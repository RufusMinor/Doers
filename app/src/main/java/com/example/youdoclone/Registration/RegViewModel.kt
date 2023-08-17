package com.example.youdoclone.Registration

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import java.lang.IllegalArgumentException


class RegViewModel :ViewModel(){






    private val _email=MutableLiveData("")
    val email :LiveData<String> = _email

    private val _password=MutableLiveData("")
    val password:LiveData<String> = _password

    private val _name=MutableLiveData("")
    val name:LiveData<String> = _name


    fun updateEmail(newEmail:String){
        _email.value=newEmail
    }

    fun updatePassword(newPassword:String){
        _password.value=newPassword
    }

    fun newName(newName:String){
        _name.value=newName
    }


    fun RegisterUser(navController: NavController){


           var reg: FirebaseAuth=Firebase.auth

        val email:String = _email.value?:throw IllegalArgumentException("email expected")
        val password:String=_password.value?:throw IllegalArgumentException("password expected")
        val name:String=_name.value?:throw IllegalArgumentException("name expected")

        reg.createUserWithEmailAndPassword(email,password).addOnCompleteListener{
            if(it.isSuccessful){
                navController.navigate(RegNav.MainScreen.route)

            }
            else{
                //Если регистрация не прошла
            }
        }

    }



}