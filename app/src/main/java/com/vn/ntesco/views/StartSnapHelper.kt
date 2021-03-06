package com.vn.ntesco.views

import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import android.view.View


class StartSnapHelper : androidx.recyclerview.widget.LinearSnapHelper() {
    private var mVerticalHelper: androidx.recyclerview.widget.OrientationHelper? = null
    private var mHorizontalHelper: androidx.recyclerview.widget.OrientationHelper? = null

    override fun attachToRecyclerView(recyclerView: androidx.recyclerview.widget.RecyclerView?) {
        super.attachToRecyclerView(recyclerView)
    }

    override fun calculateDistanceToFinalSnap(@NonNull layoutManager: androidx.recyclerview.widget.RecyclerView.LayoutManager,
                                              @NonNull targetView: View): IntArray {
        val out = IntArray(2)

        if (layoutManager.canScrollHorizontally()) {
            out[0] = distanceToStart(targetView, getHorizontalHelper(layoutManager)!!)
        } else {
            out[0] = 0
        }

        if (layoutManager.canScrollVertically()) {
            out[1] = distanceToStart(targetView, getVerticalHelper(layoutManager)!!)
        } else {
            out[1] = 0
        }
        return out
    }

    override fun findSnapView(layoutManager: androidx.recyclerview.widget.RecyclerView.LayoutManager): View? {

        return if (layoutManager is androidx.recyclerview.widget.LinearLayoutManager) {

            if (layoutManager.canScrollHorizontally()) {
                getStartView(layoutManager, getHorizontalHelper(layoutManager))
            } else {
                getStartView(layoutManager, getVerticalHelper(layoutManager))
            }
        } else super.findSnapView(layoutManager)

    }

    private fun distanceToStart(targetView: View, helper: androidx.recyclerview.widget.OrientationHelper): Int {
        return helper.getDecoratedStart(targetView) - helper.getStartAfterPadding()
    }

    private fun getStartView(layoutManager: androidx.recyclerview.widget.RecyclerView.LayoutManager,
                             helper: androidx.recyclerview.widget.OrientationHelper?): View? {

        if (layoutManager is androidx.recyclerview.widget.LinearLayoutManager) {
            val firstChild = (layoutManager as androidx.recyclerview.widget.LinearLayoutManager).findFirstVisibleItemPosition()

            val isLastItem = (layoutManager as androidx.recyclerview.widget.LinearLayoutManager)
                    .findLastCompletelyVisibleItemPosition() === layoutManager.getItemCount() - 1

            if (firstChild == androidx.recyclerview.widget.RecyclerView.NO_POSITION || isLastItem) {
                return null
            }

            val child = layoutManager.findViewByPosition(firstChild)

            return if (helper!!.getDecoratedEnd(child) >= helper!!.getDecoratedMeasurement(child) / 2 && helper!!.getDecoratedEnd(child) > 0) {
                child
            } else {
                if ((layoutManager as androidx.recyclerview.widget.LinearLayoutManager).findLastCompletelyVisibleItemPosition() === layoutManager.getItemCount() - 1) {
                    null
                } else {
                    layoutManager.findViewByPosition(firstChild + 1)
                }
            }
        }

        return super.findSnapView(layoutManager)
    }

    private fun getVerticalHelper(layoutManager: androidx.recyclerview.widget.RecyclerView.LayoutManager): androidx.recyclerview.widget.OrientationHelper? {
        if (mVerticalHelper == null) {
            mVerticalHelper = androidx.recyclerview.widget.OrientationHelper.createVerticalHelper(layoutManager)
        }
        return mVerticalHelper
    }

    private fun getHorizontalHelper(layoutManager: androidx.recyclerview.widget.RecyclerView.LayoutManager): androidx.recyclerview.widget.OrientationHelper? {
        if (mHorizontalHelper == null) {
            mHorizontalHelper = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(layoutManager)
        }
        return mHorizontalHelper
    }
}