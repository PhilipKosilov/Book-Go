package com.example.bookgo.presentation.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookgo.core.domain.firebase.connection.FirebaseConnection
import com.example.bookgo.core.utils.manager.ToastEvent
import com.example.bookgo.core.utils.manager.ToastManager
import com.example.bookgo.domain.usecase.CheckLoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val checkLoginUseCase: CheckLoginUseCase,
    private val firebaseConnection: FirebaseConnection,
    private val toastManager: ToastManager,
) : ViewModel() {

    private var _isLoading = MutableLiveData<Boolean>()
    var isLoading: LiveData<Boolean> = _isLoading

    private var _isLoggedIn = MutableLiveData<Boolean>()
    var isLoggedIn: LiveData<Boolean> = _isLoggedIn

    init {
        checkConnection()
    }

    private fun checkConnection() {
        viewModelScope.launch(Dispatchers.Default) {
            if (firebaseConnection.waitConnection()) {
                checkUserLoggedIn()
            } else {
                withContext(Dispatchers.Main) {
                    toastManager.sendToast(ToastEvent(com.example.bookgo.core.R.string.connection_failed))
                }
            }
        }
    }

    private fun checkUserLoggedIn() {
        viewModelScope.launch(Dispatchers.Default) {
            val isUserLoggedIn = checkLoginUseCase()
            _isLoggedIn.postValue(isUserLoggedIn)
            _isLoading.postValue(false)
        }
    }
}