package com.example.bookgo.feature_hotels.presentation.details

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearSnapHelper
import com.example.bookgo.core.domain.models.HotelRoom
import com.example.bookgo.feature_hotels.R
import com.example.bookgo.feature_hotels.databinding.FragmentHotelDetailsBinding
import com.example.bookgo.feature_hotels.presentation.adapter.HotelRoomRecyclerAdapter


class HotelDetailsFragment : Fragment(R.layout.fragment_hotel_details) {
    lateinit var binding: FragmentHotelDetailsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHotelDetailsBinding.bind(view)

        setupRoomRecyclerView()
    }

    private fun setupRoomRecyclerView() {
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(binding.hotelRoomRecyclerView)

        val adapter = HotelRoomRecyclerAdapter(getRoomsFromNavigationArguments())
        binding.hotelRoomRecyclerView.adapter = adapter
    }

    private fun getRoomsFromNavigationArguments(): List<HotelRoom> {
        val args = HotelDetailsFragmentArgs.fromBundle(requireArguments())
        return args.hotel.rooms
    }
}