// Generated by Dagger (https://google.github.io/dagger).
package com.own.weatherforcastapp.data.repository;

import com.own.weatherforcastapp.data.remote.NetworkService;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CurrentWeatherRepository_Factory implements Factory<CurrentWeatherRepository> {
  private final Provider<NetworkService> networkServiceProvider;

  public CurrentWeatherRepository_Factory(Provider<NetworkService> networkServiceProvider) {
    this.networkServiceProvider = networkServiceProvider;
  }

  @Override
  public CurrentWeatherRepository get() {
    return new CurrentWeatherRepository(networkServiceProvider.get());
  }

  public static CurrentWeatherRepository_Factory create(
      Provider<NetworkService> networkServiceProvider) {
    return new CurrentWeatherRepository_Factory(networkServiceProvider);
  }

  public static CurrentWeatherRepository newCurrentWeatherRepository(
      NetworkService networkService) {
    return new CurrentWeatherRepository(networkService);
  }
}
