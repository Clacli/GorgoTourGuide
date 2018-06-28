package com.example.claudiabee.gorgotourguide.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.claudiabee.gorgotourguide.Info;
import com.example.claudiabee.gorgotourguide.InfoRecyclerAdapter;
import com.example.claudiabee.gorgotourguide.R;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    private RecyclerView mCardRecyclerView;
    private RecyclerView.LayoutManager mLinearLayoutManager;
    private RecyclerView.Adapter mAdapter;

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.card_recycler, container, false);

        // Create a list of Info
        ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info("Sagra Nazionale del Gorgonzola", "Ogni anno il " + "secondo weekend di settembre la città si fa festa, le strade si popolano di persone" + " che vengono a celebrare il celebre formaggio nella città in cui è nato e ha preso " + "il nome. Affollata e allegra festa di fine estate eventi, banchetti, " + "buon cibo e buona birra."));
        infos.add(new Info("Fiera di Santa Caterina", "Ogni ultimo weekend di " + "Novembre, dal 1785, si ripete una fiera "));
        infos.add(new Info("Mercatino di Arte e Cultura", "Ogni seconda domenica"));

        // Instantiate a RecyclerView object
        mCardRecyclerView = rootView.findViewById(R.id.card_recycler);

        ///Instantiate a LinearlayoutManager to manage my cardRecyclerView
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mCardRecyclerView.setLayoutManager(mLinearLayoutManager);

        // Get an instance of InfoRecyclerAdapter
        mAdapter = new InfoRecyclerAdapter(infos);
        // Set the adapter on the cardRecyclerView
        mCardRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}
