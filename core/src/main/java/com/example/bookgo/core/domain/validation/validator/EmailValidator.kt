package com.example.bookgo.core.domain.validation.validator

import android.util.Patterns
import javax.inject.Inject

class EmailValidator @Inject constructor() {
    fun isValidEmail(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}