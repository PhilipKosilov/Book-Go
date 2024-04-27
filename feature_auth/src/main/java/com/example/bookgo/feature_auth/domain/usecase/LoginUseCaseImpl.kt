package com.example.bookgo.feature_auth.domain.usecase

import com.example.bookgo.core.data.models.entities.LoginData
import com.example.bookgo.core.domain.firebase.auth.FirebaseAuthApi
import com.example.bookgo.core.domain.firebase.state.LoginState
import javax.inject.Inject


class LoginUseCaseImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuthApi,
) : LoginUseCase {
    override suspend operator fun invoke(data: LoginData): LoginState {
        return firebaseAuth.login(data.email, data.password)
    }
}