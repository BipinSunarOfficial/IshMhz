package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class DashboardActivity extends AppCompatActivity {
    private Toolbar  toolbar;
    private TabLayout tabLayout;
    private ViewPageAdapter adapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initToolbar();
        findViews();
        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);

    }


    private void findViews(){
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

    }

    private void setupViewPager(){
     adapter = new ViewPageAdapter(getSupportFragmentManager());

     adapter.addFragment(new HomeFragment(),"Home");
     adapter.addFragment(new DashboardFragment(),"Dashboard");
     viewPager.setAdapter(adapter);
    }


    private void initToolbar(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Dashboard");

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }
}