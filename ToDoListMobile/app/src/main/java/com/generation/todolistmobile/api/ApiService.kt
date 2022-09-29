package com.generation.todolistmobile.api

import com.generation.todolistmobile.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("categoria")//Coloca o nome endpoint
    suspend fun listCategoria(): Response<List<Categoria>>//Verifica a respota da requisição na API, Suspend quer dizer que só vamos rodar ela dentro de uma corrotina
}