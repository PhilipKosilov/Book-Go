package com.example.bookgo.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.bookgo.R
import com.example.bookgo.core.utils.livedata.observeEvent
import com.example.bookgo.core.utils.viewmodel.viewModelCreator
import com.example.bookgo.domain.use_case.CheckLoginUseCase

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModelCreator { MainViewModel(CheckLoginUseCase()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupSplash()
        setupViewModelObservers()

        setContentView(R.layout.activity_main)
    }

    private fun setupViewModelObservers() {
        viewModel.launchMainScreenEvent.observeEvent(this) {
            //todo make transitions
        }
        viewModel.launchAuthorizationEvent.observeEvent(this) {

        }
    }

    private fun setupSplash() {
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                true
            }
        }
    }
}