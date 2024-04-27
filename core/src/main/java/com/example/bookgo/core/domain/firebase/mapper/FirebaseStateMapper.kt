package com.example.bookgo.core.domain.firebase.mapper

import com.example.bookgo.core.R
import com.example.bookgo.core.domain.firebase.state.LoginState
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirebaseStateMapper @Inject constructor() {
    fun toMessageId(state : LoginState): Int? = when (state) {
        is LoginState.InvalidCredentials -> R.string.invalid_login_credentials
        is LoginState.NetworkFailure -> R.string.no_internet_connection
        is LoginState.UnknownFailure -> R.string.unknown_error_has_occurred
        is LoginState.Success -> null
    }
}