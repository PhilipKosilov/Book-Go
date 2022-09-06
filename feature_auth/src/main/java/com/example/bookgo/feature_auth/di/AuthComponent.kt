package com.example.bookgo.feature_auth.di

import com.example.bookgo.feature_auth.presentation.signin.SignInFragment
import com.example.bookgo.feature_auth.presentation.signup.SignUpFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AuthModule::class])
interface AuthComponent {
    fun inject(signInFragment: SignInFragment)
    fun inject(signUpFragment: SignUpFragment)
}
