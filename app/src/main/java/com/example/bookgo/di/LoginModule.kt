package com.example.bookgo.di

import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.domain.usecase.CheckLoginUseCase
import com.example.bookgo.domain.usecase.CheckLoginUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [CoreModule::class])
@InstallIn(SingletonComponent::class)
abstract class LoginModule {
    @Binds
    abstract fun bindCheckLoginUseCase(checkLoginUseCaseImpl: CheckLoginUseCaseImpl): CheckLoginUseCase
}