package com.example.bookgo.core.domain.validation.usecase.password

import com.example.bookgo.core.domain.validation.result.FieldValidationResult

interface ValidateConfirmPasswordUseCase {
    operator fun invoke(password: String, confirmPassword: String): FieldValidationResult
}