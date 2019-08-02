package com.example.adriana.musicalapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.adriana.musicalapp.model.Song;
import com.example.adriana.musicalapp.model.SongAdapter;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song(R.drawable.listen, "Rihanna", "Rehab", "04:12"));
        songs.add(new Song(R.drawable.listen, "Outlandish", "Callin U", "04:27"));
        songs.add(new Song(R.drawable.listen, "James Arthur", "Naked", "04:02"));
        songs.add(new Song(R.drawable.listen, "Sia", "Helium", "04:11"));
        songs.add(new Song(R.drawable.listen, "Robin Schulz", "OK", "03:37"));
        songs.add(new Song(R.drawable.listen, "Sean Kingston", "Fire Burning", "04:06"));
        songs.add(new Song(R.drawable.listen, "Fly Project", "Get Wet", "02:48"));
        songs.add(new Song(R.drawable.listen, "Nervo & Savi", "Forevor Or Nothing", "03:22"));
        songs.add(new Song(R.drawable.listen, "Dua Lipa", "New Rules", "03:45"));
        songs.add(new Song(R.drawable.listen, "Arilena Ari", "Nentori", "04:03"));
        songs.add(new Song(R.drawable.listen, "Arilena Ari", "Nentori", "04:03"));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getApplicationContext(), NowPlayingActivity.class));
            }
        });
    }
}
