package com.example.bookgo.core.data.source

import android.content.Context
import android.content.SharedPreferences

object Prefs {
    // todo remake with DI
    lateinit var pref: SharedPreferences

    fun init(context: Context) {
        pref = context.getSharedPreferences(
            context.getString(context.applicationInfo.labelRes),
            Context.MODE_PRIVATE
        )
    }
}