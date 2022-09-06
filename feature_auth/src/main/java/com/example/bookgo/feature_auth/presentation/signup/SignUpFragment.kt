package com.example.bookgo.feature_auth.presentation.signup

import android.content.Context
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
import com.example.bookgo.feature_auth.di.AuthComponentProvider
import com.example.bookgo.feature_auth.domain.use_case.SignUpUseCase
import com.example.bookgo.feature_auth.domain.utils.resolveErrorMessage
import com.example.bookgo.feature_auth.presentation.signin.SignInFragment
import javax.inject.Inject


class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    private lateinit var binding: FragmentSignUpBinding
    private val args by navArgs<SignUpFragmentArgs>()

    @Inject
    lateinit var signUpUseCase: SignUpUseCase
    private val viewModel by viewModelCreator { SignUpViewModel(signUpUseCase) }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        injectDependencies()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignUpBinding.bind(view)
        binding.createAccountButton.setOnClickListener { onCreateAccountButtonPressed() }

        if (savedInstanceState == null && getEmailArgument() != null) {
            binding.emailEditText.setText(getEmailArgument())
        }

        setupViewModelObservers()
    }

    private fun setupViewModelObservers() {
        observeInvalidUsernameEvent()
        observeInvalidEmailEvent()
        observeInvalidPasswordEvent()
        observeInvalidPasswordRepeatEvent()
        observeGoBackEvent()
        observeErrorEvent()
    }

    private fun observeErrorEvent() = viewModel.showErrorToast.observeEvent(viewLifecycleOwner) {
        Toast.makeText(requireContext(), resolveErrorMessage(it), Toast.LENGTH_LONG).show()
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

    private fun observeGoBackEvent() = viewModel.goBackEvent.observeEvent(viewLifecycleOwner) {
        setResultForPreviousScreen(
            email = binding.emailEditText.text.toString(),
            password = binding.passwordEditText.text.toString()
        )
        findNavController().popBackStack()
    }

    private fun observeInvalidUsernameEvent() =
        viewModel.showInvalidUserName.observe(viewLifecycleOwner) {
            binding.usernameTextInput.error = resolveErrorMessage(it)
        }

    private fun observeInvalidEmailEvent() =
        viewModel.showInvalidEmail.observe(viewLifecycleOwner) {
            binding.emailTextInput.error = resolveErrorMessage(it)
        }

    private fun observeInvalidPasswordEvent() =
        viewModel.showInvalidPassword.observe(viewLifecycleOwner) {
            binding.passwordTextInput.error = resolveErrorMessage(it)
        }

    private fun observeInvalidPasswordRepeatEvent() =
        viewModel.showInvalidRepeatPassword.observe(viewLifecycleOwner) {
            binding.repeatPasswordTextInput.error = resolveErrorMessage(it)
        }

    private fun getEmailArgument(): String? = args.email

    private fun setResultForPreviousScreen(email: String, password: String) {
        val previousSavedState = findNavController().previousBackStackEntry?.savedStateHandle
        previousSavedState?.set(SignInFragment.EXTRA_EMAIL, email)
        previousSavedState?.set(SignInFragment.EXTRA_PASSWORD, password)
    }

    private fun injectDependencies() {
        (requireActivity().application as AuthComponentProvider)
            .provideAuthComponent().inject(this)
    }
}