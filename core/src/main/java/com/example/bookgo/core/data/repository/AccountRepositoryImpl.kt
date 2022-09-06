package com.example.bookgo.core.data.repository

import android.content.SharedPreferences
import com.example.bookgo.core.data.models.entities.Account
import com.example.bookgo.core.data.models.entities.SignInData
import com.example.bookgo.core.data.models.entities.SignUpData
import com.example.bookgo.core.data.source.Prefs
import com.example.bookgo.core.data.source.database.DBManager
import com.example.bookgo.core.domain.repository.AccountRepository
import javax.inject.Inject


class AccountRepositoryImpl @Inject constructor(
    private val pref: SharedPreferences,
    private val db: DBManager
) : AccountRepository {


    override suspend fun isSignedIn(): Boolean {
        val email = pref.getString(EMAIL_ATTRIBUTE, null) ?: return false
        val password = pref.getString(PASSWORD_ATTRIBUTE, null) ?: return false

        return isRegisteredAccount(email, password)
    }

    //todo: when signin write down SignData in local, when signup write to DB
    override suspend fun signIn(signInData: SignInData): Boolean {
        val (email, password) = signInData
        if (!isRegisteredAccount(email, password)) return false

        pref.edit()
            .putString(EMAIL_ATTRIBUTE, email)
            .putString(PASSWORD_ATTRIBUTE, password)
            .apply()
        return true
    }

    override suspend fun signUp(signUpData: SignUpData) {
        // todo: convert to Account by mapper
        val account = Account(
            username = signUpData.username,
            email = signUpData.email,
            password = signUpData.password
        )
        db.signUp(account)
    }


    override fun logout() {
        // todo: Remove login data from SharedPreferences
    }

    private suspend fun isRegisteredAccount(email: String, password: String) =
        db.contains(email, password)

    companion object {
        const val EMAIL_ATTRIBUTE = "email"
        const val PASSWORD_ATTRIBUTE = "password"
    }
}