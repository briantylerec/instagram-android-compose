package com.briantylerec.jetpackcomposeinstagram.login.data.network

import com.briantylerec.jetpackcomposeinstagram.login.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginClient {
    @GET("/api/hu/tenders/")
    suspend fun doLogin(): Response<LoginResponse>
}