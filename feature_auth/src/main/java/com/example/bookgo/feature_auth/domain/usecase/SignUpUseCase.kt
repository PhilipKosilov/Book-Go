package com.example.bookgo.feature_auth.domain.usecase

import com.example.bookgo.core.data.models.entities.SignUpData
import com.example.bookgo.feature_auth.domain.models.SignUpResult

interface SignUpUseCase {
    suspend operator fun invoke(signUpData: SignUpData): SignUpResult
}