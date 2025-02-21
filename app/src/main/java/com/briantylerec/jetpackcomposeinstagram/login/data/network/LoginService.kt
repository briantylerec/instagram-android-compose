package com.briantylerec.jetpackcomposeinstagram.login.data.network

import com.briantylerec.jetpackcomposeinstagram.login.data.network.response.DataItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import javax.inject.Inject

class LoginService @Inject constructor(private val loginClient: LoginClient) {

    suspend fun doLogin(user:String, password:String): List<DataItem> {
        return withContext(Dispatchers.IO) {
            val response = loginClient.doLogin()//user, password se debe pasar los aprametros
            response.body()?.data ?: emptyList()
        }
    }
}