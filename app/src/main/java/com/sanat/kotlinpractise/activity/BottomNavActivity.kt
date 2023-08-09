package com.sanat.kotlinpractise.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sanat.kotlinpractise.R
import com.sanat.kotlinpractise.fragment.ContactFragment
import com.sanat.kotlinpractise.fragment.FavoriteFragment
import com.sanat.kotlinpractise.fragment.SettingsFragment

class BottomNavActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)

        val actionbar = supportActionBar
        actionbar!!.title = "BottomNav"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val settingsFragment = SettingsFragment()
        val favoriteFragment = FavoriteFragment()
        val contactFragment = ContactFragment()

        setCurrentFragment(settingsFragment)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener {item ->
            when (item.itemId) {
                R.id.navSettings -> setCurrentFragment(settingsFragment)
                R.id.navAddContact -> setCurrentFragment(contactFragment)
                R.id.navFavorite -> setCurrentFragment(favoriteFragment)
            }
            true
        }

        bottomNavigationView.getOrCreateBadge(R.id.navAddContact).apply {
            number = 10
            isVisible = true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}