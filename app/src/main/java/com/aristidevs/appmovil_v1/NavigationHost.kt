package com.aristidevs.appmovil_v1

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aristidevs.appmovil_v1.Destinos.*

//Mapa de navegacion, relaciona las rutas con los contenidos a mostrar
@Composable
fun NavigationHost(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Pantalla1.ruta
    ){
        composable(Pantalla1.ruta){
            Tu_mascota()
        }
        composable(Pantalla2.ruta){
            Contenido()
        }
        composable(Pantalla3.ruta){
            Busca_mascota()
        }
        composable(Pantalla4.ruta){
            Eventos()
        }
        composable(Pantalla5.ruta){
            Premium(navController)
        }
        composable("paantalla_tabs"){
            Tabs_Principal()
        }
    }

}