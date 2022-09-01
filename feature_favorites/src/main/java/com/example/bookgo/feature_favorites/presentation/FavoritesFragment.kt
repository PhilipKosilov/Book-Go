package com.example.bookgo.feature_favorites.presentation


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.bookgo.feature_favorites.R

class FavoritesFragment: Fragment(R.layout.fragment_favorites) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("logcat", "onCreate: wow in fav")
    }

}