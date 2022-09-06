package com.example.bookgo.core.data.models.entities

/**
 * Entity containing data needed to sign up.
 */
data class SignUpData(
    val username: String,
    val email: String,
    val password: String,
    val passwordRepeat: String
)