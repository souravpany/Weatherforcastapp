// Generated by Dagger (https://google.github.io/dagger).
package com.own.weatherforcastapp.ui.main.adapter;

import com.own.weatherforcastapp.utils.network.NetworkHelper;
import com.own.weatherforcastapp.utils.rx.SchedulerProvider;
import dagger.internal.Factory;
import io.reactivex.disposables.CompositeDisposable;
import javax.inject.Provider;

public final class ForecastItemViewModel_Factory implements Factory<ForecastItemViewModel> {
  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public ForecastItemViewModel_Factory(
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.schedulerProvider = schedulerProvider;
    this.compositeDisposableProvider = compositeDisposableProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public ForecastItemViewModel get() {
    return new ForecastItemViewModel(
        schedulerProvider.get(), compositeDisposableProvider.get(), networkHelperProvider.get());
  }

  public static ForecastItemViewModel_Factory create(
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new ForecastItemViewModel_Factory(
        schedulerProvider, compositeDisposableProvider, networkHelperProvider);
  }

  public static ForecastItemViewModel newForecastItemViewModel(
      SchedulerProvider schedulerProvider,
      CompositeDisposable compositeDisposable,
      NetworkHelper networkHelper) {
    return new ForecastItemViewModel(schedulerProvider, compositeDisposable, networkHelper);
  }
}