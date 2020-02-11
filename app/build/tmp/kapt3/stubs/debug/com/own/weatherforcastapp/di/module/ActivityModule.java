package com.own.weatherforcastapp.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/own/weatherforcastapp/di/module/ActivityModule;", "", "activity", "Lcom/own/weatherforcastapp/ui/base/BaseActivity;", "(Lcom/own/weatherforcastapp/ui/base/BaseActivity;)V", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "provideMainViewModel", "Lcom/own/weatherforcastapp/ui/main/MainViewModel;", "schedulerProvider", "Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "networkHelper", "Lcom/own/weatherforcastapp/utils/network/NetworkHelper;", "currentWeatherRepository", "Lcom/own/weatherforcastapp/data/repository/CurrentWeatherRepository;", "provideSplashViewModel", "Lcom/own/weatherforcastapp/ui/splash/SplashViewModel;", "app_debug"})
@dagger.Module()
public final class ActivityModule {
    private final com.own.weatherforcastapp.ui.base.BaseActivity<?> activity = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.own.weatherforcastapp.ui.splash.SplashViewModel provideSplashViewModel(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.network.NetworkHelper networkHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.own.weatherforcastapp.ui.main.MainViewModel provideMainViewModel(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.network.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.repository.CurrentWeatherRepository currentWeatherRepository) {
        return null;
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.ui.base.BaseActivity<?> activity) {
        super();
    }
}