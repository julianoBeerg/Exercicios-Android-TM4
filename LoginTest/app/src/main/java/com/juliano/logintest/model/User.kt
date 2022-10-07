package com.juliano.logintest.model

import com.google.gson.annotations.SerializedName

data class User (

    @SerializedName("id")
    var id: Long,

    @SerializedName("nome")
    var nome: String,

    @SerializedName("sobrenome")
    var sobrenome: String,

    @SerializedName("idade")
    var idade: Int,

    @SerializedName("email")
    var email: String,

    @SerializedName("telefone")
    var foto: String,

    @SerializedName("senha")
    var senha: String
)