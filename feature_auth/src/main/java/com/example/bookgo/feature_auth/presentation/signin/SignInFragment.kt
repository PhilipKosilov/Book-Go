package com.example.bookgo.feature_auth.presentation.signin

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.example.bookgo.core.data.models.entities.SignInData
import com.example.bookgo.core.utils.livedata.observeEvent
import com.example.bookgo.core.utils.viewmodel.viewModelCreator
import com.example.bookgo.feature_auth.R
import com.example.bookgo.feature_auth.databinding.FragmentSignInBinding
import com.example.bookgo.feature_auth.di.AuthComponentProvider
import com.example.bookgo.feature_auth.domain.use_case.SignInUseCase
import com.example.bookgo.feature_auth.domain.utils.ErrorCode
import com.example.bookgo.feature_auth.domain.utils.resolveErrorMessage
import javax.inject.Inject


class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    private lateinit var binding: FragmentSignInBinding

    @Inject
    lateinit var signInUseCase: SignInUseCase
    private val viewModel by viewModelCreator { SignInViewModel(signInUseCase) }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        injectDependencies()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSignInBinding.bind(view)

        setupViewModelObservers()
        setupButtonListeners()
    }

    private fun setupButtonListeners() {
        binding.signInButton.setOnClickListener { onSignInButtonPressed() }
        binding.signUpButton.setOnClickListener { onSignUpButtonPressed() }
    }

    private fun setupViewModelObservers() {
        observeInvalidEmailEvent()
        observeInvalidPasswordEvent()
        observeAuthToastEvent()
        observeNavigateToTabsEvent()
    }

    override fun onResume() {
        super.onResume()
        getResultFromSignUp()
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

    private fun observeInvalidEmailEvent() =
        viewModel.showInvalidEmail.observe(viewLifecycleOwner) {
            binding.emailTextInput.error = resolveErrorMessage(it)
        }

    private fun observeInvalidPasswordEvent() =
        viewModel.showInvalidPassword.observe(viewLifecycleOwner) {
            binding.passwordTextInput.error = resolveErrorMessage(it)
        }

    private fun observeAuthToastEvent() = viewModel.showAuthToast.observeEvent(viewLifecycleOwner) {
        Toast.makeText(requireContext(), R.string.invalid_email_or_password, Toast.LENGTH_SHORT)
            .show()
        binding.passwordEditText.text?.clear()
    }

    private fun observeNavigateToTabsEvent() =
        viewModel.navigateToTabsEvent.observeEvent(viewLifecycleOwner) {
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

    private fun injectDependencies() {
        (requireActivity().application as AuthComponentProvider)
            .provideAuthComponent().inject(this)
    }

    companion object {
        const val EXTRA_EMAIL = "EXTRA_EMAIL"
        const val EXTRA_PASSWORD = "EXTRA_PASSWORD"
        const val DEEPLINK_TO_MAIN = "android-app://bookgo.app/tabs"
    }
}