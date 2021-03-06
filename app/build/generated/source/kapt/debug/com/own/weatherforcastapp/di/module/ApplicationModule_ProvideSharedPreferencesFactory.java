// Generated by Dagger (https://google.github.io/dagger).
package com.own.weatherforcastapp.di.module;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApplicationModule_ProvideSharedPreferencesFactory
    implements Factory<SharedPreferences> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideSharedPreferencesFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public SharedPreferences get() {
    return proxyProvideSharedPreferences(module);
  }

  public static ApplicationModule_ProvideSharedPreferencesFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideSharedPreferencesFactory(module);
  }

  public static SharedPreferences proxyProvideSharedPreferences(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideSharedPreferences(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
