package darrenf1app.f1app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class About extends AppCompatActivity
{

    TextView aboutText;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String s = "This is a Formula 1 news app which allows users to view Driver details " +
                "and statistics, Circuit details and Team details. " +
                "\n" + "\n" +
                "It provides an easy to use system for ALL fans of Formula 1!" +
                "\n" + "\n" +
                "Enjoy!! :) ";


        aboutText = (TextView)findViewById(R.id.aboutText);

        aboutText.setText(s);

    }



}
