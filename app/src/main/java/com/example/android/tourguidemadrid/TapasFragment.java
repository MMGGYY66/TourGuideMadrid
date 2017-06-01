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
public class TapasFragment extends Fragment {


    public TapasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.madrid_list, container, false);

        //I Create an arrayList called "madrid"
        final ArrayList<MadridInfo> madrid = new ArrayList<MadridInfo>();

        // add elements to the ArrayList

        madrid.add(new MadridInfo(getString(R.string.museo_prado_name),getString(R.string.museo_prado_address),
                getString(R.string.museo_prado_timetable),getString(R.string.museo_prado_price),
                R.drawable.museo_del_prado));
        madrid.add(new MadridInfo(getString(R.string.plaza_mayor_name),getString(R.string.plaza_mayor_address),
                getString(R.string.plaza_mayor_timetable), getString(R.string.plaza_mayor_price),
                R.drawable.museo_del_prado));

        final MadridInfoAdapter adapter = new MadridInfoAdapter(getActivity(), madrid);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
