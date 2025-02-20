package com.briantylerec.jetpackcomposeinstagram.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://tenders.guru/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}