package com.example.elena.musicapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Find the View that shows the home category
        LinearLayout home_navbar = (LinearLayout) findViewById(R.id.home_navbar_id);

        // Set a click listener on that View
        home_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the MainActivity
                Intent homeIntent = new Intent(PaymentActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the playlists category
        LinearLayout playlists_navbar = (LinearLayout) findViewById(R.id.playlists_navbar_id);

        // Set a click listener on that View
        playlists_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the PlaylistsActivity
                Intent playlistsIntent = new Intent(PaymentActivity.this, PlaylistsActivity.class);
                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Find the View that shows the songs category
        LinearLayout songs_navbar = (LinearLayout) findViewById(R.id.songs_navbar_id);

        // Set a click listener on that View
        songs_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the SongsActivity
                Intent songsIntent = new Intent(PaymentActivity.this, SongsActivity.class);
                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the artists category
        LinearLayout artists_navbar = (LinearLayout) findViewById(R.id.artists_navbar_id);

        // Set a click listener on that View
        artists_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the ArtistsActivity
                Intent artistsIntent = new Intent(PaymentActivity.this, ArtistsActivity.class);
                // Start the new activity
                startActivity(artistsIntent);
            }
        });
    }
}
