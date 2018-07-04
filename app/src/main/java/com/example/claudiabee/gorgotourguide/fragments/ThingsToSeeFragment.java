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

public class ThingsToSeeFragment extends Fragment {

    private RecyclerView mCardRecyclerView;
    private RecyclerView.LayoutManager mLinearLayoutManager;
    private RecyclerView.Adapter mAdapter;

    public ThingsToSeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.card_recycler, container, false);

        // Create a list of InfoCard
        ArrayList<InfoCard> infoCards = new ArrayList<InfoCard>();
        infoCards.add(new InfoCard(getString(R.string.naviglio), getString(R.string.naviglio_info), R.drawable.naviglio));
        infoCards.add(new InfoCard(getString(R.string.sanctuary), getString(R.string.sanctuary_info), R.drawable.sanctuary1));
        infoCards.add(new InfoCard(getString(R.string.ca_busca), getString(R.string.ca_busca_info), R.drawable.ponte_in_legno));
        infoCards.add(new InfoCard(getString(R.string.old_hospital), getString(R.string.old_hospital_info), R.drawable.ospedalevecchiogorgonzola));
        infoCards.add(new InfoCard(getString(R.string.major_church), getString(R.string.major_church_info), R.drawable.chiesa_dal_naviglio));
        infoCards.add(new InfoCard(getString(R.string.palazzo_pirola_fregnaneschi), getString(R.string.palazzo_pirola_fregnaneschi_info), R.drawable.palazzopirola));

        // Instantiate a RecyclerView object
        mCardRecyclerView = rootView.findViewById(R.id.card_recycler);

        // Instantiate a LinearLayoutManager to manage the RecyclerView
        mLinearLayoutManager = new LinearLayoutManager(getActivity());

        // Set the LinearLayoutManager on the RecyclerView
        mCardRecyclerView.setLayoutManager(mLinearLayoutManager);

        // Get an instance of InfoCardRecyclerAdapter
        mAdapter = new InfoCardRecyclerAdapter(infoCards);

        // Set the adapter on the RecyclerView
        mCardRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}
