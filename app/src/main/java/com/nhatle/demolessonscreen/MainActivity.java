package com.nhatle.demolessonscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager mImageViewPager;
    private String TAG = "PackageActivity";
    private Context context;
    public static TabLayout tabLayout;
    private PackageTapAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageViewPager = (ViewPager) findViewById(R.id.pager);
        tabLayout = (TabLayout) findViewById(R.id.tabDots);
        createTabFragment();
    }

    private void createTabFragment() {
        adapter = new PackageTapAdapter(getSupportFragmentManager(), tabLayout);
        mImageViewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(mImageViewPager,true);
    }
}