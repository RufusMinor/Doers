package com.example.youdoclone.Registration

sealed class RegNav(val route:String) {

    object RegScreen:RegNav("RegScreen")
    object MainScreen:RegNav("Nav")
    object AuthScreen:RegNav("AuthScreen")
}