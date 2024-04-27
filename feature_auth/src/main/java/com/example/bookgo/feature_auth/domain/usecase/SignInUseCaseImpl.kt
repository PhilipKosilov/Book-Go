package com.example.bookgo.feature_auth.domain.usecase

import com.example.bookgo.core.data.models.entities.SignInData
import com.example.bookgo.core.data.models.errors.InvalidLoginError
import com.example.bookgo.core.domain.repository.AccountRepository
import com.example.bookgo.feature_auth.domain.models.SignInResult
import com.example.bookgo.feature_auth.domain.utils.ValidationUtil
import javax.inject.Inject


class SignInUseCaseImpl @Inject constructor(
    private val accountsRepository: AccountRepository
) : SignInUseCase {
    override suspend operator fun invoke(signInData: SignInData): SignInResult {
        val validationResult = ValidationUtil.validateSignIn(signInData)

        if (!validationResult.success) {
            return validationResult
        }

        return if (accountsRepository.signIn(signInData)) {
            validationResult
        } else {
            validationResult.copy(
                success = false,
                loginError = InvalidLoginError
            )
        }
    }
}