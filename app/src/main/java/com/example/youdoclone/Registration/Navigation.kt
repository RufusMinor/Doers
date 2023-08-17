package com.example.youdoclone.Registration

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.youdoclone.AuthScreen
import com.example.youdoclone.MainScreen


@Composable
fun NavReg(){
    val NavController= rememberNavController()
    NavHost(navController = NavController, startDestination =RegNav.AuthScreen.route){
        composable(route=RegNav.RegScreen.route){
            RegScreen(navController=NavController)
        }
        composable(route=RegNav.MainScreen.route){
            MainScreen()
        }
        composable(route=RegNav.AuthScreen.route){
            AuthScreen(navController = NavController)
        }
    }

}