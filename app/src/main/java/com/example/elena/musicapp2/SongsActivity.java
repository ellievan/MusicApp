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

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_all);

        //Find the description text view and populate it with the right string
        TextView myAwesomeTextView = (TextView)findViewById(R.id.description_text_view);
        myAwesomeTextView.setText(getString(R.string.songs_activity_description));

        // Find the View that shows the home category
        LinearLayout home_navbar = (LinearLayout) findViewById(R.id.home_navbar_id);

        // Set a click listener on that View
        home_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the MainActivity
                Intent homeIntent = new Intent(SongsActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the artists category
        LinearLayout artists_navbar = (LinearLayout) findViewById(R.id.artists_navbar_id);

        // Set a click listener on that View
        artists_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the ArtistsActivity
                Intent artistsIntent = new Intent(SongsActivity.this, ArtistsActivity.class);
                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the playlistse category
        LinearLayout playlists_navbar = (LinearLayout) findViewById(R.id.playlists_navbar_id);

        // Set a click listener on that View
        playlists_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the PlaylistsActivity
                Intent playlistsIntent = new Intent(SongsActivity.this, PlaylistsActivity.class);
                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.song_title), (getString(R.string.artist_name)), R.drawable.song_icon));
        songs.add(new Song(getString(R.string.song_title), (getString(R.string.artist_name)), R.drawable.song_icon));
        songs.add(new Song(getString(R.string.song_title), (getString(R.string.artist_name)), R.drawable.song_icon));
        songs.add(new Song(getString(R.string.song_title), (getString(R.string.artist_name)), R.drawable.song_icon));
        songs.add(new Song(getString(R.string.song_title), (getString(R.string.artist_name)), R.drawable.song_icon));
        songs.add(new Song(getString(R.string.song_title), (getString(R.string.artist_name)), R.drawable.song_icon));
        songs.add(new Song(getString(R.string.song_title), (getString(R.string.artist_name)), R.drawable.song_icon));

        // Create an SongsAdapter, whose data source is a list of Songs
        final SongsAdapter adapter = new SongsAdapter(this, songs);

        // Find the ListView
        ListView listView = (ListView) findViewById(R.id.list_for_all);

        // Make the ListView use the SongsAdapter
        listView.setAdapter(adapter);

        //set OnItemClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songsIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });
    }
}
