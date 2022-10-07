package com.juliano.logintest.api



import com.juliano.logintest.model.User
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("usuario")
    fun authenticate(@Field("nome") nome : String, @Field("senha") senha : String) : Call<User>
}
