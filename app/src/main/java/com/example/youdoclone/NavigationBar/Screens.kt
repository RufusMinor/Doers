package com.example.youdoclone.NavigationBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun HomeScreen(){
    Column(modifier= Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Text(text = "This is main screen")
        
    }
    
}

@Composable
fun MessageScreen(){
    Column(modifier= Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Text(text = "This is screen message")
        
    }
    
}

@Composable
fun ProfileScreen(){
    Column(modifier=Modifier.fillMaxSize().background(Color.White)) {
        
    }
    
}