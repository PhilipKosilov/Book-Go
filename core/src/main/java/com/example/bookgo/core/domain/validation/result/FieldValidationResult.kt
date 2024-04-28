package com.example.bookgo.core.domain.validation.result

sealed interface FieldValidationResult {
    object Success : FieldValidationResult
    object InvalidName : FieldValidationResult
    object InvalidEmail : FieldValidationResult
    object InvalidPasswordLength : FieldValidationResult
    object PasswordHasNoNumbers : FieldValidationResult
    object PasswordHasNoUppercase : FieldValidationResult
    object PasswordMismatch : FieldValidationResult
    object FieldEmpty : FieldValidationResult
}