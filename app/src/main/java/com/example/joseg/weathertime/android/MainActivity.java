package com.example.joseg.weathertime.android;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.joseg.weathertime.R;
import com.example.joseg.weathertime.Service.WeatherService;
import com.example.joseg.weathertime.model.Forecast;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    }

    public void getWeatherInfo() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WeatherService service = retrofit.create(WeatherService.class);
        Call<Forecast> call = service.getForecast();

        call.enqueue(new Callback<Forecast>() {
            @Override
            public void onResponse(Call<Forecast>call, Response<Forecast> response){
                try {
                    if(response.isSuccessful()) {//log info}
                    else {//log }
                } catch(IOException e) {}
                }

            @Override
            public void onFailure(Call<Forecast> call, Throwable t) {

            }
        };
         }
    }


