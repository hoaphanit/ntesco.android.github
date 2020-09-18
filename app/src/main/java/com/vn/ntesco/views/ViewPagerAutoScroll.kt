package com.vn.ntesco.views

import android.content.Context
import android.os.Handler
import androidx.viewpager.widget.ViewPager
import android.util.AttributeSet
import java.util.*

class ViewPagerAutoScroll(context: Context, attrs: AttributeSet?) : ViewPager(context, attrs) {
    var isDragging: Boolean = false
    var currentPage: Int = 0
    val DELAY: Long = 3000
    var handlerSwipe: Handler? = null
    var swipeTimer: Timer? = null

    init {
        init()
    }

    internal var runnable: Runnable? = Runnable {
        if (currentPage == adapter?.getCount()!! - 1) {
            currentPage = 0
        } else {
            currentPage++
        }
        setCurrentItem(currentPage, true)
    }

    fun init() {
        this.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {

            }

            override fun onPageSelected(p0: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {
                val index = currentItem
                //  WriteLog.e("index", index + " " + state);
                if (adapter?.getCount() === 0 || adapter?.getCount() === 1) return
                if (state == ViewPager.SCROLL_STATE_DRAGGING) {
                    if (index == 0 || index == adapter?.getCount()!! - 1) {
                        isDragging = true
                    }
                }
                if (state == ViewPager.SCROLL_STATE_IDLE && isDragging) {
                    if (index == 0) {
                        setCurrentItem(adapter?.getCount()!! - 1, true)
                        currentPage = currentItem
                    } else if (index == adapter?.getCount()!! - 1) {
                        setCurrentItem(0, true)
                        currentPage = currentItem
                    }
                    isDragging = false
                }

            }
        })

    }


    fun startAutoScroll() {
        handlerSwipe = Handler()
        swipeTimer = Timer()
        swipeTimer?.schedule(object : TimerTask() {
            override fun run() {
                handlerSwipe?.post(runnable)
            }
        }, DELAY, DELAY)
    }

    fun stopAutoScroll() {
        if (swipeTimer != null)
            swipeTimer?.cancel()
        if (handlerSwipe != null && runnable != null)
            handlerSwipe?.removeCallbacks(runnable)
    }
}