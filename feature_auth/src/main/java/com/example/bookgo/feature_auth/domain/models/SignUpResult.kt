package com.example.bookgo.feature_auth.domain.models

import com.example.bookgo.core.data.models.errors.FormValidationError

data class SignUpResult(
    val success: Boolean,
    val usernameError: FormValidationError? = null,
    val emailError: FormValidationError? = null,
    val passwordError: FormValidationError? = null,
    val passwordRepeatError: FormValidationError? = null,
    val authError: FormValidationError? = null
)