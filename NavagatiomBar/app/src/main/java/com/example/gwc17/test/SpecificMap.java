package com.example.gwc17.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jessicahoffman on 7/31/17.
 */

public class SpecificMap extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    private String name;
    private double latitude;
    private double longitude;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        name = intent.getStringExtra("name");

        latitude = intent.getDoubleExtra("lat",0.0);
        longitude = intent.getDoubleExtra("lon",0.0);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng hotspot = new LatLng(latitude, longitude);
        mMap.addMarker(new MarkerOptions().position(hotspot).title(name).icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hotspot, 12.0f));

    }
}
