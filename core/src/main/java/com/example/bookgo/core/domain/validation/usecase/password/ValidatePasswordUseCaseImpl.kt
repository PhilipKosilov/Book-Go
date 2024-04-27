package com.example.bookgo.core.domain.validation.usecase.password

import com.example.bookgo.core.domain.validation.result.FieldValidationResult
import javax.inject.Inject

class ValidatePasswordUseCaseImpl @Inject constructor() : ValidatePasswordUseCase {
    override fun invoke(password: String): FieldValidationResult {
        // todo valid range is hardcoded. Maybe move to "validation rules".
        return if (password.length !in 6..16) {
            FieldValidationResult.InvalidPasswordLength
        } else if (!password.contains(Regex("[1-9]"))) {
            FieldValidationResult.PasswordHasNoNumbers
        } else if (!password.contains(Regex("[A-Z]"))) {
            FieldValidationResult.PasswordHasNoUppercase
        } else {
            FieldValidationResult.Success
        }
    }
}