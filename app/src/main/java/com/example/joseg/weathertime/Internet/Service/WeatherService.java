package com.example.joseg.weathertime.Internet.Service;

import com.example.joseg.weathertime.Internet.PoJos.Forecast;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by joseg on 3/25/18.
 */

public interface WeatherService {
    @GET("")
    Call<Forecast> getForecast();
}
