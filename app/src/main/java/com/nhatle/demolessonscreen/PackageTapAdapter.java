package com.nhatle.demolessonscreen;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.google.android.material.tabs.TabLayout;

public class PackageTapAdapter extends FragmentStatePagerAdapter {
    TabLayout tabLayout;
    public PackageTapAdapter(FragmentManager fm, TabLayout _tabLayout) {
        super(fm);
        this.tabLayout = _tabLayout;
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new DomesticFragment();
        }
        else if (position == 1)
        {
            fragment = new InternationalFragment();
        }
        return fragment;
    }
    @Override
    public int getCount() {
        return 2;
    }
//    @Override
//    public CharSequence getPageTitle(int position) {
//        String title = null;
//        if (position == 0)
//        {
//            title = "Domestic";
//        }
//        else if (position == 1)
//        {
//            title = "International";
//        }
//        return title;
//    }
}
