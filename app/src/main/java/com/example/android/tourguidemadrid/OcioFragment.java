package com.example.android.tourguidemadrid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OcioFragment extends Fragment {


    public OcioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.madrid_list, container, false);

        //I Create an arrayList called "madrid"
        final ArrayList<MadridInfo> madrid = new ArrayList<MadridInfo>();

        // add elements to the ArrayList

        madrid.add(new MadridInfo(getString(R.string.warner_name),
                getString(R.string.warner_address), getString(R.string.warner_timetable),
                getString(R.string.warner_price), getString(R.string.warner_web),
                getString(R.string.warner_map),
                getString(R.string.warner_descripcion),R.drawable.warner));

        madrid.add(new MadridInfo(getString(R.string.faunia_name),
                getString(R.string.faunia_address), getString(R.string.faunia_timetable),
                getString(R.string.faunia_price), getString(R.string.faunia_web),
                getString(R.string.faunia_map),
                getString(R.string.faunia_descripcion),R.drawable.faunia));

        madrid.add(new MadridInfo(getString(R.string.snow_zone_name),
                getString(R.string.snow_zone_address), getString(R.string.snow_zone_timetable),
                getString(R.string.snow_zone_price), getString(R.string.snow_zone_web),
                getString(R.string.snow_zone_map),
                getString(R.string.snow_zone_descripcion),R.drawable.snow_zone));

        madrid.add(new MadridInfo(getString(R.string.aquopolis_name),
                getString(R.string.aquopolis_address), getString(R.string.aquopolis_timetable),
                getString(R.string.aquopolis_price), getString(R.string.aquopolis_web),
                getString(R.string.aquopolis_map),
                getString(R.string.aquopolis_descripcion),R.drawable.aquopolis));

        madrid.add(new MadridInfo(getString(R.string.windobona_name),
                getString(R.string.windobona_address), getString(R.string.windobona_timetable),
                getString(R.string.windobona_price), getString(R.string.windobona_web),
                getString(R.string.windobona_map),
                getString(R.string.windobona_descripcion),R.drawable.windobona));


        final MadridInfoAdapter adapter = new MadridInfoAdapter(getActivity(), madrid);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
