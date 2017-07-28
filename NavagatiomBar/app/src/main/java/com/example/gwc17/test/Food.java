package com.example.gwc17.test;

import android.app.ListActivity;
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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.io.IOException;


/**
 * Created by GWC17 on 7/25/2017.
 */

public class Food extends AppCompatActivity {

    private View myView;
//    private String[] restaurants = new String[] {"test1\ntest0","test2"};
//    private String[] restaurants = new String[]{};
    private List<String> restaurantList = new ArrayList<>();
    private ListView listView;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.mapButton) {
            Intent i = new Intent(Food.this, FoodMap.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

    //remove?
//    @Nullable
////    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        myView = inflater.inflate(R.layout.first_layout, container, false);
//        return myView;
//
//    }


    public List<String> createFoodList() {

        ArrayList<String> arr = new ArrayList<String>();
//        final String dir = System.getProperty("user.dir");
//        Log.d("mytag","current dir = " + dir);
//        System.out.println("current dir = " + dir);

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("RestuarantsInfo.txt")));
            String line;
//            Log.e("Reader Stuff",reader.readLine());

            String data = "";
//            while ((line = reader.readLine()) != null) {
            line = reader.readLine();//restaurants
            while (!line.equals("MUSEUMS")) {
                Log.d("test",line);

//                if (line == null || line.isEmpty() || line.equals("RESTAURANTS")) {
                if(line.isEmpty() || line.equals("RESTAURANTS")) {
                    if (data != "") {
                        data+="\n";
                        restaurantList.add(data);
//                        Log.d("test","done");
                        data = "";
                    }
                } else {
                    if (data == "") {
                        data += "\n";
                        data += line.toUpperCase();
                    } else {
                        data += "\n\t"+line;
                    }

                }
                line = reader.readLine();
            }
//            restaurantList.add(data);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

//        Log.d("test","check");
//        return restaurants;
        return  restaurantList;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createFoodList();// restraunts = createFoodList();

        setContentView(R.layout.first_layout);
        listView = (ListView) findViewById(R.id.list);

//        Log.d("check",restaurants.toString());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, restaurantList);

        listView.setAdapter(adapter);

    }
}



