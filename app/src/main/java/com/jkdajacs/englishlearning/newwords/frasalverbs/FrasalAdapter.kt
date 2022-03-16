package com.jkdajacs.englishlearning.newwords.frasalverbs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.jkdajacs.englishlearning.newwords.frasalverbs.fragments.FrasalVerbsFragment
import com.jkdajacs.englishlearning.newwords.frasalverbs.fragments.PopularExpressionsFragment

class FrasalAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FrasalVerbsFragment()
            else -> PopularExpressionsFragment()
        }
    }
}