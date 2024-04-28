package com.example.bookgo.core.domain.validation.usecase.name

import com.example.bookgo.core.domain.validation.result.FieldValidationResult

interface ValidateNameUseCase {
    operator fun invoke(name: String): FieldValidationResult
}