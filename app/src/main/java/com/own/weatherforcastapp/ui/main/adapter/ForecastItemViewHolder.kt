package com.own.weatherforcastapp.ui.main.adapter

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.own.weatherforcastapp.R
import com.own.weatherforcastapp.data.model.forcast.Lists
import com.own.weatherforcastapp.di.component.ViewHolderComponent
import com.own.weatherforcastapp.ui.base.BaseItemViewHolder
import kotlinx.android.synthetic.main.row_forecast.view.*
import java.text.SimpleDateFormat
import java.util.*

class ForecastItemViewHolder(parent: ViewGroup) :
    BaseItemViewHolder<Lists, ForecastItemViewModel>(R.layout.row_forecast, parent) {

    override fun injectDependencies(viewHolderComponent: ViewHolderComponent) {
        viewHolderComponent.inject(this)
    }

    @SuppressLint("SetTextI18n")
    override fun setupObservers() {
        super.setupObservers()


        viewModel.name.observe(this, Observer {
            itemView.txtWeather.text = it

            val calendar = Calendar.getInstance()
            calendar.add(Calendar.DATE, adapterPosition)
            val date = calendar.time

            when (adapterPosition) {
                0 -> itemView.txtDayOfWeek.text = "Today"
                1 -> itemView.txtDayOfWeek.text = "Tomorrow"
                else -> itemView.txtDayOfWeek.text =
                    SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH).format(date.time)
            }

        })

        viewModel.temperature.observe(this, Observer {
            itemView.txtTemp.text = it
        })

        viewModel.iconId.observe(this, Observer {

            if (it == "01d") { // sky is clear
                itemView.iconWeather.setImageResource(R.drawable.clear)
            } else if (it == "13d") { // light snow
                itemView.iconWeather.setImageResource(R.drawable.rain)
            }
        })

    }

    override fun setupView(view: View) {
    }
}