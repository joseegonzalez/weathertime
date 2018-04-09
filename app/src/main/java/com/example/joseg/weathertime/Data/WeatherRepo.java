package com.example.joseg.weathertime.Data;

import android.location.Location;

/**
 * Created by joseg on 4/9/18.
 */

public interface WeatherRepo {

    public void getWeather(Location location, WeatherCallback callback );
}
