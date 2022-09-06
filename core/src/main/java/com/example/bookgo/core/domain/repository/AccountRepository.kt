package com.example.bookgo.core.domain.repository

import com.example.bookgo.core.data.models.entities.SignInData
import com.example.bookgo.core.data.models.entities.SignUpData

/**
 * Repository with account-related actions, e.g. sign-in, sign-up etc.
 */
interface AccountRepository {

    /**
     * Whether user is signed-in or not.
     */
    suspend fun isSignedIn(): Boolean

    /**
     * Try to sign-in with the email and password.
     */
    suspend fun signIn(signInData: SignInData): Boolean

    /**
     * Create a new account.
     */
    suspend fun signUp(signUpData: SignUpData)

    /**
     * Sign-out from the app.
     */
    fun logout()
}