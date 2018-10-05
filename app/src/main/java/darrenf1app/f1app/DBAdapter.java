package darrenf1app.f1app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by darre on 16/05/2018.
 */

public class DBAdapter
{
    private SQLiteDatabase database = null;
    private String dbPath;
    private String dbName;
    private Context context;


    public DBAdapter(Context context, String dbName)
    {
        this.context = context;
        this.dbName = dbName;
        dbPath = "/data/data/darrenf1app.f1app/databases/" + context.getPackageName() + "/databases/";


    } // public DBAdapter(Context context, String dbName)



/*
    public static SQLiteDatabase openDB()
    {
        database = SQLiteDatabase.openDatabase(dbPath + dbName, null,
                SQLiteDatabase.OPEN_READONLY);
        return database;

    } // public SQLiteDatabase openDB()

*/

} //public class DBAdapter
