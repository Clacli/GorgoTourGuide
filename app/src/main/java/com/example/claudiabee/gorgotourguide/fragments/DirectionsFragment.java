package com.example.claudiabee.gorgotourguide.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.claudiabee.gorgotourguide.InfoCard;
import com.example.claudiabee.gorgotourguide.InfoCardRecyclerAdapter;
import com.example.claudiabee.gorgotourguide.R;

import java.util.ArrayList;


public class DirectionsFragment extends Fragment {

    private RecyclerView mCardRecyclerView;
    private RecyclerView.LayoutManager mLinearLayoutLayout;
    private RecyclerView.Adapter mAdapter;

    public DirectionsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.card_recycler, container, false);

        // Create a list of InfoCard
        ArrayList<InfoCard> infoCards = new ArrayList<InfoCard>();
        infoCards.add(new InfoCard("Geranio", R.drawable.geranio));
        infoCards.add(new InfoCard("Rubus", R.drawable.geranio));
        infoCards.add(new InfoCard("Galium", R.drawable.geranio));
        infoCards.add(new InfoCard("Ficus", R.drawable.geranio));
        infoCards.add(new InfoCard("Sambucus", R.drawable.geranio));
        infoCards.add(new InfoCard("Tilium", R.drawable.geranio));
        infoCards.add(new InfoCard("Morus", R.drawable.geranio));

        // Instantiate a RecyclerView object
        mCardRecyclerView = rootView.findViewById(R.id.card_recycler);

        // Instantiate a LinearLayoutManager to manage the RecyclerView
        mLinearLayoutLayout = new LinearLayoutManager(getActivity());

        // Set the LinearLayoutManager on the RecyclerView
        mCardRecyclerView.setLayoutManager(mLinearLayoutLayout);

        // Get an instance of InfoCardRecyclerAdapter
        mAdapter = new InfoCardRecyclerAdapter(infoCards);

        // Set the adapter on the RecyclerView
        mCardRecyclerView.setAdapter(mAdapter);

        return rootView;
    }
}