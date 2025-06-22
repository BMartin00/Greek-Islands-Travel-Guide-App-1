package com.example.project1;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Flights extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_flights);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) ->
        {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        WebView flightWeb = findViewById((R.id.accommodationWeb));
        flightWeb.getSettings().setJavaScriptEnabled(true);
        flightWeb.setWebViewClient(new WebViewClient());

        try
        {
            Bundle extras = getIntent().getExtras();
            String selectedIsland = extras.getString("TextToSend");

            switch (selectedIsland)
            {
                case "Rhodes":
                    flightWeb.loadUrl("https://www.google.com/travel/flights?tfs=CBwQARocagwIAxIIL20vMDJjZnRyDAgDEggvbS8wNmt5XxocagwIAxIIL20vMDZreV9yDAgDEggvbS8wMmNmdEABSAFwAYIBCwj___________8BmAEB&tfu=KgIIAw");
                    break;
                case "Crete":
                    flightWeb.loadUrl("https://www.google.com/travel/flights?tfs=CBwQARofagwIAxIIL20vMDJjZnRyDwgEEgsvZy8xMjJ6and3NBofag8IBBILL2cvMTIyemp3dzRyDAgDEggvbS8wMmNmdEABSAFwAYIBCwj___________8BmAEB&tfu=KgIIAw");
                    break;
                case "Corfu":
                    flightWeb.loadUrl("https://www.google.com/travel/flights?tfs=CBwQARocagwIAxIIL20vMDJjZnRyDAgDEggvbS8wY2MzZBocagwIAxIIL20vMGNjM2RyDAgDEggvbS8wMmNmdEABSAFwAYIBCwj___________8BmAEB&tfu=KgIIAw");
                    break;
                case "Kos":
                    flightWeb.loadUrl("https://www.google.com/travel/flights?tfs=CBwQARodagwIAxIIL20vMDJjZnRyDQgDEgkvbS8wMWt2XzAaHWoNCAMSCS9tLzAxa3ZfMHIMCAMSCC9tLzAyY2Z0QAFIAXABggELCP___________wGYAQE&tfu=KgIIAw");
                    break;
                case "Santorini":
                    flightWeb.loadUrl("https://www.google.com/travel/flights?tfs=CBwQARocagwIAxIIL20vMDJjZnRyDAgDEggvbS8wNzB0ORocagwIAxIIL20vMDcwdDlyDAgDEggvbS8wMmNmdEABSAFwAYIBCwj___________8BmAEB&tfu=KgIIAw");
                    break;
                case "Paros":
                    flightWeb.loadUrl("https://www.google.com/travel/flights?tfs=CBwQARodagwIAxIIL20vMDJjZnRyDQgDEgkvbS8wMTh4MTMaHWoNCAMSCS9tLzAxOHgxM3IMCAMSCC9tLzAyY2Z0QAFIAXABggELCP___________wGYAQE&tfu=KgIIAw");
                    break;
                case "Mykonos":
                    flightWeb.loadUrl("https://www.google.com/travel/flights?tfs=CBwQARodagwIAxIIL20vMDJjZnRyDQgDEgkvbS8wMmd0YmgaHWoNCAMSCS9tLzAyZ3RiaHIMCAMSCC9tLzAyY2Z0QAFIAXABggELCP___________wGYAQE&tfu=KgIIAw");
                    break;
                case "Zakynthos":
                    flightWeb.loadUrl("https://www.google.com/travel/flights?tfs=CBwQARodagwIAxIIL20vMDJjZnRyDQgDEgkvbS8wMXQwbjIaHWoNCAMSCS9tLzAxdDBuMnIMCAMSCC9tLzAyY2Z0QAFIAXABggELCP___________wGYAQE&tfu=KgIIAw");
                    break;
            }
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
        }
    }
}