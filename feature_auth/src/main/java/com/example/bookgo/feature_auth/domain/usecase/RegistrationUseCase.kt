package com.example.bookgo.feature_auth.domain.usecase

import com.example.bookgo.core.data.models.entities.RegistrationData
import com.example.bookgo.core.domain.firebase.state.RegistrationState

interface RegistrationUseCase {
    suspend operator fun invoke(data: RegistrationData): RegistrationState
}