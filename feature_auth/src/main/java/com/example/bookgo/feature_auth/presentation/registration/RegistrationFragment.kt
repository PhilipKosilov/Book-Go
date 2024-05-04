package com.example.bookgo.feature_auth.presentation.registration

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.bookgo.core.data.models.entities.RegistrationData
import com.example.bookgo.feature_auth.R
import com.example.bookgo.feature_auth.databinding.FragmentRegistrationBinding
import com.example.bookgo.feature_auth.presentation.login.LoginFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegistrationFragment : Fragment(R.layout.fragment_registration) {

    private lateinit var binding: FragmentRegistrationBinding
    private val args by navArgs<RegistrationFragmentArgs>()

    private val viewModel: RegistrationViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRegistrationBinding.bind(view)
        binding.createAccountButton.setOnClickListener { onRegisterButtonPressed() }

        if (savedInstanceState == null && getEmailArgument() != null) {
            binding.emailEditText.setText(getEmailArgument())
        }

        observeViewModelState()
    }

    private fun observeViewModelState() {
        viewModel.state.observe(viewLifecycleOwner) { state ->
            if (state.success) {
                returnToLogin()
            }

            processUsernameError(state.usernameErrorMessageId)
            processEmailError(state.emailErrorMessageId)
            processPasswordError(state.passwordErrorMessageId)
            processConfirmPasswordError(state.confirmPasswordErrorMessageId)
        }
    }

    private fun processUsernameError(errorMessageId: Int?) {
        binding.usernameTextInput.error = errorMessageId?.let { getString(it) }
    }

    private fun processEmailError(errorMessageId: Int?) {
        binding.emailTextInput.error = errorMessageId?.let { getString(it) }
    }

    private fun processPasswordError(errorMessageId: Int?) {
        binding.passwordTextInput.error = errorMessageId?.let { getString(it) }
    }

    private fun processConfirmPasswordError(errorMessageId: Int?) {
        binding.repeatPasswordTextInput.error = errorMessageId?.let { getString(it) }
    }

    private fun onRegisterButtonPressed() {
        val signUpData = RegistrationData(
            email = binding.emailEditText.text.toString(),
            username = binding.usernameEditText.text.toString(),
            password = binding.passwordEditText.text.toString(),
            confirmPassword = binding.repeatPasswordEditText.text.toString(),
        )
        viewModel.register(signUpData)
    }

    private fun returnToLogin() {
        setResultForPreviousScreen(
            email = binding.emailEditText.text.toString(),
            password = binding.passwordEditText.text.toString(),
        )
        findNavController().popBackStack()
    }

    private fun getEmailArgument(): String? = args.email

    private fun setResultForPreviousScreen(email: String, password: String) {
        val previousSavedState = findNavController().previousBackStackEntry?.savedStateHandle
        previousSavedState?.set(LoginFragment.EXTRA_EMAIL, email)
        previousSavedState?.set(LoginFragment.EXTRA_PASSWORD, password)
    }
}