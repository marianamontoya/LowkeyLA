package com.example.gwc17.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

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

public class LowkeyLAMap extends AppCompatActivity implements OnMapReadyCallback {
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

        // RESTAURANTS

        LatLng KazuNori = new LatLng(34.047700, -118.247882);
        mMap.addMarker(new MarkerOptions().position(KazuNori).title("KazuNori").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(KazuNori, 12.0f));

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

//        Add Markers to Museums

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

//        COOL PLACES
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

//        FILMING LOCATIONS
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


//      PICTURE LOCATIONS

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

//        FOOD TRUCK LOCATIONS

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
