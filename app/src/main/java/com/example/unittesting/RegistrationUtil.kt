package com.example.unittesting

object RegistrationUtil {

    /**
     * the input is not valid if username/password are empty
     * **/


    fun validateLogin(userName: String, password: String): Boolean {
        if(userName.isEmpty() ||password.isEmpty()){
            return false
        }
        if(userName=="user" && password=="user"){
            return true
        }
        return true
    }

}