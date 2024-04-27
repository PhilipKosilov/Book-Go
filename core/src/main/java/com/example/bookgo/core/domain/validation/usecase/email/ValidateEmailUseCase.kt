package com.example.bookgo.core.domain.validation.usecase.email

import com.example.bookgo.core.domain.validation.result.FieldValidationResult

interface ValidateEmailUseCase {
    operator fun invoke(email: String): FieldValidationResult
}