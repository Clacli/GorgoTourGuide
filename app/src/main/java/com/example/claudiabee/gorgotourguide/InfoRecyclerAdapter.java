package com.example.claudiabee.gorgotourguide;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoRecyclerAdapter extends RecyclerView.Adapter<InfoRecyclerAdapter.InfoViewHolder> {

    ArrayList<Info> infos;

    public InfoRecyclerAdapter(ArrayList<Info> infos) {
        this.infos = infos;
    }

    @Override
    public int getItemCount() {
        return infos.size();
    }

    @NonNull
    @Override
    public InfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        // Inflate a view for the recyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        InfoViewHolder infoViewHolder = new InfoViewHolder(view);
        return infoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull InfoViewHolder infoViewHolder, int i) {
        infoViewHolder.titleTextView.setText(infos.get(i).getInfoTitle());
        infoViewHolder.descriptionTextView.setText(infos.get(i).getInfoDescription());
        // Check if an image is provided for this word or not
        if (infos.get(i).hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            infoViewHolder.cardImageView.setImageResource(infos.get(i).getImageResourceId());
            // Make sure the view is visible
            infoViewHolder.cardImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            infoViewHolder.cardImageView.setVisibility(View.GONE);
        }
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class InfoViewHolder extends RecyclerView.ViewHolder {
        CardView cardItem;
        TextView titleTextView;
        TextView descriptionTextView;
        ImageView cardImageView;

        InfoViewHolder(View itemView) {
            super(itemView);
            cardItem = itemView.findViewById(R.id.card_item);
            titleTextView = itemView.findViewById(R.id.card_title);
            descriptionTextView = itemView.findViewById(R.id.card_description);
            cardImageView = itemView.findViewById(R.id.card_image);

        }
    }


}