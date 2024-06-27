package com.starbucks.firstapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStop() {
        Log.d("Lifecycle", "onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("Lifecycle", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.d("Lifecycle", "onPause");
        super.onPause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Lifecycle", "onCreate");

        setContentView(R.layout.activity_main);


        //tinyurl.com/starbucks-workshop


    }
}