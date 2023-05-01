package com.example.dynamicfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;

import android.app.FragmentManager;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        DisplayMetrics display = this.getResources().getDisplayMetrics();

        int width = display.widthPixels;
        int height = display.heightPixels;

        if (width > height) {
            Fragment1 fragment1 = new Fragment1();
            fragmentTransaction.replace(
                    android.R.id.content, fragment1, null);
        } else {
            Fragment2 fragment2 = new Fragment2();
            fragmentTransaction.replace(
                    android.R.id.content, fragment2);
        }

        fragmentTransaction.commit();
    }
}