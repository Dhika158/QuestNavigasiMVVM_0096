package com.example.praktugas6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktugas6.view.FormIsian
import com.example.praktugas6.view.TampilData

enum class Navigation {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigation.FormulirSaya.name,
            modifier = Modifier.padding(paddingValues = isiRuang)
        ){
            composable(route = Navigation.FormulirSaya.name) {
                FormIsian(
                    OnSubmitBtnClick = {
                        navController.navigate(Navigation.Detail.name)
                    }
                )
            }
            composable(route = Navigation.Detail.name) {
                TampilData(
                    onBackBtnClick = { cancelAndBackToFormulirSaya(navController) }
                )
            }
        }
    }
}

private fun cancelAndBackToFormulirSaya(
    navController: NavHostController
){
    navController.popBackStack(route = Navigation.FormulirSaya.name, inclusive = false)
}
