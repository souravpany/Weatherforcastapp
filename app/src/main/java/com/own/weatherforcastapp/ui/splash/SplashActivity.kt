package com.own.weatherforcastapp.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import com.own.weatherforcastapp.R
import com.own.weatherforcastapp.di.component.ActivityComponent
import com.own.weatherforcastapp.ui.base.BaseActivity
import com.own.weatherforcastapp.ui.main.MainActivity
import com.own.weatherforcastapp.utils.common.Event

class SplashActivity : BaseActivity<SplashViewModel>() {


    override fun provideLayoutId(): Int = R.layout.activity_splash

    override fun injectDependencies(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
    }

    override fun setupView(savedInstanceState: Bundle?) {
    }

    override fun setupObservers() {
        super.setupObservers()
        // Event is used by the view model to tell the activity to launch another activity
        // view model also provided the Bundle in the event that is needed for the Activity
        viewModel.launchMain.observe(this, Observer<Event<Map<String, String>>> {
            it.getIfNotHandled()?.run {
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finish()
            }
        })
    }
}