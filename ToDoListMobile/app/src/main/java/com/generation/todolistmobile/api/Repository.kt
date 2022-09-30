package com.generation.todolistmobile.api

import com.generation.todolistmobile.model.Categoria
import com.generation.todolistmobile.model.Tarefa
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return  RetrofitInstance.api.listCategoria()
    }

    suspend fun addTarefa(tarefa: Tarefa):Response<Tarefa>{
        return RetrofitInstance.api.addTarefa(tarefa)
    }
}