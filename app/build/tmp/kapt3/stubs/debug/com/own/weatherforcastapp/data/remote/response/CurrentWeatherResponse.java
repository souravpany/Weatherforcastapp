package com.own.weatherforcastapp.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0018J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\fH\u00c6\u0003J\t\u0010E\u001a\u00020\fH\u00c6\u0003J\t\u0010F\u001a\u00020\bH\u00c6\u0003J\t\u0010G\u001a\u00020\fH\u00c6\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\bH\u00c6\u0003J\t\u0010J\u001a\u00020\nH\u00c6\u0003J\t\u0010K\u001a\u00020\fH\u00c6\u0003J\t\u0010L\u001a\u00020\u000eH\u00c6\u0003J\t\u0010M\u001a\u00020\u0010H\u00c6\u0003J\t\u0010N\u001a\u00020\fH\u00c6\u0003J\t\u0010O\u001a\u00020\u0013H\u00c6\u0003J\u0091\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\fH\u00c6\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010T\u001a\u00020\fH\u00d6\u0001J\t\u0010U\u001a\u00020\bH\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001e\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010$R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\u00a8\u0006V"}, d2 = {"Lcom/own/weatherforcastapp/data/remote/response/CurrentWeatherResponse;", "", "coord", "Lcom/own/weatherforcastapp/data/model/currentweather/Coord;", "weather", "", "Lcom/own/weatherforcastapp/data/model/currentweather/Weather;", "base", "", "main", "Lcom/own/weatherforcastapp/data/model/currentweather/Main;", "visibility", "", "wind", "Lcom/own/weatherforcastapp/data/model/currentweather/Wind;", "clouds", "Lcom/own/weatherforcastapp/data/model/currentweather/Clouds;", "dt", "sys", "Lcom/own/weatherforcastapp/data/model/currentweather/Sys;", "timezone", "id", "name", "cod", "(Lcom/own/weatherforcastapp/data/model/currentweather/Coord;Ljava/util/List;Ljava/lang/String;Lcom/own/weatherforcastapp/data/model/currentweather/Main;ILcom/own/weatherforcastapp/data/model/currentweather/Wind;Lcom/own/weatherforcastapp/data/model/currentweather/Clouds;ILcom/own/weatherforcastapp/data/model/currentweather/Sys;IILjava/lang/String;I)V", "getBase", "()Ljava/lang/String;", "setBase", "(Ljava/lang/String;)V", "getClouds", "()Lcom/own/weatherforcastapp/data/model/currentweather/Clouds;", "setClouds", "(Lcom/own/weatherforcastapp/data/model/currentweather/Clouds;)V", "getCod", "()I", "setCod", "(I)V", "getCoord", "()Lcom/own/weatherforcastapp/data/model/currentweather/Coord;", "setCoord", "(Lcom/own/weatherforcastapp/data/model/currentweather/Coord;)V", "getDt", "setDt", "getId", "setId", "getMain", "()Lcom/own/weatherforcastapp/data/model/currentweather/Main;", "setMain", "(Lcom/own/weatherforcastapp/data/model/currentweather/Main;)V", "getName", "setName", "getSys", "()Lcom/own/weatherforcastapp/data/model/currentweather/Sys;", "setSys", "(Lcom/own/weatherforcastapp/data/model/currentweather/Sys;)V", "getTimezone", "setTimezone", "getVisibility", "setVisibility", "getWeather", "()Ljava/util/List;", "setWeather", "(Ljava/util/List;)V", "getWind", "()Lcom/own/weatherforcastapp/data/model/currentweather/Wind;", "setWind", "(Lcom/own/weatherforcastapp/data/model/currentweather/Wind;)V", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CurrentWeatherResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "coord")
    @com.google.gson.annotations.Expose()
    private com.own.weatherforcastapp.data.model.currentweather.Coord coord;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weather")
    @com.google.gson.annotations.Expose()
    private java.util.List<com.own.weatherforcastapp.data.model.currentweather.Weather> weather;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "base")
    @com.google.gson.annotations.Expose()
    private java.lang.String base;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "main")
    @com.google.gson.annotations.Expose()
    private com.own.weatherforcastapp.data.model.currentweather.Main main;
    @com.google.gson.annotations.SerializedName(value = "visibility")
    @com.google.gson.annotations.Expose()
    private int visibility;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "wind")
    @com.google.gson.annotations.Expose()
    private com.own.weatherforcastapp.data.model.currentweather.Wind wind;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "clouds")
    @com.google.gson.annotations.Expose()
    private com.own.weatherforcastapp.data.model.currentweather.Clouds clouds;
    @com.google.gson.annotations.SerializedName(value = "dt")
    @com.google.gson.annotations.Expose()
    private int dt;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "sys")
    @com.google.gson.annotations.Expose()
    private com.own.weatherforcastapp.data.model.currentweather.Sys sys;
    @com.google.gson.annotations.SerializedName(value = "timezone")
    @com.google.gson.annotations.Expose()
    private int timezone;
    @com.google.gson.annotations.SerializedName(value = "id")
    @com.google.gson.annotations.Expose()
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    @com.google.gson.annotations.Expose()
    private java.lang.String name;
    @com.google.gson.annotations.SerializedName(value = "cod")
    @com.google.gson.annotations.Expose()
    private int cod;
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.currentweather.Coord getCoord() {
        return null;
    }
    
    public final void setCoord(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Coord p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.own.weatherforcastapp.data.model.currentweather.Weather> getWeather() {
        return null;
    }
    
    public final void setWeather(@org.jetbrains.annotations.NotNull()
    java.util.List<com.own.weatherforcastapp.data.model.currentweather.Weather> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase() {
        return null;
    }
    
    public final void setBase(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.currentweather.Main getMain() {
        return null;
    }
    
    public final void setMain(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Main p0) {
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    public final void setVisibility(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.currentweather.Wind getWind() {
        return null;
    }
    
    public final void setWind(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Wind p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.currentweather.Clouds getClouds() {
        return null;
    }
    
    public final void setClouds(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Clouds p0) {
    }
    
    public final int getDt() {
        return 0;
    }
    
    public final void setDt(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.currentweather.Sys getSys() {
        return null;
    }
    
    public final void setSys(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Sys p0) {
    }
    
    public final int getTimezone() {
        return 0;
    }
    
    public final void setTimezone(int p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCod() {
        return 0;
    }
    
    public final void setCod(int p0) {
    }
    
    public CurrentWeatherResponse(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Coord coord, @org.jetbrains.annotations.NotNull()
    java.util.List<com.own.weatherforcastapp.data.model.currentweather.Weather> weather, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Main main, int visibility, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Wind wind, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Clouds clouds, int dt, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Sys sys, int timezone, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int cod) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.currentweather.Coord component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.own.weatherforcastapp.data.model.currentweather.Weather> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.currentweather.Main component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.currentweather.Wind component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.currentweather.Clouds component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.model.currentweather.Sys component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.remote.response.CurrentWeatherResponse copy(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Coord coord, @org.jetbrains.annotations.NotNull()
    java.util.List<com.own.weatherforcastapp.data.model.currentweather.Weather> weather, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Main main, int visibility, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Wind wind, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Clouds clouds, int dt, @org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.data.model.currentweather.Sys sys, int timezone, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int cod) {
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