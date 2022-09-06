package com.example.bookgo.feature_hotels.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.bookgo.feature_hotels.R
import com.example.bookgo.feature_hotels.databinding.FragmentHotelDetailsBinding


class HotelDetailsFragment : Fragment() {
    lateinit var binding: FragmentHotelDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.fragment_hotel_details,
            container,
            false
        )

        val args = HotelDetailsFragmentArgs.fromBundle(requireArguments())
        binding.hotel = args.hotel

        return binding.root
    }
}