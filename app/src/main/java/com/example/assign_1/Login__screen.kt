package com.example.assign_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login__screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login__screen)

        var sendbtn: Button = findViewById(R.id.loginButton)
        sendbtn.setOnClickListener{

            val intent = Intent(this, HomeFragment ::class.java)

            // Start the next activity
            startActivity(intent)

        }

        val backbtn: TextView = findViewById(R.id.Signup)

        backbtn.setOnClickListener {
            // Define the destination activity
            val intent = Intent(this, Sign_up_page::class.java)

            // Start the next activity
            startActivity(intent)
        }



    }
}