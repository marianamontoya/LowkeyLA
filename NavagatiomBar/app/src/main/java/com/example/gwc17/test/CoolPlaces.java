package com.example.gwc17.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jessicahoffman on 7/27/17.
 */

public class CoolPlaces extends AppCompatActivity {
    View myView;

    @Nullable
//    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.coolplaces, container, false);
        return myView;

    }
}
