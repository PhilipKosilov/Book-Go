package com.example.bookgo.core.data.source.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.bookgo.core.data.models.entities.Account

@Dao
interface AccountDao {
    @Query("SELECT * FROM accounts")
    suspend fun getAll(): List<Account>

    @Insert
    suspend fun insert(account: Account)

    @Query("SELECT * FROM accounts")
    suspend fun getAccounts(): List<Account>

    @Query("SELECT * FROM accounts WHERE email LIKE :email AND password LIKE :password")
    suspend fun getAccount(email: String, password: String): Account?

    @Query("DELETE FROM accounts")
    suspend fun clearTable()
}