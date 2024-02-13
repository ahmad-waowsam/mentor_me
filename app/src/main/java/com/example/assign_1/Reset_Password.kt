package com.example.assign_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Reset_Password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val backbtn: TextView = findViewById(R.id.donthave)

        backbtn.setOnClickListener {
            // Define the destination activity
            val intent = Intent(this, ForgotPassword::class.java)

            // Start the next activity
            startActivity(intent)
        }
        

    }
}