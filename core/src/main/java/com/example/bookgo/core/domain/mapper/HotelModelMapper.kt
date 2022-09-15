package com.example.bookgo.core.domain.mapper

import com.example.bookgo.core.data.models.HotelData
import com.example.bookgo.core.data.models.HotelRoomType
import com.example.bookgo.core.domain.models.Hotel
import com.example.bookgo.core.domain.models.HotelRoom
import javax.inject.Inject

class HotelModelMapper @Inject constructor() {
    fun mapFromEntity(entity: HotelData): Hotel {
        return Hotel(
            name = removeSandboxSuffixFromName(entity.name),
            starRating = entity.starRating,
            address = "${entity.address.line1 ?: ""}, ${entity.address.city ?: ""}",
            images = entity.images.map { it.url },
            rooms = entity.roomTypes.map { mapToHotelRoom(it) }
        )
    }

    private fun mapToHotelRoom(hotelRoomType: HotelRoomType): HotelRoom {
        return HotelRoom(
            name = hotelRoomType.name,
            description = hotelRoomType.description,
            images = hotelRoomType.images.map { it.url }
        )
    }

    // In (free) sandbox mode API returns hotel names with [SANDBOX] suffix
    private fun removeSandboxSuffixFromName(name: String): String {
        return name.removeSuffix("[SANDBOX]")
    }
}