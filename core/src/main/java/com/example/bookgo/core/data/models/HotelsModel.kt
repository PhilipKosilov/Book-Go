package com.example.bookgo.core.data.models


data class HotelsModel(
    val data: List<HotelData>
)

data class HotelData(
    val hotelId: String,
    val name: String,
    val currency: String,
    val starRating: Int,
    val description: HotelDescription,
    val phoneNumbers: List<String>,
    val emails: List<String>,
    val websiteUrl: String,
    val images: List<HotelImage>,
    val address: HotelAddress,
    val location: HotelLocation,
    val timeZone: String,
    val amenities: List<HotelAmenity>,
    val roomCount: Int,
    val checkIn: HotelCheckIn,
    val checkOut: HotelCheckOut,
    val termsAndConditions: String,
//    val externalUrls: Any, // always empty
    val roomTypes: List<HotelRoomType>
)

data class HotelDescription(
    val short: String
)

data class HotelImage(
//    val altText: Any?,
    val height: Int,
    val width: Int,
    val url: String,
//    val isHeroImage: Boolean
)

data class HotelAddress(
    val line1: String?,
    val line2: String?,
    val city: String?,
    val postalCode: String?,
    val region: String?,
    val country: String?,
    val countryName: String?
)

data class HotelLocation(
    val longitude: Double,
    val latitude: Double
)

data class HotelAmenity(
    val code: Int,
    val formatted: String
)

data class HotelCheckIn(
    val from: String,
    val to: String
)

data class HotelCheckOut(
    val from: String,
    val to: String
)

data class HotelRoomType(
    val roomTypeId: String,
    val name: String,
    val description: String,
    val maxOccupancy: Int,
    val rates: Any,
    val amenities: List<HotelAmenity>,
    val images: List<HotelImage>
)
