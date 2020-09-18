package com.vn.ntesco.listener

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vn.ntesco.utils.Constant

abstract class EndlessRecyclerOnScrollListener : androidx.recyclerview.widget.RecyclerView.OnScrollListener {

    private var previousTotal = 0 // The total number of items in the dataset after the last load
    private var loading = true // True if we are still waiting for the last set of data to load.
    internal var firstVisibleItem: Int = 0
    internal var lastVisibleItem: Int = 0
    internal var visibleItemCount: Int = 0
    internal var totalItemCount: Int = 0

    private var currentPage = 0
    private var reverseScroll: Boolean = false
    private var isUseLinearLayoutManager: Boolean = false
    private var isUseGridLayoutManager: Boolean = false

    var linearLayoutManager: androidx.recyclerview.widget.RecyclerView.LayoutManager? = null

    constructor(linearLayoutManager: androidx.recyclerview.widget.LinearLayoutManager) {
        this.linearLayoutManager = linearLayoutManager
    }

    constructor(linearLayoutManager: androidx.recyclerview.widget.LinearLayoutManager, reverseScroll: Boolean) {
        this.linearLayoutManager = linearLayoutManager
        this.reverseScroll = reverseScroll
    }

    constructor(linearLayoutManager: androidx.recyclerview.widget.LinearLayoutManager, pager: Int) {
        this.linearLayoutManager = linearLayoutManager
        currentPage = pager
        isUseLinearLayoutManager = true
    }

    constructor(linearLayoutManager: androidx.recyclerview.widget.GridLayoutManager, pager: Int) {
        this.linearLayoutManager = linearLayoutManager
        currentPage = pager
        isUseGridLayoutManager = true
    }

    override fun onScrolled(recyclerView: androidx.recyclerview.widget.RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)
        visibleItemCount = recyclerView.getChildCount()
        totalItemCount = linearLayoutManager!!.getItemCount()
        /* firstVisibleItem = mLinearLayoutManager.findFirstVisibleItemPosition();
        lastVisibleItem = mLinearLayoutManager.findLastVisibleItemPosition();
*/
        if (isUseLinearLayoutManager && linearLayoutManager is androidx.recyclerview.widget.LinearLayoutManager) {
            firstVisibleItem = (linearLayoutManager as androidx.recyclerview.widget.LinearLayoutManager).findFirstVisibleItemPosition()
            lastVisibleItem = (linearLayoutManager as androidx.recyclerview.widget.LinearLayoutManager).findLastVisibleItemPosition()
        }

        if (isUseGridLayoutManager && linearLayoutManager is androidx.recyclerview.widget.GridLayoutManager) {
            firstVisibleItem = (linearLayoutManager as androidx.recyclerview.widget.GridLayoutManager).findFirstVisibleItemPosition()
            lastVisibleItem = (linearLayoutManager as androidx.recyclerview.widget.GridLayoutManager).findLastVisibleItemPosition()

        }

        if (loading) {
            if (totalItemCount > previousTotal) {
                loading = false
                previousTotal = totalItemCount
            }
        }
        if (!reverseScroll) {
            val visibleThreshold = 5
            if (!loading && totalItemCount <= lastVisibleItem + visibleThreshold && totalItemCount >= Constant.PAGE_SIZE * currentPage) {
                currentPage++
                onLoadMore(currentPage)
                loading = true
            }
        } else {
            if (!loading && firstVisibleItem <= visibleItemCount / 2 && dy < 0) {
                currentPage++
                onLoadMore(currentPage)
                loading = true
            }
        }
    }

    fun resetCurrentPage() {
        currentPage = Constant.DEFAULT_FIRST_PAGE
        previousTotal = 0
        loading = true
    }

    abstract fun onLoadMore(current_page: Int)

    companion object {
        var TAG = EndlessRecyclerOnScrollListener::class.java.simpleName
    }
}