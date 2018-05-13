package com.example.elena.musicapp2;

/**
 * Created by Elena on 07/05/2017.
 */

public class Song {

    //Declarations
    private String mSong;
    private String mArtist;
    private int mImageResourceId;

    public Song (String song, String artist, int imageResourceId) {
        mSong = song;
        mArtist = artist;
        mImageResourceId = imageResourceId;
    }

    public String getSong () {
        return mSong;
    }

    public String getArtist () {
        return mArtist;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
