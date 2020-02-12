package com.own.weatherforcastapp.ui.main

import androidx.lifecycle.MutableLiveData
import com.own.weatherforcastapp.data.model.forcast.Lists
import com.own.weatherforcastapp.data.repository.CurrentWeatherRepository
import com.own.weatherforcastapp.data.repository.ForcasteRepository
import com.own.weatherforcastapp.ui.base.BaseViewModel
import com.own.weatherforcastapp.utils.common.Resource
import com.own.weatherforcastapp.utils.network.NetworkHelper
import com.own.weatherforcastapp.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import kotlin.math.roundToInt


class MainViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper,
    private val currentWeatherRepository: CurrentWeatherRepository,
    private val forecastRepository: ForcasteRepository,
    private val allWeekWeatherList: ArrayList<Lists>
) : BaseViewModel(schedulerProvider, compositeDisposable, networkHelper) {

    val tempField: MutableLiveData<String> = MutableLiveData()
    val cityNameField: MutableLiveData<String> = MutableLiveData()


    val allWeekWeatherLists: MutableLiveData<Resource<List<Lists>>> = MutableLiveData()
    val allWeekSlideWeatherLists: MutableLiveData<Resource<List<Lists>>> = MutableLiveData()

    val pbLoading: MutableLiveData<Boolean> = MutableLiveData()
    val slidingLayoutVisibility: MutableLiveData<Boolean> = MutableLiveData()
    val sadPathLayoutVisibility: MutableLiveData<Boolean> = MutableLiveData()

    override fun onCreate() {

        /*
        * current weather report fetch service calling
        * */
        pbLoading.postValue(true)
        compositeDisposable.add(
            currentWeatherRepository.doFetchCurrentWeatherDetails()
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

        /*
        * forecast weather report fetch service calling
        * */
        compositeDisposable.add(
            forecastRepository.doFetchForcasteDetails()
            !!.subscribeOn(schedulerProvider.io())
                .subscribe(
                    {
                        pbLoading.postValue(false)
                        slidingLayoutVisibility.postValue(true)
                        sadPathLayoutVisibility.postValue(false)
                        allWeekWeatherList.addAll(it.list)
                        allWeekWeatherLists.postValue(Resource.success(it.list))
                        allWeekSlideWeatherLists.postValue(Resource.success(it.list))
                    },
                    {
                        pbLoading.postValue(false)
                        slidingLayoutVisibility.postValue(false)
                        sadPathLayoutVisibility.postValue(true)
                        handleNetworkError(it)
                    }
                )
        )
    }
}