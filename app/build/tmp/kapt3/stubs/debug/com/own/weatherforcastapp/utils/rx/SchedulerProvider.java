package com.own.weatherforcastapp.utils.rx;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/own/weatherforcastapp/utils/rx/SchedulerProvider;", "", "computation", "Lio/reactivex/Scheduler;", "io", "ui", "app_debug"})
@javax.inject.Singleton()
public abstract interface SchedulerProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler computation();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler io();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler ui();
}