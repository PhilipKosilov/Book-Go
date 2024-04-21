package com.example.bookgo.core.di

import android.content.Context
import android.content.SharedPreferences
import com.example.bookgo.core.data.api.HotelsRetrofitApi
import com.example.bookgo.core.data.models.mapper.AccountMapper
import com.example.bookgo.core.data.repository.AccountRepositoryImpl
import com.example.bookgo.core.data.repository.HotelsRepositoryImpl
import com.example.bookgo.core.data.source.database.AccountDatabase
import com.example.bookgo.core.data.source.database.DBManager
import com.example.bookgo.core.data.source.temp.LocalDataSource
import com.example.bookgo.core.domain.mapper.HotelModelMapper
import com.example.bookgo.core.domain.repository.AccountRepository
import com.example.bookgo.core.domain.repository.HotelsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CoreModule {

    @Singleton
    @Provides
    fun provideAccountRepository(
        pref: SharedPreferences,
        db: DBManager,
        mapper: AccountMapper
    ): AccountRepository {
        return AccountRepositoryImpl(pref, db, mapper)
    }

    @Singleton
    @Provides
    fun provideDataBaseManager(database: AccountDatabase): DBManager {
        return DBManager(database)
    }

    @Singleton
    @Provides
    fun provideAccountDataBase(
        @ApplicationContext context: Context
    ): AccountDatabase {
        return AccountDatabase.getInstance(context)
    }

    @Singleton
    @Provides
    fun providePrefs(
        @ApplicationContext context: Context
    ): SharedPreferences {
        return context.getSharedPreferences(
            context.getString(context.applicationInfo.labelRes),
            Context.MODE_PRIVATE
        )
    }

    @Singleton
    @Provides
    fun provideHotelsRepository(
        source: HotelsRetrofitApi,
        mapper: HotelModelMapper
    ): HotelsRepository {
        return HotelsRepositoryImpl(source, mapper)
    }

    //todo change to RetrofitInstance.retrofitService when done testing
    // move everything from RetrofitInstance here
    @Singleton
    @Provides
    fun provideHotelsDataSource(): HotelsRetrofitApi {
        return LocalDataSource
    }
}