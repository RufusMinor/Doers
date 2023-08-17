package com.example.youdoclone.Registration

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

import androidx.navigation.compose.rememberNavController
import com.example.youdoclone.ButtonWithColor
import com.example.youdoclone.OutLineTextFieldSample
import com.example.youdoclone.R


@Composable
fun RegScreen(navController: NavController, regViewModel: RegViewModel= viewModel()){

    val email:String by regViewModel.email.observeAsState("")
    val password:String by regViewModel.password.observeAsState("")
    val name:String by regViewModel.name.observeAsState("")

    Column(modifier= Modifier
        .fillMaxSize()
        .background(Color.White), horizontalAlignment = Alignment.CenterHorizontally) {

        Box(modifier= Modifier
            .width(300.dp)
            .height(300.dp)
            .padding(top = 80.dp), contentAlignment = Alignment.Center){
        Image(painter = painterResource(id = R.drawable.regimg), contentDescription ="registerImage" )

    }
        OutLineTextFieldEmail("Email",email)
        OutLineTextFieldPassword("Password",password)
        OutLineTextFieldName("Name",name)

        Box(modifier= Modifier
            .width(300.dp)
            .height(300.dp)
            .padding(top = 60.dp), contentAlignment = Alignment.Center) {
            ButtonReg(textButton = "Registration", navController)
        }
    }
}

@Preview
@Composable
fun PreviewRegScreen(){
    RegScreen(navController = rememberNavController())
}

@Composable
fun ButtonReg(textButton:String, navController: NavController, regViewModel: RegViewModel= viewModel()){
    Button(modifier= Modifier
        .width(300.dp)
        .height(50.dp),onClick = {  regViewModel.RegisterUser(navController) },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black), shape = RoundedCornerShape(10.dp), elevation =  ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, disabledElevation = 0.dp))
    {
        Text(text = textButton,color = Color.White)
    }
}

@Composable
fun OutLineTextFieldEmail(textlabel:String,email:String,regViewModel: RegViewModel= viewModel()) {
//    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = email,
        label = { Text(text = textlabel) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        onValueChange = {
            regViewModel.updateEmail(it)
        }
    )
}
@Composable
fun OutLineTextFieldPassword(textlabel:String,password:String,regViewModel: RegViewModel= viewModel()) {
//    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = password,
        label = { Text(text = textlabel) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        onValueChange = {
            regViewModel.updatePassword(it)
        }
    )
}
@Composable
fun OutLineTextFieldName(textlabel:String,name:String,regViewModel: RegViewModel= viewModel()) {
//    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = name,
        label = { Text(text = textlabel) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        onValueChange = {
            regViewModel.newName(it)
        }
    )
}