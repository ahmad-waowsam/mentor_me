package com.example.assign_1

import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.TextView  // Import TextView class
import androidx.appcompat.app.AppCompatActivity
import com.example.assign_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        setContentView(R.layout.activity_main)

        val textViewMentor: TextView = findViewById(R.id.textViewMentor)

        textViewMentor.setOnClickListener {
            // Define the destination activity
            val intent = Intent(this, Login__screen::class.java)

            // Start the next activity
            startActivity(intent)
        }

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        val screenWidth = displayMetrics.widthPixels
        val screenHeight = displayMetrics.heightPixels


    }
}
