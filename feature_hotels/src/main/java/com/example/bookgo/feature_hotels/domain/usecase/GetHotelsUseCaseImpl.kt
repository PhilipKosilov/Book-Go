package com.example.bookgo.feature_hotels.domain.usecase

import com.example.bookgo.core.domain.models.Hotel
import com.example.bookgo.core.domain.repository.HotelsRepository
import javax.inject.Inject


class GetHotelsUseCaseImpl @Inject constructor(
    private val repository: HotelsRepository
) : GetHotelsUseCase {
    override suspend operator fun invoke(): List<Hotel> {
        return repository.getHotels()
    }
}