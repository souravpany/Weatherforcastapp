package com.own.weatherforcastapp.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/own/weatherforcastapp/data/remote/response/ForecastResponse;", "", "cod", "", "message", "city", "Lcom/own/weatherforcastapp/data/model/forcast/City;", "cnt", "list", "", "Lcom/own/weatherforcastapp/data/model/forcast/Lists;", "(IILcom/own/weatherforcastapp/data/model/forcast/City;ILjava/util/List;)V", "getCity", "()Lcom/own/weatherforcastapp/data/model/forcast/City;", "getCnt", "()I", "getCod", "getList", "()Ljava/util/List;", "getMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class ForecastResponse {
    @com.google.gson.annotations.SerializedName(value = "cod")
    private final int cod = 0;
    @com.google.gson.annotations.SerializedName(value = "message")
    private final int message = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "city")
    private final com.own.weatherforcastapp.data.model.forcast.City city = null;
    @com.google.gson.annotations.SerializedName(value = "cnt")
    private final int cnt = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "list")
    private final java.util.List<com.own.weatherforcastapp.data.model.forcast.Lists> list = null;
    
    public final int getCod() {
        return 0;
    }
    
    public final int getMessage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.forcast.City getCity() {
        return null;
    }
    
    public final int getCnt() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.own.weatherforcastapp.data.model.forcast.Lists> getList() {
        return null;
    }
    
    public ForecastResponse(int cod, int message, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.forcast.City city, int cnt, @org.jetbrains.annotations.NotNull()
    java.util.List<com.own.weatherforcastapp.data.model.forcast.Lists> list) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.forcast.City component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.own.weatherforcastapp.data.model.forcast.Lists> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.remote.response.ForecastResponse copy(int cod, int message, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.forcast.City city, int cnt, @org.jetbrains.annotations.NotNull()
    java.util.List<com.own.weatherforcastapp.data.model.forcast.Lists> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}