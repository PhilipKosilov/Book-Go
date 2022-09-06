package com.example.bookgo.core.data.repository

import com.example.bookgo.core.data.api.HotelsRetrofitApi
import com.example.bookgo.core.domain.mapper.HotelModelMapper
import com.example.bookgo.core.domain.models.Hotel
import com.example.bookgo.core.domain.repository.HotelsRepository
import javax.inject.Inject


class HotelsRepositoryImpl @Inject constructor(
    val source: HotelsRetrofitApi,
    val mapper: HotelModelMapper
) : HotelsRepository {

    override suspend fun getHotels(): List<Hotel> {
        val result = source.getHotels()
        // remove first test hotel because it has no images
        return result.data
            .filter { it.images.isNotEmpty() }
            .map { mapper.mapFromEntity(it) }
    }
}