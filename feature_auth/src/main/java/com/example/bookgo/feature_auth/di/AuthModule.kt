package com.example.bookgo.feature_auth.di

import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.core.domain.repository.AccountRepository
import com.example.bookgo.feature_auth.domain.use_case.SignInUseCase
import com.example.bookgo.feature_auth.domain.use_case.SignUpUseCase
import dagger.Module
import dagger.Provides

@Module(includes = [CoreModule::class])
object AuthModule {

    @Provides
    fun provideSignInUseCase(
        accountsRepository: AccountRepository
    ): SignInUseCase {
        return SignInUseCase(accountsRepository)
    }

    @Provides
    fun provideSignUpUseCase(
        accountsRepository: AccountRepository
    ): SignUpUseCase {
        return SignUpUseCase(accountsRepository)
    }
}