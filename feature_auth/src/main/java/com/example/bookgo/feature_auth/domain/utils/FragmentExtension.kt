package com.example.bookgo.feature_auth.domain.utils

import androidx.fragment.app.Fragment
import com.example.bookgo.core.data.models.errors.FormValidationError

// SignIn and SignUp authorization errors are processed in domain layer, but i need to use
// string resources to display error messages.
// todo: rewrite to be exhaustive
// todo remove entirely. Pass this data from ViewModel.
//fun Fragment.resolveErrorMessage(error: FormValidationError?) = when (error) {
//    EmptyFieldError -> getString(R.string.field_is_empty)
//    InvalidEmailError -> getString(R.string.invalid_email)
//    PasswordShortError -> getString(R.string.invalid_password_length)
//    PasswordNoNumbersError -> getString(R.string.password_should_contain_numbers)
//    PasswordNoUppercaseError -> getString(R.string.password_should_contain_upper_case)
//    PasswordMismatchError -> getString(R.string.password_mismatch)
//    InvalidLoginError -> getString(R.string.invalid_email_or_password)
//    EmailTakenError -> getString(R.string.account_already_exists)
//    null -> ""
//}

fun Fragment.resolveErrorMessage(error: FormValidationError?) = ""