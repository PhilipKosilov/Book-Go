package com.example.bookgo.domain.usecase

import com.example.bookgo.core.domain.firebase.auth.FirebaseAuthApi
import javax.inject.Inject

class CheckLoginUseCaseImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuthApi,
) : CheckLoginUseCase {
    override suspend operator fun invoke(): Boolean {
        return firebaseAuth.isUserLoggedIn()
    }
}