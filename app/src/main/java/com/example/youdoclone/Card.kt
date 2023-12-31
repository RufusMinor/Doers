package com.example.youdoclone

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardHome(){

   Card(
       modifier = Modifier
           .width(200.dp)
           .height(100.dp),
       onClick = {}) {

       Box(modifier = Modifier.padding(top=15.dp, start=15.dp)){
       Column() {
           Text(text = "Создать сайт по дизайну", modifier = Modifier, color = Color.Black)
           Text(text = "21.09.2023-01.11.2023",modifier= Modifier.padding(top = 5.dp, bottom = 5.dp), fontSize = 6.sp)
           Text(text = "12000р", fontSize = 10.sp, color = Color.Black)
           
       }}



    }
}

@Preview
@Composable
fun CardPreview(){
    CardHome()
}