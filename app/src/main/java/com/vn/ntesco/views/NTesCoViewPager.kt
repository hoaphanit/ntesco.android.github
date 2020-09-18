package com.vn.ntesco.views

import android.content.Context
import androidx.viewpager.widget.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

class NTesCoViewPager(context: Context, attrs: AttributeSet?) : ViewPager(context, attrs) {
    private var swipeEnabled = false

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return if (swipeEnabled) {
            super.onTouchEvent(event)
        } else false

    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return if (swipeEnabled) {
            super.onInterceptTouchEvent(event)
        } else false

    }

    fun setPagingEnabled(enabled: Boolean) {
        this.swipeEnabled = enabled
    }
}