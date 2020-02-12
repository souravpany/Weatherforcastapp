package com.own.weatherforcastapp.di.component;

import java.lang.System;

@com.own.weatherforcastapp.di.ViewModelScope()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/own/weatherforcastapp/di/component/ViewHolderComponent;", "", "inject", "", "viewHolder", "Lcom/own/weatherforcastapp/ui/main/adapter/ForecastItemViewHolder;", "Lcom/own/weatherforcastapp/ui/main/adapter/ForecastSlideItemViewHolder;", "app_debug"})
@dagger.Component(dependencies = {com.own.weatherforcastapp.di.component.ApplicationComponent.class}, modules = {com.own.weatherforcastapp.di.module.ViewHolderModule.class})
public abstract interface ViewHolderComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.ui.main.adapter.ForecastItemViewHolder viewHolder);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.ui.main.adapter.ForecastSlideItemViewHolder viewHolder);
}