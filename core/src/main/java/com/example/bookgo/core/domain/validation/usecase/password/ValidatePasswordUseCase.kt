package com.example.bookgo.core.domain.validation.usecase.password

import com.example.bookgo.core.domain.validation.result.FieldValidationResult

interface ValidatePasswordUseCase {
    operator fun invoke(password: String): FieldValidationResult
}