package com.own.weatherforcastapp.ui.splash

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import com.own.weatherforcastapp.ui.base.BaseViewModel
import com.own.weatherforcastapp.utils.common.Event
import com.own.weatherforcastapp.utils.network.NetworkHelper
import com.own.weatherforcastapp.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable


class SplashViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper
) : BaseViewModel(schedulerProvider, compositeDisposable, networkHelper) {

    private val splashTimeOut: Long = 3000 // 3 sec

    // Event is used by the view model to tell the activity to launch another Activity
    // view model also provided the Bundle in the event that is needed for the Activity
    val launchMain: MutableLiveData<Event<Map<String, String>>> = MutableLiveData()

    override fun onCreate() {
        Handler().postDelayed({
            launchMain.postValue(Event(emptyMap()))
        }, splashTimeOut)
        launchMain.postValue(Event(emptyMap()))
    }
}