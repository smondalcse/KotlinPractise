package com.sanat.kotlinpractise.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.sanat.kotlinpractise.R

class ToolBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        val actionbar = supportActionBar
        actionbar!!.title = "ToolBar"
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.miSettings -> Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show()
            R.id.miFavorite -> Toast.makeText(this, "Favorite", Toast.LENGTH_LONG).show()
            R.id.miAddContact -> Toast.makeText(this, "AddContact", Toast.LENGTH_LONG).show()
            R.id.miFeedback -> Toast.makeText(this, "Feedback", Toast.LENGTH_LONG).show()
            R.id.miClose -> Toast.makeText(this, "Close", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}