package com.briantylerec.jetpackcomposeinstagram.login.data.network

import com.briantylerec.jetpackcomposeinstagram.core.network.RetrofitHelper
import com.briantylerec.jetpackcomposeinstagram.login.data.network.response.DataItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user:String, password:String): List<DataItem> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(LoginClient::class.java).doLogin()//user, password se debe pasar los aprametros
            response.body()?.data ?: emptyList()
        }
    }
}