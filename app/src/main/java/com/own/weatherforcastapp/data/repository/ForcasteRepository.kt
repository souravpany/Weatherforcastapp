package com.own.weatherforcastapp.data.repository

import com.own.weatherforcastapp.data.remote.NetworkService
import com.own.weatherforcastapp.data.remote.response.ForecastResponse
import io.reactivex.Single
import javax.inject.Inject

class ForcasteRepository @Inject constructor(
    private val networkService: NetworkService
) {

    fun doFetchForcasteDetails(
    ): Single<ForecastResponse>? {
        return networkService.doForecastCall(
            "524901"
        ).map { it }

    }

}