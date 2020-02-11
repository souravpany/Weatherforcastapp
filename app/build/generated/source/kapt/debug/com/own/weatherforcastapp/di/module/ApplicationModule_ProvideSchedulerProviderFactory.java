// Generated by Dagger (https://google.github.io/dagger).
package com.own.weatherforcastapp.di.module;

import com.own.weatherforcastapp.utils.rx.SchedulerProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApplicationModule_ProvideSchedulerProviderFactory
    implements Factory<SchedulerProvider> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideSchedulerProviderFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public SchedulerProvider get() {
    return proxyProvideSchedulerProvider(module);
  }

  public static ApplicationModule_ProvideSchedulerProviderFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideSchedulerProviderFactory(module);
  }

  public static SchedulerProvider proxyProvideSchedulerProvider(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideSchedulerProvider(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
