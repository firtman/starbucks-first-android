package com.starbucks.firstapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.starbucks.firstapp.R;
import com.starbucks.firstapp.adapters.CitiesAdapter;

public class CitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);


        RecyclerView recyclerView = findViewById(R.id.recycler_cities);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));
        CitiesAdapter adapter = new CitiesAdapter(this);
        recyclerView.setAdapter(adapter);
    }
}