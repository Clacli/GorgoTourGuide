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

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class DirectionsFragment extends Fragment {

    // Bind String resources with Butter Knife
    @BindString(R.string.car_directions) String car;
    @BindString(R.string.car_directions_info) String carInfo;
    @BindString(R.string.metro_directions) String metro;
    @BindString(R.string.metro_directions_info) String metroInfo;
    @BindString(R.string.bike_directions) String bike;
    @BindString(R.string.bike_directions_info) String bikeInfo;
    @BindString(R.string.bus_directions) String bus;
    @BindString(R.string.bus_directions_info) String busInfo;
    @BindString(R.string.train_directions) String train;
    @BindString(R.string.train_directions_info) String trainInfo;

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
        infoCards.add(new InfoCard(car, carInfo));
        infoCards.add(new InfoCard(metro, metroInfo));
        infoCards.add(new InfoCard(bike, bikeInfo));
        infoCards.add(new InfoCard(bus, busInfo));
        infoCards.add(new InfoCard(train, trainInfo));

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
