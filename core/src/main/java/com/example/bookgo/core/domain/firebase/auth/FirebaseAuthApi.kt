package com.example.bookgo.core.domain.firebase.auth

import com.example.bookgo.core.domain.firebase.state.LoginState
import com.example.bookgo.core.domain.firebase.state.RegistrationState

interface FirebaseAuthApi {
    suspend fun login(email: String, password: String): LoginState
    suspend fun register(email: String, password: String): RegistrationState
}