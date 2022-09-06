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
        username.isEmpty() -> ErrorCode.EMPTY_FIELD
        else -> null
    }

    private fun validateEmail(email: String) = when {
        email.isEmpty() -> ErrorCode.EMPTY_FIELD
        !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> ErrorCode.INVALID_EMAIL
        else -> null
    }

    private fun validatePassword(password: String) = when {
        password.isEmpty() -> ErrorCode.EMPTY_FIELD
        password.length < 5 -> ErrorCode.PASSWORD_SHORT
        !password.contains(Regex("[1-9]")) -> ErrorCode.PASSWORD_SHOULD_CONTAIN_NUMBERS
        !password.contains(Regex("[A-Z]")) -> ErrorCode.PASSWORD_SHOULD_CONTAIN_UPPER_CASE
        else -> null
    }

    private fun validatePasswordRepeat(password: String, passwordRepeat: String) = when {
        password.isEmpty() -> ErrorCode.EMPTY_FIELD
        password != passwordRepeat -> ErrorCode.PASSWORD_MISMATCH
        else -> null
    }
}