package com.example.bookgo.feature_auth.domain.utils

import androidx.fragment.app.Fragment
import com.example.bookgo.feature_auth.R

//TODO find a better way to handle exceptions
fun Fragment.resolveErrorMessage(errorCode: Int?) = when (errorCode) {
    ErrorCode.EMPTY_FIELD -> getString(R.string.field_is_empty)
    ErrorCode.INVALID_EMAIL -> getString(R.string.email_invalid)
    ErrorCode.PASSWORD_SHORT -> getString(R.string.password_too_short)
    ErrorCode.PASSWORD_SHOULD_CONTAIN_NUMBERS -> getString(R.string.password_should_contain_numbers)
    ErrorCode.PASSWORD_SHOULD_CONTAIN_UPPER_CASE -> getString(R.string.password_should_contain_upper_case)
    ErrorCode.INVALID_EMAIL_OR_PASSWORD -> getString(R.string.invalid_email_or_password)
    else -> ""
}