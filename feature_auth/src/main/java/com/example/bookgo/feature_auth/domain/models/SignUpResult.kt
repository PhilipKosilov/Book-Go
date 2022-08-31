package com.example.bookgo.feature_auth.domain.models

data class SignUpResult(
    val success: Boolean,
    val usernameError: String? = null,
    val emailError: String? = null,
    val passwordError: String? = null,
    val passwordRepeatError: String? = null,
    val authError: String? = null
)