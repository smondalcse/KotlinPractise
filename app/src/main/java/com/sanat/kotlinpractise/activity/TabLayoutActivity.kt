package com.sanat.kotlinpractise.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.sanat.kotlinpractise.R
import com.sanat.kotlinpractise.adapter.ViewPagerAdapter

class TabLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        val actionbar = supportActionBar
        actionbar!!.title = "Tab Layout"
        actionbar.setDisplayHomeAsUpEnabled(true)

        var images = listOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
        )

        val adapter = ViewPagerAdapter(images)
        val vpTest = findViewById<ViewPager2>(R.id.vpTest)
        vpTest.adapter = adapter

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        TabLayoutMediator(tabLayout, vpTest) {tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Log.i("TabLayoutActivity", "onTabSelected: ")
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Log.i("TabLayoutActivity", "onTabUnselected: ")
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Log.i("TabLayoutActivity", "onTabReselected: ")
            }
        })

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}