package com.example.bookgo.core.di

import com.example.bookgo.core.domain.validation.usecase.email.ValidateEmailUseCase
import com.example.bookgo.core.domain.validation.usecase.email.ValidateEmailUseCaseImpl
import com.example.bookgo.core.domain.validation.usecase.name.ValidateNameUseCase
import com.example.bookgo.core.domain.validation.usecase.name.ValidateNameUseCaseImpl
import com.example.bookgo.core.domain.validation.usecase.password.ValidateConfirmPasswordUseCase
import com.example.bookgo.core.domain.validation.usecase.password.ValidateConfirmPasswordUseCaseImpl
import com.example.bookgo.core.domain.validation.usecase.password.ValidatePasswordUseCase
import com.example.bookgo.core.domain.validation.usecase.password.ValidatePasswordUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ValidationModule {
    @Singleton
    @Binds
    abstract fun bindValidateNameUseCase(
        validateNameUseCaseImpl: ValidateNameUseCaseImpl
    ): ValidateNameUseCase

    @Singleton
    @Binds
    abstract fun bindValidateEmailUseCase(
        validateEmailUseCaseImpl: ValidateEmailUseCaseImpl
    ): ValidateEmailUseCase

    @Singleton
    @Binds
    abstract fun bindValidatePasswordUseCase(
        validatePasswordUseCaseImpl: ValidatePasswordUseCaseImpl
    ): ValidatePasswordUseCase

    @Singleton
    @Binds
    abstract fun bindValidateConfirmPasswordUseCase(
        validateConfirmPasswordUseCaseImpl: ValidateConfirmPasswordUseCaseImpl
    ): ValidateConfirmPasswordUseCase
}