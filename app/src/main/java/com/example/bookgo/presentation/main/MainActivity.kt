package com.example.bookgo.presentation.main

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.bookgo.R
import com.example.bookgo.app.MyApplication
import com.example.bookgo.databinding.ActivityMainBinding
import com.example.bookgo.presentation.tabs.TabsFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val navHostFragment: NavHostFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.nav_container) as NavHostFragment
    }

    // todo: Temporary solution.
    // I need to change navController from one in nav_container to
    // one in tabs_container to process navigateUp properly.
    private var _navController: NavController? = null
    private var navController: NavController
        private set(x) {
            _navController = x
        }
        get() = _navController ?: navHostFragment.navController.also {
            _navController = it
        }

    private val fragmentListener = object : FragmentManager.FragmentLifecycleCallbacks() {
        override fun onFragmentViewCreated(
            fm: FragmentManager,
            f: Fragment,
            v: View,
            savedInstanceState: Bundle?
        ) {
            super.onFragmentViewCreated(fm, f, v, savedInstanceState)
            if (f is TabsFragment || f is NavHostFragment) return
            onNavControllerActivated(f.findNavController())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies()
        super.onCreate(savedInstanceState)

        // Has to come AFTER setupSplash to inflate BottomNavigationView
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.registerFragmentLifecycleCallbacks(fragmentListener, true)
        setupActionBar()
    }

    private fun setupActionBar() {
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                com.example.bookgo.feature_auth.R.id.sign_in_fragment,
            )
        )
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
    }

    override fun onDestroy() {
        super.onDestroy()
        supportFragmentManager.unregisterFragmentLifecycleCallbacks(fragmentListener)
        _navController = null
    }

    private fun onNavControllerActivated(navController: NavController) {
        if (this.navController == navController) return
        this.navController = navController
    }

    // inject dependencies before super.onCreate
    private fun injectDependencies() {
        (applicationContext as MyApplication).appComponent.inject(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}