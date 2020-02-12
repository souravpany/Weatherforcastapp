package com.own.weatherforcastapp.data.repository

import com.own.weatherforcastapp.data.remote.NetworkService
import com.own.weatherforcastapp.data.remote.response.CurrentWeatherResponse
import io.reactivex.Single
import javax.inject.Inject

class CurrentWeatherRepository @Inject constructor(
    private val networkService: NetworkService
) {

    fun doFetchCurrentWeatherDetails(
    ): Single<CurrentWeatherResponse>? {
        return networkService.doCurrentWeatherReportCall(
            "1277333"
        ).map { it }

    }

}