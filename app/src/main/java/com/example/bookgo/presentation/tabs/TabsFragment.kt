package com.example.bookgo.presentation.tabs

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.bookgo.R
import com.example.bookgo.databinding.FragmentTabsBinding

/*
Not used at the moment. Will be an entry point for tabs gragp. Will provide bottom navigation.
 */
class TabsFragment : Fragment(R.layout.fragment_tabs) {

    private lateinit var binding: FragmentTabsBinding

    private val navHostFragment: NavHostFragment by lazy {
        childFragmentManager.findFragmentById(R.id.tabs_container) as NavHostFragment
    }
    private val navController: NavController by lazy {
        navHostFragment.navController
    }

    private val destinationListener =
        NavController.OnDestinationChangedListener { _, destination, _ ->
            if (destination.id == com.example.bookgo.feature_hotels.R.id.hotelDetailsFragment) {
                binding.bottomNavigationView.visibility = View.GONE
            } else {
                binding.bottomNavigationView.visibility = View.VISIBLE
            }
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTabsBinding.bind(view)

        test()

        enableBottomNavigation()
        setupActionBar()
    }

    fun test() {
        requireActivity()
            .onBackPressedDispatcher
            .addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    Log.d("general", "Fragment back pressed invoked")

                    // if you want onBackPressed() to be called as normal afterwards
                    if (isEnabled) {
                        isEnabled = false
                        requireActivity().onBackPressed()
                    }
                }
            }
            )
    }

    private fun enableBottomNavigation() {
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)
        navController.addOnDestinationChangedListener(destinationListener)
    }

    private fun setupActionBar() {
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                com.example.bookgo.feature_hotels.R.id.hotels_fragment,
                com.example.bookgo.feature_favorites.R.id.favoritesFragment,
                com.example.bookgo.feature_settings.R.id.settingsFragment,
            )
        )
        NavigationUI.setupActionBarWithNavController(
            requireActivity() as AppCompatActivity,
            navController,
            appBarConfiguration
        )
    }
}