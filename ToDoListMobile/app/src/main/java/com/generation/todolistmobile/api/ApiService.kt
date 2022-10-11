package com.generation.todolistmobile.api

import com.generation.todolistmobile.model.Categoria
import com.generation.todolistmobile.model.Tarefa
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ApiService {

    @GET("categoria")//Coloca o nome endpoint
    suspend fun listCategoria(): Response<List<Categoria>>//Verifica a respota da requisição na API, Suspend quer dizer que só vamos rodar ela dentro de uma corrotina

    @POST("tarefa")
    suspend fun addTarefa(
        @Body tarefa: Tarefa
    ): Response<Tarefa>

    @GET("tarefa")
    suspend fun listTarefa(): Response<List<Tarefa>>

    @PUT("tarefa")
    suspend fun updateTarefa(
        @Body tarefa: Tarefa
    ): Response<Tarefa>

    @DELETE("tarefa/{id}")
        suspend fun deleteTarefa(
            @Path("id") id: Long
        ): Response<Tarefa>

}