package com.example.bookgo.feature_auth.presentation.login

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.example.bookgo.core.data.models.entities.LoginData
import com.example.bookgo.feature_auth.R
import com.example.bookgo.feature_auth.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding

    private val viewModel: LoginViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)

        observeViewModelState()
        setupButtonListeners()
    }

    override fun onResume() {
        super.onResume()
        getResultFromSignUp()
    }

    private fun setupButtonListeners() {
        binding.signInButton.setOnClickListener { onSignInButtonPressed() }
        binding.signUpButton.setOnClickListener { onSignUpButtonPressed() }
    }

    private fun observeViewModelState() {
        viewModel.state.observe(viewLifecycleOwner) { state ->
            if (state.success) {
                navigateToTabs()
            }

            processInvalidEmail(state.emailErrorMessageId)
            processInvalidPassword(state.passwordErrorMessageId)
            processInvalidLogin(state.loginErrorMessageId)
        }
    }

    private fun processInvalidEmail(errorMessageId: Int?) { //todo provide way to remove errors
        binding.emailTextInput.error = errorMessageId?.let { getString(it) }
    }

    private fun processInvalidPassword(errorMessageId: Int?) {
        binding.passwordTextInput.error = errorMessageId?.let { getString(it) }
    }

    private fun processInvalidLogin(errorMessageId: Int?) {
        errorMessageId?.let {
            displayToast(getString(errorMessageId))
            binding.passwordEditText.text?.clear()
        }
    }

    private fun getResultFromSignUp() {
        val savedState = findNavController().currentBackStackEntry?.savedStateHandle
        val email = savedState?.get<String>(EXTRA_EMAIL)
        val password = savedState?.get<String>(EXTRA_PASSWORD)

        binding.emailEditText.setText(email)
        binding.passwordEditText.setText(password)
    }

    private fun onSignInButtonPressed() {
        viewModel.login(
            data = LoginData(
                email = binding.emailEditText.text.toString(),
                password = binding.passwordEditText.text.toString(),
            )
        )
    }

    private fun displayToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    private fun navigateToTabs() {
        val request = NavDeepLinkRequest.Builder
            .fromUri(DEEPLINK_TO_MAIN.toUri())
            .build()
        findNavController().navigate(request)
    }

    private fun onSignUpButtonPressed() {
        val email = binding.emailEditText.text.toString()
        val emailArg = email.ifBlank { null }

        val direction = LoginFragmentDirections.actionSignInFragmentToSignUpFragment(emailArg)
        findNavController().navigate(direction)
    }

    companion object {
        const val EXTRA_EMAIL = "EXTRA_EMAIL"
        const val EXTRA_PASSWORD = "EXTRA_PASSWORD"
        const val DEEPLINK_TO_MAIN = "android-app://bookgo.app/tabs"
    }
}