package com.example.bookgo.utils

import android.app.Application
import android.content.Context
import com.example.bookgo.core.data.source.Prefs
import com.example.bookgo.core.data.source.database.DBManager


class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initialize(applicationContext)
    }

    private fun initialize(context: Context) {
        Prefs.init(context)
        DBManager.init(context)
    }
}