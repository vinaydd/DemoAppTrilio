package com.example.app.ui

import com.example.app.base.BaseActivity
import com.example.app.ui.login.LoginActivity

class ProductionScreenSelector : ScreenSelector {

    override val loginScreen: Class<out BaseActivity>
        get() = LoginActivity::class.java
}