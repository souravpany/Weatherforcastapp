// Generated by Dagger (https://google.github.io/dagger).
package com.own.weatherforcastapp.di.module;

import com.own.weatherforcastapp.ui.splash.SplashViewModel;
import com.own.weatherforcastapp.utils.network.NetworkHelper;
import com.own.weatherforcastapp.utils.rx.SchedulerProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import javax.inject.Provider;

public final class ActivityModule_ProvideSplashViewModelFactory
    implements Factory<SplashViewModel> {
  private final ActivityModule module;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public ActivityModule_ProvideSplashViewModelFactory(
      ActivityModule module,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.module = module;
    this.schedulerProvider = schedulerProvider;
    this.compositeDisposableProvider = compositeDisposableProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public SplashViewModel get() {
    return proxyProvideSplashViewModel(
        module,
        schedulerProvider.get(),
        compositeDisposableProvider.get(),
        networkHelperProvider.get());
  }

  public static ActivityModule_ProvideSplashViewModelFactory create(
      ActivityModule module,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new ActivityModule_ProvideSplashViewModelFactory(
        module, schedulerProvider, compositeDisposableProvider, networkHelperProvider);
  }

  public static SplashViewModel proxyProvideSplashViewModel(
      ActivityModule instance,
      SchedulerProvider schedulerProvider,
      CompositeDisposable compositeDisposable,
      NetworkHelper networkHelper) {
    return Preconditions.checkNotNull(
        instance.provideSplashViewModel(schedulerProvider, compositeDisposable, networkHelper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}