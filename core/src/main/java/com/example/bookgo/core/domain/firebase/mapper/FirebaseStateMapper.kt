package com.example.bookgo.core.domain.firebase.mapper

import com.example.bookgo.core.R
import com.example.bookgo.core.domain.firebase.state.LoginState
import com.example.bookgo.core.domain.firebase.state.RegistrationState
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirebaseStateMapper @Inject constructor() {
    fun toMessageId(state: LoginState): Int? = when (state) {
        is LoginState.InvalidCredentials -> R.string.invalid_login_credentials
        is LoginState.NetworkFailure -> R.string.no_internet_connection
        is LoginState.UnknownFailure -> R.string.unknown_error_has_occurred
        is LoginState.Success -> null
    }

    fun toMessageId(state: RegistrationState): Int = when (state) {
        RegistrationState.UserAlreadyExists -> R.string.user_with_this_email_already_exists
        RegistrationState.UnknownFailure -> R.string.no_internet_connection
        RegistrationState.NetworkFailure -> R.string.unknown_error_has_occurred
        RegistrationState.Success -> R.string.registration_success
    }
}