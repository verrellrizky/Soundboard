package com.example.soundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundboardMeme extends AppCompatActivity {
    MediaPlayer avengers, bruh, horns, sadviolin, wasted, spongebob, directedby, windows;
    private Button normal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundboard_meme);

        avengers = MediaPlayer.create(SoundboardMeme.this, R.raw.avengers);
        bruh = MediaPlayer.create(SoundboardMeme.this, R.raw.bruh);
        horns = MediaPlayer.create(SoundboardMeme.this, R.raw.mlghorns);
        sadviolin = MediaPlayer.create(SoundboardMeme.this, R.raw.sadviolin);
        wasted = MediaPlayer.create(SoundboardMeme.this, R.raw.wasted);
        spongebob = MediaPlayer.create(SoundboardMeme.this, R.raw.spongebob);
        directedby = MediaPlayer.create(SoundboardMeme.this, R.raw.directedby);
        windows = MediaPlayer.create(SoundboardMeme.this, R.raw.windows);

        normal = (Button)findViewById(R.id.normal);

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNormal();
            }
        });
    }

    public void openNormal(){
        Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
    }

    public void playAvengers(View view){
        avengers.start();
    }

    public void playBruh(View view){
        bruh.start();
    }

    public void playHorns(View view){
        horns.start();
    }

    public void playSadviolin(View view){
        sadviolin.start();
    }

    public void playWasted(View view){
        wasted.start();
    }

    public void playSpongebob(View view){
        spongebob.start();
    }

    public void playDirectedby(View view){
        directedby.start();
    }

    public void playWindows(View view){
        windows.start();
    }
}
