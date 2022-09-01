package com.example.bookgo.feature_auth.presentation.signup

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.bookgo.core.data.models.entities.SignUpData
import com.example.bookgo.core.utils.livedata.observeEvent
import com.example.bookgo.core.utils.viewmodel.viewModelCreator
import com.example.bookgo.feature_auth.R
import com.example.bookgo.feature_auth.databinding.FragmentSignUpBinding
import com.example.bookgo.feature_auth.domain.use_case.SignUpUseCase
import com.example.bookgo.feature_auth.presentation.signin.SignInFragment


class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    private lateinit var binding: FragmentSignUpBinding
    private val viewModel by viewModelCreator { SignUpViewModel(SignUpUseCase()) }
    private val args by navArgs<SignUpFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignUpBinding.bind(view)
        binding.createAccountButton.setOnClickListener { onCreateAccountButtonPressed() }

        if (savedInstanceState == null && getEmailArgument() != null) {
            binding.emailEditText.setText(getEmailArgument())
        }

        observeInvalidUsernameEvent()
        observeInvalidEmailEvent()
        observeInvalidPasswordEvent()
        observeInvalidPasswordRepeatEvent()
        observeGoBackEvent()
        observeErrorEvent()
        observeShowSuccessSignUpMessageEvent()
    }

    private fun observeErrorEvent() = viewModel.showErrorToast.observeEvent(viewLifecycleOwner) {
        Toast.makeText(requireContext(), "Email is taken", Toast.LENGTH_LONG).show()
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

    private fun observeShowSuccessSignUpMessageEvent() =
        viewModel.showSuccessSignUpEvent.observeEvent(viewLifecycleOwner) {
            Toast.makeText(requireContext(), R.string.sign_up_success, Toast.LENGTH_LONG).show()
        }

    private fun observeGoBackEvent() = viewModel.goBackEvent.observeEvent(viewLifecycleOwner) {
        setResultForPreviousScreen(
            email = binding.emailEditText.text.toString(),
            password = binding.passwordEditText.text.toString()
        )
        findNavController().popBackStack()
    }

    private fun observeInvalidUsernameEvent() =
        viewModel.showInvalidUserName.observe(viewLifecycleOwner) {
            binding.usernameTextInput.error = it
        }

    private fun observeInvalidEmailEvent() =
        viewModel.showInvalidEmail.observe(viewLifecycleOwner) {
            binding.emailTextInput.error = it
        }

    private fun observeInvalidPasswordEvent() =
        viewModel.showInvalidPassword.observe(viewLifecycleOwner) {
            binding.passwordTextInput.error = it
        }

    private fun observeInvalidPasswordRepeatEvent() =
        viewModel.showInvalidRepeatPassword.observe(viewLifecycleOwner) {
            binding.repeatPasswordTextInput.error = it
        }

    private fun getEmailArgument(): String? = args.email

    private fun setResultForPreviousScreen(email: String, password: String) {
        val previousSavedState = findNavController().previousBackStackEntry?.savedStateHandle
        previousSavedState?.set(SignInFragment.EXTRA_EMAIL, email)
        previousSavedState?.set(SignInFragment.EXTRA_PASSWORD, password)
    }
}