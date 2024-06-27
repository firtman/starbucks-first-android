package com.starbucks.firstapp.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import com.starbucks.firstapp.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);
        setSupportActionBar(findViewById(R.id.toolbar));

        setTitle("Republic of MA");

        findViewById(R.id.btn_open_currency).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, CurrencyActivity.class);
                startActivity(intent);
            }
        });


    }

}