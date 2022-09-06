package com.example.bookgo.app

import android.app.Application
import com.example.bookgo.core.di.CoreModule
import com.example.bookgo.di.AppComponent
import com.example.bookgo.di.DaggerAppComponent
import com.example.bookgo.feature_auth.di.AuthComponent
import com.example.bookgo.feature_auth.di.AuthComponentProvider
import com.example.bookgo.feature_auth.di.DaggerAuthComponent
import com.example.bookgo.feature_hotels.di.DaggerHotelsComponent
import com.example.bookgo.feature_hotels.di.HotelsComponent
import com.example.bookgo.feature_hotels.di.HotelsComponentProvider


class MyApplication : Application(), AuthComponentProvider, HotelsComponentProvider {
    lateinit var appComponent: AppComponent

    private val coreModule: CoreModule by lazy {
        CoreModule(this)
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .coreModule(coreModule)
            .build()
    }

    override fun provideAuthComponent(): AuthComponent {
        return DaggerAuthComponent.builder()
            .coreModule(coreModule)
            .build()
    }

    override fun provideHotelsComponent(): HotelsComponent {
        return DaggerHotelsComponent.builder()
            .coreModule(coreModule)
            .build()
    }
}