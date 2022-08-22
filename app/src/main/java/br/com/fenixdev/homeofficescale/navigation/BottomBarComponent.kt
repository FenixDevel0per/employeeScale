package br.com.fenixdev.homeofficescale.navigation

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy


@Composable
fun BottomBarComponent(navController: NavHostController){
    val screens = listOf(
        BottomBarRouter.Scale,
        BottomBarRouter.PersonalSchedule
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    
    BottomNavigation() {
        screens.forEach { screen ->
            AddItem(screen = screen, currentDestination = currentDestination, navController = navController)
        }
    }
}


@Composable
fun RowScope.AddItem(
    screen: BottomBarRouter,
    currentDestination: NavDestination?,
    navController: NavHostController 
){
    BottomNavigationItem(
        icon = {
            Icon (
                imageVector = screen.icon,
                contentDescription = "Navigation Icon"
                    )
        },
        label = {
            Text(text = screen.title)
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = {
            navController.navigate(screen.route)
        }
    )
}