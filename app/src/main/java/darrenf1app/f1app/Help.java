package darrenf1app.f1app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Help extends AppCompatActivity
{
    TextView hText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        String s = "This is the HELP Section ..." +
                "\n" + "\n" +
                "To navigate through the pages, use the buttons on the main home page. " +
                "\n" + "\n" +
                "To go back to previous pages, use the built in back button on the device!" +
                "\n" + "\n" +
                "If you have any further queries, please contact the developer at darren.goddard@hotmail.co.uk";


        hText = (TextView)findViewById(R.id.hText);

        hText.setText(s);


    }




}
