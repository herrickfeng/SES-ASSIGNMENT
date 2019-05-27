package com.example.locationsystemsoftwarestudio;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng clothes = new LatLng(-33.8822, 151.1970);
        LatLng shoes = new LatLng(-34, 151);
        LatLng food = new LatLng(-33.8150, 151.0011);

        mMap.addMarker(new MarkerOptions().position(clothes).title("Accepting Clothes Donations"));
        mMap.addMarker(new MarkerOptions().position(shoes).title("Accepting Shoes Donations"));
        mMap.addMarker(new MarkerOptions().position(food).title("Accepting Food Donations"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(shoes));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(clothes));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(food));

    }
}