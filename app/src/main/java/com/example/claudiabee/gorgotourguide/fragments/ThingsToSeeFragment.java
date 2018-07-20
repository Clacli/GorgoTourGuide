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

public class ThingsToSeeFragment extends Fragment {

    // Bind String resources with Butter Knife
    @BindString(R.string.naviglio) String naviglio;
    @BindString(R.string.naviglio_info) String naviglioInfo;
    @BindString(R.string.sanctuary) String sanctuary;
    @BindString(R.string.sanctuary_info) String sanctuaryInfo;
    @BindString(R.string.ca_busca) String caBusca;
    @BindString(R.string.ca_busca_info) String caBuscaInfo;
    @BindString(R.string.old_hospital) String oldHospital;
    @BindString(R.string.old_hospital_info) String oldHospitalInfo;
    @BindString(R.string.major_church) String majorChurch;
    @BindString(R.string.major_church_info) String majorChurchInfo;
    @BindString(R.string.palazzo_pirola_fregnaneschi) String palazzoPirolaFregnaneschi;
    @BindString(R.string.palazzo_pirola_fregnaneschi_info) String palazzoPirolaFregnaneschiInfo;

    @BindView(R.id.card_recycler) RecyclerView mCardRecyclerView;
    private Unbinder unbinder;

    private RecyclerView.LayoutManager mLinearLayoutManager;
    private RecyclerView.Adapter mAdapter;

    public ThingsToSeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.card_recycler, container, false);
        unbinder = ButterKnife.bind(this, rootView);

        // Create a list of InfoCard
        ArrayList<InfoCard> infoCards = new ArrayList<InfoCard>();
        infoCards.add(new InfoCard(naviglio, naviglioInfo, R.drawable.naviglio));
        infoCards.add(new InfoCard(sanctuary, sanctuaryInfo, R.drawable.sanctuary1));
        infoCards.add(new InfoCard(caBusca, caBuscaInfo, R.drawable.ponte_in_legno));
        infoCards.add(new InfoCard(oldHospital, oldHospitalInfo, R.drawable.ospedalevecchiogorgonzola));
        infoCards.add(new InfoCard(majorChurch, majorChurchInfo, R.drawable.chiesa_dal_naviglio));
        infoCards.add(new InfoCard(palazzoPirolaFregnaneschi, palazzoPirolaFregnaneschiInfo, R.drawable.palazzopirola));

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

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
