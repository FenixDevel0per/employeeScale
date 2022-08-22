package br.com.fenixdev.homeofficescale.ui.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import br.com.fenixdev.homeofficescale.navigation.BottomBarComponent
import br.com.fenixdev.homeofficescale.navigation.BottomBarGraph

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBarComponent(navController = navController) }
    ){
        BottomBarGraph(navController = navController)
    }
}


@Preview
@Composable
fun MainScreenPreview(){
    MainScreen()
}