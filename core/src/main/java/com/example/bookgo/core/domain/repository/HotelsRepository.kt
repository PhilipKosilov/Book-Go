package com.example.bookgo.core.domain.repository

import com.example.bookgo.core.domain.models.Hotel


interface HotelsRepository {
    suspend fun getHotels(): List<Hotel>
}