package com.example.bookgo.feature_settings.presentation

import androidx.lifecycle.ViewModel
import com.example.bookgo.feature_settings.domain.usecase.LogoutUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val logoutUseCase: LogoutUseCase,
) : ViewModel() {
    fun logout() {
        logoutUseCase()
    }
}