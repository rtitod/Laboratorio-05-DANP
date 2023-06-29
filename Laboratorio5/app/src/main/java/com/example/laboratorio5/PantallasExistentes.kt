package com.example.laboratorio5

sealed class PantallasExistentes(val route: String) {
    object SwitcherScreen: PantallasExistentes("switcher-scr")
    object ConsultaScreen: PantallasExistentes("consulta-scr")
    object FormularioScreen: PantallasExistentes("formulario-scr")
}
