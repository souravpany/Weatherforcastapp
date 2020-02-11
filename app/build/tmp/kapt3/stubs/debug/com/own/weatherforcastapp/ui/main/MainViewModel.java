package com.own.weatherforcastapp.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/own/weatherforcastapp/ui/main/MainViewModel;", "Lcom/own/weatherforcastapp/ui/base/BaseViewModel;", "schedulerProvider", "Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "networkHelper", "Lcom/own/weatherforcastapp/utils/network/NetworkHelper;", "currentWeatherRepository", "Lcom/own/weatherforcastapp/data/repository/CurrentWeatherRepository;", "(Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;Lcom/own/weatherforcastapp/utils/network/NetworkHelper;Lcom/own/weatherforcastapp/data/repository/CurrentWeatherRepository;)V", "cityNameField", "Landroidx/lifecycle/MutableLiveData;", "", "getCityNameField", "()Landroidx/lifecycle/MutableLiveData;", "tempField", "getTempField", "onCreate", "", "app_debug"})
public final class MainViewModel extends com.own.weatherforcastapp.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> tempField = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> cityNameField = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTempField() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCityNameField() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.network.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.repository.CurrentWeatherRepository currentWeatherRepository) {
        super(null, null, null);
    }
}