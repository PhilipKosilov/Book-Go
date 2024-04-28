package com.example.bookgo.feature_settings.di

import com.example.bookgo.feature_settings.domain.usecase.LogoutUseCase
import com.example.bookgo.feature_settings.domain.usecase.LogoutUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class SettingsModule {
    @Singleton
    @Binds
    abstract fun bindLogoutUseCase(
        logoutUseCaseImpl: LogoutUseCaseImpl
    ): LogoutUseCase

}