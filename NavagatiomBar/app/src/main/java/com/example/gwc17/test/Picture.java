package com.example.gwc17.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by GWC17 on 7/27/17.
 */

public class Picture extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private HashMap<String, String> pictureInfo = new HashMap<>();
    private List<HashMap<String, String>> listItems = new ArrayList<>();
    private List<String> listOrder = new ArrayList<>();

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.mapButton) {
            Intent i = new Intent(Picture.this, PictureMap.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    public void createPictureMap() {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("RestuarantsInfo.txt")));
            String line;

            String name = "";
            String data = "";
            line = reader.readLine(); //first line
            while (!line.equals("PICTURE PERFECT")) {
                line = reader.readLine();
            }
            while (!line.equals("FOOD TRUCK")) {

                if (!line.isEmpty() && line.charAt(0) == '@') {
                    name = line.substring(1);

                    String description = "";
                    String address = "";

                    for (int i = 0; i < MainActivity.locationData.size(); i++) {
                        if (name.equals(MainActivity.locationData.get(i).get(0))) {

                            Map<String,String> foundData = (HashMap) MainActivity.locationData.get(i).get(1);

                            for (Map.Entry entry : foundData.entrySet()) {
                                if (entry.getKey().equals("Description")) {
                                    description = (String) entry.getValue();
                                } else if (entry.getKey().equals("Address")) {
                                    address = (String) entry.getValue();
                                }
                            }
                        }
                    }

                    if (description != "") {
                        data += description + "\n";
                    }
                    if (address != "") {
                        data += address + "\n";
                    }

                    pictureInfo.put(name,data);

                    data = "";
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
        createPictureMap();

        listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_item,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.text1, R.id.text2});

        Iterator it = pictureInfo.entrySet().iterator();
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
        intent.setClass(this, DetailedView.class);
        intent.putExtra("position", position);
        intent.putExtra("name",listOrder.get(position));
        startActivity(intent);
    }
}
