package com.samdev.azzuraenglishlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class numbersActivity extends AppCompatActivity {

    //Log for checking status
    private void LogCheck(String txt) {
        String Numbers_log = numbersActivity.class.getSimpleName();
        Log.d(Numbers_log, txt);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        LogCheck("onCreateNumbers");

    }

    @Override
    protected void onPause() {
        super.onPause();
        LogCheck("onPauseNumbers");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogCheck("onDestroyAnimal");
    }

}
