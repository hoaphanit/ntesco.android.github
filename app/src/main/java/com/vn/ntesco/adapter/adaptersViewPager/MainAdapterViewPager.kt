package com.vn.ntesco.adapter.adaptersViewPager

//import android.support.v4.app.Fragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.util.ArrayList

class MainAdapterViewPager(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val mFragmentList = ArrayList<Fragment>()

    override fun getCount(): Int {
        return mFragmentList.size
    }


    override fun getItem(i: Int): Fragment {
        return mFragmentList.get(i)
    }

    fun addFragment(fragment: Fragment) {
        mFragmentList.add(fragment)
    }

}