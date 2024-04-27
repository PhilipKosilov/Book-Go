package com.example.bookgo.feature_auth.domain.utils

import android.util.Patterns
import com.example.bookgo.core.data.models.entities.SignUpData
import com.example.bookgo.core.data.models.errors.EmptyFieldError
import com.example.bookgo.core.data.models.errors.InvalidEmailError
import com.example.bookgo.core.data.models.errors.PasswordMismatchError
import com.example.bookgo.core.data.models.errors.PasswordNoNumbersError
import com.example.bookgo.core.data.models.errors.PasswordNoUppercaseError
import com.example.bookgo.core.data.models.errors.PasswordShortError
import com.example.bookgo.feature_auth.domain.models.SignUpResult

object ValidationUtil { //todo remove and migrate to new Validators.

    fun validateSignUp(signUpData: SignUpData): SignUpResult {
        val usernameError = validateUserName(signUpData.username)
        val emailError = validateEmail(signUpData.email)
        val passwordError = validatePassword(signUpData.password)
        val passwordRepeatError =
            validatePasswordRepeat(signUpData.password, signUpData.passwordRepeat)

        val status =
            usernameError == null && emailError == null && passwordError == null && passwordRepeatError == null

        return SignUpResult(
            status,
            usernameError,
            emailError,
            passwordError,
            passwordRepeatError
        )
    }

//    fun validateSignIn(signInData: LoginData): SignInResult {
//        val emailError = validateEmail(signInData.email)
//        val passwordError = validatePassword(signInData.password)
//
//        val status = emailError == null && passwordError == null
//
//        return SignInResult(
//            status,
//            emailError,
//            passwordError
//        )
//    }

    private fun validateUserName(username: String) = when {
        username.isEmpty() -> EmptyFieldError
        else -> null
    }

    private fun validateEmail(email: String) = when {
        email.isEmpty() -> EmptyFieldError
        !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> InvalidEmailError
        else -> null
    }

    private fun validatePassword(password: String) = when {
        password.isEmpty() -> EmptyFieldError
        password.length < 5 -> PasswordShortError
        !password.contains(Regex("[1-9]")) -> PasswordNoNumbersError
        !password.contains(Regex("[A-Z]")) -> PasswordNoUppercaseError
        else -> null
    }

    private fun validatePasswordRepeat(password: String, passwordRepeat: String) = when {
        password.isEmpty() -> EmptyFieldError
        password != passwordRepeat -> PasswordMismatchError
        else -> null
    }
}