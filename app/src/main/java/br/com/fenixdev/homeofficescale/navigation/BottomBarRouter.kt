package br.com.fenixdev.homeofficescale.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarRouter(
    val route: String,
    val title: String,
    val icon: ImageVector)
{
    object Scale: BottomBarRouter(
        route = "scaleScreen",
        title = "Escala",
        icon = Icons.Default.Home
    )
    object PersonalSchedule: BottomBarRouter(
        route = "personalScheduleScreen",
        title = "Pessoal",
        icon = Icons.Default.Home
    )
}