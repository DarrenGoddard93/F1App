package darrenf1app.f1app;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;

import static android.R.attr.data;
import static android.R.attr.id;


public class DriversPage extends AppCompatActivity {

    private static final String DATABASE_PATH =
            "/data/data/darrenf1app.f1app/databases/";
    //   "C:/Users/darre/AndroidStudioProjects/F1App/app/src/main/assets";
    private static final String DATABASE_PATH2 =
            "/data/data/darrenf1app.f1app/databases";

    private static final String DATABASE_NAME = "f1Database.db";
    private static final String LOG_TAG = "F1_DB";

    Context ctx;

    OpenDatabase sqh;
    SQLiteDatabase sqdb;


    private DBAdapter db;

    TextView DriverTextView;
    private ListView DriverList;
    private ArrayAdapter<String> listAdapter;

    ArrayList<String> data;
    ArrayAdapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers);

        setUpDatabase();
        InitDataBase();

        populateListView();

    //    DriverTextView = (TextView)findViewById(R.id.DriverTextView);
    //    DriverTextView.setText(sqh.DisplayRecords(sqdb));



    } // protected void onCreate(Bundle savedInstanceState)



    public void InitDataBase() {
        // Init the SQLite Helper Class
        sqh = new OpenDatabase(this);
        // RETRIEVE A READABLE AND WRITEABLE DATABASE
        sqdb = sqh.getWritableDatabase();

    } // public void InitDataBase() {






    public void setUpDatabase() {
        ctx = this.getBaseContext();
        try {
            CopyDataBaseFromAsset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // public void setUpDatabase()


    public void CopyDataBaseFromAsset() throws IOException {
        // Get the sqlite databse in the assets folder
        InputStream in = ctx.getAssets().open(DATABASE_NAME);
        Log.w(LOG_TAG, "Starting copying...");
        String outputFileName = DATABASE_PATH + DATABASE_NAME;
        File databaseFolder = new File(DATABASE_PATH2);

        // databases folder exists ? No - Create it and copy !!!
        if (!databaseFolder.exists()) {
            databaseFolder.mkdir();
            OutputStream out = new
                    FileOutputStream(outputFileName);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            } // while ( (length = in.read(buffer)) > 0 )
            out.flush();
            out.close();
            in.close();
            Log.w(LOG_TAG, "Completed.");

        } // if ( !databaseFolder.exists() )

    } // public void CopyDataBaseFromAsset() throws IOException




    public void populateListView()
    {

        DriverList = (ListView) findViewById(R.id.DriverList);

        data = new ArrayList<String>();

        data = sqh.DisplayRecordsV2(sqdb);

        //Construct array adapter
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);


        //link adapter to listview
        DriverList.setAdapter(adapter);

        //Create item click listener to react to when item selected
        DriverList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id)
            {    //get item in string
                String item = (String) parent.getItemAtPosition(position);


                //use toast message
                Toast.makeText(getApplicationContext(), item, Toast.LENGTH_LONG).show();


            }
        });




    } // public void populateListView()





} // public class Drivers extends AppCompatActivity
