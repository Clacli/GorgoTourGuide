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

public class ThingsToDoFragment extends Fragment {

    // Bind strings with Butter Knife
    @BindString(R.string.public_park) String publicPark;
    @BindString(R.string.public_park_info) String publicParkInfo;
    @BindString(R.string.stadium) String stadium;
    @BindString(R.string.stadium_info) String stadiumInfo;
    @BindString(R.string.cinema) String cinema;
    @BindString(R.string.cinema_info) String cinemaInfo;
    @BindString(R.string.sports_centre) String sportsCentre;
    @BindString(R.string.sports_centre_info) String sportsCentreInfo;
    @BindString(R.string.public_library) String publicLibrary;
    @BindString(R.string.public_library_info) String publicLibraryInfo;
    @BindString(R.string.events_pp) String eventsPp;
    @BindString(R.string.events_pp_info) String eventsPpInfo;
    @BindString(R.string.sagra) String sagra;
    @BindString(R.string.sagra_info) String sagraInfo;
    @BindString(R.string.fair) String fair;
    @BindString(R.string.fair_info) String fairInfo;
    @BindString(R.string.mercatino) String mercatino;
    @BindString(R.string.mercatino_info) String mercatinoInfo;


    @BindView(R.id.card_recycler) RecyclerView mCardRecyclerView;
    private Unbinder unbinder;

    private RecyclerView.LayoutManager mLinearLayoutManager;
    private RecyclerView.Adapter mAdapter;

    public ThingsToDoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.card_recycler, container, false);
        unbinder = ButterKnife.bind(this, rootView);

        // Create a list of Info
        ArrayList<InfoCard> infoCards = new ArrayList<InfoCard>();
        infoCards.add(new InfoCard(publicPark, publicParkInfo));
        infoCards.add(new InfoCard(stadium, stadiumInfo));
        infoCards.add(new InfoCard(cinema, cinemaInfo));
        infoCards.add(new InfoCard(sportsCentre, sportsCentreInfo));
        infoCards.add(new InfoCard(publicLibrary, publicLibraryInfo));
        infoCards.add(new InfoCard(eventsPp, eventsPpInfo));
        infoCards.add(new InfoCard(sagra, sagraInfo));
        infoCards.add(new InfoCard(fair, fairInfo));
        infoCards.add(new InfoCard(mercatino, mercatinoInfo));

        ///Instantiate a LinearlayoutManager to manage my cardRecyclerView
        mLinearLayoutManager = new LinearLayoutManager(getActivity());

        // Set the LinearLayoutManager on the RecyclerView
        mCardRecyclerView.setLayoutManager(mLinearLayoutManager);

        // Get an instance of InfoCardRecyclerAdapter
        mAdapter = new InfoCardRecyclerAdapter(infoCards);

        // Set the adapter on the cardRecyclerView
        mCardRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
