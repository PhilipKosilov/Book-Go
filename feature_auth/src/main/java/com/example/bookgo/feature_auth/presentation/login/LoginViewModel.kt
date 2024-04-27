package com.example.bookgo.feature_auth.presentation.login

import androidx.annotation.StringRes
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookgo.core.data.models.entities.LoginData
import com.example.bookgo.core.domain.firebase.mapper.FirebaseStateMapper
import com.example.bookgo.core.domain.firebase.state.LoginState
import com.example.bookgo.core.domain.models.ToastEvent
import com.example.bookgo.core.domain.validation.mapper.ValidationMapper
import com.example.bookgo.core.domain.validation.usecase.email.ValidateEmailUseCase
import com.example.bookgo.core.domain.validation.usecase.password.ValidatePasswordUseCase
import com.example.bookgo.core.utils.livedata.MutableLiveEvent
import com.example.bookgo.core.utils.livedata.publishEvent
import com.example.bookgo.core.utils.livedata.toLiveEvent
import com.example.bookgo.feature_auth.domain.usecase.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase,
    private val validateEmailUseCase: ValidateEmailUseCase,
    private val validatePasswordUseCase: ValidatePasswordUseCase,
    private val validationMapper: ValidationMapper,
    private val firebaseStateMapper: FirebaseStateMapper,
) : ViewModel() {

    // todo: add loading animation
    private var stateValue = State()
    private val _state = MutableLiveData(stateValue)
    val state: LiveData<State> = _state

    private val _showErrorToast = MutableLiveEvent<ToastEvent?>()
    val showErrorToast = _showErrorToast.toLiveEvent()

    fun login(data: LoginData) {
        viewModelScope.launch {
            if (validateLoginFields(data)) {
                when (val loginResult = loginUseCase(data)) {
                    is LoginState.Success -> {
                        updateState(stateValue.copy(success = true))
                    }

                    is LoginState.NetworkFailure,
                    is LoginState.InvalidCredentials,
                    is LoginState.UnknownFailure -> {
                        firebaseStateMapper.toMessageId(loginResult)?.let { messageId ->
                            showToast(messageId)
                        }
                    }
                }
            }
        }
    }

    private fun validateLoginFields(data: LoginData): Boolean {
        val emailResult = validateEmailUseCase(data.email)
        val emailValidation = validationMapper.toValidationState(emailResult)

        val passwordResult = validatePasswordUseCase(data.password)
        val passwordValidation = validationMapper.toValidationState(passwordResult)

        val newState = stateValue.copy(
            emailErrorMessageId = emailValidation.errorMessageId,
            passwordErrorMessageId = passwordValidation.errorMessageId,
        )
        updateState(newState)

        return !emailValidation.isError && !passwordValidation.isError
    }

    private fun showToast(@StringRes messageId: Int) {
        _showErrorToast.publishEvent(ToastEvent(messageResId = messageId))
    }

    private fun updateState(state: State) {
        stateValue = state
        _state.postValue(stateValue)
    }

    data class State(
        val success: Boolean = false,
        @StringRes val emailErrorMessageId: Int? = null,
        @StringRes val passwordErrorMessageId: Int? = null,
    )
}