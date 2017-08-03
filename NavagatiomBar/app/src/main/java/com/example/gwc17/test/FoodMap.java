package com.example.gwc17.test;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;
//import android.view.View.OnClickListener;

/**
 * Created by jessicahoffman on 7/27/17.
 */

public class FoodMap extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private List<Marker> markers = new ArrayList<>();

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


    //todo make camera include all points

        LatLng KazuNori = new LatLng(34.047700, -118.247882);

        MarkerOptions k = new MarkerOptions().position(KazuNori).title("KazuNori").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE));


//        mMap.addMarker(new MarkerOptions().position(KazuNori).title("KazuNori").icon(BitmapDescriptorFactory
//                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(KazuNori, 12.0f));

        LatLng GrandCentralMarket =new LatLng(34.050655, -118.248795);
        mMap.addMarker(new MarkerOptions().position(GrandCentralMarket).title("Grand Central Market").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(GrandCentralMarket, 12.0f));

        LatLng Birdies =new LatLng(34.041769, -118.259048);
        mMap.addMarker(new MarkerOptions().position(Birdies).title("Birdies").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Birdies, 12.0f));

        LatLng UmamiBurgerBroadway =new LatLng(34.042400, -118.255606);
        mMap.addMarker(new MarkerOptions().position(UmamiBurgerBroadway).title("Umami Burger Broadway").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UmamiBurgerBroadway, 12.0f));

        LatLng GoldenStateCafe =new LatLng(34.078998, -118.361336);
        mMap.addMarker(new MarkerOptions().position(GoldenStateCafe).title("GoldenStateCafe").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(GoldenStateCafe, 12.0f));

        LatLng Animal =new LatLng(34.079217, -118.361604);
        mMap.addMarker(new MarkerOptions().position(Animal).title("Animal Restaurant").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Animal, 12.0f));

        LatLng Burgerlords =new LatLng(34.065207, -118.237149);
        mMap.addMarker(new MarkerOptions().position(Burgerlords).title("Burgerlords").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Burgerlords, 12.0f));

        LatLng Delilah =new LatLng(34.091064, -118.363581);
        mMap.addMarker(new MarkerOptions().position(Delilah).title("Delilah").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Delilah, 12.0f));

        LatLng Alma =new LatLng(34.095928, -118.371018);
        mMap.addMarker(new MarkerOptions().position(Alma).title("Alma").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Alma, 12.0f));

//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);



    }


}
