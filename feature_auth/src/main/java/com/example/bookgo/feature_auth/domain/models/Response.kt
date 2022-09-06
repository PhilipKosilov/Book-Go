package com.example.bookgo.feature_auth.domain.models

/*
    For future use. For now use SignInResult and SignUpResult.
 */

sealed class Response <out T> {
    data class Success<out T: Any>(val data: T) : Response<T>()
    data class Error(val message: String) : Response<Nothing>()
}