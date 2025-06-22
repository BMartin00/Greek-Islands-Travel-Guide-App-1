package com.example.project1;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Weather extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) ->
        {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        WebView weatherWeb = findViewById((R.id.accommodationWeb));
        weatherWeb.getSettings().setJavaScriptEnabled(true);
        weatherWeb.setWebViewClient(new WebViewClient());

        try
        {
            Bundle extras = getIntent().getExtras();
            String selectedIsland = extras.getString("TextToSend");

            switch (selectedIsland)
            {
                case "Rhodes":
                    weatherWeb.loadUrl("https://www.google.com/search?q=rhodes+weather&rlz=1C1CHBF_enIE1109IE1109&oq=rhodes+weather&gs_lcrp=EgZjaHJvbWUqEQgAEAAYQxhGGIACGIAEGIoFMhEIABAAGEMYRhiAAhiABBiKBTIMCAEQABhDGIAEGIoFMgcIAhAAGIAEMgcIAxAAGIAEMgwIBBAAGEMYgAQYigUyBwgFEAAYgAQyBwgGEAAYgAQyBwgHEAAYgAQyBwgIEAAYgAQyBwgJEAAYgATSAQgyMjc2ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
                    break;
                case "Crete":
                    weatherWeb.loadUrl("https://www.google.com/search?q=crete+weather&sca_esv=bcc33a35ba758be7&rlz=1C1CHBF_enIE1109IE1109&sxsrf=AHTn8zrZPMKQZyHNs438jE33-PlaxMvjYw%3A1739814794905&ei=inezZ8LyNruyhbIP7M2EkQ0&oq=creteweather&gs_lp=Egxnd3Mtd2l6LXNlcnAiDGNyZXRld2VhdGhlcioCCAAyCxAAGAcYHhhGGIACMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMhcQABgHGB4YRhiAAhiXBRiMBRjdBNgBAUiVDVDxAVi5B3ACeAGQAQGYAYMCoAGNBKoBBTQuMC4xuAEByAEA-AEBmAIHoALKBsICChAAGLADGNYEGEfCAg0QABiABBiwAxhDGIoFwgIKECMYsQIYJxidApgDAIgGAZAGCroGBggBEAEYE5IHBzUuMS40LTGgB4gk&sclient=gws-wiz-serp");
                    break;
                case "Corfu":
                    weatherWeb.loadUrl("https://www.google.com/search?q=corfu+weather&sca_esv=bcc33a35ba758be7&rlz=1C1CHBF_enIE1109IE1109&sxsrf=AHTn8zorMlCpBJLlBM34RT8laKF4zsX2PA%3A1739815072809&ei=oHizZ46AMfm-hbIPpIjJ2Ak&ved=0ahUKEwiO0I6bpMuLAxV5X0EAHSREEpsQ4dUDCBE&uact=5&oq=corfu+weather&gs_lp=Egxnd3Mtd2l6LXNlcnAiDWNvcmZ1IHdlYXRoZXIyCxAAGIAEGJECGIoFMgsQABiABBiRAhiKBTILEAAYgAQYkQIYigUyCxAAGIAEGJECGIoFMgsQABiABBiRAhiKBTIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgYQABgHGB5IoRNQ1AtYwBJwAngBkAEBmAHCBKABvQeqAQc0LjEuNS0xuAEDyAEA-AEBmAIHoAKZA8ICChAAGLADGNYEGEfCAg0QABiABBiwAxhDGIoFwgIHECMYsQIYJ8ICDRAAGIAEGLEDGIMBGA2YAwCIBgGQBgqSBwM2LjGgB_gl&sclient=gws-wiz-serp");
                    break;
                case "Kos":
                    weatherWeb.loadUrl("https://www.google.com/search?sca_esv=bcc33a35ba758be7&rlz=1C1CHBF_enIE1109IE1109&sxsrf=AHTn8zr6OO5VwvPE2Cih0IKtB4y-pIiMVw:1739815090554&q=kos+weather&spell=1&sa=X&ved=2ahUKEwjA4cmjpMuLAxWgRkEAHUCwAB8QBSgAegQIChAB&biw=1920&bih=953&dpr=1");
                    break;
                case "Santorini":
                    weatherWeb.loadUrl("https://www.google.com/search?q=santorini+weather&sca_esv=bcc33a35ba758be7&rlz=1C1CHBF_enIE1109IE1109&biw=1920&bih=953&sxsrf=AHTn8zrnAUc5kMCmsgJMlWar5ySBTMCHzg%3A1739815091986&ei=s3izZ7LzO6-AhbIPz_CpiAc&ved=0ahUKEwjymKGkpMuLAxUvQEEAHU94CnEQ4dUDCBE&uact=5&oq=santorini+weather&gs_lp=Egxnd3Mtd2l6LXNlcnAiEXNhbnRvcmluaSB3ZWF0aGVyMhAQABiABBiRAhiKBRhGGIACMgsQABiABBiRAhiKBTILEAAYgAQYkQIYigUyBhAAGAcYHjILEAAYgAQYkQIYigUyCxAAGIAEGJECGIoFMgYQABgHGB4yBhAAGAcYHjIFEAAYgAQyBhAAGAcYHjIcEAAYgAQYkQIYigUYRhiAAhiXBRiMBRjdBNgBAUi9ElC5CFjiEHADeAGQAQCYAU-gAagEqgEBObgBA8gBAPgBAZgCDKAClwXCAgoQABiwAxjWBBhHwgINEAAYgAQYsAMYQxiKBcICDhAAGLADGOQCGNYE2AEBwgITEC4YgAQYsAMYQxjIAxiKBdgBAcICGRAuGIAEGLADGEMYxwEYyAMYigUYrwHYAQHCAgsQABgHGB4YRhiAAsICFxAAGAcYHhhGGIACGJcFGIwFGN0E2AEBmAMAiAYBkAYSugYGCAEQARgJkgcCMTKgB-4_&sclient=gws-wiz-serp");
                    break;
                case "Paros":
                    weatherWeb.loadUrl("https://www.google.com/search?q=paros+weather&sca_esv=bcc33a35ba758be7&rlz=1C1CHBF_enIE1109IE1109&biw=1920&bih=953&sxsrf=AHTn8zp8N9GrHcA-Ov0Iuc-OM-ad_1xchw%3A1739815102340&ei=vnizZ_e-FPzRhbIPzLLM2QM&ved=0ahUKEwj3lZmppMuLAxX8aEEAHUwZMzsQ4dUDCBE&uact=5&oq=paros+weather&gs_lp=Egxnd3Mtd2l6LXNlcnAiDXBhcm9zIHdlYXRoZXIyCxAAGIAEGJECGIoFMgYQABgHGB4yBhAAGAcYHjILEAAYgAQYkQIYigUyCxAAGIAEGJECGIoFMgsQABiABBiRAhiKBTIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeSIENUOQFWIoLcAJ4AZABAJgBS6ABrgKqAQE1uAEDyAEA-AEBmAIHoALcAsICChAAGLADGNYEGEfCAg0QABiABBiwAxhDGIoFmAMAiAYBkAYKkgcBN6AHtBs&sclient=gws-wiz-serp");
                    break;
                case "Mykonos":
                    weatherWeb.loadUrl("https://www.google.com/search?q=mykonos+weather&sca_esv=bcc33a35ba758be7&rlz=1C1CHBF_enIE1109IE1109&biw=1920&bih=953&sxsrf=AHTn8zoF7lJIAD6Watk0ltvI50vmQhEjfQ%3A1739815111684&ei=x3izZ5SvKayEhbIPze2umAM&ved=0ahUKEwjUrtOtpMuLAxUsQkEAHc22CzMQ4dUDCBE&uact=5&oq=mykonos+weather&gs_lp=Egxnd3Mtd2l6LXNlcnAiD215a29ub3Mgd2VhdGhlcjIQEAAYgAQYkQIYigUYRhiAAjILEAAYgAQYkQIYigUyCxAAGIAEGJECGIoFMgYQABgHGB4yCxAAGIAEGJECGIoFMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgUQABiABDIGEAAYBxgeMhwQABiABBiRAhiKBRhGGIACGJcFGIwFGN0E2AEBSKkSUMoGWPcQcAJ4AZABAZgBsgSgAZoIqgEFNy41LTG4AQPIAQD4AQGYAgmgArEEwgIKEAAYsAMY1gQYR8ICDRAAGIAEGLADGEMYigXCAg4QABiwAxjkAhjWBNgBAcICExAuGIAEGLADGEMYyAMYigXYAQHCAhkQLhiABBiwAxjRAxhDGMcBGMgDGIoF2AEBmAMAiAYBkAYSugYGCAEQARgJkgcDOC4xoAfqNQ&sclient=gws-wiz-serp");
                    break;
                case "Zakynthos":
                    weatherWeb.loadUrl("https://www.google.com/search?q=zakynthos+weather&sca_esv=bcc33a35ba758be7&rlz=1C1CHBF_enIE1109IE1109&biw=1920&bih=953&sxsrf=AHTn8zrfxvjfl5qiqQGhc6VmT3PxYsQK2g%3A1739815122163&ei=0nizZ4_cCbiuhbIPs87OyAg&oq=zakynweather&gs_lp=Egxnd3Mtd2l6LXNlcnAiDHpha3lud2VhdGhlcioCCAAyBhAAGAcYHjIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHjIGEAAYBxgeMgYQABgHGB4yBhAAGAcYHkixE1COBFj0CXACeAGQAQCYAYcCoAGkBKoBBTMuMS4xuAEDyAEA-AEBmAIGoALOAsICChAAGLADGNYEGEfCAg0QABiABBiwAxhDGIoFwgIPECMYsAIYJxidAhhGGIACwgINEAAYgAQYsQMYgwEYDcICBxAAGIAEGA3CAhAQABiABBixAxiDARiKBRgNwgIKEAAYgAQYsQMYDcICGRAAGLACGJ0CGEYYgAIYlwUYjAUY3QTYAQGYAwCIBgGQBgq6BgYIARABGBOSBwM1LjGgB8Qn&sclient=gws-wiz-serp");
                    break;
            }
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
        }
    }
}