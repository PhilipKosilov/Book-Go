package com.example.bookgo.feature_hotels.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bookgo.core.domain.models.HotelRoom
import com.example.bookgo.feature_hotels.databinding.RoomItemBinding

class HotelRoomRecyclerAdapter(private val rooms: List<HotelRoom>) :
    RecyclerView.Adapter<HotelRoomRecyclerAdapter.HotelRoomViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HotelRoomRecyclerAdapter.HotelRoomViewHolder {
        val binding = RoomItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HotelRoomViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: HotelRoomRecyclerAdapter.HotelRoomViewHolder,
        position: Int
    ) {
        holder.bind(rooms[position])
    }

    override fun getItemCount(): Int = rooms.size

    inner class HotelRoomViewHolder(private val binding: RoomItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(room: HotelRoom) {
            binding.hotelRoom = room
            binding.executePendingBindings()
        }
    }
}


