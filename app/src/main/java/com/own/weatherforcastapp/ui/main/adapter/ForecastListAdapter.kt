package com.own.weatherforcastapp.ui.main.adapter

import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import com.own.weatherforcastapp.data.model.forcast.Lists
import com.own.weatherforcastapp.ui.base.BaseAdapter

class ForecastListAdapter(
    parentLifecycle: Lifecycle,
    weather: ArrayList<Lists>
) : BaseAdapter<Lists, ForecastItemViewHolder>(parentLifecycle, weather) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ForecastItemViewHolder(parent)
}