package com.sanat.kotlinpractise.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.sanat.kotlinpractise.R
import com.sanat.kotlinpractise.model.PersonModel

class FirstParamsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_params)

        val actionbar = supportActionBar
        actionbar!!.title = "FirstParams"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val btnApply = findViewById<Button>(R.id.btnApply)
        btnApply.setOnClickListener {
            val  etName = findViewById<EditText>(R.id.etName)
            val  etAge = findViewById<EditText>(R.id.etAge)
            val  etCountry = findViewById<EditText>(R.id.etCountry)

            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()

            val person = PersonModel(name, age, country)

            Intent(this, SecondParamsActivity::class.java).apply {
//                this.putExtra("Name", name)
//                this.putExtra("Age", age)
//                this.putExtra("Country", country)

                this.putExtra("Person", person)

                startActivity(this)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}