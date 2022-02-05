package com.nszalas.quospierdlite.Model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface QuotesAPI {

    @GET("api/quotes")
    fun getAll(): Call<List<Quote>>

}