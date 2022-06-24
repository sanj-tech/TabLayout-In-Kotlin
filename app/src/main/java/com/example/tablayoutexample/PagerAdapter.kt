package com.example.tablayoutexample

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount()=2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{CalendarFragment()}
            1->{ListFragment()}
            else -> {throw Resources.NotFoundException("position not found")
            }
        }
    }
}