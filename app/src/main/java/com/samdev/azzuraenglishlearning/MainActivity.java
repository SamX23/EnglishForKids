package com.samdev.azzuraenglishlearning;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Log for checking status
    private void LogCheck(String txt) {
        String MainAct_Log = MainActivity.class.getSimpleName();
        Log.d(MainAct_Log, txt);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogCheck("onCreateMainAct");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButtonSetup();
    }

    public void ButtonSetup() {
        ImageButton button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

        ImageButton button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Intent animalInt = new Intent(MainActivity.this, animalActivity.class);
                startActivity(animalInt);
                break;
            case R.id.button2:
                Intent numbersInt = new Intent(MainActivity.this, numbersActivity.class);
                startActivity(numbersInt);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Each activity in this menu is assigned in Manifest as a child of MainActivity
        int id = item.getItemId();
        if (id == R.id.close) {
            System.exit(1);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogCheck("onPauseMain");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogCheck("onDestroyMain");
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}