package com.example.bloodbank

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun navigation(){
    val mynavcontroller = rememberNavController()
    NavHost(navController = mynavcontroller, startDestination = allscreens.totheloginscreen.route){
        composable(route = allscreens.tothemainscreen.route){
            mainscreen(navController = mynavcontroller)
        }
        composable(route = allscreens.totheloginscreen.route){
            loginscreen(navController = mynavcontroller)
        }
    }
}
