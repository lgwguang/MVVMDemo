package com.ligw.mvvmdemo.weather.request;

import com.ligw.mvvmdemo.weather.model.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QueryWeatherRequest {

    @GET("data/cityinfo/101210101.html")
    Call<WeatherData> queryWeather();

}
