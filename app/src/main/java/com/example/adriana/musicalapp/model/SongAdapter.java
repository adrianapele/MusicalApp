package com.example.adriana.musicalapp.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adriana.musicalapp.AlbumsActivity;
import com.example.adriana.musicalapp.MainActivity;
import com.example.adriana.musicalapp.NowPlayingActivity;
import com.example.adriana.musicalapp.PlaylistActivity;
import com.example.adriana.musicalapp.R;
import com.example.adriana.musicalapp.SongsActivity;

import java.util.ArrayList;

/**
 * Created by Adriana on 4/12/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> implements View.OnClickListener
{
    Context context;

    public SongAdapter(@NonNull Context context, ArrayList<Song> songs)
    {
        super(context, 0, songs);
        this.context = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View songsListView = convertView;

        if (songsListView == null) {
            songsListView = LayoutInflater.from(getContext()).inflate(R.layout.activity_songs, parent, false);
//            songsListView.addChildrenForAccessibility(new ArrayList<View>((R.id.linearLayoutIdFromList)));
        }

        Song currentSong = getItem(position);

        ImageView imageView = (ImageView) songsListView.findViewById(R.id.image);
        imageView.setImageResource(currentSong.getImageId());

        TextView songNameTextView = (TextView) songsListView.findViewById(R.id.songName);
        songNameTextView.setText(currentSong.getSongName());

        TextView artistNameTextView = (TextView) songsListView.findViewById(R.id.artistName);
        artistNameTextView.setText(currentSong.getArtistName());

        TextView durationTextView = (TextView) songsListView.findViewById(R.id.duration);
        durationTextView.setText(currentSong.getDuration());

        Button homeBtn = (Button) songsListView.findViewById(R.id.homeBtn);
        Button nowPlayingBtn = (Button) songsListView.findViewById(R.id.nowPlayingBtn);
        Button playlistBtn = (Button) songsListView.findViewById(R.id.playlistBtn);
        Button albumsBtn = (Button) songsListView.findViewById(R.id.albumsBtn);
        homeBtn.setOnClickListener(this);
        nowPlayingBtn.setOnClickListener(this);
        playlistBtn.setOnClickListener(this);
        albumsBtn.setOnClickListener(this);

        return songsListView;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.homeBtn:
                ((Activity)context).startActivity(new Intent(getContext(), MainActivity.class));
                break;

            case R.id.nowPlayingBtn:
                ((Activity)context).startActivity(new Intent(getContext(), NowPlayingActivity.class));
                break;

            case R.id.playlistBtn:
                ((Activity)context).startActivity(new Intent(getContext(), PlaylistActivity.class));
                break;

            case R.id.albumsBtn:
                ((Activity)context).startActivity(new Intent(getContext(), AlbumsActivity.class));
                break;
        }
    }
}
