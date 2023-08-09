package com.sanat.kotlinpractise.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.sanat.kotlinpractise.R


class ButtonActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        val actionbar = supportActionBar
        actionbar!!.title = "Button"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val etHeight = findViewById<EditText>(R.id.etHeight);
        val etWidth = findViewById<EditText>(R.id.etWidth);
        val btnArea = findViewById<Button>(R.id.btnArea);
        val txtArea = findViewById<TextView>(R.id.txtArea);
        btnArea.setOnClickListener{

            if (TextUtils.isEmpty(etHeight.text.toString())){
                Toast.makeText(this, "Enter Height", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (TextUtils.isEmpty(etWidth.text.toString())){
                Toast.makeText(this, "Enter Width", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val height = etHeight.text.toString().toInt();
            val width = etWidth.text.toString().toInt();

            txtArea.text = add(height, width).toString()
        }

    }

    private fun add(height: Int, width: Int): Int{
        var area: Int = 0;
        area = height * width;
        return area;
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}