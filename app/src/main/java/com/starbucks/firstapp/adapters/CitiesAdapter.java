package com.starbucks.firstapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.starbucks.firstapp.R;
import com.starbucks.firstapp.data.CitiesProvider;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.CityViewHolder> {

    Activity context;

    public CitiesAdapter(Activity context) {
        this.context = context;
    }

    // Every time RecyclerView needs a new View Holder to use in the future
    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rootView = inflater.inflate(R.layout.item_city, parent, false);
        return new CityViewHolder(rootView);
    }

    // Every time RecyclerView needs to render data into a View Holder
    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        String cityName = CitiesProvider.cities[position][0];
        String cityPopulation = CitiesProvider.cities[position][1];
        holder.bind(cityName, cityPopulation);
    }

    @Override
    public int getItemCount() {
        return CitiesProvider.cities.length;
    }

    class CityViewHolder extends RecyclerView.ViewHolder {

        public void bind(String name, String population) {
            clearAll();

            TextView textName = itemView.findViewById(R.id.text_city_name);
            textName.setText(name);
            TextView textPopulation = itemView.findViewById(R.id.text_city_population);
            textPopulation.setText(population);
        }

        public void clearAll() {
        }

        public CityViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
