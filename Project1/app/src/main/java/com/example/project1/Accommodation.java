package com.example.project1;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Accommodation extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_accommodation);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) ->
        {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        WebView accommodationWeb = findViewById((R.id.accommodationWeb));
        accommodationWeb.getSettings().setJavaScriptEnabled(true);
        accommodationWeb.setWebViewClient(new WebViewClient());

        try
        {
            Bundle extras = getIntent().getExtras();
            String selectedIsland = extras.getString("TextToSend");

            switch (selectedIsland)
            {
                case "Rhodes":
                    accommodationWeb.loadUrl("https://www.booking.com/searchresults.en-gb.html?ss=Rhodes%2C+Greece&efdco=1&label=gen173nr-1BCAEoggI46AdIM1gEaGmIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AruS170GwAIB0gIkYTFjYmZiNWMtYzQxZC00MTRhLTlmOWQtODAzYjI3NzQ0NzAz2AIF4AIB&sid=00c0960ba2724c1ea98a3a129c4c8fe5&aid=304142&lang=en-gb&sb=1&src_elem=sb&src=index&dest_id=1591&dest_type=region&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=dd985521176303a4&ac_meta=GhBkZDk4NTUyMTE3NjMwM2E0IAAoATICZW46BnJob2Rlc0AASgBQAA%3D%3D&group_adults=2&no_rooms=1&group_children=0");
                    break;
                case "Crete":
                    accommodationWeb.loadUrl("https://www.booking.com/searchresults.en-gb.html?ss=Crete%2C+Greece&efdco=1&label=gen173nr-1BCAEoggI46AdIM1gEaGmIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AruS170GwAIB0gIkYTFjYmZiNWMtYzQxZC00MTRhLTlmOWQtODAzYjI3NzQ0NzAz2AIF4AIB&sid=00c0960ba2724c1ea98a3a129c4c8fe5&aid=304142&lang=en-gb&sb=1&src_elem=sb&src=index&dest_id=811&dest_type=region&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=dd985521176303a4&ac_meta=GhBkZDk4NTUyMTE3NjMwM2E0IAAoATICZW46BWNyZXRlQABKAFAA&group_adults=2&no_rooms=1&group_children=0");
                    break;
                case "Corfu":
                    accommodationWeb.loadUrl("https://www.booking.com/searchresults.en-gb.html?ss=Corfu%2C+Greece&efdco=1&label=gen173nr-1BCAEoggI46AdIM1gEaGmIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AruS170GwAIB0gIkYTFjYmZiNWMtYzQxZC00MTRhLTlmOWQtODAzYjI3NzQ0NzAz2AIF4AIB&sid=00c0960ba2724c1ea98a3a129c4c8fe5&aid=304142&lang=en-gb&sb=1&src_elem=sb&src=index&dest_id=1570&dest_type=region&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=dd985521176303a4&ac_meta=GhBkZDk4NTUyMTE3NjMwM2E0IAAoATICZW46BWNvcmZ1QABKAFAA&group_adults=2&no_rooms=1&group_children=0");
                    break;
                case "Kos":
                    accommodationWeb.loadUrl("https://www.booking.com/searchresults.en-gb.html?ss=Kos%2C+Greece&efdco=1&label=gen173nr-1BCAEoggI46AdIM1gEaGmIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AruS170GwAIB0gIkYTFjYmZiNWMtYzQxZC00MTRhLTlmOWQtODAzYjI3NzQ0NzAz2AIF4AIB&sid=00c0960ba2724c1ea98a3a129c4c8fe5&aid=304142&lang=en-gb&sb=1&src_elem=sb&src=index&dest_id=1817&dest_type=region&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=dd985521176303a4&ac_meta=GhBkZDk4NTUyMTE3NjMwM2E0IAAoATICZW46A2tvc0AASgBQAA%3D%3D&group_adults=2&no_rooms=1&group_children=0");
                    break;
                case "Santorini":
                    accommodationWeb.loadUrl("https://www.booking.com/searchresults.en-gb.html?ss=Santorini%2C+Greece&efdco=1&label=gen173nr-1BCAEoggI46AdIM1gEaGmIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AruS170GwAIB0gIkYTFjYmZiNWMtYzQxZC00MTRhLTlmOWQtODAzYjI3NzQ0NzAz2AIF4AIB&sid=00c0960ba2724c1ea98a3a129c4c8fe5&aid=304142&lang=en-gb&sb=1&src_elem=sb&src=index&dest_id=1513&dest_type=region&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=dd985521176303a4&ac_meta=GhBkZDk4NTUyMTE3NjMwM2E0IAAoATICZW46B3NhbnRvcmlAAEoAUAA%3D&group_adults=2&no_rooms=1&group_children=0");
                    break;
                case "Paros":
                    accommodationWeb.loadUrl("https://www.booking.com/searchresults.en-gb.html?ss=Paros%2C+Greece&efdco=1&label=gen173nr-1BCAEoggI46AdIM1gEaGmIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AruS170GwAIB0gIkYTFjYmZiNWMtYzQxZC00MTRhLTlmOWQtODAzYjI3NzQ0NzAz2AIF4AIB&sid=00c0960ba2724c1ea98a3a129c4c8fe5&aid=304142&lang=en-gb&sb=1&src_elem=sb&src=index&dest_id=2815&dest_type=region&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=dd985521176303a4&ac_meta=GhBkZDk4NTUyMTE3NjMwM2E0IAAoATICZW46BXBhcm9zQABKAFAA&group_adults=2&no_rooms=1&group_children=0");
                    break;
                case "Mykonos":
                    accommodationWeb.loadUrl("https://www.booking.com/searchresults.en-gb.html?ss=Mykonos%2C+Greece&efdco=1&label=gen173nr-1BCAEoggI46AdIM1gEaGmIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AruS170GwAIB0gIkYTFjYmZiNWMtYzQxZC00MTRhLTlmOWQtODAzYjI3NzQ0NzAz2AIF4AIB&sid=00c0960ba2724c1ea98a3a129c4c8fe5&aid=304142&lang=en-gb&sb=1&src_elem=sb&src=index&dest_id=2813&dest_type=region&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=dd985521176303a4&ac_meta=GhBkZDk4NTUyMTE3NjMwM2E0IAAoATICZW46B215a29ub3NAAEoAUAA%3D&group_adults=2&no_rooms=1&group_children=0");
                    break;
                case "Zakynthos":
                    accommodationWeb.loadUrl("https://www.booking.com/searchresults.en-gb.html?ss=Zakynthos%2C+Greece&efdco=1&label=gen173nr-1BCAEoggI46AdIM1gEaGmIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AruS170GwAIB0gIkYTFjYmZiNWMtYzQxZC00MTRhLTlmOWQtODAzYjI3NzQ0NzAz2AIF4AIB&sid=00c0960ba2724c1ea98a3a129c4c8fe5&aid=304142&lang=en-gb&sb=1&src_elem=sb&src=index&dest_id=1663&dest_type=region&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=dd985521176303a4&ac_meta=GhBkZDk4NTUyMTE3NjMwM2E0IAAoATICZW46Bnpha3ludEAASgBQAA%3D%3D&group_adults=2&no_rooms=1&group_children=0");
                    break;
            }
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
        }
    }
}