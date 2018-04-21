package com.test.axel.sandec21.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

import com.test.axel.sandec21.Constant;

import java.util.ArrayList;

/**
 * Created by Axel on 21/04/2018.
 */

public class ViawPagerVpAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments = new ArrayList<>();


    public ViawPagerVpAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;

        switch (position) {
            case 0:
                return title = Constant.GAMBAR_1;
            case 1:
                return title = Constant.GAMBAR_2;
            default:
                return null;
        }
    }

    public void addFragment(Fragment fragment) {
        fragments.add(fragment);
    }
}
