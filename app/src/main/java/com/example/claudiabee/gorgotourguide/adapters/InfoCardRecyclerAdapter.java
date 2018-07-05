package com.example.claudiabee.gorgotourguide.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.claudiabee.gorgotourguide.InfoCard;
import com.example.claudiabee.gorgotourguide.R;

import java.util.ArrayList;

public class InfoCardRecyclerAdapter extends RecyclerView.Adapter<InfoCardRecyclerAdapter.InfoViewHolder> {

    private ArrayList<InfoCard> infoCards;

    public InfoCardRecyclerAdapter(ArrayList<InfoCard> infoCards) {
        this.infoCards = infoCards;
    }

    @Override
    public int getItemCount() {
        return infoCards.size();
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
        infoViewHolder.titleTextView.setText(infoCards.get(i).getInfoCardTitle());
        // Check if a description is provided for this InfoCard or not
        if (TextUtils.isEmpty(infoCards.get(i).getInfoCardDescription())) {
            infoViewHolder.descriptionTextView.setVisibility(View.GONE);
        } else {
            infoViewHolder.descriptionTextView.setText(infoCards.get(i).getInfoCardDescription());
        }
        // Check if an image is provided for this InfoCard or not
        if (infoCards.get(i).hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            infoViewHolder.cardImageView.setImageResource(infoCards.get(i).getImageResourceId());
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