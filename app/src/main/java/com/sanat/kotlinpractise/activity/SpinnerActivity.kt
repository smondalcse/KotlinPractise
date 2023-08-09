package com.sanat.kotlinpractise.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.sanat.kotlinpractise.R

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val actionbar = supportActionBar
        actionbar!!.title = "Spinner"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val country = listOf("Bangladesh", "India", "Australia", "Nepal", "Bhutan")
        val adapter = ArrayAdapter<String>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, country)
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, postion: Int, id: Long) {
                Toast.makeText(this@SpinnerActivity, "you selected ${adapterView?.getItemAtPosition(postion).toString()}",
                    Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}