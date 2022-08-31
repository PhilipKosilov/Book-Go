package com.example.bookgo.feature_auth.domain.utils

import android.util.Patterns
import com.example.bookgo.core.data.models.entities.SignInData
import com.example.bookgo.core.data.models.entities.SignUpData
import com.example.bookgo.feature_auth.domain.models.SignInResult
import com.example.bookgo.feature_auth.domain.models.SignUpResult

object ValidationUtil {

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

    fun validateSignIn(signInData: SignInData): SignInResult {
        val emailError = validateEmail(signInData.email)
        val passwordError = validatePassword(signInData.password)

        val status = emailError == null && passwordError == null

        return SignInResult(
            status,
            emailError,
            passwordError
        )
    }

    private fun validateUserName(username: String) = when {
        username.isEmpty() -> "User name cannot be empty"
        else -> null
    }

    private fun validateEmail(email: String) = when {
        email.isEmpty() -> "email field is empty"
        !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> "is not a valid email"
        else -> null
    }

    private fun validatePassword(password: String) = when {
        password.isEmpty() -> "password field is empty"
        password.length < 5 -> "password has to be at least 5 symbols"
        !password.contains(Regex("[1-9]")) -> "password should contain numbers"
        !password.contains(Regex("[A-Z]")) -> "password should contain upper case letters"
        else -> null
    }

    private fun validatePasswordRepeat(password: String, passwordRepeat: String) = when {
        password.isEmpty() -> "repeat password field is empty"
        password != passwordRepeat -> "Password mismatch"
        else -> null
    }
}