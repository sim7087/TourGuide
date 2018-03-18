package com.reportapp071997.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Word> {
    public PlaceAdapter(Activity context, ArrayList<Word> placeName) {
        super(context, 0, placeName);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentPlace = getItem(position);
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.place_layout, parent, false);
        TextView placeDesc = (TextView) listItemView.findViewById(R.id.desc_text_view);
        placeDesc.setText(currentPlace.getPlaceDesc());
        ImageView image = (ImageView) listItemView.findViewById(R.id.place_image_view);
        if (currentPlace.hasImage()) {
            image.setImageResource(currentPlace.getImageView());
            image.setVisibility(convertView.VISIBLE);
        } else {
            image.setVisibility(convertView.GONE);
        }
        return listItemView;
    }


}
