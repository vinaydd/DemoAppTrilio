package com.example.app.ui.settings;

import com.example.app.ui.settings.SettingsActivity.SettingsFragment;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface SettingsFragmentSubcomponent extends AndroidInjector<SettingsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SettingsFragment> {}
}
