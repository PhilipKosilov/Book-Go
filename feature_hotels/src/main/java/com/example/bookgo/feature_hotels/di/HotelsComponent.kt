package com.example.bookgo.feature_hotels.di

import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.feature_hotels.presentation.hotels.HotelsFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [HotelsModule::class, CoreModule::class])
interface HotelsComponent {
    fun inject(hotelsFragment: HotelsFragment)
}