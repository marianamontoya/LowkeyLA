package com.example.gwc17.test;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by GWC17 on 7/25/2017.
 */

public class Food extends AppCompatActivity {

    View myView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Nullable
//    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        Log.d("mytag","test3");
        myView = inflater.inflate(R.layout.first_layout, container, false);
//        Log.d("mytag","test4");
        return myView;

    }
}



