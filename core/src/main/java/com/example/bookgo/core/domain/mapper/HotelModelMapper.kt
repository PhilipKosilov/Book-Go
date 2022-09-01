package com.example.bookgo.core.domain.mapper

import com.example.bookgo.core.data.models.HotelData
import com.example.bookgo.core.domain.models.Hotel

class HotelModelMapper {
    fun mapFromEntity(entity: HotelData): Hotel {
        return Hotel(
            name = entity.name,
            starRating = entity.starRating,
            address = "${entity.address.line1 ?: ""}, ${entity.address.city ?: ""}",
            images = entity.images.map { it.url }
        )
    }
}