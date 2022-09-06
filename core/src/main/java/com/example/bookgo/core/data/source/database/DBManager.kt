package com.example.bookgo.core.data.source.database

import android.content.Context
import android.database.sqlite.SQLiteConstraintException
import com.example.bookgo.core.data.models.EmailTakenException
import com.example.bookgo.core.data.models.entities.Account
import javax.inject.Inject

class DBManager @Inject constructor(
    val database: AccountDatabase
) {
    private val accountDao by lazy { database.accountDao() }
//    private lateinit var database: AccountDatabase

//    fun init(context: Context) {
//        database = AccountDatabase.getInstance(context)
//    }

    //todo check what returns if no account in DB (null)
    suspend fun contains(email: String, password: String): Boolean {
        val account = accountDao.getAccount(email, password)

        val accounts = accountDao.getAccounts()

        return account?.password == password
    }

    // android.database.sqlite.SQLiteConstraintException: UNIQUE constraint failed: accounts.email (code 2067)
    suspend fun signUp(account: Account) {
        try {
            accountDao.insert(account)
        } catch (e: SQLiteConstraintException) {
            throw EmailTakenException(e)
        }
    }

    private suspend fun clearTable() {
        accountDao.clearTable()
    }
}