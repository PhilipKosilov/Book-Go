package com.example.bookgo.feature_hotels.presentation.hotels

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookgo.core.domain.models.Hotel
import com.example.bookgo.feature_hotels.R
import com.example.bookgo.feature_hotels.databinding.FragmentHotelsBinding
import com.example.bookgo.feature_hotels.presentation.adapter.HotelsRecyclerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HotelsFragment : Fragment(R.layout.fragment_hotels) {

    private lateinit var binding: FragmentHotelsBinding
    private val viewModel: HotelsViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHotelsBinding.bind(view)

        setupViewModelObservers()
        fetchHotels()
    }

    private fun fetchHotels() {
        viewModel.fetchHotels()
    }

    private fun setupViewModelObservers() {
        viewModel.hotels.observe(viewLifecycleOwner) {
            setupRecyclerView(it)
        }
    }

    private fun setupRecyclerView(hotels: List<Hotel>){
        binding.hotelsRecyclerView.layoutManager = object: LinearLayoutManager(context) {
            override fun checkLayoutParams(lp: RecyclerView.LayoutParams?): Boolean {
                lp?.height = (height / 1.5).toInt()
                return true
            }
        }

        val adapter = HotelsRecyclerAdapter(hotels)
        adapter.setOnItemClickListener { gotoDetailsFragment(it) }
        binding.hotelsRecyclerView.adapter = adapter
    }

    private fun gotoDetailsFragment(hotel: Hotel) {
        val direction = HotelsFragmentDirections.actionHotelsFragmentToHotelDetailsFragment(hotel)
        findNavController().navigate(direction)
    }
}