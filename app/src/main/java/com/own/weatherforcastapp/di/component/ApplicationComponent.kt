package com.own.weatherforcastapp.di.component

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.own.weatherforcastapp.WeatherForecastApplication
import com.own.weatherforcastapp.data.remote.NetworkService
import com.own.weatherforcastapp.di.ApplicationContext
import com.own.weatherforcastapp.di.module.ApplicationModule
import com.own.weatherforcastapp.utils.network.NetworkHelper
import com.own.weatherforcastapp.utils.rx.SchedulerProvider
import dagger.Component
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(app: WeatherForecastApplication)

    fun getApplication(): Application

    @ApplicationContext
    fun getContext(): Context


    fun getNetworkService(): NetworkService


    fun getSharedPreferences(): SharedPreferences

    fun getNetworkHelper(): NetworkHelper

    fun getSchedulerProvider(): SchedulerProvider

    fun getCompositeDisposable(): CompositeDisposable
}