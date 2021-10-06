package com.example.firstunittesting

object RegistrationUtil {

    private val existingUser = listOf("Carl","Peter")

    /*
    * the input is not valid if....
    * ...the username/password is empty
    * ...the username is already taken
    * ...confirm password is not equal to password
    * ...the password contains 2 digits
    */

    fun registrationUtil(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean{
        if (userName.isEmpty() || password.isEmpty()){
            return false
        }
        if (userName in existingUser){
            return false
        }
        if (password != confirmedPassword){
            return false
        }
        if (password.count { it.isDigit()}<2){
            return false
        }
        return true
    }
}