package com.example.app.ui.settings;

import com.example.app.ui.settings.SettingsActivity.SettingsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = SettingsFragmentSubcomponent.class)
public abstract class SettingsFragmentModule {
    @Binds
    @IntoMap
    @ClassKey(SettingsFragment.class)
    abstract AndroidInjector.Factory<?> bindYourFragmentInjectorFactory(
            SettingsFragmentSubcomponent.Factory factory);
}
