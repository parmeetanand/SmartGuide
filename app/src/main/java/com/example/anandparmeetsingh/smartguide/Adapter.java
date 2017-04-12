package com.example.anandparmeetsingh.smartguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ParmeetSingh on 4/3/2017.
 */

public class Adapter extends FragmentPagerAdapter {
    public Adapter(FragmentManager fm) {
        super(fm);
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