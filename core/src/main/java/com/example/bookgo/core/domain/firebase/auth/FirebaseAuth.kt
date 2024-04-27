package com.example.bookgo.core.domain.firebase.auth

import com.example.bookgo.core.domain.firebase.state.LoginState
import com.example.bookgo.core.domain.firebase.state.RegistrationState
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.FirebaseNetworkException
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class FirebaseAuth @Inject constructor() : FirebaseAuthApi {
    private val firebaseAuth = FirebaseAuth.getInstance()

    override suspend fun register(email: String, password: String): RegistrationState {
        return suspendCoroutine { continuation ->
            val callback = OnCompleteListener<AuthResult> { task ->
                if (task.isSuccessful) {
                    continuation.resume(RegistrationState.Success)
                } else {
                    when (task.exception) {
                        is FirebaseNetworkException -> {
                            continuation.resume(RegistrationState.NetworkFailure)
                        }

                        is FirebaseAuthUserCollisionException -> {
                            continuation.resume(RegistrationState.UserAlreadyExists)
                        }

                        else -> {
                            continuation.resume(RegistrationState.UnknownFailure)
                        }
                    }
                }
            }
            firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(callback)
        }
    }

    override suspend fun login(email: String, password: String): LoginState {
        return suspendCoroutine { continuation ->
            val callback = OnCompleteListener<AuthResult> { task ->
                if (task.isSuccessful) {
                    continuation.resume(LoginState.Success)
                } else {
                    when (task.exception) {
                        is FirebaseAuthInvalidUserException -> {
                            continuation.resume(LoginState.InvalidCredentials)
                        }

                        is FirebaseAuthInvalidCredentialsException -> {
                            continuation.resume(LoginState.InvalidCredentials)
                        }

                        is FirebaseNetworkException -> {
                            continuation.resume(LoginState.NetworkFailure)
                        }

                        else -> {
                            continuation.resume(LoginState.UnknownFailure)
                        }
                    }
                }
            }
            firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(callback)
        }
    }
}