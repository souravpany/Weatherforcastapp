package com.own.weatherforcastapp.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/own/weatherforcastapp/di/module/ApplicationModule;", "", "application", "Lcom/own/weatherforcastapp/WeatherForecastApplication;", "(Lcom/own/weatherforcastapp/WeatherForecastApplication;)V", "provideApplication", "Landroid/app/Application;", "provideCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "provideContext", "Landroid/content/Context;", "provideNetworkHelper", "Lcom/own/weatherforcastapp/utils/network/NetworkHelper;", "provideNetworkService", "Lcom/own/weatherforcastapp/data/remote/NetworkService;", "provideSchedulerProvider", "Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    private final com.own.weatherforcastapp.WeatherForecastApplication application = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.app.Application provideApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.own.weatherforcastapp.di.ApplicationContext()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    /**
     * Since this function do not have @Singleton then each time CompositeDisposable is injected
     * then a new instance of CompositeDisposable will be provided
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final io.reactivex.disposables.CompositeDisposable provideCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.own.weatherforcastapp.utils.rx.SchedulerProvider provideSchedulerProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPreferences() {
        return null;
    }
    
    /**
     * We need to write @Singleton on the provide method if we are create the instance inside this method
     * to make it singleton. Even if we have written @Singleton on the instance's class
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.own.weatherforcastapp.data.remote.NetworkService provideNetworkService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.own.weatherforcastapp.utils.network.NetworkHelper provideNetworkHelper() {
        return null;
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.WeatherForecastApplication application) {
        super();
    }
}