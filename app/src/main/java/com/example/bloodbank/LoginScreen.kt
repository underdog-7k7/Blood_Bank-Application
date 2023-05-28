package com.example.bloodbank

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun loginscreen(navController:NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red)) {
        Text(text = "this is the loginscreen")
        Button(onClick = {
                         navController.navigate(allscreens.tothemainscreen.route)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "To the main screen")
        }
    }

}




