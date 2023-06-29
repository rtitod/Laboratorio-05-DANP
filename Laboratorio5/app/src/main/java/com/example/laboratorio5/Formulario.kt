package com.example.laboratorio5

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Formulario(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp, start = 16.dp, bottom = 80.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Fecha"
        )
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Ingrese Fecha") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Medida"
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Ingrese la medida del sensor") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Comentario"
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Ingrese un Comentario") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { }) {
            Text(text = "Ingresar Datos")
        }
    }
}