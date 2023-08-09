package com.sanat.kotlinpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class EdittextActivity : AppCompatActivity() {
    private val TAG = "MainActivity2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edittext)
        val etFirstName = findViewById<EditText>(R.id.etFirstName)
        val etLastName = findViewById<EditText>(R.id.etLastName)
        val etBirthDay = findViewById<EditText>(R.id.etBirthDay)
        val etCountry = findViewById<EditText>(R.id.etCountry)
        val btnApply = findViewById<Button>(R.id.btnApply)
        btnApply.setOnClickListener {
            Log.i(TAG, "btn apply: ")
            val firstName  = etFirstName.text
            val lastName  = etLastName.text
            val birthDay  = etBirthDay.text
            val country  = etCountry.text

            Log.i(TAG, "first name: $firstName")
            Log.i(TAG, "last name: $lastName")
            Log.i(TAG, "birth day: $birthDay")
            Log.i(TAG, "country: $country")
        }
    }
}