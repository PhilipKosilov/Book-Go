package com.example.bookgo.core.domain.models

import android.os.Parcelable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hotel(
    val name: String,
    val starRating: Int,
    val address: String,
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
