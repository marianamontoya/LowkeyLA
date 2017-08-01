package com.example.gwc17.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import java.io.IOException;
import java.util.Map;


/**
 * Created by GWC17 on 7/25/2017.
 */

public class Food extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private HashMap<String, String> restaurantInfo = new HashMap<>();
    private List<HashMap<String, String>> listItems = new ArrayList<>();
    private List<String> listOrder = new ArrayList<>();

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

    public void createFoodMap() {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("RestuarantsInfo.txt")));
            String line;

            String name = "";
            String data = "";
            line = reader.readLine(); //first line
            while (!line.equals("MUSEUMS")) {

                if(line.isEmpty() || line.equals("RESTAURANTS")) {
                    if (data != "") {
                        data+="\n";
                        restaurantInfo.put(name,data);
                        name = "";
                        data = "";
                    }
                } else {
                    if (name == "") {
                        name = line;
                    } else if (data == "") {
                        data += line;
                    } else {
                        data += "\n"+line;
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

        setContentView(R.layout.fancy_list);
        ListView resultsListView = (ListView) findViewById(R.id.results_listview);
        createFoodMap();

        listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_item,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.text1, R.id.text2});

        Iterator it = restaurantInfo.entrySet().iterator();
        while (it.hasNext())
        {
            HashMap<String, String> resultsMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultsMap.put("First Line", pair.getKey().toString());
            resultsMap.put("Second Line", pair.getValue().toString());
            listItems.add(resultsMap);
            listOrder.add(pair.getKey().toString());
        }
        resultsListView.setAdapter(adapter);
        resultsListView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> l, View v, int position, long id) {
        Intent intent = new Intent();
        intent.setClass(this, SpecificMap.class);
        intent.putExtra("position", position);
        intent.putExtra("name",listOrder.get(position));
        startActivity(intent);
    }
}



