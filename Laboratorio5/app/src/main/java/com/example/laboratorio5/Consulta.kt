package com.example.laboratorio5

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Consulta(navController: NavHostController) {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 60.dp, start = 16.dp, bottom = 80.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Registro del Sensor"
        )

    }
}
