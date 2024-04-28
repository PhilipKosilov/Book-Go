package com.example.bookgo.core.domain.validation.usecase.email

import com.example.bookgo.core.domain.validation.result.FieldValidationResult
import com.example.bookgo.core.domain.validation.validator.EmailValidator
import javax.inject.Inject

class ValidateEmailUseCaseImpl @Inject constructor(
    private val emailValidator: EmailValidator,
) : ValidateEmailUseCase {
    override fun invoke(email: String): FieldValidationResult {
        return if (emailValidator.isValidEmail(email)) {
            FieldValidationResult.Success
        } else {
            FieldValidationResult.InvalidEmail
        }
    }
}