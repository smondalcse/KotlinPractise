package com.sanat.kotlinpractise.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.sanat.kotlinpractise.R

class SharedPreferenceActivity : AppCompatActivity() {
    private val TAG = "SharedPreferenceActivit"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        val actionbar = supportActionBar
        actionbar!!.title = "Shared Preference"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        editor.apply {
            putString("Name", "Sanat Mondal")
            putInt("Age", 35)
            putBoolean("MaritalStatus", true)
            apply()
        }

        val pName = sharedPref.getString("Name", "")
        val pAge = sharedPref.getInt("Age", 0)
        val pMaritalStatus = sharedPref.getBoolean("MaritalStatus", false)

        val txtHello = findViewById<TextView>(R.id.txtHello)

        val msg = "I am $pName, $pAge years old and my marital status is  $pMaritalStatus"
        txtHello.text = msg

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}