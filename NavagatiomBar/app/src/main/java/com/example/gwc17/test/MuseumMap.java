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

public class MuseumMap extends AppCompatActivity implements OnMapReadyCallback {
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

        LatLng Lacma =new LatLng(34.063791, -118.358885);
        mMap.addMarker(new MarkerOptions().position(Lacma).title("LACMA").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Lacma, 12.0f));

        LatLng NHM =new LatLng(34.016957, -118.288831);
        mMap.addMarker(new MarkerOptions().position(NHM).title("National History Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(NHM, 12.0f));

        LatLng Broad =new LatLng(34.054471, -118.250559);
        mMap.addMarker(new MarkerOptions().position(Broad).title("The Broad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Broad, 12.0f));

        LatLng Getty =new LatLng(34.076450, -118.473884);
        mMap.addMarker(new MarkerOptions().position(Getty).title("The Getty").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Getty, 12.0f));

        LatLng Griffith =new LatLng(34.118407, -118.300422);
        mMap.addMarker(new MarkerOptions().position(Griffith).title("The Griffith Observatory").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Griffith, 12.0f));

        LatLng CSC =new LatLng(34.015788, -118.286209);
        mMap.addMarker(new MarkerOptions().position(CSC).title("California Science Center").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CSC, 12.0f));

        LatLng Death =new LatLng(34.101947, -118.321275);
        mMap.addMarker(new MarkerOptions().position(Death).title("Museum of Death").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Death, 12.0f));

        LatLng Tolerance =new LatLng(34.053697, -118.401716);
        mMap.addMarker(new MarkerOptions().position(Tolerance).title("Museum of Tolerance").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Tolerance, 12.0f));

        LatLng Wax =new LatLng(34.101730, -118.338087);
        mMap.addMarker(new MarkerOptions().position(Wax).title("Hollywood Wax Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Wax, 12.0f));

}}
