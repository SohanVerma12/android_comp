package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {

//    TabLayout tabLayout;
//    ViewPager viewPager;
//    FloatingActionButton fb, google, twitter;
//    float v = 0;

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        tabLayout = findViewById(R.id.tab_layout);
//        viewPager = findViewById(R.id.view_pager);
//        fb = findViewById(R.id.fab_fb);
//        google = findViewById(R.id.fab_google);
//        twitter = findViewById(R.id.fab_twitter);
//
//        tabLayout.addTab(tabLayout.newTab().setText("Login"));
//        tabLayout.addTab(tabLayout.newTab().setText("Signup"));
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//
//        loginAdapter adapter = new loginAdapter(getSupportFragmentManager(), this, tabLayout.getTabCount());
//        viewPager.setAdapter(adapter);
//
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//
//        fb.setTranslationY(300);
//        google.setTranslationY(300);
//        twitter.setTranslationY(300);
//        tabLayout.setTranslationY(300);
//
//        fb.setAlpha(v);
//        google.setAlpha(v);
//        twitter.setAlpha(v);
//        tabLayout.setAlpha(v);
//
//        fb.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
//        google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
//        twitter.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
//        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();
//
//
//    }
//}

        viewPager = findViewById(R.id.view_pager);

        // setting up the adapter
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        // add the fragments
        viewPagerAdapter.add(new LoginTabFragment(), "Page 1");
        viewPagerAdapter.add(new SignTabFragment(), "Page 2");
//        viewPagerAdapter.add(new Page3(), "Page 3");

        // Set the adapter
        viewPager.setAdapter(viewPagerAdapter);

        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}