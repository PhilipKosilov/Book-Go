package com.example.bookgo.core.data.api

import com.example.bookgo.core.data.models.HotelsModel
import retrofit2.http.GET

/**
 * Retrofit API defines possible HTTP requests and operations.
 */
interface HotelsRetrofitApi {
    @GET("v1/hotels")
    suspend fun getHotels(): HotelsModel
}