package com.example.gwc17.test;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by jessicahoffman on 7/31/17.
 */

public class DetailedView extends AppCompatActivity implements AdapterView.OnItemClickListener {
//    OnMapReadyCallback

    private GoogleMap mMap;
    private String name;
    private String phone = "";
    private String description = "";
    private String address = "";
    private Double latitude;
    private Double longitude;
    private String website = "";
    private String extra = "";

    private HashMap<String, String> infoMap = new HashMap<>();

    private List<HashMap<String, String>> listItems = new ArrayList<>();
    private List<String> listOrder = new ArrayList<>();

    private void findInfo() {
        for (int i = 0; i < MainActivity.locationData.size(); i++) {
            if (name.equals(MainActivity.locationData.get(i).get(0))) {

                Map<String,String> data = (HashMap) MainActivity.locationData.get(i).get(1);

                for (Map.Entry entry : data.entrySet()) {
                    if (entry.getKey().equals("Latitude")) {
                        latitude = Double.parseDouble((String) entry.getValue());
                    } else if (entry.getKey().equals("Longitude")) {
                        longitude = Double.parseDouble((String) entry.getValue());
                    } else if (entry.getKey().equals("Description")) {
                        description = (String) entry.getValue();
                    } else if (entry.getKey().equals("Phone")) {
                        phone = (String) entry.getValue();
                    } else if (entry.getKey().equals("Address")) {
                        address = (String) entry.getValue();
                    } else if (entry.getKey().equals("Website")) {
                        website = (String) entry.getValue();
                    } else if (entry.getKey().equals("Extra")) {
                        extra = (String) entry.getValue();
                    }
                }
            }
        }
    }

    private void createInfoMap() {

        if (description != "") {
            infoMap.put("Description",description + "\n");
        }
        if (phone != "") {
            infoMap.put("Phone",phone + "\n");
        }
        if (address != "") {
            infoMap.put("Address",address + "\n");
        }
        if (website != "") {
            infoMap.put("Website",website + "\n");
        }
        if (extra != "") {
            infoMap.put("Reviews & More!","Powered by Google" + "\n");
//            Log.e("Extra","extra added");
//            Log.e("Print extra", extra);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_view);

        Intent intent = getIntent();
//        int position = intent.getIntExtra("position", 0);
        name = intent.getStringExtra("name");
        TextView title= (TextView) findViewById(R.id.Title);
        title.setText(name);

        findInfo();
        createInfoMap();

        ListView resultsListView = (ListView) findViewById(R.id.detailed_list);

        listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_item,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.text1, R.id.text2});

        String[] order = new String[5];
        order[0] = "Description";
        order[1] = "Phone";
        order[2] = "Address";
        order[3] = "Website";
        order[4] = "Reviews & More!";

        int location = 0;
        while (location < order.length)
        {
            String key = order[location];
            if (infoMap.get(key) != null) {
                HashMap<String, String> resultsMap = new HashMap<>();
                if (!key.equals("Description")) {
                    resultsMap.put("First Line", "\n" + key);
                } else {
                    resultsMap.put("First Line", key);
                }
                resultsMap.put("Second Line", infoMap.get(key));
                listItems.add(resultsMap);
                listOrder.add(key);
            }
            location++;
        }
        resultsListView.setAdapter(adapter);
        resultsListView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> l, View v, int position, long id) {
        String item = listOrder.get(position);

        if (item.equals("Phone")) {
            String phoneNum = "tel:";
            for(int i = 0; i < phone.length(); i ++) {
                Character c = phone.charAt(i);
                if (Character.isDigit(c)) {
                    phoneNum += c;
                }
            }
            Uri number = Uri.parse(phoneNum);
            Intent intent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(intent);
        } else if (item.equals("Address")) {
            Intent intent = new Intent();
            intent.setClass(this, SpecificMap.class);
            intent.putExtra("lat",latitude);
            intent.putExtra("lon",longitude);
            startActivity(intent);
        } else if (item.equals("Website")) {
            if (!website.startsWith("http://") && !website.startsWith("https://")) {
                website = "http://" + website;
            }
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
            startActivity(intent);
        } else if (item.equals("Reviews & More!")) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(extra));
            startActivity(intent);
        }
    }
}
