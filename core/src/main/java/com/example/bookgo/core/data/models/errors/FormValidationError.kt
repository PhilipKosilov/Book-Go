package com.example.bookgo.core.data.models.errors

//todo check what this is
sealed class FormValidationError
object EmptyFieldError : FormValidationError()
object InvalidEmailError : FormValidationError()
object PasswordShortError : FormValidationError()
object PasswordNoNumbersError : FormValidationError()
object PasswordNoUppercaseError : FormValidationError()
object PasswordMismatchError : FormValidationError()
object InvalidLoginError : FormValidationError()
object EmailTakenError : FormValidationError()