package com.example.gwc17.test;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


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


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        Log.d("mytag","inside");

        if (item.getItemId() == R.id.mapButton) {
            Intent i = new Intent(Food.this, FoodMap.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

//    private View.OnClickListener foodMapOCL = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            // do something when the button is clicked
//            Intent i = new Intent(Food.this, FoodMap.class);
//            startActivity(i);
//        }
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        Button foodMapButton = (Button) findViewById(R.id.mapButton);
//
//        if (foodMapOCL == null) {
//            Log.d("mytag","Null");
//        }
//        else {
//            Log.d("mytag", "NOT NULL");
//        }
//
//        if (foodMapButton == null) {
//            Log.d("mytag","FOOD NULL");
//        }
//        else {
//            Log.d("mytag", "FOOD NOT NULL");
//        }
//    }


    @Nullable
//    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.first_layout, container, false);
        return myView;

    }
}



