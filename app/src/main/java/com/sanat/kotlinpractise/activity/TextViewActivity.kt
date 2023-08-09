package com.sanat.kotlinpractise.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.sanat.kotlinpractise.R

class TextViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)

        val actionbar = supportActionBar
        actionbar!!.title = "TextView"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val txtView = findViewById<TextView>(R.id.txtTextview)
        var count = 1
        txtView.text = "The value of count is : $count"
        val btnCount = findViewById<Button>(R.id.btnCount)
        btnCount.setOnClickListener {
            count++;
            txtView.text = "The value of count is : $count"
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}