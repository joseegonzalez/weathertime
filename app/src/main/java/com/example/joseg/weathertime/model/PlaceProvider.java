package com.example.joseg.weathertime.model;


import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.location.Location;
import android.location.LocationListener;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

import static com.google.android.gms.common.api.GoogleApiClient.*;

/**
 * Created by joseg on 4/1/18.
 */

public class PlaceProvider extends Activity implements LocationListener {
    protected LocationListener locationListener;
    protected Context context;
    String provider;
    protected boolean gps_enabled,network_enabled;
    protected float latitude,longitude;


    LocationManager locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);




    @Override
    public void onLocationChanged(Location location) {

         latitude = (float) location.getLatitude();
         longitude = (float) location.getLongitude();

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String provider) {
        Log.d("Latitude","disable");
    }








}
