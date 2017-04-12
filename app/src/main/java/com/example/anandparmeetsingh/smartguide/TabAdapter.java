package com.example.anandparmeetsingh.smartguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ParmeetSingh on 4/10/2017.
 */

public class TabAdapter extends FragmentPagerAdapter {
    public TabAdapter(FragmentManager fm, Context context) {
        super(fm);
    }
    private String tabTiles[] = new  String[]{"Top Spots","Outdoor","Indoor","Indoor","Kid Friendly"};

    @Override
    public  CharSequence getPageTitle(int position){
        return tabTiles[position];
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Outdoors();
        } else if (position == 1) {
            return new TopSpots();
        } else if (position == 2) {
            return new Indoors();
        } else
            return new KidFriendly();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
