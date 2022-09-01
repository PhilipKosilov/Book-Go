package com.example.bookgo.feature_hotels.domain.use_case

import com.example.bookgo.core.data.repository.HotelsRepositoryImpl
import com.example.bookgo.core.domain.models.Hotel
import com.example.bookgo.core.domain.repository.HotelsRepository


class GetHotelsUseCase(
    private val repository: HotelsRepository = HotelsRepositoryImpl()
) {
    suspend fun execute(): List<Hotel> {
        return repository.getHotels()
    }
}