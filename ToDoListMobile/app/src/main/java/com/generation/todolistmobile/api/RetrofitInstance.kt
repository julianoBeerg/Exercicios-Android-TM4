package com.generation.todolistmobile.api

import com.generation.todolistmobile.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy { //Para inicar essa variaveis toda vez que vamos utilizar colocamos o By Lazy
        Retrofit.Builder() /*Constroi o objeto*/

            .baseUrl(Constants.BASE_URL)//Link da URL de base
            .addConverterFactory(GsonConverterFactory.create())//Ele pega o objeto Json, converte a Api em algo que o Kotlin consiga ler
            .build()
    }

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }


}