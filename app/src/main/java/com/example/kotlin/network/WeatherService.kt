package com.example.kotlin.network

import com.example.kotlin.WeatherActivity
import retrofit2.http.Query

interface WeatherService {
    @GET("data/2.5/weather")
    fun getWeather(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String,
    ): Call<WeatherResponse>
}