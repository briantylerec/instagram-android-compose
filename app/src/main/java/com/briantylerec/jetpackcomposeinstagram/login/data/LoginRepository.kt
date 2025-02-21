package com.briantylerec.jetpackcomposeinstagram.login.data

import com.briantylerec.jetpackcomposeinstagram.login.data.network.LoginService
import com.briantylerec.jetpackcomposeinstagram.login.data.network.response.DataItem
import javax.inject.Inject

class LoginRepository @Inject constructor(private val api: LoginService) {

    suspend fun doLogin(user: String, password: String) : List<DataItem> {
        return api.doLogin(user, password)
    }
}