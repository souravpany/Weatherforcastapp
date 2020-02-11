package com.own.weatherforcastapp.di.component

import com.own.weatherforcastapp.di.ActivityScope
import com.own.weatherforcastapp.di.module.ActivityModule
import com.own.weatherforcastapp.ui.main.MainActivity
import com.own.weatherforcastapp.ui.splash.SplashActivity
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun inject(activity: SplashActivity)

    fun inject(activity: MainActivity)
}