package com.example.android.tourguidemadrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by sgomezp on 01/06/2017.
 */

public class MadridDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madrid_details);

        //Set the name to the TextView in the madrid_details.xml
        TextView largeText = (TextView)findViewById(R.id.description_details);


    }
}
