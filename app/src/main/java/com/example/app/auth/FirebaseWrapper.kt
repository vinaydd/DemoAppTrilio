package com.example.app.auth

import com.google.firebase.auth.FirebaseAuth

class FirebaseWrapper {

    val instance: FirebaseAuth
        get() = FirebaseAuth.getInstance()
}