package com.example.elena.musicapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_all);

        //Finds the description text view and populates it with the string describing this activity
        TextView myAwesomeTextView = (TextView)findViewById(R.id.description_text_view);
        myAwesomeTextView.setText(getString(R.string.playlists_activity_description));

        // Find the View that shows the home category
        LinearLayout home_navbar = (LinearLayout) findViewById(R.id.home_navbar_id);

        // Set a click listener on that View
        home_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the MainActivity
                Intent homeIntent = new Intent(PlaylistsActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the songs category
        LinearLayout songs_navbar = (LinearLayout) findViewById(R.id.songs_navbar_id);

        // Set a click listener on that View
        songs_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the SongsActivity
                Intent songsIntent = new Intent(PlaylistsActivity.this, SongsActivity.class);
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
                Intent artistsIntent = new Intent(PlaylistsActivity.this, ArtistsActivity.class);
                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.playlist_name), (getString(R.string.number_of_song)), R.drawable.playlists_icon));
        songs.add(new Song(getString(R.string.playlist_name), (getString(R.string.number_of_song)), R.drawable.playlists_icon));
        songs.add(new Song(getString(R.string.playlist_name), (getString(R.string.number_of_song)), R.drawable.playlists_icon));
        songs.add(new Song(getString(R.string.playlist_name), (getString(R.string.number_of_song)), R.drawable.playlists_icon));
        songs.add(new Song(getString(R.string.playlist_name), (getString(R.string.number_of_song)), R.drawable.playlists_icon));
        songs.add(new Song(getString(R.string.playlist_name), (getString(R.string.number_of_song)), R.drawable.playlists_icon));
        songs.add(new Song(getString(R.string.playlist_name), (getString(R.string.number_of_song)), R.drawable.playlists_icon));

        // Create an SongsAdapter, whose data source is a list of Songs. The
        // adapter knows how to create list items for each item in the list.
        final SongsAdapter adapter = new SongsAdapter(this, songs);

        // Find the ListView
        ListView listView = (ListView) findViewById(R.id.list_for_all);

        // Make the ListView use the SongsAdapter
        listView.setAdapter(adapter);

        //set OnItemClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songsIntent = new Intent(PlaylistsActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });
    }
}
