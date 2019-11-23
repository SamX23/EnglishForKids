package com.samdev.azzuraenglishlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashScreen extends AppCompatActivity {

    private void LogCheck(String txt) {
        String Splash_log = SplashScreen.class.getSimpleName();
        Log.d(Splash_log, txt);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        LogCheck("OnCreateSplash");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        }, 2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogCheck("onDestroySplash");
    }
}