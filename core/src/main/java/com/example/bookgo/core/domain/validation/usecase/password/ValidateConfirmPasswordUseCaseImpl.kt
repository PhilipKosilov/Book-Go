package com.example.bookgo.core.domain.validation.usecase.password

import com.example.bookgo.core.domain.validation.result.FieldValidationResult
import javax.inject.Inject

class ValidateConfirmPasswordUseCaseImpl @Inject constructor() : ValidateConfirmPasswordUseCase {
    override fun invoke(password: String, confirmPassword: String): FieldValidationResult {
        return if (confirmPassword.isEmpty()) {
            FieldValidationResult.FieldEmpty
        } else if (password != confirmPassword) {
            FieldValidationResult.PasswordMismatch
        } else {
            FieldValidationResult.Success
        }
    }
}