package com.example.bookgo.feature_auth.domain.models

data class SignUpResult(
    val success: Boolean,
    val usernameError: Int? = null,
    val emailError: Int? = null,
    val passwordError: Int? = null,
    val passwordRepeatError: Int? = null,
    val authError: Int? = null
)