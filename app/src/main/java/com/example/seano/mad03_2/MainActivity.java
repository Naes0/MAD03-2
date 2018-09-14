package com.example.seano.mad03_2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment mapFrag = fm.findFragmentById(R.id.map);
        //Fragment selectorFrag = fm.findFragmentById(R.id.selectorRecyclerView);
        if (mapFrag == null)
        {
            mapFrag = new MapFragment();
            fm.beginTransaction().add(R.id.map, mapFrag).commit();
        }
        /*if (selectorFrag == null)
        {
            selectorFrag = new SelectorFragment();
            fm.beginTransaction().add(R.id.selectorRecyclerView, selectorFrag).commit();
        }*/
    }
}