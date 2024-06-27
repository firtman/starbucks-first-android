package com.starbucks.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
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

        EditText editUser = findViewById(R.id.edit_user);
        String username = editUser.getText().toString();

        findViewById(R.id.btn_login).setOnClickListener(view -> {
            Intent intent = new Intent(this, NextActivity.class);
            startActivity(intent);
        });

        //tinyurl.com/starbucks-workshop


    }
}