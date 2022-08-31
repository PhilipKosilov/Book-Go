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


    private val _showInvalidEmail = MutableLiveData<String?>()
    val showInvalidEmail: LiveData<String?> = _showInvalidEmail

    private val _showInvalidPassword = MutableLiveData<String?>()
    val showInvalidPassword: LiveData<String?> = _showInvalidPassword

    // won't be processed if value is null
    private val _showAuthErrorToast = MutableLiveEvent<String?>()
    val showAuthToast = _showAuthErrorToast.toLiveEvent()

    //todo: rename to get back to main
    private val _navigateToTabsEvent = MutableUnitLiveEvent()
    val navigateToTabsEvent = _navigateToTabsEvent.toLiveEvent()
//
    fun signIn(signInData: SignInData) = viewModelScope.launch {
        val result = singIn.execute(signInData)

        _showInvalidEmail.postValue(result.emailError)
        _showInvalidPassword.postValue(result.passwordError)
        _showAuthErrorToast.publishEvent(result.loginError)

        if (result.success) {
            _navigateToTabsEvent.publishEvent()
        }
    }

}