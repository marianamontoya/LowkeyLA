package com.example.gwc17.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by jessicahoffman on 7/27/17.
 */

public class FoodTruckMap extends AppCompatActivity  implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED)
//            mMap.setMyLocationEnabled(true);
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

        LatLng TheLobos =new LatLng(34.097777, -118.28706);
        mMap.addMarker(new MarkerOptions().position(TheLobos).title("The Lobos").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(TheLobos, 12.0f));

        LatLng SonofaBun =new LatLng(34.097777, -118.28706);
        mMap.addMarker(new MarkerOptions().position(SonofaBun).title("Son of a Bun").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SonofaBun, 12.0f));

        LatLng ElChatoTacoTruck =new LatLng(34.056889, -118.346233);
        mMap.addMarker(new MarkerOptions().position(ElChatoTacoTruck).title("El Chato Taco Truck").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ElChatoTacoTruck, 12.0f));

        LatLng TheFeedingFrnzy =new LatLng(34.047600, -118.253495);
        mMap.addMarker(new MarkerOptions().position(TheFeedingFrnzy).title("The Feeding Frnzy").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(TheFeedingFrnzy, 12.0f));

    }}
