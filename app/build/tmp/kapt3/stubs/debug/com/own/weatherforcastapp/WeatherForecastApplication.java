package com.own.weatherforcastapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/own/weatherforcastapp/WeatherForecastApplication;", "Landroid/app/Application;", "()V", "applicationComponent", "Lcom/own/weatherforcastapp/di/component/ApplicationComponent;", "getApplicationComponent", "()Lcom/own/weatherforcastapp/di/component/ApplicationComponent;", "setApplicationComponent", "(Lcom/own/weatherforcastapp/di/component/ApplicationComponent;)V", "injectDependencies", "", "onCreate", "app_debug"})
public final class WeatherForecastApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public com.own.weatherforcastapp.di.component.ApplicationComponent applicationComponent;
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.di.component.ApplicationComponent getApplicationComponent() {
        return null;
    }
    
    public final void setApplicationComponent(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.di.component.ApplicationComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void injectDependencies() {
    }
    
    public WeatherForecastApplication() {
        super();
    }
}