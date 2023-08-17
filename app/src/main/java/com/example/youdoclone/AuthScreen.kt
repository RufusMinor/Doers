package com.example.youdoclone

import androidx.annotation.Px
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.youdoclone.NavigationBar.BottomNavigationBar
import com.example.youdoclone.NavigationBar.Navigation
import com.example.youdoclone.Registration.RegNav
import com.example.youdoclone.Registration.RegViewModel
import com.google.firebase.installations.Utils


@Composable
fun AuthScreen(navController:NavController){
    Column(modifier= Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(top = 80.dp), horizontalAlignment = Alignment.CenterHorizontally) {

        Box(modifier= Modifier
            .width(250.dp)
            .height(250.dp), contentAlignment = Alignment.TopCenter){
        Image(painter = painterResource(id = R.drawable.authimg), contentDescription ="registrationImg" )

        
    }
        Box(modifier=Modifier.padding(top = 50.dp)) {
            OutLineTextFieldSample("Enter Your Email","ss")
        }

        Box(modifier=Modifier.padding(top = 20.dp)) {
            OutLineTextFieldSample("Password","pas")
        }
        Box(modifier=Modifier.padding(top = 20.dp)) {
            ButtonWithColor(textButton = "Sing In")
        }

        Box(modifier=Modifier.padding(top = 20.dp)) {
            Row {
                Text(text = "Not registered?")
                ClickableText(text = AnnotatedString(" Registrated"), onClick = {
                    navController.navigate(RegNav.RegScreen.route)
                    //onClicked
                })
            }

        }
    }

}


@Composable
fun OutLineTextFieldSample(textlabel:String,text:String,regViewModel: RegViewModel= viewModel()) {
//    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = text,
        label = { Text(text = textlabel) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        onValueChange = {
            regViewModel.updateEmail(it)
        }
    )
}

@Composable
fun ButtonWithColor(textButton:String){
    Button(modifier= Modifier
        .width(300.dp)
        .height(50.dp),onClick = {  },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black), shape = RoundedCornerShape(10.dp), elevation =  ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, disabledElevation = 0.dp))
    {
        Text(text = textButton,color = Color.White)
    }
}




@Preview
@Composable
fun PreviewAuth(){
    AuthScreen(navController = rememberNavController())
}
@Preview
@Composable
fun PreviewGradient(){
    Gradient()
}

@Composable
fun Gradient(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        colorResource(id = R.color.one),
                        colorResource(id = R.color.two),
                        colorResource(id = R.color.three),
                        colorResource(id = R.color.five),
                        colorResource(id = R.color.white)
                    )
                )
            )
    ) {
        Content
    }
}