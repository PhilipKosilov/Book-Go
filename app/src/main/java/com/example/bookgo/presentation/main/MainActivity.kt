package com.example.bookgo.presentation.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.bookgo.R
import com.example.bookgo.app.MyApplication
import com.example.bookgo.core.utils.livedata.observeEvent
import com.example.bookgo.core.utils.viewmodel.viewModelCreator
import com.example.bookgo.databinding.ActivityMainBinding
import com.example.bookgo.domain.use_case.CheckLoginUseCase
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var checkLoginUseCase: CheckLoginUseCase
    private val viewModel by viewModelCreator { MainViewModel(checkLoginUseCase) }

    private val navHostFragment: NavHostFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.nav_container) as NavHostFragment
    }
    private val navController: NavController by lazy {
        navHostFragment.navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies()
        super.onCreate(savedInstanceState)

        setupSplash()
        setupViewModelObservers()

        // Has to be AFTER setupSplash to inflate BottomNavigationView
        // with Theme.App.Starting, that is not based on Theme.AppCompat. Otherwise crashes.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }



    private fun setupViewModelObservers() {
        viewModel.launchMainScreenEvent.observeEvent(this) {
            launchMainScreen()
        }
        viewModel.launchAuthorizationEvent.observeEvent(this) {
            launchAuthorization()
        }
    }

    private fun launchMainScreen() {
        // works with bottom navigation
        navHostFragment.findNavController()
            .setGraph(R.navigation.tabs_graph)

        setupActionBar() //only after setting graph
        enableBottomNavigation()
    }

    private fun enableBottomNavigation() {
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)
        binding.bottomNavigationView.visibility = View.VISIBLE
    }

    private fun launchAuthorization() {
        navHostFragment.findNavController()
            .setGraph(com.example.bookgo.feature_auth.R.navigation.auth_graph)
        setupActionBar() //only after setting graph
    }

    private fun setupSplash() {
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                viewModel.isLoading.value ?: true
            }
        }
    }

    private fun setupActionBar() {
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    // inject dependencies before super.onCreate
    private fun injectDependencies() {
        (applicationContext as MyApplication).appComponent.inject(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}