package com.example.bookgo.feature_auth.presentation.login

import androidx.annotation.StringRes
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookgo.core.data.models.entities.LoginData
import com.example.bookgo.core.domain.firebase.mapper.FirebaseStateMapper
import com.example.bookgo.core.domain.firebase.state.LoginState
import com.example.bookgo.core.domain.validation.mapper.ValidationMapper
import com.example.bookgo.core.domain.validation.usecase.email.ValidateEmailUseCase
import com.example.bookgo.core.domain.validation.usecase.password.ValidatePasswordUseCase
import com.example.bookgo.core.utils.manager.ToastEvent
import com.example.bookgo.core.utils.manager.ToastManager
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
    private val toastManager: ToastManager,
) : ViewModel() {

    // todo: add loading animation
    private var stateValue = State()
    private val _state = MutableLiveData(stateValue)
    val state: LiveData<State> = _state

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
                            toastManager.sendToast(ToastEvent(messageId))
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