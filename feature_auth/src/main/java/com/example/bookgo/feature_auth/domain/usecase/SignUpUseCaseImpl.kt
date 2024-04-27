package com.example.bookgo.feature_auth.domain.usecase

import com.example.bookgo.core.data.models.entities.SignUpData
import com.example.bookgo.core.data.models.errors.EmailTakenError
import com.example.bookgo.core.data.models.exceptions.EmailTakenException
import com.example.bookgo.core.domain.repository.AccountRepository
import com.example.bookgo.feature_auth.domain.models.SignUpResult
import com.example.bookgo.feature_auth.domain.utils.ValidationUtil
import javax.inject.Inject


class SignUpUseCaseImpl @Inject constructor(
    private val accountsRepository: AccountRepository
): SignUpUseCase {
    override suspend operator fun invoke(signUpData: SignUpData): SignUpResult {
        val validationResult = ValidationUtil.validateSignUp(signUpData)

        if (!validationResult.success) {
            return validationResult
        }

        return try {
            accountsRepository.signUp(signUpData)
            validationResult
        } catch (e: EmailTakenException) {
            validationResult.copy(
                success = false,
                authError = EmailTakenError
            )
        }
    }
}