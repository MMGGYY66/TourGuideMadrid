package com.example.android.tourguidemadrid;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sgomezp on 29/05/2017.
 */

/*
* {@link MadridInfoAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link MadridInfo} objects.
* */

public class MadridInfoAdapter extends ArrayAdapter<MadridInfo> {

    /** Resource ID for the Background color for this list of words */
    private int mColorResourceId;
    private Context context = getContext();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param madrid A List of Word objects to display in a list
     */

    public MadridInfoAdapter(Activity context, ArrayList<MadridInfo> madrid) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, madrid);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link MadridInfo} object located at this position in the list
        MadridInfo currentSight = getItem(position);

        // Find the TextView in the list_item.xml layout with the TopSight Name TextView
        TextView topSightNameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the Tops Sight Name from the current Madrid object and
        // set this text on the name TextView
        topSightNameTextView.setText(currentSight.getTopSightName());


        // Find the TextView in the list_item.xml layout with the Address TextView
        TextView topSightAddressTextView = (TextView) listItemView.findViewById(R.id.address);
        // Get the address from the current Madrid object and
        // set this text on the address TextView
        topSightAddressTextView.setText(currentSight.getTopSightAddress());

        // Find the TextView in the list_item.xml layout with the timetable TextView
        TextView topSightTimetableTextView = (TextView) listItemView.findViewById(R.id.timetable);
        // Get the timetable from the current Madrid object and
        // set this text on the timetable TextView
        topSightTimetableTextView.setText(currentSight.getTopSightTime());

        // Find the TextView in the list_item.xml layout with the price TextView
        TextView topSightPriceTextView = (TextView) listItemView.findViewById(R.id.price);
        // Get the price from the current Madrid object and
        // set this text on the price TextView
        topSightPriceTextView.setText(currentSight.getTopSightPrice());



        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Check if an image is provided for this word or not
        if (currentSight.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentSight.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }





        // Set the color for the list item
        //View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        //int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        //textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews  and  an image)
        // so that it can be shown in the ListView
        return listItemView;
    }



}
