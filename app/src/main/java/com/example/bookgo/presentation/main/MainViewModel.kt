package com.example.bookgo.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookgo.core.utils.livedata.MutableUnitLiveEvent
import com.example.bookgo.core.utils.livedata.publishEvent
import com.example.bookgo.core.utils.livedata.toLiveEvent
import com.example.bookgo.domain.use_case.CheckLoginUseCase
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel(
    private val checkLogin: CheckLoginUseCase
) : ViewModel() {

    private var _isLoading = MutableLiveData<Boolean>()
    var isLoading: LiveData<Boolean> = _isLoading

    private val _launchMainScreenEvent = MutableUnitLiveEvent()
    val launchMainScreenEvent = _launchMainScreenEvent.toLiveEvent()

    private val _launchAuthorizationEvent = MutableUnitLiveEvent()
    val launchAuthorizationEvent = _launchAuthorizationEvent.toLiveEvent()

    init {
        viewModelScope.launch {
            delay(1000) // let animation play
            val isSigned = checkLogin.execute()

            if (isSigned) {
                _launchMainScreenEvent.publishEvent()
            } else {
                _launchAuthorizationEvent.publishEvent()
            }

            _isLoading.postValue(false)
        }
    }
}