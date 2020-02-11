package com.own.weatherforcastapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/own/weatherforcastapp/data/repository/CurrentWeatherRepository;", "", "networkService", "Lcom/own/weatherforcastapp/data/remote/NetworkService;", "(Lcom/own/weatherforcastapp/data/remote/NetworkService;)V", "doAddPediatricsDetails", "Lio/reactivex/Single;", "Lcom/own/weatherforcastapp/data/remote/response/CurrentWeatherResponse;", "app_debug"})
public final class CurrentWeatherRepository {
    private final com.own.weatherforcastapp.data.remote.NetworkService networkService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.Single<com.own.weatherforcastapp.data.remote.response.CurrentWeatherResponse> doAddPediatricsDetails() {
        return null;
    }
    
    @javax.inject.Inject()
    public CurrentWeatherRepository(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.remote.NetworkService networkService) {
        super();
    }
}