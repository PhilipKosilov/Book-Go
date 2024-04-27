package com.example.bookgo.feature_auth.domain.usecase

import com.example.bookgo.core.data.models.entities.LoginData
import com.example.bookgo.core.domain.firebase.state.LoginState

interface LoginUseCase {
    suspend operator fun invoke(data: LoginData): LoginState
}