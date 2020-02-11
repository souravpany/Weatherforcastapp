package com.own.weatherforcastapp.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H\'J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&\u00a8\u0006\u0014"}, d2 = {"Lcom/own/weatherforcastapp/di/component/ApplicationComponent;", "", "getApplication", "Landroid/app/Application;", "getCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getContext", "Landroid/content/Context;", "getNetworkHelper", "Lcom/own/weatherforcastapp/utils/network/NetworkHelper;", "getNetworkService", "Lcom/own/weatherforcastapp/data/remote/NetworkService;", "getSchedulerProvider", "Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;", "getSharedPreferences", "Landroid/content/SharedPreferences;", "inject", "", "app", "Lcom/own/weatherforcastapp/WeatherForecastApplication;", "app_debug"})
@dagger.Component(modules = {com.own.weatherforcastapp.di.module.ApplicationModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.WeatherForecastApplication app);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.app.Application getApplication();
    
    @org.jetbrains.annotations.NotNull()
    @com.own.weatherforcastapp.di.ApplicationContext()
    public abstract android.content.Context getContext();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.own.weatherforcastapp.data.remote.NetworkService getNetworkService();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.SharedPreferences getSharedPreferences();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.own.weatherforcastapp.utils.network.NetworkHelper getNetworkHelper();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.own.weatherforcastapp.utils.rx.SchedulerProvider getSchedulerProvider();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.disposables.CompositeDisposable getCompositeDisposable();
}