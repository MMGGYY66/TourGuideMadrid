package com.example.android.tourguidemadrid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sgomezp on 01/06/2017.
 */

public class MadridDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madrid_details);

        //Get the properties of the MadridInfo Object from the intent
        Bundle bundle = getIntent().getExtras();
        String sightName = bundle.getString(getString(R.string.sight_name_var));
        String sightAddress = bundle.getString(getString(R.string.sight_address_var));
        String sightTime = bundle.getString(getString(R.string.sight_time_var));
        String sightPrice = bundle.getString(getString(R.string.sight_price_var));
        final String sightWeb = bundle.getString(getString(R.string.sight_web_var));
        final String sightMap = bundle.getString(getString(R.string.sight_map_var));
        int sightImage = bundle.getInt(getString(R.string.sight_image_var));
        String sightDescription = bundle.getString(getString(R.string.sight_description_var));


        //Set the name of sight as the title of the screen
        this.setTitle(sightName);

        //Activate Up Button to enable the navigation back to the MainActivity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set the image to the ImageView in the madrid_details.xml
        ImageView imageView = (ImageView) findViewById(R.id.image_details);
        imageView.setImageResource(sightImage);

        //Set the name to the TextView in the madrid_details.xml
        TextView nameTextView = (TextView) findViewById(R.id.name_details);
        nameTextView.setText(sightName);

        //Set the address to the TextView in the madrid_details.xml
        TextView addressTextView = (TextView) findViewById(R.id.address_details);
        addressTextView.setText(sightAddress);

        // Set the price to the TexView in the madrid_details.xml
        TextView priceTextView = (TextView) findViewById(R.id.price_details);
        priceTextView.setText(sightPrice);

        // Set the Time to the TexView in the madrid_details.xml
        TextView timeTextView = (TextView) findViewById(R.id.timetable_details);
        timeTextView.setText(sightTime);


        //Set the description to the TextView in the madrid_details.xml
        TextView descriptionTextView = (TextView) findViewById(R.id.description_details);
        descriptionTextView.setText(sightDescription);


        //Create an intent for the web page of the sight
        final TextView webTextView = (TextView) findViewById(R.id.web_details);

        webTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Uri webPage = Uri.parse(sightWeb);
                Intent webPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(sightWeb));
                if (webPageIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webPageIntent);
                }
            }
        });

        //Create an intent for the map of the sight
        final TextView mapTextView = (TextView) findViewById(R.id.map_details);

        mapTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(sightMap));
                if (webPageIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webPageIntent);
                }
            }
        });


    }
}
