package com.example.pang.myapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.content.SharedPreferences;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
//
//        if (prefs.getString("weather", null) != null) {
//            Intent intent = new Intent(this, WeatherActivity.class);
//            startActivity(intent);
//            finish();
//        }
    }

}
