package com.example.bloodbank

sealed class allscreens(val route:String){
    object tothemainscreen : allscreens("route_to_the_main_screen")
    object totheloginscreen: allscreens("route_to_the_login_screen")
}
