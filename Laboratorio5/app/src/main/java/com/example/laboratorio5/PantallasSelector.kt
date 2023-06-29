package com.example.laboratorio5

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun PantallasSelector(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = PantallasExistentes.SwitcherScreen.route){
        composable(
            route = PantallasExistentes.FormularioScreen.route) {
            Formulario(navController)
        }
        composable(
            route = PantallasExistentes.SwitcherScreen.route) {
            Switcher(navController)
        }
        composable(
            route = PantallasExistentes.ConsultaScreen.route) {
            Consulta(navController)
        }

    }
}