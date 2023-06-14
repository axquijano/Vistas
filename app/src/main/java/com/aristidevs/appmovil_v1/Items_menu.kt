package com.aristidevs.appmovil_v1

//Destinos de la barra baja
sealed class Items_menu(
    val icon: Int,
    val title: String,
    val ruta: String
){
    object Pantalla1: Items_menu(R.drawable.mascota, "Inicio", "pantalla1")
    object Pantalla2: Items_menu(R.drawable.book, "Contenidos", "pantalla2")
    object Pantalla3: Items_menu(R.drawable.start, "Premium", "pantalla5")
}