package com.example.app.ui.room

import android.app.Application
import android.content.SharedPreferences
import com.example.app.ApplicationModule
import com.example.app.ApplicationScope
import com.example.app.data.api.VideoAppServiceModule
import com.example.app.data.DataModule
import com.example.app.data.api.TokenService

import dagger.Module
import dagger.Provides

@Module(includes = [
    ApplicationModule::class,
    DataModule::class,
    VideoAppServiceModule::class])
class RoomManagerModule {

    @Provides
    @ApplicationScope
    fun providesRoomManager(
        application: Application,
        sharedPreferences: SharedPreferences,
        tokenService: TokenService
    ): RoomManager {
        return RoomManager(application, sharedPreferences, tokenService)
    }
}