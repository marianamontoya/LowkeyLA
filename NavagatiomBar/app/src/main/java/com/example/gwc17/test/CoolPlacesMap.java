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

public class CoolPlacesMap extends AppCompatActivity implements OnMapReadyCallback {
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

        LatLng Escape=new LatLng(34.042072, -118.252829);
        mMap.addMarker(new MarkerOptions().position(Escape).title("Escape Room LA").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Escape, 12.0f));

        LatLng Skyspace=new LatLng(34.051102, -118.25439);
        mMap.addMarker(new MarkerOptions().position(Skyspace).title("OUE Skyspace LA").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Skyspace, 12.0f));

        LatLng Zoo=new LatLng(34.135643, -118.28456);
        mMap.addMarker(new MarkerOptions().position(Zoo).title("Abandoned LA Zoo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Zoo, 12.0f));

        LatLng Tokyo=new LatLng(34.049242, -118.239823);
        mMap.addMarker(new MarkerOptions().position(Tokyo).title("Little Tokyo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Tokyo, 12.0f));

        LatLng KMall=new LatLng(34.055136, -118.308628);
        mMap.addMarker(new MarkerOptions().position(KMall).title("Korea Town Mall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(KMall, 12.0f));

        LatLng DriveIn=new LatLng(34.113893, -118.246678);
        mMap.addMarker(new MarkerOptions().position(DriveIn).title("Electric Dusk Drive In").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(DriveIn, 12.0f));

        LatLng SFCinema=new LatLng(34.139754, -118.20166);
        mMap.addMarker(new MarkerOptions().position(SFCinema).title("Street Food Cinema").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SFCinema, 12.0f));

        LatLng BookStore=new LatLng(34.047763, -118.249515);
        mMap.addMarker(new MarkerOptions().position(BookStore).title("The Last Book Store").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BookStore, 12.0f));

        LatLng Grocery=new LatLng(34.118604, -118.193454);
        mMap.addMarker(new MarkerOptions().position(Grocery).title("Galco's Old World Grocery").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Grocery, 12.0f));

        LatLng MurderHouse=new LatLng(34.050000, -118.317253);
        mMap.addMarker(new MarkerOptions().position(MurderHouse).title("American Horror Story Murder House").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(MurderHouse, 12.0f));

}}
