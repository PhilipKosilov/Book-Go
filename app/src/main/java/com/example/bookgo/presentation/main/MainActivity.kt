package com.example.bookgo.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.bookgo.R
import com.example.bookgo.core.utils.livedata.observeEvent
import com.example.bookgo.core.utils.viewmodel.viewModelCreator
import com.example.bookgo.domain.use_case.CheckLoginUseCase

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModelCreator { MainViewModel(CheckLoginUseCase()) }
    private val navHostFragment: NavHostFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.nav_container) as NavHostFragment
    }
    private val navController: NavController by lazy {
        navHostFragment.navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupSplash()
        setupViewModelObservers()

        setContentView(R.layout.activity_main)
    }

    private fun setupViewModelObservers() {
        viewModel.launchMainScreenEvent.observeEvent(this) {
            launchMainScreen()
        }
        viewModel.launchAuthorizationEvent.observeEvent(this) {
            launchAuthorization()
        }
    }

    private fun launchMainScreen() {
        navHostFragment.findNavController()
            .setGraph(com.example.bookgo.feature_hotels.R.navigation.hotels_graph)
        setupActionBar() //only after setting graph
    }

    private fun launchAuthorization() {
        navHostFragment.findNavController()
            .setGraph(com.example.bookgo.feature_auth.R.navigation.auth_graph)
        setupActionBar() //only after setting graph
    }

    private fun setupSplash() {
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                viewModel.isLoading.value ?: true
            }
        }
    }

    private fun setupActionBar() {
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}