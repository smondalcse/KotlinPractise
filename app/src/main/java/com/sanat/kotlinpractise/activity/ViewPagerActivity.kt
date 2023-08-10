package com.sanat.kotlinpractise.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.sanat.kotlinpractise.R
import com.sanat.kotlinpractise.adapter.ViewPagerAdapter

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val actionbar = supportActionBar
        actionbar!!.title = "ViewPager"
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

        /* orientation change */
        vpTest.orientation = ViewPager2.ORIENTATION_VERTICAL

        /*  Automatic drag  */
        vpTest.beginFakeDrag()
        vpTest.fakeDragBy(-10f)
        vpTest.endFakeDrag()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}