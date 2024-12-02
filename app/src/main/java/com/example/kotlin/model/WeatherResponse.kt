package com.example.kotlin.model

class WeatherResponse (
    val main: Main
)

data class Main(
    val temp: Double
)