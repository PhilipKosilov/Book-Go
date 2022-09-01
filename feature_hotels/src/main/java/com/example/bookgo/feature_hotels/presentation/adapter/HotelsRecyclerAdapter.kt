package com.example.bookgo.feature_hotels.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bookgo.core.domain.models.Hotel
import com.example.bookgo.feature_hotels.databinding.HotelItemBinding


class HotelsRecyclerAdapter(private val hotels: List<Hotel>) :
    RecyclerView.Adapter<HotelsRecyclerAdapter.HotelViewHolder>() {

    private var onItemClick: ((Hotel) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelViewHolder {
        val binding = HotelItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HotelViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HotelViewHolder, position: Int) {
        holder.bind(hotels[position])
    }

    override fun getItemCount(): Int = hotels.size

    fun setOnItemClickListener(listener: (Hotel) -> Unit) {
        onItemClick = listener
    }

    inner class HotelViewHolder(private val binding: HotelItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(hotel: Hotel) {
            binding.hotel = hotel
            binding.executePendingBindings()

            binding.root.setOnClickListener {
                onItemClick?.invoke(hotels[adapterPosition])
            }
        }
    }
}