package com.example.myapplication;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.airbnb.lottie.L;

public class loginAdapter extends FragmentManager {

    private Context context;
    int totalTabs;

    public loginAdapter(FragmentManager fm, Context context, int totalTabs) {
        super();

        this.context = context;
        this.totalTabs = totalTabs;

    }

    public int getCount(){
        return totalTabs;
    }

    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                LoginTabFragment loginTabFragment = new LoginTabFragment();
                return loginTabFragment;
            case 1:
                SignTabFragment signTabFragment = new SignTabFragment();
                return signTabFragment;
            default:
                return null;
        }
    }
}
