package com.example.bookgo.feature_settings.domain.usecase

import com.example.bookgo.core.domain.firebase.state.LogoutState

interface LogoutUseCase {
    operator fun invoke(): LogoutState
}