package com.example.elena.musicapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the View that shows the home category
        LinearLayout homeButton = (LinearLayout) findViewById(R.id.home_button);

        // Set a click listener on that View
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the MainActivity
                Intent homeIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the back to list view
        LinearLayout backToListsButton = (LinearLayout) findViewById(R.id.back_to_list);
        // Set a click listener on that View
        backToListsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}
