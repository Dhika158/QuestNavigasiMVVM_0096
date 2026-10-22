package com.example.praktugas6

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

enum class  Navigation {
    FormulirSaya,
    Detail
}

@Composable
fun  DataApp(
    navController: NavHostController = rememberNavController()
)