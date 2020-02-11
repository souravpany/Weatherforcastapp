package com.own.weatherforcastapp.ui.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R)\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/own/weatherforcastapp/ui/splash/SplashViewModel;", "Lcom/own/weatherforcastapp/ui/base/BaseViewModel;", "schedulerProvider", "Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "networkHelper", "Lcom/own/weatherforcastapp/utils/network/NetworkHelper;", "(Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;Lcom/own/weatherforcastapp/utils/network/NetworkHelper;)V", "launchMain", "Landroidx/lifecycle/MutableLiveData;", "Lcom/own/weatherforcastapp/utils/common/Event;", "", "", "getLaunchMain", "()Landroidx/lifecycle/MutableLiveData;", "splashTimeOut", "", "onCreate", "", "app_debug"})
public final class SplashViewModel extends com.own.weatherforcastapp.ui.base.BaseViewModel {
    private final long splashTimeOut = 3000L;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.own.weatherforcastapp.utils.common.Event<java.util.Map<java.lang.String, java.lang.String>>> launchMain = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.own.weatherforcastapp.utils.common.Event<java.util.Map<java.lang.String, java.lang.String>>> getLaunchMain() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.network.NetworkHelper networkHelper) {
        super(null, null, null);
    }
}