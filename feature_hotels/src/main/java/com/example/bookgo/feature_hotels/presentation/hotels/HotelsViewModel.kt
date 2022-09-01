package com.example.bookgo.feature_hotels.presentation.hotels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookgo.core.domain.models.Hotel
import com.example.bookgo.feature_hotels.domain.use_case.GetHotelsUseCase
import kotlinx.coroutines.launch

// todo remake to use UseCase
class HotelsViewModel(
    val getHotels: GetHotelsUseCase
): ViewModel() {

    private val _hotels = MutableLiveData<List<Hotel>>()
    val hotels: LiveData<List<Hotel>> = _hotels

    // todo: add necessary error checks
    fun fetchHotels() = viewModelScope.launch {
        val hoteldata = getHotels.execute()
        _hotels.postValue(hoteldata)
    }
}