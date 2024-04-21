package com.example.bookgo.domain.use_case

import com.example.bookgo.core.domain.repository.AccountRepository
import javax.inject.Inject

class CheckLoginUseCase @Inject constructor(
    private val accountsRepository: AccountRepository
) {
    suspend fun execute(): Boolean {
        return accountsRepository.isSignedIn()
    }
}