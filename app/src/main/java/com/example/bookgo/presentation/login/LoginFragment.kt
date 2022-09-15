package com.example.bookgo.presentation.login

import android.content.Context
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bookgo.app.MyApplication
import com.example.bookgo.core.utils.livedata.requireValue
import com.example.bookgo.core.utils.viewmodel.viewModelCreator
import com.example.bookgo.domain.use_case.CheckLoginUseCase
import javax.inject.Inject

class LoginFragment : Fragment() {

    @Inject
    lateinit var checkLoginUseCase: CheckLoginUseCase
    private val viewModel by viewModelCreator { LoginViewModel(checkLoginUseCase) }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        injectDependencies()
    }

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

    private fun injectDependencies() {
        (requireActivity().application as MyApplication).appComponent.inject(this)
    }
}