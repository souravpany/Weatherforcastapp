package com.own.weatherforcastapp.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/own/weatherforcastapp/data/remote/NetworkService;", "", "doCurrentWeatherReportCall", "Lio/reactivex/Single;", "Lcom/own/weatherforcastapp/data/remote/response/CurrentWeatherResponse;", "cityId", "", "apiKey", "app_debug"})
@javax.inject.Singleton()
public abstract interface NetworkService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract io.reactivex.Single<com.own.weatherforcastapp.data.remote.response.CurrentWeatherResponse> doCurrentWeatherReportCall(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id")
    java.lang.String cityId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}