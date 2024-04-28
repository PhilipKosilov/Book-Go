package com.example.bookgo.core.domain.firebase.state

sealed interface LogoutState {
    object Success : LogoutState
    object Failure : LogoutState
}