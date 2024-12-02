package com.example.kotlin

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin.model.WeatherResponse
import com.example.kotlin.network.WeatherService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class WeatherActivity : AppCompatActivity() {

    private lateinit var textviewTemp: TextView
    private val apiKey = "027be8290e32f7d734e8f6e3bbc560a7";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_weather)



        textviewTemp = findViewById(R.id.textview_temp)

        fetchWeatherData()

    }


    private fun fetchWeatherData() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.openweather.org")
            //.addConverterFactory(GsonConverterFactory.create())
            .build()

        val weatherService = retrofit.create(WeatherService::class.java)

        val call = weatherService.getWeather("Tatabánya", apiKey, "metric")

        call.enqueue(object:Callback<WeatherResponse> {

            override fun onResponse(
                call: Call<WeatherResponse>,
                response: Response<WeatherResponse>
            ) {
                if (response.isSuccessful) {
                    val weatherResponse = response.body()
                    if (weatherResponse != null) {
                        val weatherInfo = weatherResponse.main.temp
                        textviewTemp.text = weatherInfo.toString()
                    }
                }
            }
            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                Log.e("HIBA", "Hiba az API kérés során")
            }
        })

    }
}