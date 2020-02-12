package com.own.weatherforcastapp.di.module

import androidx.lifecycle.LifecycleRegistry
import com.own.weatherforcastapp.di.ViewModelScope
import com.own.weatherforcastapp.ui.base.BaseItemViewHolder
import dagger.Module
import dagger.Provides

@Module
class ViewHolderModule(private val viewHolder: BaseItemViewHolder<*, *>) {

    @Provides
    @ViewModelScope
    fun provideLifecycleRegistry(): LifecycleRegistry = LifecycleRegistry(viewHolder)
}