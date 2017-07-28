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

public class FilmingLocMap extends AppCompatActivity implements OnMapReadyCallback {
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

        LatLng Summer=new LatLng(34.0563, 118.2468);
        mMap.addMarker(new MarkerOptions().position(Summer).title("500 Days Summer").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Summer,12.0f));

        LatLng PrettyWoman=new LatLng(34.047829, -118.254875);
        mMap.addMarker(new MarkerOptions().position(PrettyWoman).title("Pretty Woman").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(PrettyWoman,12.0f));

        LatLng Independence=new LatLng(34.054507, -118.250261);
        mMap.addMarker(new MarkerOptions().position(Independence).title("Independence Day").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Independence,12.0f));

        LatLng Clueless=new LatLng(34.127357, -118.2105);
        mMap.addMarker(new MarkerOptions().position(Clueless).title("Clueless").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Clueless,12.0f));

        LatLng DayOff=new LatLng(34.127357, -118.2105);
        mMap.addMarker(new MarkerOptions().position(DayOff).title("Ferris Buller’s Day Off").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(DayOff,12.0f));


    }}
