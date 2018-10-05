package darrenf1app.f1app;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Teams2 extends AppCompatActivity
{
    String url = "https://www.formula1.com/en/championship/teams.html";  // F1 website
    String url2 = "http://www.skysports.com/f1/drivers-teams";  // Sky sports website
    TextView textView1;
    Button But1;

    ArrayList<String> data;

    private static final String LOG_TAG = "LOG_DATA";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams2);

       textView1 = (TextView)findViewById(R.id.textView1);
        But1 = (Button)findViewById(R.id.But1);


        But1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                new doit().execute();
            }
        });


    }

    public class doit extends AsyncTask<Void, Void, Void>
    {
        String words;

        String team;
        String TeamName;

        @Override
        protected Void doInBackground(Void... params)
        {
            try {
                //Website Connection
                Document doc = Jsoup.connect(url).get();    // NOT USING
                Document doc2 = Jsoup.connect(url2).get();

               Elements e = doc2.select("div[class = f1-team]");

          //     Elements e = doc2.select("div[class = f1-team__team-name");

               TeamName = e.text();


              //  words = e2.text();

          //  Elements e = doc2.select("a[href]");


                Log.w(LOG_TAG, ("TEAM:  " + TeamName ));  // PRINT TEAM DATA



            }catch(Exception e)
            {
                e.printStackTrace();
            }


            return null;


        }


        @Override
        protected void onPostExecute(Void aVoid)
        {
            super.onPostExecute(aVoid);

        //   textView1.setText(words);

           // data = new ArrayList<String>();


            textView1.setText("Team: " +  TeamName);  // working!!!


        }
    }



}
