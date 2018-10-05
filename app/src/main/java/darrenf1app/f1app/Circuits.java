package darrenf1app.f1app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Circuits extends AppCompatActivity
{
   Button AustraliaButton;
    Button BahrainButton;
    Button ChinaButton;
    Button AzerbaijanButton;
    Button SpainButton, MonacoButton, CanadaButton, FranceButton, AustriaButton, BritishButton,
            GermanyButton, HungaryButton, BelgiumButton, ItalyButton, SingaporeButton, RussiaButton;


    WebView wv;

    String australia = "https://www.formula1.com/en/championship/races/2018/Australia.html";
    String bah = "https://www.formula1.com/en/championship/races/2018/Bahrain.html";
    String china = "https://www.formula1.com/en/championship/races/2018/China.html";
    String azerbaijan = "https://www.formula1.com/en/championship/races/2018/Azerbaijan.html";
    String spain = "https://www.formula1.com/en/championship/races/2018/Spain.html";
    String monaco = "https://www.formula1.com/en/championship/races/2018/Monaco.html";
    String canada = "https://www.formula1.com/en/championship/races/2018/Canada.html";
    String france = "https://www.formula1.com/en/championship/races/2018/france.html";
    String austria = "https://www.formula1.com/en/championship/races/2018/Austria.html";
    String british = "https://www.formula1.com/en/championship/races/2018/Great_Britain.html";
    String germany = "https://www.formula1.com/en/championship/races/2018/Germany.html";
    String hungary = "https://www.formula1.com/en/championship/races/2018/Hungary.html";
    String belgium = "https://www.formula1.com/en/championship/races/2018/Belgium.html";
    String italy = "https://www.formula1.com/en/championship/races/2018/Italy.html";
    String singapore = "https://www.formula1.com/en/championship/races/2018/Singapore.html";
    String russia = "https://www.formula1.com/en/championship/races/2018/Russia.html";



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circuits);

        AustraliaButton =(Button)findViewById(R.id.AustraliaButton);
        BahrainButton =(Button)findViewById(R.id.BahrainButton);
        ChinaButton =(Button)findViewById(R.id.ChinaButton);
        AzerbaijanButton =(Button)findViewById(R.id.AzerbaijanButton);
        SpainButton =(Button)findViewById(R.id.SpainButton);
        MonacoButton =(Button)findViewById(R.id.MonacoButton);
        CanadaButton =(Button)findViewById(R.id.CanadaButton);
        FranceButton =(Button)findViewById(R.id.FranceButton);
        AustriaButton =(Button)findViewById(R.id.AustriaButton);
        BritishButton =(Button)findViewById(R.id.BritishButton);
        GermanyButton =(Button)findViewById(R.id.GermanyButton);
        HungaryButton =(Button)findViewById(R.id.HungaryButton);
        BelgiumButton =(Button)findViewById(R.id.BelgiumButton);
        ItalyButton =(Button)findViewById(R.id.ItalyButton);
        SingaporeButton =(Button)findViewById(R.id.SingaporeButton);
        RussiaButton =(Button)findViewById(R.id.RussiaButton);

        wv = (WebView) findViewById(R.id.circuitView);



        AustraliaButton.setOnClickListener(new View.OnClickListener()
        {
         @Override
                 public void onClick(View v)
         {
             wv.setWebViewClient(new WebViewClient());
             wv.getSettings().setJavaScriptEnabled(true);
             wv.loadUrl(australia);
         }

        });

        BahrainButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(bah);
            }

        });

        ChinaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(china);
            }

        });

        AzerbaijanButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(azerbaijan);
            }

        });


        SpainButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(spain);
            }

        });

        MonacoButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(monaco);
            }

        });

        CanadaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(canada);
            }

        });


        FranceButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(france);
            }

        });


        AustriaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(austria);
            }

        });

        BritishButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(british);
            }

        });

        GermanyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(germany);
            }

        });


        HungaryButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(hungary);
            }

        });

        BelgiumButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(belgium);
            }

        });

        ItalyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(italy);
            }

        });


        SingaporeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(singapore);
            }

        });


        RussiaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.loadUrl(russia);
            }

        });





    } // protected void onCreate(Bundle savedInstanceState)





} // public class Circuits extends AppCompatActivity