package com.example.adriana.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlaylistActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        Button homeBtn = (Button) findViewById(R.id.homeBtn);
        Button nowPlayingBtn = (Button) findViewById(R.id.nowPlayingBtn);
        Button albumsBtn = (Button) findViewById(R.id.albumsBtn);
        Button songsBtn = (Button) findViewById(R.id.songsBtn);

        homeBtn.setOnClickListener(this);
        nowPlayingBtn.setOnClickListener(this);
        albumsBtn.setOnClickListener(this);
        songsBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.homeBtn:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                break;

            case R.id.nowPlayingBtn:
                startActivity(new Intent(getApplicationContext(), NowPlayingActivity.class));
                break;

            case R.id.albumsBtn:
                startActivity(new Intent(getApplicationContext(), AlbumsActivity.class));
                break;

            case R.id.songsBtn:
                startActivity(new Intent(getApplicationContext(), SongsActivity.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {

    }
}
