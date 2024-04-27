package com.example.bookgo.feature_hotels.di

import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.feature_hotels.domain.usecase.GetHotelsUseCase
import com.example.bookgo.feature_hotels.domain.usecase.GetHotelsUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [CoreModule::class])
@InstallIn(SingletonComponent::class)
abstract class HotelsModule {
    @Binds
    abstract fun bindGetHotelsUseCase(getHotelsUseCase: GetHotelsUseCaseImpl): GetHotelsUseCase
}