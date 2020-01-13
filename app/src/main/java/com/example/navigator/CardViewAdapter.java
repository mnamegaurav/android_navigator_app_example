package com.example.navigator;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {
    String[] cities_data,cities_desc;

    public CardViewAdapter(String[] cities, String[] desc) {
        cities_data = cities;
        cities_desc = desc;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.card_view_layout, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.textView1.setText(cities_data[position]);
        holder.textView2.setText(cities_desc[position]);
    }

    @Override
    public int getItemCount() {
        return cities_data.length;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{
        TextView textView1,textView2;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.card_view_text1);
            textView2 = itemView.findViewById(R.id.card_view_text2);
        }
    }
}