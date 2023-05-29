package com.example.bloodbank

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bloodbank.ui.theme.myfont
import com.example.bloodbank.ui.theme.myred
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll

@Composable

fun loginscreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(myred)
        ) {
        Column() {
            Column(modifier = Modifier.weight(0.4f)) {
                Text(text = "Plasma", modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 72.dp, 0.dp, 0.dp)
                , fontSize = 84.sp, color = Color.White, textAlign = TextAlign.Center, fontFamily = myfont )
                Text(text = "Plus", modifier = Modifier.fillMaxWidth(), fontSize = 68.sp, textAlign = TextAlign.Center, color = Color.White, fontFamily = myfont)
            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .weight(0.2f)
                .background(myred), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Top) {
                Image(painter = painterResource(id = R.drawable.drop), contentDescription = "logindrop",)
            }
            Box(modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White, shape = RoundedCornerShape(30.dp, 30.dp))
                .weight(0.4f)) {
                Submitfieldcheck(navController = navController)
            }

        }

    }
}








