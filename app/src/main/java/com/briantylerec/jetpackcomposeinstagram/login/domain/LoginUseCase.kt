package com.briantylerec.jetpackcomposeinstagram.login.domain

import com.briantylerec.jetpackcomposeinstagram.login.data.LoginRepository
import com.briantylerec.jetpackcomposeinstagram.login.data.network.response.DataItem

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user: String, password: String): List<DataItem> {
        return repository.doLogin(user, password)
    }
}