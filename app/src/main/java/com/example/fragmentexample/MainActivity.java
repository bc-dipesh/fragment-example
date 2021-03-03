package com.example.fragmentexample;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleFragment(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        if (toggle == 0) {
            Fragment1 fragment1 = new Fragment1();
            fragmentManager.beginTransaction().replace(R.id.container1, fragment1).addToBackStack(null).commit();
            toggle = 1;
        } else {
            Fragment2 fragment2 = new Fragment2();
            fragmentManager.beginTransaction().replace(R.id.container1, fragment2).addToBackStack(null).commit();
            toggle = 0;
        }

    }


}