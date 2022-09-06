package com.example.bookgo.feature_auth.domain.utils

object ErrorCode {
    const val EMPTY_FIELD = 0
    const val INVALID_EMAIL = 1
    const val PASSWORD_SHORT = 2
    const val PASSWORD_SHOULD_CONTAIN_NUMBERS = 3
    const val PASSWORD_SHOULD_CONTAIN_UPPER_CASE = 4
    const val PASSWORD_MISMATCH = 5
    const val INVALID_EMAIL_OR_PASSWORD = 6
    const val ACCOUNT_ALREADY_EXISTS = 7
}