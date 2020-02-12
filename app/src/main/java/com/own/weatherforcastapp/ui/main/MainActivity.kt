package com.own.weatherforcastapp.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.own.weatherforcastapp.R
import com.own.weatherforcastapp.di.component.ActivityComponent
import com.own.weatherforcastapp.ui.base.BaseActivity
import com.own.weatherforcastapp.ui.main.adapter.ForecastListAdapter
import com.own.weatherforcastapp.ui.main.adapter.ForecastSlideListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_no_data_found.*
import javax.inject.Inject

class MainActivity : BaseActivity<MainViewModel>() {


    @Inject
    lateinit var linearLayoutManager: LinearLayoutManager

    @Inject
    lateinit var linearExtraLayoutManager: LinearLayoutManager

    @Inject
    lateinit var forecastListAdapter: ForecastListAdapter

    @Inject
    lateinit var forecastSlideListAdapter: ForecastSlideListAdapter


    override fun provideLayoutId(): Int = R.layout.activity_main

    override fun injectDependencies(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
    }

    override fun setupView(savedInstanceState: Bundle?) {

        rvWeather.apply {
            layoutManager = linearLayoutManager
            adapter = forecastListAdapter
        }

        rvSlideWeather.apply {
            layoutManager = linearExtraLayoutManager
            adapter = forecastSlideListAdapter
        }

        btnRetry.setOnClickListener {
            viewModel.onCreate()
        }
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


        viewModel.allWeekWeatherLists.observe(this, Observer {
            it.data?.run { forecastListAdapter.appendData(this) }
        })

        viewModel.allWeekSlideWeatherLists.observe(this, Observer {
            it.data?.run { forecastSlideListAdapter.appendData(this) }
        })

        viewModel.pbLoading.observe(this, Observer {
            pb_loading.visibility = if (it) View.VISIBLE else View.GONE
        })

        viewModel.slidingLayoutVisibility.observe(this, Observer {
            sliding_layout.visibility = if (it) View.VISIBLE else View.GONE
        })

        viewModel.sadPathLayoutVisibility.observe(this, Observer {
            layout_sad_path.visibility = if (it) View.VISIBLE else View.GONE
        })

    }


}