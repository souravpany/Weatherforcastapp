package com.own.weatherforcastapp.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u00a2\u0006\u0002\u0010\u0010J\b\u0010%\u001a\u00020&H\u0016R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00140\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00140\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/own/weatherforcastapp/ui/main/MainViewModel;", "Lcom/own/weatherforcastapp/ui/base/BaseViewModel;", "schedulerProvider", "Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "networkHelper", "Lcom/own/weatherforcastapp/utils/network/NetworkHelper;", "currentWeatherRepository", "Lcom/own/weatherforcastapp/data/repository/CurrentWeatherRepository;", "forecastRepository", "Lcom/own/weatherforcastapp/data/repository/ForcasteRepository;", "allWeekWeatherList", "Ljava/util/ArrayList;", "Lcom/own/weatherforcastapp/data/model/forcast/Lists;", "Lkotlin/collections/ArrayList;", "(Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;Lcom/own/weatherforcastapp/utils/network/NetworkHelper;Lcom/own/weatherforcastapp/data/repository/CurrentWeatherRepository;Lcom/own/weatherforcastapp/data/repository/ForcasteRepository;Ljava/util/ArrayList;)V", "allWeekSlideWeatherLists", "Landroidx/lifecycle/MutableLiveData;", "Lcom/own/weatherforcastapp/utils/common/Resource;", "", "getAllWeekSlideWeatherLists", "()Landroidx/lifecycle/MutableLiveData;", "allWeekWeatherLists", "getAllWeekWeatherLists", "cityNameField", "", "getCityNameField", "pbLoading", "", "getPbLoading", "sadPathLayoutVisibility", "getSadPathLayoutVisibility", "slidingLayoutVisibility", "getSlidingLayoutVisibility", "tempField", "getTempField", "onCreate", "", "app_debug"})
public final class MainViewModel extends com.own.weatherforcastapp.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> tempField = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> cityNameField = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.own.weatherforcastapp.utils.common.Resource<java.util.List<com.own.weatherforcastapp.data.model.forcast.Lists>>> allWeekWeatherLists = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.own.weatherforcastapp.utils.common.Resource<java.util.List<com.own.weatherforcastapp.data.model.forcast.Lists>>> allWeekSlideWeatherLists = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> pbLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> slidingLayoutVisibility = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> sadPathLayoutVisibility = null;
    private final com.own.weatherforcastapp.data.repository.CurrentWeatherRepository currentWeatherRepository = null;
    private final com.own.weatherforcastapp.data.repository.ForcasteRepository forecastRepository = null;
    private final java.util.ArrayList<com.own.weatherforcastapp.data.model.forcast.Lists> allWeekWeatherList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTempField() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCityNameField() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.own.weatherforcastapp.utils.common.Resource<java.util.List<com.own.weatherforcastapp.data.model.forcast.Lists>>> getAllWeekWeatherLists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.own.weatherforcastapp.utils.common.Resource<java.util.List<com.own.weatherforcastapp.data.model.forcast.Lists>>> getAllWeekSlideWeatherLists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPbLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSlidingLayoutVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSadPathLayoutVisibility() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.network.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.repository.CurrentWeatherRepository currentWeatherRepository, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.repository.ForcasteRepository forecastRepository, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.own.weatherforcastapp.data.model.forcast.Lists> allWeekWeatherList) {
        super(null, null, null);
    }
}