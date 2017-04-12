package com.example.anandparmeetsingh.smartguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ParmeetSingh on 4/2/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_top_spots, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        name.setText(currentWord.getname());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView rating = (TextView) listItemView.findViewById(R.id.rating);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        rating.setText(currentWord.getrating());

        TextView description = (TextView) listItemView.findViewById(R.id.description);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        description.setText(currentWord.getdescription());
        ImageView miwokImageView = (ImageView) listItemView.findViewById(R.id.image);

        miwokImageView.setImageResource(currentWord.ImageResourceId());
        miwokImageView.setVisibility(View.VISIBLE);

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
