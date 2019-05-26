package com.example.soundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer dolphin, drum, laugh, rubberduck, sniper, infinityandbeyond, yearslater, bus;
    private Button meme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dolphin = MediaPlayer.create(MainActivity.this, R.raw.dolphin);
        drum = MediaPlayer.create(MainActivity.this, R.raw.drumming);
        laugh = MediaPlayer.create(MainActivity.this, R.raw.evillaugh);
        sniper = MediaPlayer.create(MainActivity.this, R.raw.sniper);
        infinityandbeyond = MediaPlayer.create(MainActivity.this, R.raw.toinfinityandbeyond);
        rubberduck = MediaPlayer.create(MainActivity.this, R.raw.rubberduckies);
        yearslater = MediaPlayer.create(MainActivity.this, R.raw.yearslater);
        bus = MediaPlayer.create(MainActivity.this, R.raw.horn);

        meme = (Button)findViewById(R.id.meme);


        meme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeme();
            }
        });
    }

public void openMeme(){
    Intent intent = new Intent(this, SoundboardMeme.class);
        startActivity(intent);

}

    public void playDolphin(View view){
        dolphin.start();
    }

    public void playDrum(View view){
        drum.start();
    }

    public void playLaugh(View view){
        laugh.start();
    }

    public void playDuckies(View view){
        rubberduck.start();
    }

    public void playSniper(View view){
        sniper.start();
    }

    public void playInfinity(View view){
        infinityandbeyond.start();
    }

    public void playYearslater(View view){
        yearslater.start();
    }

    public void playBus(View view){
        bus.start();
    }

}
