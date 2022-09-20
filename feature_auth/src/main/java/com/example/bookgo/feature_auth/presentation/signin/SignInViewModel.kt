package com.example.bookgo.feature_auth.presentation.signin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookgo.core.data.models.entities.SignInData
import com.example.bookgo.core.data.models.errors.FormValidationError
import com.example.bookgo.core.utils.livedata.MutableLiveEvent
import com.example.bookgo.core.utils.livedata.MutableUnitLiveEvent
import com.example.bookgo.core.utils.livedata.publishEvent
import com.example.bookgo.core.utils.livedata.toLiveEvent
import com.example.bookgo.feature_auth.domain.models.SignInResult
import com.example.bookgo.feature_auth.domain.use_case.SignInUseCase

import kotlinx.coroutines.launch


class SignInViewModel(
    private val singIn: SignInUseCase
) : ViewModel() {

    // todo: add loading animation

    private val _state = MutableLiveData<State>()
    val state: LiveData<State> = _state

    fun signIn(signInData: SignInData) = viewModelScope.launch {
        val result = singIn.execute(signInData)
        _state.postValue(resultToState(result))
    }

    private fun resultToState(signInResult: SignInResult) = State(
        success = signInResult.success,
        emailError = signInResult.emailError,
        passwordError = signInResult.passwordError,
        loginError = signInResult.loginError
    )

    data class State(
        val success: Boolean,
        val emailError: FormValidationError? = null,
        val passwordError: FormValidationError? = null,
        val loginError: FormValidationError? = null
    )
}