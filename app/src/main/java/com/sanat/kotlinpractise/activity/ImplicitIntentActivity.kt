package com.sanat.kotlinpractise.activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.sanat.kotlinpractise.R

class ImplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)

        val actionbar = supportActionBar
        actionbar!!.title = "ImplicitIntent"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val btnTakePhoto = findViewById<Button>(R.id.btnTakePhoto)
        btnTakePhoto.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).apply {
                this.type = "image/*"
                startActivityForResult(this, 0)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (resultCode == Activity.RESULT_OK && requestCode == 0) {
            val uri = intent?.data
            val imageView = findViewById<ImageView>(R.id.imageView)
            imageView.setImageURI(uri)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}