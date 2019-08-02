package com.example.adriana.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RelativeLayout nowPlayingLayout, playlistLayout, albumsLayout, songsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nowPlayingLayout = (RelativeLayout) findViewById(R.id.nowPlayingLayout);
        playlistLayout = (RelativeLayout) findViewById(R.id.playlistLayout);
        albumsLayout = (RelativeLayout) findViewById(R.id.albumsLayout);
        songsLayout = (RelativeLayout) findViewById(R.id.songsLayout);

        nowPlayingLayout.setOnClickListener(this);
        playlistLayout.setOnClickListener(this);
        albumsLayout.setOnClickListener(this);
        songsLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nowPlayingLayout:
                startActivity(new Intent(getApplicationContext(), NowPlayingActivity.class));
                break;

            case R.id.playlistLayout:
                startActivity(new Intent(getApplicationContext(), PlaylistActivity.class));
                break;

            case R.id.albumsLayout:
                startActivity(new Intent(getApplicationContext(), AlbumsActivity.class));
                break;

            case R.id.songsLayout:
                startActivity(new Intent(getApplicationContext(), SongsActivity.class));
                break;
        }
    }
}
