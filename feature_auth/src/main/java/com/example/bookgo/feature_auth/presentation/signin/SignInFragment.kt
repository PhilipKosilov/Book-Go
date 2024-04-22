package com.example.bookgo.feature_auth.presentation.signin

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.example.bookgo.core.data.models.entities.SignInData
import com.example.bookgo.core.data.models.errors.FormValidationError
import com.example.bookgo.feature_auth.R
import com.example.bookgo.feature_auth.databinding.FragmentSignInBinding
import com.example.bookgo.feature_auth.domain.utils.resolveErrorMessage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    private lateinit var binding: FragmentSignInBinding

    private val viewModel: SignInViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignInBinding.bind(view)

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
            state.emailError?.let {
                processInvalidEmail(it)
            }
            state.passwordError?.let {
                processInvalidPassword(it)
            }
            state.loginError?.let {
                processInvalidLogin(it)
            }
        }
    }

    private fun processInvalidEmail(error: FormValidationError) {
        binding.emailTextInput.error = resolveErrorMessage(error)
    }

    private fun processInvalidPassword(error: FormValidationError) {
        binding.passwordTextInput.error = resolveErrorMessage(error)
    }

    private fun processInvalidLogin(error: FormValidationError) {
        displayToast(resolveErrorMessage(error))
        binding.passwordEditText.text?.clear()
    }

    private fun getResultFromSignUp() {
        val savedState = findNavController().currentBackStackEntry?.savedStateHandle
        val email = savedState?.get<String>(EXTRA_EMAIL)
        val password = savedState?.get<String>(EXTRA_PASSWORD)

        binding.emailEditText.setText(email)
        binding.passwordEditText.setText(password)
    }

    private fun onSignInButtonPressed() {
        val signInData = SignInData(
            email = binding.emailEditText.text.toString(),
            password = binding.passwordEditText.text.toString(),
        )
        viewModel.signIn(signInData)
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

        val direction = SignInFragmentDirections.actionSignInFragmentToSignUpFragment(emailArg)
        findNavController().navigate(direction)
    }

    companion object {
        const val EXTRA_EMAIL = "EXTRA_EMAIL"
        const val EXTRA_PASSWORD = "EXTRA_PASSWORD"
        const val DEEPLINK_TO_MAIN = "android-app://bookgo.app/tabs"
    }
}