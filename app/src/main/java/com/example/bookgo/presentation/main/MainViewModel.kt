package com.example.bookgo.presentation.main

import androidx.lifecycle.ViewModel
import com.example.bookgo.core.utils.manager.ToastManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val toastManager: ToastManager,
): ViewModel() {
    val toastLiveEvent = toastManager.toastLiveEvent
}