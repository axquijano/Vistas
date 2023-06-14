package com.aristidevs.appmovil_v1

//Destinos de la barra lateral
sealed class Destinos(
    val icon: Int,
    val title : String,
    val ruta : String
){
    object Pantalla1 : Destinos(R.drawable.mascota, "Tu mascota", "pantalla1")
    object Pantalla2 : Destinos(R.drawable.mascota, "Contenidos", "pantalla2")
    object Pantalla3 : Destinos(R.drawable.mascota, "Busca una mascota", "pantalla3")
    object Pantalla4 : Destinos(R.drawable.mascota, "Eventos", "pantalla4")
    object Pantalla5 : Destinos(R.drawable.mascota, "Premium", "pantalla5")
}