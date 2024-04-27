package com.example.bookgo.domain.usecase

import com.example.bookgo.core.domain.repository.AccountRepository
import javax.inject.Inject

class CheckLoginUseCaseImpl @Inject constructor(
    private val accountsRepository: AccountRepository
) : CheckLoginUseCase {
    override suspend operator fun invoke(): Boolean {
        return accountsRepository.isSignedIn()
    }
}