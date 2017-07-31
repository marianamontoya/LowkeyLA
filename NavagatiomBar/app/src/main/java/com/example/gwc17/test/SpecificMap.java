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

/**
 * Created by jessicahoffman on 7/31/17.
 */

public class SpecificMap extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED)
//            mMap.setMyLocationEnabled(true);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        int id = intent.getIntExtra("id", 0);
        Log.d("position extra", String.valueOf(position));
        Log.d("id extra", String.valueOf(id));

        // Here we turn your string.xml in an array
//        String[] myKeys = getResources().getStringArray(R.array.sections);

//        TextView myTextView = (TextView) findViewById(R.id.my_textview);
//        myTextView.setText(myKeys[position]);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng LeosTacoTruck = new LatLng(34.046400, -118.34569);
        mMap.addMarker(new MarkerOptions().position(LeosTacoTruck).title("Leo's Taco Truck").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LeosTacoTruck, 12.0f));

    }
}
