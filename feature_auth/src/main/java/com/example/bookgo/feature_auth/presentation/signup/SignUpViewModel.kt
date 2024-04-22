package com.example.bookgo.feature_auth.presentation.signup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookgo.core.data.models.entities.SignUpData
import com.example.bookgo.core.data.models.errors.FormValidationError
import com.example.bookgo.core.utils.livedata.MutableLiveEvent
import com.example.bookgo.core.utils.livedata.publishEvent
import com.example.bookgo.core.utils.livedata.toLiveEvent
import com.example.bookgo.feature_auth.domain.models.SignUpResult
import com.example.bookgo.feature_auth.domain.use_case.SignUpUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val signUpUseCase: SignUpUseCase
) : ViewModel() {

    private val _state = MutableLiveData<State>()
    val state: LiveData<State> = _state

    private val _showErrorToast = MutableLiveEvent<FormValidationError?>()
    val showErrorToast = _showErrorToast.toLiveEvent()

    fun signUp(signUpData: SignUpData) = viewModelScope.launch {
        val result = signUpUseCase.execute(signUpData)
        _state.postValue(resultToState(result))

        if (result.authError != null) {
            _showErrorToast.publishEvent(result.authError)
        }
    }

    private fun resultToState(signUpResult: SignUpResult) = State(
        success = signUpResult.success,
        usernameError = signUpResult.usernameError,
        emailError = signUpResult.emailError,
        passwordError = signUpResult.passwordError,
        passwordRepeatError = signUpResult.passwordRepeatError
    )

    data class State(
        val success: Boolean,
        val usernameError: FormValidationError? = null,
        val emailError: FormValidationError? = null,
        val passwordError: FormValidationError? = null,
        val passwordRepeatError: FormValidationError? = null,
    )
}