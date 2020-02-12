package com.own.weatherforcastapp.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001aH\u0015J\u0012\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/own/weatherforcastapp/ui/main/MainActivity;", "Lcom/own/weatherforcastapp/ui/base/BaseActivity;", "Lcom/own/weatherforcastapp/ui/main/MainViewModel;", "()V", "forecastListAdapter", "Lcom/own/weatherforcastapp/ui/main/adapter/ForecastListAdapter;", "getForecastListAdapter", "()Lcom/own/weatherforcastapp/ui/main/adapter/ForecastListAdapter;", "setForecastListAdapter", "(Lcom/own/weatherforcastapp/ui/main/adapter/ForecastListAdapter;)V", "forecastSlideListAdapter", "Lcom/own/weatherforcastapp/ui/main/adapter/ForecastSlideListAdapter;", "getForecastSlideListAdapter", "()Lcom/own/weatherforcastapp/ui/main/adapter/ForecastSlideListAdapter;", "setForecastSlideListAdapter", "(Lcom/own/weatherforcastapp/ui/main/adapter/ForecastSlideListAdapter;)V", "linearExtraLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearExtraLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLinearExtraLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "linearLayoutManager", "getLinearLayoutManager", "setLinearLayoutManager", "injectDependencies", "", "activityComponent", "Lcom/own/weatherforcastapp/di/component/ActivityComponent;", "provideLayoutId", "", "setupObservers", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends com.own.weatherforcastapp.ui.base.BaseActivity<com.own.weatherforcastapp.ui.main.MainViewModel> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.recyclerview.widget.LinearLayoutManager linearExtraLayoutManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.own.weatherforcastapp.ui.main.adapter.ForecastListAdapter forecastListAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.own.weatherforcastapp.ui.main.adapter.ForecastSlideListAdapter forecastSlideListAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getLinearLayoutManager() {
        return null;
    }
    
    public final void setLinearLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getLinearExtraLayoutManager() {
        return null;
    }
    
    public final void setLinearExtraLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.ui.main.adapter.ForecastListAdapter getForecastListAdapter() {
        return null;
    }
    
    public final void setForecastListAdapter(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.ui.main.adapter.ForecastListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.ui.main.adapter.ForecastSlideListAdapter getForecastSlideListAdapter() {
        return null;
    }
    
    public final void setForecastSlideListAdapter(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.ui.main.adapter.ForecastSlideListAdapter p0) {
    }
    
    @java.lang.Override()
    protected int provideLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void injectDependencies(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.di.component.ActivityComponent activityComponent) {
    }
    
    @java.lang.Override()
    protected void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void setupObservers() {
    }
    
    public MainActivity() {
        super();
    }
}