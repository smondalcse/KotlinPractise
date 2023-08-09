package com.sanat.kotlinpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ImageViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        val imgProfile = findViewById<ImageView>(R.id.imgProfile)
        val btnProfile = findViewById<Button>(R.id.btnProfile)
        btnProfile.setOnClickListener {
            imgProfile.setImageResource(R.drawable.test)
        }

        val imgDocument = findViewById<ImageView>(R.id.imgDocument)
        val btnDocument = findViewById<Button>(R.id.btnDocument)
        btnDocument.setOnClickListener {
            imgDocument.setImageResource(R.drawable.profile)
        }
    }
}