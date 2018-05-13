package com.example.elena.musicapp2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Song> {

    public SongsAdapter(Activity context, ArrayList<Song> songs){
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the veiew
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the Song  object located at this position in the list
        Song currentSong = getItem(position);

        //Find the TextView with the id song_text_view
        TextView artistTextView = (TextView)listItemView.findViewById(R.id.song_text_view);
        //Get the version name from the current Song object and set the text
        artistTextView.setText(currentSong.getSong());

        //Find the TextView in with id artist_text_view
        TextView musicTextView = (TextView)listItemView.findViewById(R.id.artist_text_view);
        //Get the version name from the current Song object and set the text
        musicTextView.setText(currentSong.getArtist());

        //Find the ImageView with id image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //Set the ImageView to the image resource specified in the current Song
        imageView.setImageResource(currentSong.getImageResourceId());

        //Return the whole ListItem layout (containing 2 Text View and an ImageView)
        return  listItemView;
    }
}
