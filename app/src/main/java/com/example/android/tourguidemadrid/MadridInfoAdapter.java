package com.example.android.tourguidemadrid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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


    private Context context = getContext();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param madrid  A List of Word objects to display in a list
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

        //Get the object's properties
        String sightName = currentSight.getTopSightName();
        String sightAddress = currentSight.getTopSightAddress();
        String sightDescription = currentSight.getTopSightDescription();
        String sightPrice = currentSight.getTopSightPrice();
        String sightTime = currentSight.getTopSightTime();
        String sightWeb = currentSight.getTopSightWeb();
        String sightMap = currentSight.getTopSightMap();
        int sightImageId = currentSight.getImageResourceId();

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

        //Create an implicit intent to display the detailed sight information if the user taps on the list item
        final Intent sightIntent = new Intent(context, MadridDetailsActivity.class);

        //Put the properties of the Object to the intent
        sightIntent.putExtra(context.getString(R.string.sight_name_var),
                sightName);
        sightIntent.putExtra(context.getString(R.string.sight_address_var),
                sightAddress);
        sightIntent.putExtra(context.getString(R.string.sight_description_var),
                sightDescription);
        sightIntent.putExtra(context.getString(R.string.sight_time_var), sightTime);
        sightIntent.putExtra(context.getString(R.string.sight_price_var), sightPrice);
        sightIntent.putExtra(context.getString(R.string.sight_web_var), sightWeb);
        sightIntent.putExtra(context.getString(R.string.sight_map_var), sightMap);
        sightIntent.putExtra(context.getString(R.string.sight_image_var), sightImageId);

        // Start the activity/intent

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(sightIntent);
            }
        });

        // Return the whole list item layout (containing 2 TextViews  and  an image)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
