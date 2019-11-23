package com.samdev.azzuraenglishlearning;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class animalActivity extends AppCompatActivity implements View.OnClickListener {

    //Log for checking status
    private void LogCheck(String txt) {
        String Animal_Log = animalActivity.class.getSimpleName();
        Log.d(Animal_Log, txt);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        LogCheck("onCreateAnimal");

        buttonSetup();
    }

    //Setup ImageButton
    public void buttonSetup() {
        ImageView img1 = findViewById(R.id.cowimage);
        img1.setOnClickListener(this);

        ImageView img2 = findViewById(R.id.dogimage);
        img2.setOnClickListener(this);

        ImageView img3 = findViewById(R.id.catimage);
        img3.setOnClickListener(this);

        ImageView img4 = findViewById(R.id.chickimage);
        img4.setOnClickListener(this);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    //Setup ImageButtonOnClick
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cowcard:
            case R.id.cowimage:
            case R.id.cowtext:
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.cow);
                mp.start();
                break;

            case R.id.dogcard:
            case R.id.dogimage:
            case R.id.dogtext:
                MediaPlayer mp2 = MediaPlayer.create(getApplicationContext(), R.raw.dog);
                mp2.start();
                break;

            case R.id.catcard:
            case R.id.catimage:
            case R.id.cattext:
                MediaPlayer mp3 = MediaPlayer.create(getApplicationContext(), R.raw.cat);
                mp3.start();
                break;

            case R.id.chickcard:
            case R.id.chickimage:
            case R.id.chicktext:
                MediaPlayer mp4 = MediaPlayer.create(getApplicationContext(), R.raw.chic);
                mp4.start();
                break;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogCheck("onPauseAnimal");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogCheck("onDestroyAnimal");
    }

}
