package com.example.bookgo.feature_hotels.domain.usecase

import com.example.bookgo.core.domain.models.Hotel

interface GetHotelsUseCase {
    suspend operator fun invoke(): List<Hotel>
}