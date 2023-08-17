package com.example.youdoclone.NavigationBar

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.youdoclone.R
import com.example.youdoclone.ui.theme.Navy


@Composable
fun BottomNavigationBar(navController:NavController){

val items= listOf(
    NavigationItem.Home,
    NavigationItem.Message,
    NavigationItem.Profile
)
    
    
    BottomNavigation(modifier = Modifier.clip(RoundedCornerShape(topEnd = 15.dp, topStart = 14.dp)), backgroundColor = colorResource(id = R.color.navy)
    ) {



        items.forEach { item->
            BottomNavigationItem(
                icon = { Icon(painter = painterResource(id = item.icon), contentDescription =item.route )},
                label = { Text(text = item.title)},
                selected = false, onClick = {
                    navController.navigate(item.route){
                        // on the back stack as users select items
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }
                })

        }
        
    }

}

