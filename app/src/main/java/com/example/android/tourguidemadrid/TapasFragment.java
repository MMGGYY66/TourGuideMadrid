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

        madrid.add(new MadridInfo(getString(R.string.rey_vinos_name),
                getString(R.string.rey_vinos_address), getString(R.string.rey_vinos_timetable),
                getString(R.string.rey_vinos_price), getString(R.string.rey_vinos_web),
                getString(R.string.rey_vinos_map),
                getString(R.string.rey_vinos_descripcion),R.drawable.rey_vinos));

        madrid.add(new MadridInfo(getString(R.string.botin_name),
                getString(R.string.botin_address), getString(R.string.botin_timetable),
                getString(R.string.botin_price), getString(R.string.botin_web),
                getString(R.string.botin_map),
                getString(R.string.botin_descripcion),R.drawable.botin));

        madrid.add(new MadridInfo(getString(R.string.viuda_name),
                getString(R.string.viuda_address), getString(R.string.viuda_timetable),
                getString(R.string.viuda_price), getString(R.string.viuda_web),
                getString(R.string.viuda_map),
                getString(R.string.viuda_descripcion),R.drawable.viuda_de_vacas));

        madrid.add(new MadridInfo(getString(R.string.casa_labra_name),
                getString(R.string.casa_labra_address), getString(R.string.casa_labra_timetable),
                getString(R.string.casa_labra_price), getString(R.string.casa_labra_web),
                getString(R.string.casa_labra_map),
                getString(R.string.casa_labra_descripcion),R.drawable.casa_labra));

        madrid.add(new MadridInfo(getString(R.string.bodega_ardosa_name),
                getString(R.string.bodega_ardosa_address), getString(R.string.bodega_ardosa_timetable),
                getString(R.string.bodega_ardosa_price), getString(R.string.bodega_ardosa_web),
                getString(R.string.bodega_ardosa_map),
                getString(R.string.bodega_ardosa_descripcion),R.drawable.bodega_ardosa));


        final MadridInfoAdapter adapter = new MadridInfoAdapter(getActivity(), madrid);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
