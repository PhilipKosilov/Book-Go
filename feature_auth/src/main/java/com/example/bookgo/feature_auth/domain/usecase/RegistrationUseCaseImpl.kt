package com.example.bookgo.feature_auth.domain.usecase

import com.example.bookgo.core.data.models.entities.RegistrationData
import com.example.bookgo.core.domain.firebase.auth.FirebaseAuthApi
import com.example.bookgo.core.domain.firebase.state.RegistrationState
import javax.inject.Inject


class RegistrationUseCaseImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuthApi,
): RegistrationUseCase {
    override suspend operator fun invoke(data: RegistrationData): RegistrationState {
        return firebaseAuth.register(data.email, data.password)
    }
}