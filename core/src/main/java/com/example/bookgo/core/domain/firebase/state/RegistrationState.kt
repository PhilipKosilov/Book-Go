package com.example.bookgo.core.domain.firebase.state

sealed interface RegistrationState {
    object Success : RegistrationState
    object UserAlreadyExists : RegistrationState
    object NetworkFailure : RegistrationState
    object UnknownFailure : RegistrationState
}