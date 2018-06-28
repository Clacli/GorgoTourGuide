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


public class GeneralInfoFragment extends Fragment {

    private RecyclerView mCardRecyclerView;
    private RecyclerView.LayoutManager mLinearLayoutManager;
    private RecyclerView.Adapter mAdapter;

    public GeneralInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.card_recycler, container, false);

        // Create a list of Info
        ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info("Lorem Ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse et mattis tellus, finibus egestas ipsum. Cras faucibus laoreet libero consequat imperdiet. Vivamus egestas a ligula eu tempus.", R.drawable.pontesullamartesana));
        infos.add(new Info("Etiam justo odio", "Etiam justo odio, blandit non luctus sed, aliquam eu neque. ", R.drawable.segnaletica_ciclovia));
        infos.add(new Info("Vestibulum euismod", "Vestibulum euismod ante lorem, ac bibendum quam aliquet vel. In ac consectetur massa. ", R.drawable.geranio));
        infos.add(new Info("Morbi tincidunt", "Morbi tincidunt gravida mauris, at suscipit quam aliquam et. Donec euismod arcu est, vel mattis nisl scelerisque auctor.", R.drawable.pontesullamartesana));
        infos.add(new Info("Phasellus gravida", "Phasellus gravida dignissim neque, sed dignissim est. Sed non felis in magna lobortis molestie. Proin at vehicula tellus.", R.drawable.pontesullamartesana));

        // Instantiate a RecyclerView object
        mCardRecyclerView = rootView.findViewById(R.id.card_recycler);

        //Instantiate a LinearlayoutManager to manage my cardRecyclerView
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mCardRecyclerView.setLayoutManager(mLinearLayoutManager);

        // Get an instance of InfoRecyclerAdapter
        mAdapter = new InfoRecyclerAdapter(infos);
        // Set the adapter on the cardRecyclerView
        mCardRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}
