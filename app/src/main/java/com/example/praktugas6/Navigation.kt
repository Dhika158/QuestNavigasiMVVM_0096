package com.example.praktugas6

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

enum class  Navigation {
    FormulirSaya,
    Detail
}

@Composable
fun  DataApp(
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigation.FormulirSaya.name,

            modifier = Modifier.padding(paddingValues = isiRuang){
                composable(route = Navigation.FormulirSaya.name){
                    Formisian (
                        onSubmitBtnClick = {
                            navController.navigate(Navigation.Detail.name)
                        }

                    )
                }
            }
    }
}