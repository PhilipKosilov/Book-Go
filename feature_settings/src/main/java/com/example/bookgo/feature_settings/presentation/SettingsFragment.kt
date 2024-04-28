package com.example.bookgo.feature_settings.presentation

import android.os.Bundle
import android.view.View
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.example.bookgo.feature_settings.R
import com.example.bookgo.feature_settings.databinding.FragmentSettingsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private lateinit var binding: FragmentSettingsBinding

    private val viewModel: SettingsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)

        setupButtonListeners()
    }

    private fun setupButtonListeners() {
        binding.logoutButton.setOnClickListener {
            viewModel.logout()
        }
    }

    //todo implement centralized navigation system. Preferably inject it in viewModel instead of
    // navigating from View.
    private fun navigateToAuthorization() {
        val request = NavDeepLinkRequest.Builder
            .fromUri(DEEPLINK_TO_LOGIN.toUri())
            .build()
        findNavController().navigate(request)
    }

    companion object {
        const val DEEPLINK_TO_LOGIN = "android-app://bookgo.app/sign_in"
    }
}