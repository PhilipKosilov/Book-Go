package com.example.bookgo.core.domain.validation.usecase.name

import com.example.bookgo.core.domain.validation.result.FieldValidationResult
import javax.inject.Inject

class ValidateNameUseCaseImpl @Inject constructor() : ValidateNameUseCase {
    override fun invoke(name: String): FieldValidationResult {
        // todo valid range is hardcoded. Maybe move to "validation rules".
        return if (name.length in 1..50 && name.isNotBlank()) {
            FieldValidationResult.Success
        } else {
            FieldValidationResult.InvalidName
        }
    }
}