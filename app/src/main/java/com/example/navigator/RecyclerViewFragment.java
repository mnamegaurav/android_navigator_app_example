package com.example.navigator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class RecyclerViewFragment extends Fragment {
    RecyclerView recyclerView;
    String[] cities_data,cities_desc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.recycler_view_fragment, container, false);

       recyclerView = view.findViewById(R.id.recycler_view_fragment);
       cities_data = getResources().getStringArray(R.array.cities);
       cities_desc = getResources().getStringArray(R.array.cities);

       final RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(cities_data,cities_desc);

       recyclerView.setAdapter(recyclerViewAdapter);
       recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}
