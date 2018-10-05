package darrenf1app.f1app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity
{
    Button FerrariButton;


    Button CircuitsButton, DriversButton, TeamsButton, Teams2, AboutButton, HelpButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        /*
        //OPEN FERRARI PAGE
        FerrariButton = (Button)findViewById(R.id.FerrariButton);
        FerrariButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(), FerrariPage.class);
                startActivity(intent);
            }
        });

*/


        //OPEN CIRCUITS PAGE
        CircuitsButton = (Button) findViewById(R.id.CircuitsButton);
        CircuitsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(), Circuits.class);
                startActivity(intent);
            }
        });


        //OPEN DRIVERS PAGE
        DriversButton = (Button) findViewById(R.id.DriversButton);
        DriversButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(), DriversPage.class);
                startActivity(intent);
            }
        });

/*
        //OPEN DRIVERS PAGE
        TeamsButton = (Button) findViewById(R.id.TeamsButton);
        TeamsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(), TeamsPage.class);
                startActivity(intent);
            }
        });
        */

        //OPEN DRIVERS PAGE
        Teams2 = (Button) findViewById(R.id.Teams2);
        Teams2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(), Teams2.class);
                startActivity(intent);
            }
        });


        //OPEN About PAGE
        AboutButton = (Button) findViewById(R.id.AboutButton);
        AboutButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(), About.class);
                startActivity(intent);
            }
        });


        //OPEN Help PAGE
        HelpButton = (Button) findViewById(R.id.HelpButton);
        HelpButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(), Help.class);
                startActivity(intent);
            }
        });




    }










}
