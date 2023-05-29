package com.example.bloodbank

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavController
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bloodbank.ui.theme.myfont
import com.example.bloodbank.ui.theme.myred

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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldWithIcons(modifier: Modifier = Modifier
    .fillMaxWidth()
                       ,content:String,onTextChanged: (String) -> Unit) {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        modifier= Modifier
            .padding(
                40.dp, 30.dp
            ) //this will anyway be default when we dont call it with a modifier
            /*.width(350.dp)*/
            .fillMaxWidth()
        ,
        value = text,
        onValueChange = {
            text = it
            onTextChanged(it)
        },
        placeholder = {
            androidx.compose.material3.Text(
                text = "$content",
                textAlign = TextAlign.Center
            )
        },
        leadingIcon = { androidx.compose.material3.Icon(Icons.Default.Person, contentDescription = "PERSON") },
        shape= RoundedCornerShape(30.dp),



        )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordInput(modifier: Modifier = Modifier
    .fillMaxWidth()
                  ,content:String,onTextChanged: (String) -> Unit) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier= Modifier
            .padding(
                40.dp, 10.dp
            ) //this will anyway be default when we dont call it with a modifier
            /*.width(350.dp)*/
            .fillMaxWidth()
        ,
        value = text,
        onValueChange = {
            text = it
            onTextChanged(it)
        },
        placeholder = {
            androidx.compose.material3.Text(
                text = "$content",
                textAlign = TextAlign.Center
            )
        },
        leadingIcon = {
            androidx.compose.material3.Icon(
                Icons.Default.Lock,
                contentDescription = "PERSON"
            )
        },
        shape= RoundedCornerShape(30.dp),
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
    )
}

@SuppressLint("SuspiciousIndentation")
@Composable
fun SubmitButton(
    /*modifier: Modifier = Modifier
        .padding(40.dp, 30.dp)
        .fillMaxWidth(),*/
    isEnabled: Boolean,
    onButtonClick: () -> Unit
) {

    Button(
        onClick = onButtonClick,
        enabled = isEnabled,
        modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp, 20.dp),
        colors = ButtonDefaults.buttonColors(myred)

    ) {
        androidx.compose.material3.Text("Submit", fontFamily = myfont, fontSize =16.sp)
    }

}
@Composable
fun Submitfieldcheck(navController: NavController) {
    var clientname by remember { mutableStateOf("") }
    var clientpass by remember { mutableStateOf("") }

    Box(){
        Column(modifier = Modifier
            .padding(8.dp)
        ) {
            TextFieldWithIcons(content = "Donor ID", onTextChanged = {clientname=it})
            PasswordInput(content = "Password", onTextChanged = {clientpass=it})
            SubmitButton(
                isEnabled = (clientname.isNotEmpty()&&clientpass.isNotEmpty()),
                onButtonClick ={ navController.navigate(allscreens.tothemainscreen.route) },
            )

        }
    }

}