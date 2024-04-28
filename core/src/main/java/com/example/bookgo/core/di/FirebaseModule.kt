package com.example.bookgo.core.di

import com.example.bookgo.core.domain.firebase.auth.FirebaseAuth
import com.example.bookgo.core.domain.firebase.auth.FirebaseAuthApi
import com.example.bookgo.core.domain.firebase.connection.FirebaseConnection
import com.example.bookgo.core.domain.firebase.connection.FirebaseConnectionImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class FirebaseModule {
    @Binds
    abstract fun bindFirebaseAuth(firebaseAuth: FirebaseAuth): FirebaseAuthApi

    @Binds
    abstract fun bindFirebaseConnection(firebaseConnectionImpl: FirebaseConnectionImpl): FirebaseConnection
}