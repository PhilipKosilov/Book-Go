package com.example.bookgo.feature_auth.di

import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.core.di.FirebaseModule
import com.example.bookgo.feature_auth.domain.usecase.LoginUseCase
import com.example.bookgo.feature_auth.domain.usecase.LoginUseCaseImpl
import com.example.bookgo.feature_auth.domain.usecase.SignUpUseCase
import com.example.bookgo.feature_auth.domain.usecase.SignUpUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [CoreModule::class, FirebaseModule::class])
@InstallIn(SingletonComponent::class)
abstract class AuthModule {
    @Binds
    abstract fun bindSignInUseCase(signInUseCase: LoginUseCaseImpl): LoginUseCase

    @Binds
    abstract fun bindSignUpUseCase(signUpUseCase: SignUpUseCaseImpl): SignUpUseCase
}