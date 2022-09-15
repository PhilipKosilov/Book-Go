package com.example.bookgo.core.domain.models

import android.os.Parcelable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import kotlinx.parcelize.Parcelize

@Parcelize
class HotelRoom(
    val name: String,
    val description: String,
    val images: List<String>
) : Parcelable {
    companion object {
        @JvmStatic
        @BindingAdapter("imageUrl")
        fun loadImage(view: ImageView, url: String?) {
            if (url != null) {
                Glide.with(view.context).load(url).into(view)
            }
        }
    }
}