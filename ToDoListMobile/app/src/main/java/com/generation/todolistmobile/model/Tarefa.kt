package com.generation.todolistmobile.model

data class Tarefa (
    var nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var categoria: String
        ) {
}