package com.example.bookgo.domain.use_case

import android.util.Log
import com.example.bookgo.core.data.repository.AccountRepositoryImpl
import com.example.bookgo.core.domain.repository.AccountRepository

class CheckLoginUseCase(
    private val accountsRepository: AccountRepository = AccountRepositoryImpl()
) {
    suspend fun execute(): Boolean {
        return accountsRepository.isSignedIn()
    }
}