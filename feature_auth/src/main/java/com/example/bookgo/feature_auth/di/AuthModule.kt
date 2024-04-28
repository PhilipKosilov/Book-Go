package com.example.bookgo.feature_auth.di

import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.core.di.FirebaseModule
import com.example.bookgo.feature_auth.domain.usecase.LoginUseCase
import com.example.bookgo.feature_auth.domain.usecase.LoginUseCaseImpl
import com.example.bookgo.feature_auth.domain.usecase.RegistrationUseCase
import com.example.bookgo.feature_auth.domain.usecase.RegistrationUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [CoreModule::class, FirebaseModule::class])
@InstallIn(SingletonComponent::class)
abstract class AuthModule {
    @Binds
    abstract fun bindLoginUseCase(loginUseCaseImpl: LoginUseCaseImpl): LoginUseCase

    @Binds
    abstract fun bindRegistrationUseCase(registrationUseCaseImpl: RegistrationUseCaseImpl): RegistrationUseCase
}