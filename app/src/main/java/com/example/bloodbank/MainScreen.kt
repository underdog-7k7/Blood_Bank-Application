package com.example.bloodbank

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
@ExperimentalMaterialApi
fun mainscreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Yellow)) {
        Text(text = "this is the mainscreen")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick =     {
                   navController.navigate(allscreens.totheloginscreen.route)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Logout")
        }
        centralbottomnavbar(mynavcontroller = navController)
    }

}



