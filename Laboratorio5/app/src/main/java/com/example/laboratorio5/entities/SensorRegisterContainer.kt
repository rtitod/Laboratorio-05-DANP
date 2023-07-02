package com.example.laboratorio5.entities

import com.example.laboratorio5.entities.SensorRegister

data class SensorRegisterContainer(
    val registers: List<SensorRegister>,
    val start: Int,
    val max: Int,
    val lastRegistroId: Int
    )
