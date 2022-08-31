package com.example.bookgo.core.data.models.entities


/**
 * Fields that should be provided during creating a new account.
 */
data class SignInData(
    val email: String,
    val password: String,
)