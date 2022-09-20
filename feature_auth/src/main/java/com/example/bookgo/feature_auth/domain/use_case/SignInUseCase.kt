package com.example.bookgo.feature_auth.domain.use_case

import com.example.bookgo.core.data.models.entities.SignInData
import com.example.bookgo.core.data.models.errors.FormValidationError
import com.example.bookgo.core.data.models.errors.InvalidLoginError
import com.example.bookgo.core.domain.repository.AccountRepository
import com.example.bookgo.feature_auth.domain.models.SignInResult
import com.example.bookgo.feature_auth.domain.utils.ErrorCode
import com.example.bookgo.feature_auth.domain.utils.ValidationUtil
import javax.inject.Inject


class SignInUseCase @Inject constructor(
    val accountsRepository: AccountRepository
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
                loginError = InvalidLoginError
            )
        }
    }
}