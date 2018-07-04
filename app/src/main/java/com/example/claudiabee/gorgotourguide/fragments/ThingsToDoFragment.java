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

public class ThingsToDoFragment extends Fragment {

    private RecyclerView mCardRecyclerView;
    private RecyclerView.LayoutManager mLinearLayoutManager;
    private RecyclerView.Adapter mAdapter;

    public ThingsToDoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.card_recycler, container, false);

        // Create a list of Info
        ArrayList<InfoCard> infoCards = new ArrayList<InfoCard>();
        infoCards.add(new InfoCard(getString(R.string.public_park), getString(R.string.public_park_info)));
        infoCards.add(new InfoCard(getString(R.string.stadium), getString(R.string.stadium_info)));
        infoCards.add(new InfoCard(getString(R.string.cinema), getString(R.string.cinema_info)));
        infoCards.add(new InfoCard(getString(R.string.sports_centre), getString(R.string.sports_centre_info)));
        infoCards.add(new InfoCard(getString(R.string.public_library), getString(R.string.public_library_info)));
        infoCards.add(new InfoCard(getString(R.string.events_pp), getString(R.string.events_pp_info)));
        infoCards.add(new InfoCard(getString(R.string.sagra), getString(R.string.sagra_info)));
        infoCards.add(new InfoCard(getString(R.string.fair), getString(R.string.fair_info)));
        infoCards.add(new InfoCard(getString(R.string.mercatino), getString(R.string.mercatino_info)));

        // Instantiate a RecyclerView object
        mCardRecyclerView = rootView.findViewById(R.id.card_recycler);

        ///Instantiate a LinearlayoutManager to manage my cardRecyclerView
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mCardRecyclerView.setLayoutManager(mLinearLayoutManager);

        // Get an instance of InfoCardRecyclerAdapter
        mAdapter = new InfoCardRecyclerAdapter(infoCards);
        // Set the adapter on the cardRecyclerView
        mCardRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}
