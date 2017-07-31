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

public class PictureMap extends AppCompatActivity implements OnMapReadyCallback {
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

        LatLng Instagram=new LatLng(34.048595, -118.241231);
        mMap.addMarker(new MarkerOptions().position(Instagram).title("'Please Do Not Instagram This.' Mural").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Instagram,12.0f));

        LatLng California=new LatLng(34.024526,-118.372906);
        mMap.addMarker(new MarkerOptions().position(California).title("'California Dreaming' Mural").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(California,12.0f));

        LatLng Love=new LatLng(34.023586, -118.381827);
        mMap.addMarker(new MarkerOptions().position(Love).title("'Love' Mural").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Love,12.0f));

        LatLng PinkWall=new LatLng(34.083947, -118.368785);
        mMap.addMarker(new MarkerOptions().position(PinkWall).title("Pink Wall").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(PinkWall,12.0f));


        LatLng TechnicolorOoze=new LatLng(34.026917, -118.387782);
        mMap.addMarker(new MarkerOptions().position(TechnicolorOoze).title("Technicolor Ooze").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(TechnicolorOoze, 12.0f));

        LatLng PolkaDotWall=new LatLng(34.037720, -118.232236);

        mMap.addMarker(new MarkerOptions().position(PolkaDotWall).title("Polka Dot Wall").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(PolkaDotWall, 12.0f));

        LatLng MondrianWall=new LatLng(34.047220, -118.375967);
        mMap.addMarker(new MarkerOptions().position(MondrianWall).title("Mondrian Wall").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(MondrianWall, 12.0f));

        LatLng  Figure8=new LatLng(34.095254, -118.28374);
        mMap.addMarker(new MarkerOptions().position(Figure8).title("Figure 8").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Figure8, 12.0f));

        LatLng  ArtShareBuilding=new LatLng(34.044533, -118.236718);
        mMap.addMarker(new MarkerOptions().position(ArtShareBuilding).title("Art Share Building").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ArtShareBuilding, 12.0f));

        LatLng  MadeinLA=new LatLng(34.044533, -118.236718);
        mMap.addMarker(new MarkerOptions().position(MadeinLA).title("Made in LA").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(MadeinLA, 12.0f));

        LatLng  LookIntoMyEyes=new LatLng(34.044533, -118.236718);
        mMap.addMarker(new MarkerOptions().position(LookIntoMyEyes).title("Look Into My Eyes").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LookIntoMyEyes, 12.0f));

        LatLng MuralbyRetna=new LatLng(34.080620, -118.386518);
        mMap.addMarker(new MarkerOptions().position(MuralbyRetna).title("Mural by Retna").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(MuralbyRetna, 12.0f));

        LatLng JustInCase=new LatLng(34.085553, -118.361136);
        mMap.addMarker(new MarkerOptions().position(JustInCase).title("Just In Case").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(JustInCase, 12.0f));

        LatLng Uniwolfcheetah=new LatLng(33.990497, -118.464965);
        mMap.addMarker(new MarkerOptions().position(Uniwolfcheetah).title("Uniwolfcheetah").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Uniwolfcheetah, 12.0f));

        LatLng MuralbehindWylieWilsonboutique=new LatLng(33.991460, -118.468019);
        mMap.addMarker(new MarkerOptions().position(MuralbehindWylieWilsonboutique).title("Mural behind Wylie Wilson boutique").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(MuralbehindWylieWilsonboutique, 12.0f));

        LatLng ArtbyROA=new LatLng(34.036290, -118.231394);
        mMap.addMarker(new MarkerOptions().position(ArtbyROA).title("Art by ROA").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ArtbyROA, 12.0f));

        LatLng squarefootmuralbyKobra=new LatLng(34.036290, -118.231394);
        mMap.addMarker(new MarkerOptions().position(squarefootmuralbyKobra).title("4,300-square-foot mural by Kobra").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(squarefootmuralbyKobra, 12.0f));





    }}
