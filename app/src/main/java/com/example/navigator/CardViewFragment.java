package com.example.navigator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class CardViewFragment extends Fragment {
    RecyclerView cardView;
    String[] cities,desc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.card_view_fragment, container, false);

        cardView = view.findViewById(R.id.card_view_fragment);

        cities = getResources().getStringArray(R.array.cities);
        desc = getResources().getStringArray(R.array.cities);

        final CardViewAdapter cardViewAdapter = new CardViewAdapter(cities,desc);

        cardView.setAdapter(cardViewAdapter);
        cardView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }


}
