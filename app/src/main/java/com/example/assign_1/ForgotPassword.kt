package com.example.assign_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val backbtn: TextView = findViewById(R.id.donthave)

        backbtn.setOnClickListener {
            // Define the destination activity
            val intent = Intent(this, Login__screen::class.java)

            // Start the next activity
            startActivity(intent)
        }

        var sendbtn: Button = findViewById(R.id.signupButton)
        sendbtn.setOnClickListener{

            val intent = Intent(this, Reset_Password ::class.java)

            // Start the next activity
            startActivity(intent)

        }

    }

}