package com.example.elena.musicapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the SongsActivity
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the playlists category
        TextView playlists = (TextView) findViewById(R.id.playlists);

        // Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the PlaylistsActivity
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Find the View that shows the payment category
        TextView payment = (TextView) findViewById(R.id.payment);

        // Set a click listener on that View
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the payment category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the PaymentActivity
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);
                // Start the new activity
                startActivity(paymentIntent);
            }
        });

    }
}
