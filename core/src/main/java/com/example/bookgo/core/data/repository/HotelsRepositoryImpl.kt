package com.example.bookgo.core.data.repository

import com.example.bookgo.core.data.source.temp.LocalDataSource
import com.example.bookgo.core.domain.mapper.HotelModelMapper
import com.example.bookgo.core.domain.models.Hotel
import com.example.bookgo.core.domain.repository.HotelsRepository


// todo: change data source to Retrofit when done testing
class HotelsRepositoryImpl(
    val source: LocalDataSource = LocalDataSource,
    val mapper: HotelModelMapper = HotelModelMapper()
) : HotelsRepository {

    override suspend fun getHotels(): List<Hotel> {
        val result = source.getHotels()
        // remove test hotel #1 (no images)
        return result.data
            .filter { it.images.isNotEmpty() }
            .map { mapper.mapFromEntity(it) }
    }
}