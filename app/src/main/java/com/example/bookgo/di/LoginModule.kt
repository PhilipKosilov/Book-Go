package com.example.bookgo.di

import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.core.domain.repository.AccountRepository
import com.example.bookgo.domain.use_case.CheckLoginUseCase
import dagger.Module
import dagger.Provides

@Module(includes = [CoreModule::class])
object LoginModule {
    @Provides
    fun provideLoginUseCase(
        accountsRepository: AccountRepository
    ): CheckLoginUseCase {
        return CheckLoginUseCase(accountsRepository)
    }
}
