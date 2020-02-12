package com.own.weatherforcastapp.di.component

import com.own.weatherforcastapp.di.ViewModelScope
import com.own.weatherforcastapp.di.module.ViewHolderModule
import com.own.weatherforcastapp.ui.main.adapter.ForecastItemViewHolder
import com.own.weatherforcastapp.ui.main.adapter.ForecastSlideItemViewHolder
import dagger.Component

@ViewModelScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ViewHolderModule::class]
)
interface ViewHolderComponent {

    fun inject(viewHolder: ForecastItemViewHolder)

    fun inject(viewHolder: ForecastSlideItemViewHolder)

}