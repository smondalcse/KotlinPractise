package com.sanat.kotlinpractise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var btnButton = findViewById<Button>(R.id.btnButton)
        btnButton.setOnClickListener {
            Intent(this, ButtonActivity::class.java).apply {
                startActivity(this)
            }
        }

        var btnTextView = findViewById<Button>(R.id.btnTextView)
        btnTextView.setOnClickListener {
            Intent(this, TextViewActivity::class.java).apply {
                startActivity(this)
            }
        }

        var btnEdittext = findViewById<Button>(R.id.btnEdittext)
        btnEdittext.setOnClickListener {
            Intent(this, EdittextActivity::class.java).apply {
                startActivity(this)
            }
        }

        var btnImageview = findViewById<Button>(R.id.btnImageview)
        btnImageview.setOnClickListener {
            Intent(this, ImageViewActivity::class.java).apply {
                startActivity(this)
            }
        }

        var btnCheckBox = findViewById<Button>(R.id.btnCheckBox)
        btnCheckBox.setOnClickListener {
            Intent(this, CheckboxRadioButtonActivity::class.java).apply {
                startActivity(this)
            }
        }

        var btnParams = findViewById<Button>(R.id.btnParams)
        btnParams.setOnClickListener {
            Intent(this, FirstParamsActivity::class.java).apply {
                startActivity(this)
            }
        }

        var btnPermission = findViewById<Button>(R.id.btnPermission)
        btnPermission.setOnClickListener {
            Intent(this, PermissionActivity::class.java).apply {
                startActivity(this)
            }
        }

        var btnToastContext = findViewById<Button>(R.id.btnToastContext)
        btnToastContext.setOnClickListener {

        }

        var btnImplicitIntent = findViewById<Button>(R.id.btnImplicitIntent)
        btnImplicitIntent.setOnClickListener {
            Intent(this, ImplicitIntentActivity::class.java).apply {
                startActivity(this)
            }
        }

        var btnToolBar = findViewById<Button>(R.id.btnToolBar)
        btnToolBar.setOnClickListener {

        }

        var btnAlertDialog = findViewById<Button>(R.id.btnAlertDialog)
        btnAlertDialog.setOnClickListener {

        }

        var btnFragment = findViewById<Button>(R.id.btnFragment)
        btnFragment.setOnClickListener {

        }

        var btnBottomNavigation = findViewById<Button>(R.id.btnBottomNavigation)
        btnBottomNavigation.setOnClickListener {

        }

        var btnRecycleView = findViewById<Button>(R.id.btnRecycleView)
        btnRecycleView.setOnClickListener {

        }

        var btnSharedPref = findViewById<Button>(R.id.btnSharedPref)
        btnSharedPref.setOnClickListener {

        }
    }
}