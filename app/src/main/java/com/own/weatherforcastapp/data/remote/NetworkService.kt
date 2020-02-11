package com.own.weatherforcastapp.data.remote

import com.own.weatherforcastapp.data.remote.response.CurrentWeatherResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface NetworkService {


    @GET(Endpoints.CURRENT)
    fun doCurrentWeatherReportCall(
        @Query("id") cityId: String?,
        @Query(Networking.HEADER_API_KEY) apiKey: String = Networking.API_KEY
    ): Single<CurrentWeatherResponse>
}