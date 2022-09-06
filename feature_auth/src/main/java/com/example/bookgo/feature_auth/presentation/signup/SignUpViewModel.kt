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

    private val _showInvalidUserName = MutableLiveData<Int?>()
    val showInvalidUserName: LiveData<Int?> = _showInvalidUserName

    private val _showInvalidEmail = MutableLiveData<Int?>()
    val showInvalidEmail: LiveData<Int?> = _showInvalidEmail

    private val _showInvalidPassword = MutableLiveData<Int?>()
    val showInvalidPassword: LiveData<Int?> = _showInvalidPassword

    private val _showInvalidRepeatPassword = MutableLiveData<Int?>()
    val showInvalidRepeatPassword: LiveData<Int?> = _showInvalidRepeatPassword

    private val _showErrorToast = MutableLiveEvent<Int?>()
    val showErrorToast = _showErrorToast.toLiveEvent()

    private val _goBackEvent = MutableUnitLiveEvent()
    val goBackEvent = _goBackEvent.toLiveEvent()

    fun signUp(signUpData: SignUpData) = viewModelScope.launch {
        val result = signUp.execute(signUpData)

        if (result.success) {
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