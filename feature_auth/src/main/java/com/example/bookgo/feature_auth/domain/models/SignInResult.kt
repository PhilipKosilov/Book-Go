package com.example.bookgo.feature_auth.domain.models

import com.example.bookgo.core.data.models.errors.FormValidationError

data class SignInResult(
    val success: Boolean,
    val emailError: FormValidationError? = null,
    val passwordError: FormValidationError? = null,
    val loginError: FormValidationError? = null
)