package com.example.bookgo.core.utils.manager

import com.example.bookgo.core.utils.livedata.MutableLiveEvent
import com.example.bookgo.core.utils.livedata.publishEvent
import com.example.bookgo.core.utils.livedata.toLiveEvent
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ToastManager presents centralized architecture of toast messages.
 *
 * Inject ToastManager to MainActivity's viewModel and observe [toastLiveEvent] changes.
 * Inject ToastManager to other viewModels to send toast via [ToastEvent].
 */
@Singleton
class ToastManager @Inject constructor() {
    private val _toastLiveEvent = MutableLiveEvent<ToastEvent?>()
    val toastLiveEvent = _toastLiveEvent.toLiveEvent()

    fun sendToast(event: ToastEvent) {
        _toastLiveEvent.publishEvent(event)
    }
}