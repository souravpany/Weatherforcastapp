package com.own.weatherforcastapp.ui.main

import androidx.lifecycle.MutableLiveData
import com.own.weatherforcastapp.data.repository.CurrentWeatherRepository
import com.own.weatherforcastapp.ui.base.BaseViewModel
import com.own.weatherforcastapp.utils.network.NetworkHelper
import com.own.weatherforcastapp.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import kotlin.math.roundToInt


class MainViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper, currentWeatherRepository: CurrentWeatherRepository
) : BaseViewModel(schedulerProvider, compositeDisposable, networkHelper) {

    val tempField: MutableLiveData<String> = MutableLiveData()
    val cityNameField: MutableLiveData<String> = MutableLiveData()

    init {
        compositeDisposable.addAll(
            currentWeatherRepository.doAddPediatricsDetails()
            !!.subscribeOn(schedulerProvider.io())
                .subscribe(
                    {
                        tempField.postValue(((it.main.temp_min - 273.15).roundToInt()).toString())
                        cityNameField.postValue(it.name)
                    },
                    {
                        handleNetworkError(it)
                    }
                )
        )
    }

    override fun onCreate() {}
}