package com.example.bookgo.core.data.source.remote


import com.example.bookgo.core.BuildConfig
import com.example.bookgo.core.data.api.HotelsRetrofitApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Provides a ready to use retrofit service.
 */
//TODO: Migrate to Dagger dependency injection
object RetrofitInstance {
    private const val BASE_URL = "https://sandbox.impala.travel/"
    private const val API_KEY_ATTRIBUTE = "x-api-key"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(buildOkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val retrofitService: HotelsRetrofitApi = retrofit.create(HotelsRetrofitApi::class.java)

    private fun buildOkHttpClient() = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val request = chain.request().newBuilder()
                .addHeader(API_KEY_ATTRIBUTE, BuildConfig.HOTELS_API_KEY)
                .build()
            chain.proceed(request)
        }
        .build()
}