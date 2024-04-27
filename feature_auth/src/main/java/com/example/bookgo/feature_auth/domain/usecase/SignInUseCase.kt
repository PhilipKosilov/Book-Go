package com.example.bookgo.feature_auth.domain.usecase

import com.example.bookgo.core.data.models.entities.SignInData
import com.example.bookgo.feature_auth.domain.models.SignInResult

interface SignInUseCase {
    suspend operator fun invoke(signInData: SignInData): SignInResult
}