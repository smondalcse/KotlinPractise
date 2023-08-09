package com.sanat.kotlinpractise.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.sanat.kotlinpractise.R

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        val actionbar = supportActionBar
        actionbar!!.title = "Toast"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val btnShowToast = findViewById<Button>(R.id.btnShowToast)
        val clToast = findViewById<LinearLayout>(R.id.clToast)
        btnShowToast.setOnClickListener {
            //Toast.makeText(this, "Hi, I am a toast", Toast.LENGTH_LONG).show()

            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view  = layoutInflater.inflate(R.layout.custome_toast, clToast)
                show()
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}