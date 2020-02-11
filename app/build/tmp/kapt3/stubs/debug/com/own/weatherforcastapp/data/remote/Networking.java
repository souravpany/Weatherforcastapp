package com.own.weatherforcastapp.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/own/weatherforcastapp/data/remote/Networking;", "", "()V", "API_KEY", "", "getAPI_KEY", "()Ljava/lang/String;", "setAPI_KEY", "(Ljava/lang/String;)V", "HEADER_ACCESS_TOKEN", "HEADER_API_KEY", "HEADER_USER_ID", "NETWORK_CALL_TIMEOUT", "", "create", "Lcom/own/weatherforcastapp/data/remote/NetworkService;", "apiKey", "baseUrl", "cacheDir", "Ljava/io/File;", "cacheSize", "", "app_debug"})
public final class Networking {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_API_KEY = "appid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_ACCESS_TOKEN = "x-access-token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_USER_ID = "x-user-id";
    private static final int NETWORK_CALL_TIMEOUT = 60;
    @org.jetbrains.annotations.NotNull()
    public static java.lang.String API_KEY;
    public static final com.own.weatherforcastapp.data.remote.Networking INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAPI_KEY() {
        return null;
    }
    
    public final void setAPI_KEY(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.data.remote.NetworkService create(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.io.File cacheDir, long cacheSize) {
        return null;
    }
    
    private Networking() {
        super();
    }
}