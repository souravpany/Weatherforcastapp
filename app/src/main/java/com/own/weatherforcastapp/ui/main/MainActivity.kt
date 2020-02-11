package com.own.weatherforcastapp.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.Observer
import com.own.weatherforcastapp.R
import com.own.weatherforcastapp.di.component.ActivityComponent
import com.own.weatherforcastapp.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainViewModel>() {

    override fun provideLayoutId(): Int = R.layout.activity_main

    override fun injectDependencies(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
    }

    override fun setupView(savedInstanceState: Bundle?) {
    }

    @SuppressLint("SetTextI18n")
    override fun setupObservers() {
        super.setupObservers()

        viewModel.tempField.observe(this, Observer {
            if (txt_temp_field.text.toString() != it) txt_temp_field.text = "$it\u2103"
        })

        viewModel.cityNameField.observe(this, Observer {
            if (txt_city_name.text.toString() != it) txt_city_name.text = it
        })

    }


}