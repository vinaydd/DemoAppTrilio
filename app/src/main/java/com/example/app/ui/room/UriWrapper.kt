package com.example.app.ui.room

import android.net.Uri

class UriWrapper(uri: Uri?) {

    val pathSegments: MutableList<String>? = uri?.pathSegments
}