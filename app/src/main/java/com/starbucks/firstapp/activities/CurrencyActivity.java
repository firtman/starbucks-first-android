package com.starbucks.firstapp.activities;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.starbucks.firstapp.R;

import org.json.JSONException;
import org.json.JSONObject;

public class CurrencyActivity extends AppCompatActivity {

    private String[] currencies = new String[] { "EUR", "GBP", "JPY", "BRL" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                    android.R.layout.simple_spinner_item, currencies);
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );
        spinner.setAdapter(adapter);

        findViewById(R.id.btn_getrate).setOnClickListener(v -> {
            request();
        });

    }

    void request() {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://open.er-api.com/v6/latest/USD";

        JsonObjectRequest stringRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                response -> {
                    JSONObject rates = null;
                    try {
                        rates = response.getJSONObject("rates");
                        double eur = rates.getDouble("EUR");
                        Log.d("Volley", String.valueOf(eur));
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                },
                error -> {

                }
        );
        queue.add(stringRequest);

    }
}