package com.example.app.ui

import com.example.app.base.BaseActivity


interface ScreenSelector {

    val loginScreen: Class<out BaseActivity>
}