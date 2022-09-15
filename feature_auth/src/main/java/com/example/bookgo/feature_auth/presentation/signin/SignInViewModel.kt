package com.example.bookgo.feature_auth.presentation.signin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookgo.core.data.models.entities.SignInData
import com.example.bookgo.core.utils.livedata.MutableLiveEvent
import com.example.bookgo.core.utils.livedata.MutableUnitLiveEvent
import com.example.bookgo.core.utils.livedata.publishEvent
import com.example.bookgo.core.utils.livedata.toLiveEvent
import com.example.bookgo.feature_auth.domain.use_case.SignInUseCase

import kotlinx.coroutines.launch


class SignInViewModel(
    private val singIn: SignInUseCase
) : ViewModel() {

    // todo: add loading animation

    private val _state = MutableLiveData<State>()
    val state: LiveData<State> = _state

    private val _showInvalidEmail = MutableLiveData<Int?>()
    val showInvalidEmail: LiveData<Int?> = _showInvalidEmail

    private val _showInvalidPassword = MutableLiveData<Int?>()
    val showInvalidPassword: LiveData<Int?> = _showInvalidPassword

    // won't be processed if value is null
    private val _showAuthErrorToast = MutableLiveEvent<Int?>()
    val showAuthToast = _showAuthErrorToast.toLiveEvent()

    //todo: rename to get back to main
    private val _navigateToMainEvent = MutableUnitLiveEvent()
    val navigateToMainEvent = _navigateToMainEvent.toLiveEvent()

    fun signIn(signInData: SignInData) = viewModelScope.launch {
        val result = singIn.execute(signInData)

        _showInvalidEmail.postValue(result.emailError)
        _showInvalidPassword.postValue(result.passwordError)
        _showAuthErrorToast.publishEvent(result.loginError)

        if (result.success) {
            _navigateToMainEvent.publishEvent()
        }
    }

    //TODO use state instead
    data class State(
        val success: Boolean,
        val emailError: Int? = null,
        val passwordError: Int? = null,
        val loginError: Int? = null
    )
}