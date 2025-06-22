package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Destinations extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_destinations);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) ->
        {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button surveyButton = findViewById(R.id.surveyButton);
        ImageView phoneImage = findViewById(R.id.phoneImage);

        ImageView rhodesImage = findViewById(R.id.rhodesImage);
        ImageView creteImage = findViewById(R.id.creteImage);
        ImageView corfuImage = findViewById(R.id.corfuImage);
        ImageView kosImage = findViewById(R.id.kosImage);
        ImageView santoriniImage = findViewById(R.id.santoriniImage);
        ImageView parosImage = findViewById(R.id.parosImage);
        ImageView mykonosImage = findViewById(R.id.mykonosImage);
        ImageView zakynthosImage = findViewById(R.id.zakynthosImage);

        surveyButton.setOnClickListener(view ->
        {
            Intent i = new Intent(Destinations.this, Survey.class);
            startActivity(i);
        });

        phoneImage.setOnClickListener(view ->
        {
            Intent i = new Intent(Destinations.this, PhoneNumbers.class);
            startActivity(i);
        });

        rhodesImage.setOnClickListener(view ->
        {
            Intent i = new Intent(Destinations.this, SelectedDestination.class);
            String myText = "Rhodes";
            i.putExtra("TextToSend", myText);
            startActivity(i);
        });

        creteImage.setOnClickListener(view ->
        {
            Intent i = new Intent(Destinations.this, SelectedDestination.class);
            String myText = "Crete";
            i.putExtra("TextToSend", myText);
            startActivity(i);
        });

        corfuImage.setOnClickListener(view ->
        {
            Intent i = new Intent(Destinations.this, SelectedDestination.class);
            String myText = "Corfu";
            i.putExtra("TextToSend", myText);
            startActivity(i);
        });

        kosImage.setOnClickListener(view ->
        {
            Intent i = new Intent(Destinations.this, SelectedDestination.class);
            String myText = "Kos";
            i.putExtra("TextToSend", myText);
            startActivity(i);
        });

        santoriniImage.setOnClickListener(view ->
        {
            Intent i = new Intent(Destinations.this, SelectedDestination.class);
            String myText = "Santorini";
            i.putExtra("TextToSend", myText);
            startActivity(i);
        });

        parosImage.setOnClickListener(view ->
        {
            Intent i = new Intent(Destinations.this, SelectedDestination.class);
            String myText = "Paros";
            i.putExtra("TextToSend", myText);
            startActivity(i);
        });

        mykonosImage.setOnClickListener(view ->
        {
            Intent i = new Intent(Destinations.this, SelectedDestination.class);
            String myText = "Mykonos";
            i.putExtra("TextToSend", myText);
            startActivity(i);
        });

        zakynthosImage.setOnClickListener(view ->
        {
            Intent i = new Intent(Destinations.this, SelectedDestination.class);
            String myText = "Zakynthos";
            i.putExtra("TextToSend", myText);
            startActivity(i);
        });

    }
}