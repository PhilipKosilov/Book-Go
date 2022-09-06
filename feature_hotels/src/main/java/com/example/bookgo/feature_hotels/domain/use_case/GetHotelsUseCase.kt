package com.example.bookgo.feature_hotels.domain.use_case

import com.example.bookgo.core.domain.models.Hotel
import com.example.bookgo.core.domain.repository.HotelsRepository
import javax.inject.Inject


class GetHotelsUseCase @Inject constructor(
    private val repository: HotelsRepository
) {
    suspend fun execute(): List<Hotel> {
        return repository.getHotels()
    }
}