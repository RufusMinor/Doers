package com.example.youdoclone.NavigationBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun Navigation(navController: NavHostController){
NavHost(navController, startDestination = NavigationItem.Home.route){
    composable(NavigationItem.Home.route){
    HomeScreen()
}
    composable(NavigationItem.Message.route){
        MessageScreen()
    }
    composable(NavigationItem.Profile.route){
        ProfileScreen()
    }
}
}