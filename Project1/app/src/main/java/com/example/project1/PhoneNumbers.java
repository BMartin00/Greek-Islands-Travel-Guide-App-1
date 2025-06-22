package com.example.project1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PhoneNumbers extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_phone_numbers);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) ->
        {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button rhodesAirport = findViewById(R.id.rhodesAirport);
        Button creteAirport = findViewById(R.id.creteAirport);
        Button corfuAirport = findViewById(R.id.corfuAirport);
        Button kosAirport = findViewById(R.id.kosAirport);
        Button santoriniAirport = findViewById(R.id.santoriniAirport);
        Button parosAirport = findViewById(R.id.parosAirport);
        Button mykonosAirport = findViewById(R.id.mykonosAirport);
        Button zakynthosAirport = findViewById(R.id.zakynthosAirport);

        rhodesAirport.setOnClickListener(view ->
        {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:" + "+30 2241 088700"));
            if (i.resolveActivity(getPackageManager()) != null)
                startActivity(i);
        });

        creteAirport.setOnClickListener(view ->
        {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:" + "+30 2821 063245"));
            if (i.resolveActivity(getPackageManager()) != null)
                startActivity(i);
        });

        corfuAirport.setOnClickListener(view ->
        {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:" + "+30 2661 089602"));
            if (i.resolveActivity(getPackageManager()) != null)
                startActivity(i);
        });

        kosAirport.setOnClickListener(view ->
        {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:" + "+30 2242 056000"));
            if (i.resolveActivity(getPackageManager()) != null)
                startActivity(i);
        });

        santoriniAirport.setOnClickListener(view ->
        {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:" + "+30 2286 028400"));
            if (i.resolveActivity(getPackageManager()) != null)
                startActivity(i);
        });

        parosAirport.setOnClickListener(view ->
        {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:" + "+30 2284 090500"));
            if (i.resolveActivity(getPackageManager()) != null)
                startActivity(i);
        });

        mykonosAirport.setOnClickListener(view ->
        {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:" + "+30 2289 079000"));
            if (i.resolveActivity(getPackageManager()) != null)
                startActivity(i);
        });

        zakynthosAirport.setOnClickListener(view ->
        {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:" + "+30 2695 029500"));
            if (i.resolveActivity(getPackageManager()) != null)
                startActivity(i);
        });
    }
}