package com.example.bookgo.feature_auth.domain.models

//data class SignInResult(
//    val success: Boolean,
//    val emailError: String? = null,
//    val passwordError: String? = null,
//    val loginError: String? = null
//)

data class SignInResult(
    val success: Boolean,
    val emailError: Int? = null,
    val passwordError: Int? = null,
    val loginError: Int? = null
)