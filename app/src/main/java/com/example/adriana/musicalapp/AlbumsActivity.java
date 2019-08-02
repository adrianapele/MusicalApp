package com.example.adriana.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        Button homeBtn = (Button) findViewById(R.id.homeBtn);
        Button nowPlayingBtn = (Button) findViewById(R.id.nowPlayingBtn);
        Button playlistBtn = (Button) findViewById(R.id.playlistBtn);
        Button songsBtn = (Button) findViewById(R.id.songsBtn);

        homeBtn.setOnClickListener(this);
        nowPlayingBtn.setOnClickListener(this);
        playlistBtn.setOnClickListener(this);
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

            case R.id.playlistBtn:
                startActivity(new Intent(getApplicationContext(), PlaylistActivity.class));
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
