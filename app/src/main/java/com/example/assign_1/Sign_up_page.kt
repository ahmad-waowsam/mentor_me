package com.example.assign_1

import SelectionResultActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class Sign_up_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)


// Combine the arrays
        val countries = resources.getStringArray(R.array.countries)

        val autoCompleteTextView: AutoCompleteTextView = findViewById(R.id.country_edit_text)
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, countries)
        autoCompleteTextView.setAdapter(adapter)

        // Set item click listener
        autoCompleteTextView.setOnItemClickListener { _, _, position, _ ->
            val selectedCountry = adapter.getItem(position).toString()

            // Open the selection result activity
            val intent = Intent(this, SelectionResultActivity::class.java)
            intent.putExtra("selectedCountry", selectedCountry)
            startActivity(intent)
        }
    }
}