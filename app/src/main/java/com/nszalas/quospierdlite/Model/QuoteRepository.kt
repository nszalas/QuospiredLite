package com.nszalas.quospierdlite.Model

import retrofit2.awaitResponse

class QuoteRepository {

    companion object{

        suspend fun getAll(): List<Quote>?{
            return RetrofitInstance.api.getAll().awaitResponse().body()
        }
    }
}