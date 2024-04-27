package com.example.bookgo.core.domain.validation.mapper

import com.example.bookgo.core.R
import com.example.bookgo.core.domain.validation.result.FieldValidationResult
import com.example.bookgo.core.domain.validation.state.ValidationState
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ValidationMapper @Inject constructor() {
    fun toValidationState(result: FieldValidationResult): ValidationState {
        var isError = true
        val messageId: Int? = when (result) {
            is FieldValidationResult.InvalidName -> R.string.invalid_name
            is FieldValidationResult.InvalidEmail -> R.string.invalid_email
            is FieldValidationResult.InvalidPasswordLength -> R.string.invalid_password_length
            is FieldValidationResult.PasswordHasNoNumbers -> R.string.password_should_contain_numbers
            is FieldValidationResult.PasswordHasNoUppercase -> R.string.password_should_contain_upper_case
            is FieldValidationResult.FieldEmpty -> R.string.field_is_empty
            is FieldValidationResult.PasswordMismatch -> R.string.password_mismatch
            is FieldValidationResult.Success -> {
                isError = false
                null
            }
        }
        return ValidationState(isError, messageId)
    }
}