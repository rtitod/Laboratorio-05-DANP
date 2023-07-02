package com.example.laboratorio5.entities

data class SensorRegister(
    var RegistroId: Int,
    var FechayHora: String,
    var medida: Int,
    var comentario: String
)
