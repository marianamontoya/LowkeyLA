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


    public void createFoodList() {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("RestuarantsInfo.txt")));
            String line;

            String data = "";
            line = reader.readLine(); //first line
            while (!line.equals("MUSEUMS")) {

                if(line.isEmpty() || line.equals("RESTAURANTS")) {
                    if (data != "") {
                        data+="\n";
                        restaurantList.add(data);
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

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createFoodList();
        setContentView(R.layout.first_layout);
        listView = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, restaurantList);

        listView.setAdapter(adapter);

    }
}



