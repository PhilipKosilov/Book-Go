package com.example.bookgo.presentation.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookgo.domain.usecase.CheckLoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val checkLoginUseCase: CheckLoginUseCase
) : ViewModel() {

    private var _isLoading = MutableLiveData<Boolean>()
    var isLoading: LiveData<Boolean> = _isLoading

    private var _isLoggedIn = MutableLiveData<Boolean>()
    var isLoggedIn: LiveData<Boolean> = _isLoggedIn

    init {
        viewModelScope.launch {
            delay(1000) // let animation play

            _isLoggedIn.postValue(checkLoginUseCase())
            _isLoading.postValue(false)
        }
    }
}