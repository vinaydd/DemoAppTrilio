/*
 * Copyright (C) 2019 Twilio, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.app.ui.splash

import android.content.Intent
import android.os.Bundle
import com.example.app.base.BaseActivity
import com.example.app.ui.room.RoomActivity
import com.example.app.auth.Authenticator
import com.example.app.ui.ScreenSelector

import javax.inject.Inject

class SplashActivity : BaseActivity() {

    @Inject lateinit var authenticator: Authenticator
    @Inject lateinit var screenSelector: ScreenSelector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val newIntent = if (authenticator.loggedIn())
            Intent(this, RoomActivity::class.java)
        else
            Intent(this, screenSelector.loginScreen)
            startActivity(newIntent.apply { data = intent.data })
            finish()
    }
}
