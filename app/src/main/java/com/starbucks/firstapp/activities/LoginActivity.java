package com.starbucks.firstapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.starbucks.firstapp.R;

public class LoginActivity extends AppCompatActivity {

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
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        });

        //tinyurl.com/starbucks-workshop


    }
}