package com.example.bookgo.core.data.models.mapper

import com.example.bookgo.core.data.models.entities.Account
import com.example.bookgo.core.data.models.entities.SignUpData
import javax.inject.Inject

class AccountMapper @Inject constructor() {
    fun mapFromSignUp(signUpData: SignUpData): Account {
        return Account(
            username = signUpData.username,
            email = signUpData.email,
            password = signUpData.password
        )
    }
}