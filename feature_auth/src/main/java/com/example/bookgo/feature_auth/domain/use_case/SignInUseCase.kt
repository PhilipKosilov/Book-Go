package com.example.bookgo.feature_auth.domain.use_case

import android.util.Log
import com.example.bookgo.core.data.models.entities.SignInData
import com.example.bookgo.core.data.repository.AccountRepositoryImpl
import com.example.bookgo.core.domain.repository.AccountRepository
import com.example.bookgo.core.temp.TAG
import com.example.bookgo.feature_auth.domain.models.SignInResult
import com.example.bookgo.feature_auth.domain.utils.ValidationUtil


class SignInUseCase(
    private val accountsRepository: AccountRepository = AccountRepositoryImpl()
) {
    suspend fun execute(signInData: SignInData): SignInResult {
        val validationResult = ValidationUtil.validateSignIn(signInData)

        if (!validationResult.success) {
            return validationResult
        }

        return if (accountsRepository.signIn(signInData)) {
            validationResult
        } else {
            validationResult.copy(
                success = false,
                loginError = "invalid email or password"
            )
        }
    }
}