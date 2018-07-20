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


public class GeneralInfoFragment extends Fragment {

    // Bind String resources with Butter Knife
    @BindString(R.string.gorgonzola) String gorgonzola;
    @BindString(R.string.gorgonzola_description) String gorgonzolaDescription;
    @BindString(R.string.geography) String geography;
    @BindString(R.string.geographical_info) String geographicalInfo;
    @BindString(R.string.cheese) String cheese;
    @BindString(R.string.gorgonzola_cheese_info) String cheeseInfo;
    @BindString(R.string.parco_agricolo) String parcoAgricolo;
    @BindString(R.string.parco_agricolo_info) String parcoAgricoloInfo;
    @BindString(R.string.literature_curiosity) String literatureCuriosity;
    @BindString(R.string.literature_curiosity_text) String literatureCuriosityText;
    @BindString(R.string.twin_towns) String twinTowns;
    @BindString(R.string.twin_towns_info) String twinTownInfo;

    @BindView(R.id.card_recycler) RecyclerView mCardRecyclerView;
    private Unbinder unbinder;

    private RecyclerView.LayoutManager mLinearLayoutManager;
    private RecyclerView.Adapter mAdapter;

    public GeneralInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.card_recycler, container, false);
        unbinder = ButterKnife.bind(this, rootView);

        // Create a list of Info
        ArrayList<InfoCard> infoCards = new ArrayList<InfoCard>();
        infoCards.add(new InfoCard(gorgonzola, gorgonzolaDescription, R.drawable.naviglio_al_tramonto_bis));
        infoCards.add(new InfoCard(geography, geographicalInfo));
        infoCards.add(new InfoCard(cheese, cheeseInfo));
        infoCards.add(new InfoCard(parcoAgricolo, parcoAgricoloInfo));
        infoCards.add(new InfoCard(literatureCuriosity, literatureCuriosityText));
        infoCards.add(new InfoCard(twinTowns, twinTownInfo));

        //Instantiate a LinearLayoutManager to manage my cardRecyclerView
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
