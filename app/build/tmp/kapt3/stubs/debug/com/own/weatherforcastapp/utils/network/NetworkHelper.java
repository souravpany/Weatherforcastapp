package com.own.weatherforcastapp.utils.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/own/weatherforcastapp/utils/network/NetworkHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "castToNetworkError", "Lcom/own/weatherforcastapp/utils/network/NetworkError;", "throwable", "", "isNetworkConnected", "", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class NetworkHelper {
    private final android.content.Context context = null;
    private static final java.lang.String TAG = "NetworkHelper";
    public static final com.own.weatherforcastapp.utils.network.NetworkHelper.Companion Companion = null;
    
    public final boolean isNetworkConnected() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.utils.network.NetworkError castToNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
        return null;
    }
    
    public NetworkHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/own/weatherforcastapp/utils/network/NetworkHelper$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}