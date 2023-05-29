package com.example.bloodbank

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavController
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@ExperimentalMaterialApi
@Composable
fun centralbottomnavbar(mynavcontroller: NavController){
    val items = listOf(
        allscreens.totheappointmentscreen,
        allscreens.totheloginscreen,
        allscreens.tothehistoryscreen
    )
    val navBackStackEntry by mynavcontroller.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    BottomNavigation {
        items.forEach { screen ->
            BottomNavigationItem(
                selected = currentRoute == screen.route,
                onClick = {
                    mynavcontroller.navigate(screen.route)
                }, icon = {}, modifier = Modifier.background(Color.Magenta))
                /*icon = {
                    Icon(screen.icon, contentDescription = screen.title)
                },
                label = {
                    Text(screen.title)
                }
            )*/
        }}


}