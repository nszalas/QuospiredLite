package com.nszalas.quospiredlite.Model

import retrofit2.Call
import retrofit2.http.GET

interface QuotesAPI {

    @GET("api/quotes")
    fun getAll(): Call<List<Quote>>

}