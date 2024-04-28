package com.example.bookgo.feature_settings.domain.usecase

import com.example.bookgo.core.domain.firebase.auth.FirebaseAuth
import com.example.bookgo.core.domain.firebase.state.LogoutState
import javax.inject.Inject

class LogoutUseCaseImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuth,
) : LogoutUseCase {
    override fun invoke(): LogoutState {
        return firebaseAuth.logout()
    }
}