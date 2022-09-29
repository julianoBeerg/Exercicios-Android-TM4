package com.generation.todolistmobile.api

import com.generation.todolistmobile.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return  RetrofitInstance.api.listCategoria()
    }
}