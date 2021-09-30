package com.example.unittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.example.unittesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding  //late initializtion of binding class for Applying View Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       //Using the Scope Function with() for better readability

        with(binding){

            btnLogin?.setOnClickListener {
                validation(user.text.toString(),password.text.toString())
            }
        }

    }

    //Validation of Login details
    private fun validation(user: String, password: String): String {
        return if(user == "user" && password == "user"){
            "Login was successful"
        }else{
            "Invalid Login"
        }

    }
}