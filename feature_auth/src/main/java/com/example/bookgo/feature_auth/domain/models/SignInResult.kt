package com.example.bookgo.feature_auth.domain.models

//todo use Error classes instead of Int codes
data class SignInResult(
    val success: Boolean,
    val emailError: Int? = null,
    val passwordError: Int? = null,
    val loginError: Int? = null
)