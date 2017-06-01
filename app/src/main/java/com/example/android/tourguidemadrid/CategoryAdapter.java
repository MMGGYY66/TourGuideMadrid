package com.example.android.tourguidemadrid;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sgomezp on 29/05/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TopSightsFragment();

        } else if(position == 1) {
            return new TapasFragment();
        }else {
            return new RutasFragment();
        }
    }

    /**
     * Return the total number of pages.
     */

    @Override
    public int getCount() {

        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Set the titles of the tabs for the TabLayout
        if (position == 0){
            return mContext.getString(R.string.sights_Tab);
        }
        else if(position == 1) {
            return mContext.getString(R.string.tapas_Tab);
        } else{
            return mContext.getString(R.string.rutas_Tab);
        }


    }

}
