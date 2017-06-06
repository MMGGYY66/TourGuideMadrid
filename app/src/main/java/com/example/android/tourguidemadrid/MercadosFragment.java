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
public class MercadosFragment extends Fragment {


    public MercadosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.madrid_list, container, false);

        // Create an arrayList called "madrid"
        final ArrayList<MadridInfo> madrid = new ArrayList<MadridInfo>();

        // add elements to the ArrayList

        madrid.add(new MadridInfo(getString(R.string.mercado_san_miguel_name),
                getString(R.string.mercado_san_miguel_address), getString(R.string.mercado_san_miguel_timetable),
                getString(R.string.mercado_san_miguel_price), getString(R.string.mercado_san_miguel_web),
                getString(R.string.mercado_san_miguel_map),
                getString(R.string.mercado_san_miguel_descripcion),R.drawable.mercado_san_miguel));

        madrid.add(new MadridInfo(getString(R.string.mercado_san_anton_name),
                getString(R.string.mercado_san_anton_address), getString(R.string.mercado_san_anton_timetable),
                getString(R.string.mercado_san_anton_price), getString(R.string.mercado_san_anton_web),
                getString(R.string.mercado_san_anton_map),
                getString(R.string.mercado_san_anton_descripcion),R.drawable.mercado_sananton));

        madrid.add(new MadridInfo(getString(R.string.mercado_san_ildefonso_name),
                getString(R.string.mercado_san_ildefonso_address), getString(R.string.mercado_san_ildefonso_timetable),
                getString(R.string.mercado_san_ildefonso_price), getString(R.string.mercado_san_ildefonso_web),
                getString(R.string.mercado_san_ildefonso_map),
                getString(R.string.mercado_san_ildefonso_descripcion),R.drawable.mercado_san_ildefonso));

        madrid.add(new MadridInfo(getString(R.string.platea_name),
                getString(R.string.platea_address), getString(R.string.platea_timetable),
                getString(R.string.platea_price), getString(R.string.platea_web),
                getString(R.string.platea_map),
                getString(R.string.platea_descripcion),R.drawable.la_platea));

        madrid.add(new MadridInfo(getString(R.string.gran_via_name),
                getString(R.string.gran_via_address), getString(R.string.gran_via_timetable),
                getString(R.string.gran_via_price), getString(R.string.gran_via_web),
                getString(R.string.gran_via_map),
                getString(R.string.gran_via_descripcion),R.drawable.gran_via));


        final MadridInfoAdapter adapter = new MadridInfoAdapter(getActivity(), madrid);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
