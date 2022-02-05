package com.nszalas.quospierdlite.Model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL="https://type.fit/"
object RetrofitInstance{

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: QuotesAPI by lazy {

        Retrofit.Builder()
            .baseUrl("https://type.fit/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuotesAPI::class.java)

    }

}