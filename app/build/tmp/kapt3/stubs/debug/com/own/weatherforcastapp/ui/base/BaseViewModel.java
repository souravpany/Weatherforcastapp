package com.own.weatherforcastapp.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0004J\b\u0010\u001a\u001a\u00020\u0019H\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0004\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001cH\u0014J\b\u0010\"\u001a\u00020\u001cH&R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/own/weatherforcastapp/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "schedulerProvider", "Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "networkHelper", "Lcom/own/weatherforcastapp/utils/network/NetworkHelper;", "(Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;Lcom/own/weatherforcastapp/utils/network/NetworkHelper;)V", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "messageString", "Landroidx/lifecycle/MutableLiveData;", "Lcom/own/weatherforcastapp/utils/common/Resource;", "", "getMessageString", "()Landroidx/lifecycle/MutableLiveData;", "messageStringId", "", "getMessageStringId", "getNetworkHelper", "()Lcom/own/weatherforcastapp/utils/network/NetworkHelper;", "getSchedulerProvider", "()Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;", "checkInternetConnection", "", "checkInternetConnectionWithMessage", "forcedLogoutUser", "", "handleNetworkError", "err", "", "(Ljava/lang/Throwable;)Lkotlin/Unit;", "onCleared", "onCreate", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.own.weatherforcastapp.utils.common.Resource<java.lang.Integer>> messageStringId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.own.weatherforcastapp.utils.common.Resource<java.lang.String>> messageString = null;
    @org.jetbrains.annotations.NotNull()
    private final com.own.weatherforcastapp.utils.rx.SchedulerProvider schedulerProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final com.own.weatherforcastapp.utils.network.NetworkHelper networkHelper = null;
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.own.weatherforcastapp.utils.common.Resource<java.lang.Integer>> getMessageStringId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.own.weatherforcastapp.utils.common.Resource<java.lang.String>> getMessageString() {
        return null;
    }
    
    protected final boolean checkInternetConnectionWithMessage() {
        return false;
    }
    
    protected final boolean checkInternetConnection() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final kotlin.Unit handleNetworkError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable err) {
        return null;
    }
    
    protected void forcedLogoutUser() {
    }
    
    public abstract void onCreate();
    
    @org.jetbrains.annotations.NotNull()
    protected final com.own.weatherforcastapp.utils.rx.SchedulerProvider getSchedulerProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.own.weatherforcastapp.utils.network.NetworkHelper getNetworkHelper() {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.utils.network.NetworkHelper networkHelper) {
        super();
    }
}