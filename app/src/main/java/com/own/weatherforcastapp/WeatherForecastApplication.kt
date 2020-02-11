package com.own.weatherforcastapp

import android.app.Application
import com.own.weatherforcastapp.di.component.ApplicationComponent
import com.own.weatherforcastapp.di.component.DaggerApplicationComponent
import com.own.weatherforcastapp.di.module.ApplicationModule

class WeatherForecastApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()

    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }

}