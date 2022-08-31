package com.example.bookgo.core.data.source.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.bookgo.core.data.models.entities.Account

@Database(entities = arrayOf(Account::class), version = 1)
abstract class AccountDatabase : RoomDatabase() {
    abstract fun accountDao(): AccountDao

    companion object {
        private const val DATABASE = "accounts_db"
        private var db: AccountDatabase? = null

        fun getInstance(context: Context): AccountDatabase {
            return db ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    AccountDatabase::class.java,
                    DATABASE
                ).build()

                db = instance
                instance
            }
        }
    }
}