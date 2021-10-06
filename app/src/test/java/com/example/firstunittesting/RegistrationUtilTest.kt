package com.example.firstunittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        var result = RegistrationUtil.registrationUtil(
            userName = "",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `valid username and correctly repeated password returns true`(){
        var result = RegistrationUtil.registrationUtil(
            userName = "Phillip",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isTrue()
       // assertThat("hello").isEqualTo("hello")
    }
    @Test
    fun `username already exists returns false`(){
        var result = RegistrationUtil.registrationUtil(
            userName = "Carl",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        var result = RegistrationUtil.registrationUtil(
            userName = "Phillip",
            password = "",
            confirmedPassword = ""
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `less than 2 digit password return false`(){
        var result = RegistrationUtil.registrationUtil(
            userName = "Phillip",
            password = "abcdeg5",
            confirmedPassword = "abcdeg5"
        )
        assertThat(result).isFalse()
    }

}