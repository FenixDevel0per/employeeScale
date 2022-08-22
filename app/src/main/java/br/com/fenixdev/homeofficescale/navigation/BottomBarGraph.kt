package br.com.fenixdev.homeofficescale.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.fenixdev.homeofficescale.ui.screens.PersonalScheduleScreen
import br.com.fenixdev.homeofficescale.ui.screens.ScaleScreen


@Composable
fun BottomBarGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarRouter.Scale.route
    ){
        composable(route = BottomBarRouter.Scale.route){
            ScaleScreen()
        }
        composable(route = BottomBarRouter.PersonalSchedule.route){
            PersonalScheduleScreen()
        }
    }



}