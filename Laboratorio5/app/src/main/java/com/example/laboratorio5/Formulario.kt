package com.example.laboratorio5

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.laboratorio5.operations.getData_Retrofit_lastkey
import com.example.laboratorio5.operations.postData_Retrofit
import com.example.laboratorio5.selector.PantallasExistentes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

@Composable
fun Formulario(navController: NavHostController) {
    val context = LocalContext.current
    Column {
        Text(
            text = "Ingresar Registro de Sensor",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            ),
            modifier = Modifier.padding(20.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp, start = 16.dp, bottom = 80.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        var fecha by remember { mutableStateOf("") }
        var medida by remember { mutableStateOf("") }
        var comentario by remember { mutableStateOf("") }

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Fecha"
        )
        OutlinedTextField(
            value = fecha,
            onValueChange = { fecha = it },
            label = { Text("Ingrese Fecha") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Medida"
        )
        OutlinedTextField(
            value = medida,
            onValueChange = { medida = it },
            label = { Text("Ingrese la medida del sensor") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Comentario"
        )
        OutlinedTextField(
            value = comentario,
            onValueChange = { comentario = it },
            label = { Text("Ingrese un Comentario") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            if(fecha.isNotBlank() && medida.isNotBlank() && comentario.isNotBlank())
            {
                runBlocking {
                    withContext(Dispatchers.IO) {
                        val lastRegistroId: Int? = getData_Retrofit_lastkey()
                        if (lastRegistroId != null) {
                            postData_Retrofit(
                                lastRegistroId + 1,
                                fecha,
                                medida.toInt(),
                                comentario
                            )
                        }
                    }
                }
                navController.navigate(route = PantallasExistentes.SwitcherScreen.route)
            }

        }) {
            Text(text = "Ingresar Datos")
        }
    }
}
