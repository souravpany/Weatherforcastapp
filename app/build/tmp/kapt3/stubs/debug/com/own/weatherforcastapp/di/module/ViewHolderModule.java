package com.own.weatherforcastapp.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u0016\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/own/weatherforcastapp/di/module/ViewHolderModule;", "", "viewHolder", "Lcom/own/weatherforcastapp/ui/base/BaseItemViewHolder;", "(Lcom/own/weatherforcastapp/ui/base/BaseItemViewHolder;)V", "provideLifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "app_debug"})
@dagger.Module()
public final class ViewHolderModule {
    private final com.own.weatherforcastapp.ui.base.BaseItemViewHolder<?, ?> viewHolder = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.own.weatherforcastapp.di.ViewModelScope()
    @dagger.Provides()
    public final androidx.lifecycle.LifecycleRegistry provideLifecycleRegistry() {
        return null;
    }
    
    public ViewHolderModule(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.ui.base.BaseItemViewHolder<?, ?> viewHolder) {
        super();
    }
}