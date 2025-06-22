package com.example.project1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class SelectedDestination extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_selected_destination);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) ->
        {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        TextView descriptionText = findViewById(R.id.descriptionText);

        ImageView planeVector = findViewById(R.id.planeVector);
        ImageView mapVector = findViewById(R.id.mapVector);
        ImageView hotelVector = findViewById(R.id.hotelVector);
        ImageView weatherVector = findViewById(R.id.weatherVector);

        try
        {
            Bundle extras = getIntent().getExtras();
            String selectedIsland = extras.getString("TextToSend");

            switch (selectedIsland)
            {
                case "Rhodes":
                    youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener()
                    {
                        @Override
                        public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                            String videoId = "9rBvSBUMtPA";
                            youTubePlayer.cueVideo(videoId, 0);
                        }
                    });
                    descriptionText.setText(getString(R.string.rhodesDescription));
                    break;
                case "Crete":
                    youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener()
                    {
                        @Override
                        public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                            String videoId = "8a09R1-xuM8";
                            youTubePlayer.cueVideo(videoId, 0);
                        }
                    });
                    descriptionText.setText(getString(R.string.creteDescription));
                    break;
                case "Corfu":
                    youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener()
                    {
                        @Override
                        public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                            String videoId = "-xsx5_tqA3E";
                            youTubePlayer.cueVideo(videoId, 0);
                        }
                    });
                    descriptionText.setText(getString(R.string.corfuDescription));
                    break;
                case "Kos":
                    youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener()
                    {
                        @Override
                        public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                            String videoId = "FJ01vW7XGCc";
                            youTubePlayer.cueVideo(videoId, 0);
                        }
                    });
                    descriptionText.setText(getString(R.string.kosDescription));
                    break;
                case "Santorini":
                    youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener()
                    {
                        @Override
                        public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                            String videoId = "qCtTT4V7hIM";
                            youTubePlayer.cueVideo(videoId, 0);
                        }
                    });
                    descriptionText.setText(getString(R.string.santoriniDescription));
                    break;
                case "Paros":
                    youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener()
                    {
                        @Override
                        public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                            String videoId = "IdBjkw0kmgc";
                            youTubePlayer.cueVideo(videoId, 0);
                        }
                    });
                    descriptionText.setText(getString(R.string.parosDescription));
                    break;
                case "Mykonos":
                    youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener()
                    {
                        @Override
                        public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                            String videoId = "t-ANe_RtebA";
                            youTubePlayer.cueVideo(videoId, 0);
                        }
                    });
                    descriptionText.setText(getString(R.string.mykonosDescription));
                    break;
                case "Zakynthos":
                    youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener()
                    {
                        @Override
                        public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                            String videoId = "2s6DpEDY-Cg";
                            youTubePlayer.cueVideo(videoId, 0);
                        }
                    });
                    descriptionText.setText(getString(R.string.zakynthosDescription));
                    break;
            }
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
        }

        planeVector.setOnClickListener(view ->
        {
            Bundle extras = getIntent().getExtras();
            String selectedIsland = extras.getString("TextToSend");
            flightInfo(selectedIsland);
        });

        mapVector.setOnClickListener(view ->
        {
            Bundle extras = getIntent().getExtras();
            String selectedIsland = extras.getString("TextToSend");
            showMap(selectedIsland);
        });

        hotelVector.setOnClickListener(view ->
        {
            Bundle extras = getIntent().getExtras();
            String selectedIsland = extras.getString("TextToSend");
            accommodations(selectedIsland);
        });

        weatherVector.setOnClickListener(view ->
        {
            Bundle extras = getIntent().getExtras();
            String selectedIsland = extras.getString("TextToSend");
            weatherInfo(selectedIsland);
        });

    }

    public void flightInfo(String island)
    {
        Intent i = new Intent(SelectedDestination.this, Flights.class);
        i.putExtra("TextToSend", island);
        startActivity(i);
    }

    public void showMap(String island)
    {
        String coordinate = null;
        try
        {
            switch (island)
            {
                case "Rhodes":
                    coordinate = "geo:36.4340,28.2176";
                    break;
                case "Crete":
                    coordinate = "geo:35.2401,24.8093";
                    break;
                case "Corfu":
                    coordinate = "geo:39.6243,19.9217";
                    break;
                case "Kos":
                    coordinate = "geo:36.8912,27.2877";
                    break;
                case "Santorini":
                    coordinate = "geo:36.3932,25.4615";
                    break;
                case "Paros":
                    coordinate = "geo:37.0853,25.1523";
                    break;
                case "Mykonos":
                    coordinate = "geo:37.4467,25.3289";
                    break;
                case "Zakynthos":
                    coordinate = "geo:37.7870,20.8997";
                    break;
            }
            Intent i = new Intent();
            i.setAction(Intent.ACTION_VIEW);
            i.setData(Uri.parse(coordinate));
            startActivity(i);
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
        }
    }

    public void accommodations(String island)
    {
        Intent i = new Intent(SelectedDestination.this, Accommodation.class);
        i.putExtra("TextToSend", island);
        startActivity(i);
    }

    public void weatherInfo(String island)
    {
        Intent i = new Intent(SelectedDestination.this, Weather.class);
        i.putExtra("TextToSend", island);
        startActivity(i);
    }
}