package com.example.app.ui;


import com.example.app.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ScreenSelectorModule {

    @Provides
    @ApplicationScope
    ScreenSelector providesScreenSelector() {
        return new ProductionScreenSelector();
    }
}
