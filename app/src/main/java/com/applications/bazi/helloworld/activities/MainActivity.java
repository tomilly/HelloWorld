package com.applications.bazi.helloworld.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.applications.bazi.helloworld.R;

public class MainActivity extends AppCompatActivity {
    String msg = "Android : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg,"onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg, "onPause");
    }

    @Override
    protected void onStop(){
        super.onPause();
        Log.d(msg, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onPause();
        Log.d(msg, "onDestroy");
    }
}
