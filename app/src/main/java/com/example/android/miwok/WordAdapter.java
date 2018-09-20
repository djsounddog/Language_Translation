package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the current Word object located at the requested position in the list
        Word currentWord = getItem(position);

        //Set the background color on text containers
        View textContainer = listItemView.findViewById(R.id.text_container);
        int backgroundColor  = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(backgroundColor);

        //Get the miwok translation TextView
        TextView miwokTranslation = listItemView.findViewById(R.id.miwok_text_view);
        //Assign it the current miwok translation value from the requested Word object
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        //Get the default language translation TextView
        TextView defaultTranslation = listItemView.findViewById(R.id.default_text_view);
        //Assign it the current default language translation value from the requested Word object
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        //Set the ImageView
        ImageView miwokImage = listItemView.findViewById(R.id.image);
        //Add or remove the space for teh images depending if present or not in the Word constructor
        if (currentWord.hasImage()) {
            //Make the image view VISIBLE and assign the image to the ImageView
            miwokImage.setVisibility(View.VISIBLE);
            miwokImage.setImageResource(currentWord.getImage());
        } else {
            //Remove the ImageView when no image is present
            miwokImage.setVisibility(View.GONE);
        }

        //Return all the populated views as a consolidated View
        return listItemView;

    }
}
