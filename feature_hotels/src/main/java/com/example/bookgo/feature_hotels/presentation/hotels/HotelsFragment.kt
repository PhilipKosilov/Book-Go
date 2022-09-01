package com.example.bookgo.feature_hotels.presentation.hotels

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bookgo.core.utils.viewmodel.viewModelCreator
import com.example.bookgo.feature_hotels.R
import com.example.bookgo.feature_hotels.databinding.FragmentHotelsBinding
import com.example.bookgo.feature_hotels.domain.use_case.GetHotelsUseCase
import com.example.bookgo.feature_hotels.presentation.adapter.HotelsRecyclerAdapter


class HotelsFragment : Fragment(R.layout.fragment_hotels) {

    lateinit var binding: FragmentHotelsBinding
    private val viewModel by viewModelCreator { HotelsViewModel(GetHotelsUseCase()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHotelsBinding.bind(view)

        viewModel.hotels.observe(viewLifecycleOwner) {
            val adapter = HotelsRecyclerAdapter(it)
            adapter.setOnItemClickListener { hotel ->
                val direction =
                    HotelsFragmentDirections.actionHotelsFragmentToHotelDetailsFragment(hotel)
                findNavController().navigate(direction)
            }
            binding.hotelsRecyclerView.adapter = adapter
        }

        viewModel.fetchHotels()
    }
}