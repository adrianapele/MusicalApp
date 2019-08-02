package com.example.adriana.musicalapp.model;

/**
 * Created by Adriana on 4/12/2018.
 */

public class Song {
    private int mImageId;
    private String mAartistName;
    private String mSongName;
    private String mDduration;

    public Song(int imageId, String artistName, String songName, String duration) {
        mImageId = imageId;
        mAartistName = artistName;
        mSongName = songName;
        mDduration = duration;
    }

    public int getImageId() {
        return mImageId;
    }

    public String getArtistName() {
        return mAartistName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getDuration() {
        return mDduration;
    }
}
