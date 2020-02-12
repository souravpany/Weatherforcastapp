package com.own.weatherforcastapp.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u00020\u0006B\u0017\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u001dH\u0002\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H$J\b\u0010$\u001a\u00020\u0019H\u0004J\u0006\u0010%\u001a\u00020\u0019J\u0006\u0010&\u001a\u00020\u0019J\u0006\u0010\'\u001a\u00020\u0019J\b\u0010(\u001a\u00020\u0019H\u0014J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+H&J\u0010\u0010,\u001a\u00020\u00192\b\b\u0001\u0010-\u001a\u00020\bJ\u000e\u0010,\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u00028\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u00060"}, d2 = {"Lcom/own/weatherforcastapp/ui/base/BaseItemViewHolder;", "T", "", "VM", "Lcom/own/weatherforcastapp/ui/base/BaseItemViewModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/lifecycle/LifecycleOwner;", "layoutId", "", "parent", "Landroid/view/ViewGroup;", "(ILandroid/view/ViewGroup;)V", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "setLifecycleRegistry", "(Landroidx/lifecycle/LifecycleRegistry;)V", "viewModel", "getViewModel", "()Lcom/own/weatherforcastapp/ui/base/BaseItemViewModel;", "setViewModel", "(Lcom/own/weatherforcastapp/ui/base/BaseItemViewModel;)V", "Lcom/own/weatherforcastapp/ui/base/BaseItemViewModel;", "bind", "", "data", "(Ljava/lang/Object;)V", "buildViewHolderComponent", "error/NonExistentClass", "()Lerror/NonExistentClass;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "injectDependencies", "viewHolderComponent", "Lcom/own/weatherforcastapp/di/component/ViewHolderComponent;", "onCreate", "onDestroy", "onStart", "onStop", "setupObservers", "setupView", "view", "Landroid/view/View;", "showMessage", "resId", "message", "", "app_debug"})
public abstract class BaseItemViewHolder<T extends java.lang.Object, VM extends com.own.weatherforcastapp.ui.base.BaseItemViewModel<T>> extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements androidx.lifecycle.LifecycleOwner {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public VM viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.LifecycleRegistry lifecycleRegistry;
    
    @org.jetbrains.annotations.NotNull()
    public final VM getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LifecycleRegistry getLifecycleRegistry() {
        return null;
    }
    
    public final void setLifecycleRegistry(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleRegistry p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return null;
    }
    
    public void bind(@org.jetbrains.annotations.NotNull()
    T data) {
    }
    
    protected final void onCreate() {
    }
    
    public final void onStart() {
    }
    
    public final void onStop() {
    }
    
    public final void onDestroy() {
    }
    
    private final error.NonExistentClass buildViewHolderComponent() {
        return null;
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showMessage(@androidx.annotation.StringRes()
    int resId) {
    }
    
    protected void setupObservers() {
    }
    
    protected abstract void injectDependencies(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.di.component.ViewHolderComponent viewHolderComponent);
    
    public abstract void setupView(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public BaseItemViewHolder(@androidx.annotation.LayoutRes()
    int layoutId, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        super(null);
    }
}