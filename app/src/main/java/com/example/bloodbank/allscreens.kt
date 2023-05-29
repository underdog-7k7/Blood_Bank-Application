package com.example.bloodbank

sealed class allscreens(val route:String){
    object tothemainscreen : allscreens("route_to_the_main_screen")
    object totheloginscreen: allscreens("route_to_the_login_screen")
    object tothesettingsscreen: allscreens("route_to_the_settings_screen")
    object tothehistoryscreen: allscreens("route_to_the_history_screen")
    object totheappointmentscreen: allscreens("route_to_the_appointment_screen")
}
