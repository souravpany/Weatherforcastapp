package com.own.weatherforcastapp.ui.base;

import java.lang.System;

/**
 * Reference for generics: https://kotlinlang.org/docs/reference/generics.html
 * Basically BaseActivity will take any class that extends BaseViewModel
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0002\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H$J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0018H%J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\u0012\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H$J\u0010\u0010\u001b\u001a\u00020\u000f2\b\b\u0001\u0010\u001c\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eR \u0010\u0005\u001a\u00028\u00008\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001f"}, d2 = {"Lcom/own/weatherforcastapp/ui/base/BaseActivity;", "VM", "Lcom/own/weatherforcastapp/ui/base/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "getViewModel", "()Lcom/own/weatherforcastapp/ui/base/BaseViewModel;", "setViewModel", "(Lcom/own/weatherforcastapp/ui/base/BaseViewModel;)V", "Lcom/own/weatherforcastapp/ui/base/BaseViewModel;", "buildActivityComponent", "error/NonExistentClass", "()Lerror/NonExistentClass;", "goBack", "", "injectDependencies", "activityComponent", "Lcom/own/weatherforcastapp/di/component/ActivityComponent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "provideLayoutId", "", "setupObservers", "setupView", "showMessage", "resId", "message", "", "app_debug"})
public abstract class BaseActivity<VM extends com.own.weatherforcastapp.ui.base.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public VM viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final VM getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final error.NonExistentClass buildActivityComponent() {
        return null;
    }
    
    protected void setupObservers() {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showMessage(@androidx.annotation.StringRes()
    int resId) {
    }
    
    public void goBack() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int provideLayoutId();
    
    protected abstract void injectDependencies(@org.jetbrains.annotations.NotNull()
    com.own.weatherforcastapp.di.component.ActivityComponent activityComponent);
    
    protected abstract void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    public BaseActivity() {
        super();
    }
}