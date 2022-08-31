package com.example.bookgo.feature_auth.domain.models

// Probably don't need this until getting data remotely

sealed class Response <out T> {
    data class Success<out T: Any>(val data: T) : Response<T>()
    data class Error(val message: String) : Response<Nothing>()
}