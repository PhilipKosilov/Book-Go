package com.example.bookgo.feature_hotels.presentation.hotels

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookgo.core.domain.models.Hotel
import com.example.bookgo.core.utils.viewmodel.viewModelCreator
import com.example.bookgo.feature_hotels.R
import com.example.bookgo.feature_hotels.databinding.FragmentHotelsBinding
import com.example.bookgo.feature_hotels.di.HotelsComponentProvider
import com.example.bookgo.feature_hotels.domain.use_case.GetHotelsUseCase
import com.example.bookgo.feature_hotels.presentation.adapter.HotelsRecyclerAdapter
import javax.inject.Inject


class HotelsFragment : Fragment(R.layout.fragment_hotels) {

    lateinit var binding: FragmentHotelsBinding

    @Inject
    lateinit var getHotelsUseCase: GetHotelsUseCase
    private val viewModel by viewModelCreator { HotelsViewModel(getHotelsUseCase) }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        injectDependencies()
    }

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

    private fun injectDependencies() {
        (requireActivity().application as HotelsComponentProvider)
            .provideHotelsComponent().inject(this)
    }
}