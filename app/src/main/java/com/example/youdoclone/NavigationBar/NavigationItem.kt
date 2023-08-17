package com.example.youdoclone.NavigationBar

import com.example.youdoclone.R

sealed class NavigationItem(var route:String, var title:String,var icon:Int){

object Home:NavigationItem("home","Home", R.drawable.home_icon)
object Message:NavigationItem("msg","Message",R.drawable.message_icon)
object Profile:NavigationItem("profile","Profile",R.drawable.profile_icon)

}
