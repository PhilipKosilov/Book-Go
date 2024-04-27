package com.example.bookgo.domain.usecase

interface CheckLoginUseCase {
    suspend operator fun invoke(): Boolean
}