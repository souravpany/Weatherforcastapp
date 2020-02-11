// Generated by Dagger (https://google.github.io/dagger).
package com.own.weatherforcastapp.ui.main;

import com.own.weatherforcastapp.ui.base.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainViewModel> viewModelProvider;

  public MainActivity_MembersInjector(Provider<MainViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<MainViewModel> viewModelProvider) {
    return new MainActivity_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    BaseActivity_MembersInjector.injectViewModel(instance, viewModelProvider.get());
  }
}