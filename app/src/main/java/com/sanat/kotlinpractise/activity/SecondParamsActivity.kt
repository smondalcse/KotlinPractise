package com.sanat.kotlinpractise.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.sanat.kotlinpractise.R
import com.sanat.kotlinpractise.model.PersonModel

class SecondParamsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_params)

        val actionbar = supportActionBar
        actionbar!!.title = "SecondParams"
        actionbar.setDisplayHomeAsUpEnabled(true)

//        val name = intent.getStringExtra("Name")
//        val age = intent.getIntExtra("Age", 0)
//        val country = intent.getStringExtra("Country")
//

        val person  = intent.getSerializableExtra("Person") as PersonModel
        val name = person.name
        val age = person.age
        val country = person.country

        val infoString = "Name: $name\nAge: $age\nCountry: $country"

        val txtParamValue = findViewById<TextView>(R.id.txtParamValue)
        txtParamValue.text = infoString


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}