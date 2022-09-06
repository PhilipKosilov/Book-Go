package com.example.bookgo.di

import com.example.bookgo.presentation.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [LoginModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}