package com.example.bookgo.feature_hotels.di

import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.core.domain.repository.HotelsRepository
import com.example.bookgo.feature_hotels.domain.use_case.GetHotelsUseCase
import dagger.Module
import dagger.Provides

@Module(includes = [CoreModule::class])
object HotelsModule {
    @Provides
    fun provideGetHotelsUseCase(
        HotelsRepository: HotelsRepository
    ): GetHotelsUseCase {
        return GetHotelsUseCase(HotelsRepository)
    }
}