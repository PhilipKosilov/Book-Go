package com.example.bookgo.feature_auth.presentation.registration

import androidx.annotation.StringRes
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookgo.core.data.models.entities.RegistrationData
import com.example.bookgo.core.domain.firebase.mapper.FirebaseStateMapper
import com.example.bookgo.core.domain.firebase.state.RegistrationState
import com.example.bookgo.core.domain.validation.mapper.ValidationMapper
import com.example.bookgo.core.domain.validation.usecase.email.ValidateEmailUseCase
import com.example.bookgo.core.domain.validation.usecase.name.ValidateNameUseCase
import com.example.bookgo.core.domain.validation.usecase.password.ValidateConfirmPasswordUseCase
import com.example.bookgo.core.domain.validation.usecase.password.ValidatePasswordUseCase
import com.example.bookgo.core.utils.manager.ToastEvent
import com.example.bookgo.core.utils.manager.ToastManager
import com.example.bookgo.feature_auth.domain.usecase.RegistrationUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor(
    private val registrationUseCase: RegistrationUseCase,
    private val validateNameUseCase: ValidateNameUseCase,
    private val validateEmailUseCase: ValidateEmailUseCase,
    private val validatePasswordUseCase: ValidatePasswordUseCase,
    private val validateConfirmPasswordUseCase: ValidateConfirmPasswordUseCase,
    private val validationMapper: ValidationMapper,
    private val firebaseStateMapper: FirebaseStateMapper,
    private val toastManager: ToastManager,
) : ViewModel() {

    private var stateValue = State()
    private val _state = MutableLiveData(stateValue)
    val state: LiveData<State> = _state

    fun register(data: RegistrationData) {
        viewModelScope.launch {
            if (validateRegistrationFields(data)) {
                when (val registrationResult = registrationUseCase(data)) {
                    is RegistrationState.Success -> {
                        updateState(stateValue.copy(success = true))
                    }

                    is RegistrationState.UserAlreadyExists,
                    is RegistrationState.NetworkFailure,
                    is RegistrationState.UnknownFailure -> {
                        val messageId = firebaseStateMapper.toMessageId(registrationResult)
                        toastManager.sendToast(ToastEvent(messageId))
                    }
                }
            }
        }
    }

    private fun validateRegistrationFields(data: RegistrationData): Boolean {
        val usernameResult = validateNameUseCase(data.username)
        val usernameValidation = validationMapper.toValidationState(usernameResult)

        val emailResult = validateEmailUseCase(data.email)
        val emailValidation = validationMapper.toValidationState(emailResult)

        val passwordResult = validatePasswordUseCase(data.password)
        val passwordValidation = validationMapper.toValidationState(passwordResult)

        val confirmPasswordResult = validateConfirmPasswordUseCase(data.password, data.confirmPassword)
        val confirmPasswordValidation = validationMapper.toValidationState(confirmPasswordResult)

        val newState = stateValue.copy(
            usernameErrorMessageId = usernameValidation.errorMessageId,
            emailErrorMessageId = emailValidation.errorMessageId,
            passwordErrorMessageId = passwordValidation.errorMessageId,
            confirmPasswordErrorMessageId = confirmPasswordValidation.errorMessageId,
        )
        updateState(newState)

        return !usernameValidation.isError && !emailValidation.isError
                && !passwordValidation.isError && !confirmPasswordValidation.isError
    }

    private fun updateState(state: State) {
        stateValue = state
        _state.postValue(stateValue)
    }

    data class State(
        val success: Boolean = false,
        @StringRes val usernameErrorMessageId: Int? = null,
        @StringRes val emailErrorMessageId: Int? = null,
        @StringRes val passwordErrorMessageId: Int? = null,
        @StringRes val confirmPasswordErrorMessageId: Int? = null,
    )
}