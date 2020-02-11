package com.own.weatherforcastapp.data.remote.response

import com.google.gson.annotations.Expose
import com.own.weatherforcastapp.data.model.currentweather.Clouds
import com.own.weatherforcastapp.data.model.currentweather.Coord
import com.own.weatherforcastapp.data.model.currentweather.Main
import com.own.weatherforcastapp.data.model.currentweather.Sys
import com.own.weatherforcastapp.data.model.currentweather.Weather
import com.own.weatherforcastapp.data.model.currentweather.Wind
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(

    @Expose
    @SerializedName("coord") 
    var coord: Coord,

    @Expose
    @SerializedName("weather") 
    var weather: List<Weather>,

    @Expose
    @SerializedName("base") 
    var base: String,

    @Expose
    @SerializedName("main") 
    var main: Main,

    @Expose
    @SerializedName("visibility")
    var visibility: Int,

    @Expose
    @SerializedName("wind") 
    var wind: Wind,

    @Expose
    @SerializedName("clouds") 
    var clouds: Clouds,

    @Expose
    @SerializedName("dt") 
    var dt: Int,

    @Expose
    @SerializedName("sys") 
    var sys: Sys,

    @Expose
    @SerializedName("timezone") 
    var timezone: Int,

    @Expose
    @SerializedName("id") 
    var id: Int,

    @Expose
    @SerializedName("name") 
    var name: String,

    @Expose
    @SerializedName("cod") 
    var cod: Int
)