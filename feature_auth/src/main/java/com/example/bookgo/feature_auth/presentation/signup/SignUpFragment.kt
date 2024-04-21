package com.example.bookgo.feature_auth.presentation.signup

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.bookgo.core.data.models.entities.SignUpData
import com.example.bookgo.core.data.models.errors.FormValidationError
import com.example.bookgo.core.utils.livedata.observeEvent
import com.example.bookgo.core.utils.viewmodel.viewModelCreator
import com.example.bookgo.feature_auth.R
import com.example.bookgo.feature_auth.databinding.FragmentSignUpBinding
import com.example.bookgo.feature_auth.domain.use_case.SignUpUseCase
import com.example.bookgo.feature_auth.domain.utils.resolveErrorMessage
import com.example.bookgo.feature_auth.presentation.signin.SignInFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    private lateinit var binding: FragmentSignUpBinding
    private val args by navArgs<SignUpFragmentArgs>()

    @Inject
    lateinit var signUpUseCase: SignUpUseCase
    private val viewModel by viewModelCreator { SignUpViewModel(signUpUseCase) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignUpBinding.bind(view)
        binding.createAccountButton.setOnClickListener { onCreateAccountButtonPressed() }

        if (savedInstanceState == null && getEmailArgument() != null) {
            binding.emailEditText.setText(getEmailArgument())
        }

        observeViewModelState()
        observeToastEvent()
    }

    private fun observeViewModelState() {
        viewModel.state.observe(viewLifecycleOwner) { state ->
            if (state.success) {
                returnToSignIn()
            }
            state.usernameError?.let {
                processUsernameError(it)
            }
            state.emailError?.let {
                processEmailError(it)
            }
            state.passwordError?.let {
                processPasswordError(it)
            }
            state.passwordRepeatError?.let {
                processPasswordRepeatError(it)
            }
        }
    }

    private fun processUsernameError(error: FormValidationError) {
        binding.usernameTextInput.error = resolveErrorMessage(error)
    }

    private fun processEmailError(error: FormValidationError) {
        binding.emailTextInput.error = resolveErrorMessage(error)
    }

    private fun processPasswordError(error: FormValidationError) {
        binding.passwordTextInput.error = resolveErrorMessage(error)
    }

    private fun processPasswordRepeatError(error: FormValidationError) {
        binding.repeatPasswordTextInput.error = resolveErrorMessage(error)
    }

    private fun observeToastEvent() {
        viewModel.showErrorToast.observeEvent(viewLifecycleOwner) { error ->
            displayToast(resolveErrorMessage(error))
        }
    }

    private fun displayToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    private fun onCreateAccountButtonPressed() {
        val signUpData = SignUpData(
            email = binding.emailEditText.text.toString(),
            username = binding.usernameEditText.text.toString(),
            password = binding.passwordEditText.text.toString(),
            passwordRepeat = binding.repeatPasswordEditText.text.toString(),
        )
        viewModel.signUp(signUpData)
    }

    private fun returnToSignIn() {
        setResultForPreviousScreen(
            email = binding.emailEditText.text.toString(),
            password = binding.passwordEditText.text.toString()
        )
        findNavController().popBackStack()
    }

    private fun getEmailArgument(): String? = args.email

    private fun setResultForPreviousScreen(email: String, password: String) {
        val previousSavedState = findNavController().previousBackStackEntry?.savedStateHandle
        previousSavedState?.set(SignInFragment.EXTRA_EMAIL, email)
        previousSavedState?.set(SignInFragment.EXTRA_PASSWORD, password)
    }
}