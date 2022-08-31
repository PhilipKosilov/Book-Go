package com.example.bookgo.feature_auth.presentation.signup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookgo.core.data.models.entities.SignUpData
import com.example.bookgo.core.utils.livedata.MutableLiveEvent
import com.example.bookgo.core.utils.livedata.MutableUnitLiveEvent
import com.example.bookgo.core.utils.livedata.publishEvent
import com.example.bookgo.core.utils.livedata.toLiveEvent
import com.example.bookgo.feature_auth.domain.use_case.SignUpUseCase
import kotlinx.coroutines.launch


class SignUpViewModel(
    private val signUp: SignUpUseCase
) : ViewModel() {

    private val _showInvalidUserName = MutableLiveData<String?>()
    val showInvalidUserName: LiveData<String?> = _showInvalidUserName

    private val _showInvalidEmail = MutableLiveData<String?>()
    val showInvalidEmail: LiveData<String?> = _showInvalidEmail

    private val _showInvalidPassword = MutableLiveData<String?>()
    val showInvalidPassword: LiveData<String?> = _showInvalidPassword

    private val _showInvalidRepeatPassword = MutableLiveData<String?>()
    val showInvalidRepeatPassword: LiveData<String?> = _showInvalidRepeatPassword

    private val _showSuccessSignUpEvent = MutableUnitLiveEvent()
    val showSuccessSignUpEvent = _showSuccessSignUpEvent.toLiveEvent()

    private val _showErrorToast = MutableLiveEvent<String?>()
    val showErrorToast = _showErrorToast.toLiveEvent()

    private val _goBackEvent = MutableUnitLiveEvent()
    val goBackEvent = _goBackEvent.toLiveEvent()


    fun signUp(signUpData: SignUpData) = viewModelScope.launch {
        val result = signUp.execute(signUpData)

        if (result.success) {
            _showSuccessSignUpEvent.publishEvent()
            _goBackEvent.publishEvent()
        } else if (result.authError != null) {
            _showErrorToast.publishEvent(result.authError)
        } else {
            _showInvalidUserName.postValue(result.usernameError)
            _showInvalidEmail.postValue(result.emailError)
            _showInvalidPassword.postValue(result.passwordError)
            _showInvalidRepeatPassword.postValue(result.passwordRepeatError)
        }
    }
}