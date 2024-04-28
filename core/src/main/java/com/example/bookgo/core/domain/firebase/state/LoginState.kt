package com.example.bookgo.core.domain.firebase.state

sealed interface LoginState {
    object Success : LoginState
    object InvalidCredentials : LoginState
    object NetworkFailure : LoginState
    object UnknownFailure : LoginState
}