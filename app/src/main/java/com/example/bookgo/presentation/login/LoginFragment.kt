package com.example.bookgo.presentation.login

import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.bookgo.core.utils.livedata.requireValue
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupSplash()
        setupViewModelObservers()
    }

    private fun setupSplash() {
        requireActivity().installSplashScreen().apply {
            setKeepOnScreenCondition {
                viewModel.isLoading.value ?: true
            }
        }
    }

    private fun setupViewModelObservers() {
        viewModel.isLoggedIn.observe(this) {
            if (viewModel.isLoggedIn.requireValue()) {
                launchMainScreen()
            } else {
                launchAuthorization()
            }
        }
    }

    private fun launchMainScreen() {
        val direction = LoginFragmentDirections.actionLoginFragmentToTabsFragment()
        findNavController().navigate(direction)
    }

    private fun launchAuthorization() {
        val direction = LoginFragmentDirections.actionLoginFragmentToAuthGraph()
        findNavController().navigate(direction)
    }
}