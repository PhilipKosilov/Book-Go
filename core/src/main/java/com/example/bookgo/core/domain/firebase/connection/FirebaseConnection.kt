package com.example.bookgo.core.domain.firebase.connection

interface FirebaseConnection {
    fun getConnection(): Boolean
    suspend fun waitConnection(): Boolean
}