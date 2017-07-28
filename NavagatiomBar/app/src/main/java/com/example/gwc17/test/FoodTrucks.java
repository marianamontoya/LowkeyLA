package com.example.gwc17.test;

import android.content.Intent;
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
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jessicahoffman on 7/27/17.
 */

public class FoodTrucks extends AppCompatActivity {

    private List<String> foodTruckList = new ArrayList<>();
    private ListView listView;

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.mapButton) {
            Intent i = new Intent(FoodTrucks.this, FoodTruckMap.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

    public void createFoodTruckList() {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("RestuarantsInfo.txt")));
            String line;

            String data = "";

            line = reader.readLine(); //first line
            while (!line.equals("FOOD TRUCK")) {
                line = reader.readLine();
            }
            while (line != null) {

                if(line.isEmpty() || line.equals("FOOD TRUCK")) {
                    if (data != "") {
                        data+="\n";
                        foodTruckList.add(data);
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

        createFoodTruckList();
        setContentView(R.layout.first_layout);
        listView = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foodTruckList);

        listView.setAdapter(adapter);

    }

}
