package com.example.bookgo.feature_hotels.di

import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.core.domain.repository.HotelsRepository
import com.example.bookgo.feature_hotels.domain.use_case.GetHotelsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [CoreModule::class])
@InstallIn(SingletonComponent::class)
object HotelsModule {
    @Provides
    fun provideGetHotelsUseCase(
        hotelsRepository: HotelsRepository
    ): GetHotelsUseCase {
        return GetHotelsUseCase(hotelsRepository)
    }
}