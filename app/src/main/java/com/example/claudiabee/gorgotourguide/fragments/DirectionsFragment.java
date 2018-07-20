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
import com.example.claudiabee.gorgotourguide.R;
import com.example.claudiabee.gorgotourguide.adapters.InfoCardRecyclerAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class DirectionsFragment extends Fragment {

    @BindView(R.id.card_recycler) RecyclerView mCardRecyclerView;
    private Unbinder unbinder;

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
        unbinder = ButterKnife.bind(this, rootView);

        // Create a list of InfoCard
        ArrayList<InfoCard> infoCards = new ArrayList<InfoCard>();
        infoCards.add(new InfoCard(getString(R.string.car_directions), getString(R.string.car_directions_info)));
        infoCards.add(new InfoCard(getString(R.string.metro_directions), getString(R.string.metro_directions_info)));
        infoCards.add(new InfoCard(getString(R.string.bike_directions), getString(R.string.bike_directions_info)));
        infoCards.add(new InfoCard(getString(R.string.bus_directions), getString(R.string.bus_directions_info)));
        infoCards.add(new InfoCard(getString(R.string.train_directions), getString(R.string.train_directions_info)));

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

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
