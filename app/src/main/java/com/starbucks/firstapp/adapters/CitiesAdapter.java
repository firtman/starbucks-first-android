package com.starbucks.firstapp.adapters;

import android.content.Context;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.CityViewHolder> {

    Context context;

    public CitiesAdapter(Context context) {
        this.context = context;
    }

    // Every time RecyclerView needs a new View Holder to use in the future
    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView rootView = new TextView(parent.getContext());
        rootView.setTextSize(40);
        return new CityViewHolder(rootView);
    }

    // Every time RecyclerView needs to render data into a View Holder
    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        Log.d("RecyclerView", String.valueOf(position));
        TextView tv = (TextView) holder.itemView;
        if (position % 2 == 0) {
            tv.setBackgroundColor(0xFFE489A3);  // ARGB
        } else {
            tv.setBackgroundColor(0xFFFFFFFF);  // ARGB
        }
        tv.setText("Position " + String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return 200;
    }

    class CityViewHolder extends RecyclerView.ViewHolder {

        public CityViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
