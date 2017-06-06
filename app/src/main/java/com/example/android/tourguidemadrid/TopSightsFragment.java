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
public class TopSightsFragment extends Fragment {


    public TopSightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.madrid_list, container, false);

        //I Create an arrayList called "madrid"
        final ArrayList<MadridInfo> madrid = new ArrayList<MadridInfo>();

        // add elements to the ArrayList

        madrid.add(new MadridInfo(getString(R.string.museo_prado_name),
                getString(R.string.museo_prado_address), getString(R.string.museo_prado_timetable),
                getString(R.string.museo_prado_price), getString(R.string.museo_prado_web),
                getString(R.string.museo_prado_map),
                getString(R.string.museo_prado_description),R.drawable.museo_del_prado));

        madrid.add(new MadridInfo(getString(R.string.palacio_real_name),getString(R.string.palacio_real_address),
                getString(R.string.palacio_real_timetable), getString(R.string.palacio_real_price),
                getString(R.string.palacio_real_web), getString(R.string.palacio_real_map),
                getString(R.string.palacio_real_descripcion),R.drawable.palacio_real));

        madrid.add(new MadridInfo(getString(R.string.templo_debod_name),getString(R.string.templo_debod_address),
                getString(R.string.templo_debod_timetable), getString(R.string.templo_debod_price),
                getString(R.string.templo_debod_web), getString(R.string.templo_debod_map),
                getString(R.string.templo_debod_descripcion),R.drawable.templo_debod));

        madrid.add(new MadridInfo(getString(R.string.parque_retiro_name),getString(R.string.parque_retiro_address),
                getString(R.string.parque_retiro_timetable), getString(R.string.parque_retiro_price),
                getString(R.string.parque_retiro_web), getString(R.string.parque_retiro_map),
                getString(R.string.parque_retiro_descripcion),R.drawable.parque_retiro));

        madrid.add(new MadridInfo(getString(R.string.capricho_name),getString(R.string.capricho_address),
                getString(R.string.capricho_timetable), getString(R.string.capricho_price),
                getString(R.string.capricho_web), getString(R.string.capricho_map),
                getString(R.string.capricho_descripcion),R.drawable.capricho));

        final MadridInfoAdapter adapter = new MadridInfoAdapter(getActivity(), madrid);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
