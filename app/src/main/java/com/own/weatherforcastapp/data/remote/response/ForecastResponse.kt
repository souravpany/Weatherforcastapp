package com.own.weatherforcastapp.data.remote.response

import com.google.gson.annotations.SerializedName
import com.own.weatherforcastapp.data.model.forcast.City
import com.own.weatherforcastapp.data.model.forcast.Lists

data class ForecastResponse(

    @SerializedName("cod") val cod: Int,
    @SerializedName("message") val message: Int,
    @SerializedName("city") val city: City,
    @SerializedName("cnt") val cnt: Int,
    @SerializedName("list") val list: List<Lists>

)