package com.example.bookgo.core.data.models.entities

/**
 * Entity containing data needed to register.
 */
data class RegistrationData( //todo check if has to be here, or can be in feature module.
    val username: String,
    val email: String,
    val password: String,
    val confirmPassword: String
)