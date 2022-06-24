package com.example.tablayoutexample

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.title = "TabLayout"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        tabLayout = findViewById(R.id.tabLayout)

        viewPager.adapter = PagerAdapter(this)
        TabLayoutMediator(tabLayout, viewPager) { tab, index ->
            if (index == 0) {
                tab.setIcon(R.drawable.ic_baseline_calendar_month_24)
            } else {
                tab.setIcon(R.drawable.ic_baseline_home_24)
            }
            tab.text = when (index) {
                0 -> {
                    "Calendar View"
                }
                1 -> {
                    "Home"
                }
                else -> {
                    throw Resources.NotFoundException("position not found")
                }

            }


        }.attach()


    }
}
