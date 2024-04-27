package com.example.bookgo.feature_auth.di

import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.feature_auth.domain.usecase.SignInUseCase
import com.example.bookgo.feature_auth.domain.usecase.SignInUseCaseImpl
import com.example.bookgo.feature_auth.domain.usecase.SignUpUseCase
import com.example.bookgo.feature_auth.domain.usecase.SignUpUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [CoreModule::class])
@InstallIn(SingletonComponent::class)
abstract class AuthModule {
    @Binds
    abstract fun bindSignInUseCase(signInUseCase: SignInUseCaseImpl): SignInUseCase

    @Binds
    abstract fun bindSignUpUseCase(signUpUseCase: SignUpUseCaseImpl): SignUpUseCase
}