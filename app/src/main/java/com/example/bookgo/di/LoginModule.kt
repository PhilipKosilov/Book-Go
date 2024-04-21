package com.example.bookgo.di

import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.core.domain.repository.AccountRepository
import com.example.bookgo.domain.use_case.CheckLoginUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [CoreModule::class])
@InstallIn(SingletonComponent::class)
object LoginModule {
    @Provides
    fun provideLoginUseCase(
        accountsRepository: AccountRepository
    ): CheckLoginUseCase {
        return CheckLoginUseCase(accountsRepository)
    }
}