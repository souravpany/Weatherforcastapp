// Generated by Dagger (https://google.github.io/dagger).
package com.own.weatherforcastapp.di.component;

import androidx.lifecycle.LifecycleRegistry;
import com.own.weatherforcastapp.di.module.ViewHolderModule;
import com.own.weatherforcastapp.di.module.ViewHolderModule_ProvideLifecycleRegistryFactory;
import com.own.weatherforcastapp.ui.base.BaseItemViewHolder_MembersInjector;
import com.own.weatherforcastapp.ui.main.adapter.ForecastItemViewHolder;
import com.own.weatherforcastapp.ui.main.adapter.ForecastItemViewModel;
import com.own.weatherforcastapp.ui.main.adapter.ForecastSlideItemViewHolder;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerViewHolderComponent implements ViewHolderComponent {
  private final ApplicationComponent applicationComponent;

  private Provider<LifecycleRegistry> provideLifecycleRegistryProvider;

  private DaggerViewHolderComponent(
      ViewHolderModule viewHolderModuleParam, ApplicationComponent applicationComponentParam) {
    this.applicationComponent = applicationComponentParam;
    initialize(viewHolderModuleParam, applicationComponentParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  private ForecastItemViewModel getForecastItemViewModel() {
    return new ForecastItemViewModel(
        Preconditions.checkNotNull(
            applicationComponent.getSchedulerProvider(),
            "Cannot return null from a non-@Nullable component method"),
        Preconditions.checkNotNull(
            applicationComponent.getCompositeDisposable(),
            "Cannot return null from a non-@Nullable component method"),
        Preconditions.checkNotNull(
            applicationComponent.getNetworkHelper(),
            "Cannot return null from a non-@Nullable component method"));
  }

  @SuppressWarnings("unchecked")
  private void initialize(
      final ViewHolderModule viewHolderModuleParam,
      final ApplicationComponent applicationComponentParam) {
    this.provideLifecycleRegistryProvider =
        DoubleCheck.provider(
            ViewHolderModule_ProvideLifecycleRegistryFactory.create(viewHolderModuleParam));
  }

  @Override
  public void inject(ForecastItemViewHolder viewHolder) {
    injectForecastItemViewHolder(viewHolder);
  }

  @Override
  public void inject(ForecastSlideItemViewHolder viewHolder) {
    injectForecastSlideItemViewHolder(viewHolder);
  }

  private ForecastItemViewHolder injectForecastItemViewHolder(ForecastItemViewHolder instance) {
    BaseItemViewHolder_MembersInjector.injectViewModel(instance, getForecastItemViewModel());
    BaseItemViewHolder_MembersInjector.injectLifecycleRegistry(
        instance, provideLifecycleRegistryProvider.get());
    return instance;
  }

  private ForecastSlideItemViewHolder injectForecastSlideItemViewHolder(
      ForecastSlideItemViewHolder instance) {
    BaseItemViewHolder_MembersInjector.injectViewModel(instance, getForecastItemViewModel());
    BaseItemViewHolder_MembersInjector.injectLifecycleRegistry(
        instance, provideLifecycleRegistryProvider.get());
    return instance;
  }

  public static final class Builder {
    private ViewHolderModule viewHolderModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public Builder viewHolderModule(ViewHolderModule viewHolderModule) {
      this.viewHolderModule = Preconditions.checkNotNull(viewHolderModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }

    public ViewHolderComponent build() {
      Preconditions.checkBuilderRequirement(viewHolderModule, ViewHolderModule.class);
      Preconditions.checkBuilderRequirement(applicationComponent, ApplicationComponent.class);
      return new DaggerViewHolderComponent(viewHolderModule, applicationComponent);
    }
  }
}
