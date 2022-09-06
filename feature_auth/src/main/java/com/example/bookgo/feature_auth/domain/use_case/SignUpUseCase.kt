package com.example.bookgo.feature_auth.domain.use_case

import com.example.bookgo.core.data.models.entities.SignUpData
import com.example.bookgo.core.data.models.exceptions.EmailTakenException
import com.example.bookgo.core.domain.repository.AccountRepository
import com.example.bookgo.feature_auth.domain.models.SignUpResult
import com.example.bookgo.feature_auth.domain.utils.ErrorCode
import com.example.bookgo.feature_auth.domain.utils.ValidationUtil
import javax.inject.Inject


class SignUpUseCase @Inject constructor(
    val accountsRepository: AccountRepository
) {
    suspend fun execute(signUpData: SignUpData): SignUpResult {
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
                authError = ErrorCode.ACCOUNT_ALREADY_EXISTS
            )
        }
    }
}