package com.example.gwc17.test;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.app.FragmentManager;
import android.util.Log;
import android.content.Intent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static List<List<Object>> locationData = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        createLocationData();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (item.getItemId() == R.id.mapButton) {
            Intent i = new Intent(MainActivity.this, LowkeyLAMap.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.restaurantsNav) {
            Intent i = new Intent(MainActivity.this, Food.class);
            startActivity(i);

        } else if (id == R.id.foodTrucksNav) {
            Intent i = new Intent(MainActivity.this, FoodTrucks.class);
            startActivity(i);

        } else if (id == R.id.picturePerfectNav) {
            Intent i = new Intent(MainActivity.this, Picture.class);
            startActivity(i);

        } else if (id == R.id.museumsNav) {
            Intent i = new Intent(MainActivity.this, Museums.class);
            startActivity(i);

        } else if (id == R.id.coolPlacesNav) {
            Intent i = new Intent(MainActivity.this, CoolPlaces.class);
            startActivity(i);

        } else if (id == R.id.filmingNav) {
            Intent i = new Intent(MainActivity.this, FilmingLoc.class);
            startActivity(i);

        } else if (id == R.id.aboutNav) {
            Intent i = new Intent(MainActivity.this, About.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void createLocationData() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("RestuarantsInfo.txt")));
            String line;

            line = reader.readLine(); //first line

            List<Object> stuff = new ArrayList();
//            int counter = 0;
            String name = "";
            Map <String,String> data = new HashMap<String,String>();

            while (line != null) {

                if(line.isEmpty() || line.equals("RESTAURANTS") || line.equals("MUSEUMS") || line.equals("COOL PLACES")
                        || line.equals("FILMING LOCATIONS") || line.equals("PICTURE PERFECT") || line.equals("TACO TRUCK")){
                    if (name != "") {

                        stuff.add(name);
                        stuff.add(data);
                        locationData.add(stuff);

                        Log.d("NAME", name);
                        for (Map.Entry entry : data.entrySet()) {
                            Log.d("DATA", entry.getKey() + ", " + entry.getValue());
                        }

                        name = "";
                        data = new HashMap<String,String>();
                        stuff = new ArrayList();
                    }
                } else {

                    if (name == "") {
                        name = line.substring(1);
                    } else {
                        if (line.charAt(4) == ')') { //phone number
                            data.put("Phone", line);
                        } else if (Character.isDigit(line.charAt(0))) { //address
                            data.put("Address", line);
                        } else if (line.charAt(0) == '*') { //address
                            data.put("Address", line.substring(1));
                        } else if ((line.charAt(line.length() - 2) == '$')) { //description
                            data.put("Description", line);
                        } else if ((line.charAt(0) == '!')) { //description
                            data.put("Description", line.substring(1));
                        } else if (line.charAt(line.length() - 1) == ')') { //lat & long
                            String a = line.substring(1, line.length() - 2);
                            String lat = a.substring(0, 9);
                            String lon = a.substring(11);
                            data.put("Latitude", lat);
                            data.put("Longitude", lon);
                        } else if (line.charAt(0) == '~') {
                            data.put("Extra",line.substring(1));
                        } else { //website
                            data.put("Website", line);
                        }
                    }
                }
                line = reader.readLine();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
