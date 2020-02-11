package com.own.weatherforcastapp.di.module

import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.own.weatherforcastapp.data.repository.CurrentWeatherRepository
import com.own.weatherforcastapp.ui.base.BaseActivity
import com.own.weatherforcastapp.ui.main.MainViewModel
import com.own.weatherforcastapp.ui.splash.SplashViewModel
import com.own.weatherforcastapp.utils.ViewModelProviderFactory
import com.own.weatherforcastapp.utils.network.NetworkHelper
import com.own.weatherforcastapp.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable


@Module
class ActivityModule(private val activity: BaseActivity<*>) {

    @Provides
    fun provideLinearLayoutManager(): LinearLayoutManager = LinearLayoutManager(activity)


    @Provides
    fun provideSplashViewModel(
        schedulerProvider: SchedulerProvider,
        compositeDisposable: CompositeDisposable,
        networkHelper: NetworkHelper
    ): SplashViewModel = ViewModelProviders.of(
        activity, ViewModelProviderFactory(SplashViewModel::class) {
            SplashViewModel(schedulerProvider, compositeDisposable, networkHelper)
            //this lambda creates and return SplashViewModel
        }).get(SplashViewModel::class.java)

    @Provides
    fun provideMainViewModel(
        schedulerProvider: SchedulerProvider,
        compositeDisposable: CompositeDisposable,
        networkHelper: NetworkHelper,currentWeatherRepository: CurrentWeatherRepository
    ): MainViewModel = ViewModelProviders.of(
        activity, ViewModelProviderFactory(MainViewModel::class) {
            MainViewModel(schedulerProvider, compositeDisposable, networkHelper, currentWeatherRepository)
            //this lambda creates and return SplashViewModel
        }).get(MainViewModel::class.java)


}