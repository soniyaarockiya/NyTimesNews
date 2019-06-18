package com.example.a91user.nytimesnews;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewpager;
    private ViewPageAdapter VPadapter; // create instance of view pager adapter class


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tablayout_id);
        viewpager = findViewById(R.id.viewpager_id);
        VPadapter = new ViewPageAdapter(getSupportFragmentManager());

        VPadapter.AddFragment(new science_fragment(), ""); // add fragment
        VPadapter.AddFragment(new technology_fragment(), "");

        viewpager.setAdapter(VPadapter); // add adapter to view pager
        tabLayout.setupWithViewPager(viewpager); // add view pager to tab layout

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_world);// set icons instead of name for tabs
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_india);


        ActionBar actionbar = getSupportActionBar();
        actionbar.setElevation(0);
    }
}
