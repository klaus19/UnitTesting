package com.example.unittesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username but valid password returns false`(){

        val result = RegistrationUtil.validateLogin(
            "","user"
        )
        assertThat(result).isFalse()  //usage of Google's truth library to assert that result will be false as predetermined
    }

    @Test
    fun `valid username but empty password returns false`(){
        val result = RegistrationUtil.validateLogin(
            "user",""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty username and empty password returns false`(){
        val result = RegistrationUtil.validateLogin("","")
        assertThat(result).isFalse()
    }

    @Test
    fun `correct username and password returns true`(){
        val result = RegistrationUtil.validateLogin("user","user")
        assertThat(result).isTrue()
    }

}