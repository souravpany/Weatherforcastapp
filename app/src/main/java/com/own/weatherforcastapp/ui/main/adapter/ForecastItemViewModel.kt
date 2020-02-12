package com.own.weatherforcastapp.ui.main.adapter

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.own.weatherforcastapp.data.model.forcast.Lists
import com.own.weatherforcastapp.ui.base.BaseItemViewModel
import com.own.weatherforcastapp.utils.network.NetworkHelper
import com.own.weatherforcastapp.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import kotlin.math.roundToInt

class ForecastItemViewModel @Inject constructor(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper
) : BaseItemViewModel<Lists>(schedulerProvider, compositeDisposable, networkHelper) {

    val name: LiveData<String> = Transformations.map(data) { it.weather[0].description }
    val iconId: LiveData<String> = Transformations.map(data) { it.weather[0].icon }
    val temperature: LiveData<String> = Transformations.map(data) {
        ((it.temp.max - 273.15).roundToInt()).toString() +"℃"+ "/" + ((it.temp.min - 273.15).roundToInt()).toString() + "℃"
    }


    override fun onCreate() {
    }

}