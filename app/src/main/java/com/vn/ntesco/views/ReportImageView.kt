package com.vn.ntesco.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.annotation.Nullable
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vn.ntesco.R

class ReportImageView : FrameLayout {
    lateinit var ivPrevious: ImageView
    lateinit var ivNext: ImageView
    lateinit var rvImageReport: RecyclerView
    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, @Nullable attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, @Nullable attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init()
    }

    fun init() {
        val view = LayoutInflater.from(context).inflate(R.layout.report_image_layout, this, false)
        rvImageReport = view.findViewById(R.id.rvImageReport)
        ivPrevious = view.findViewById(R.id.ivPrevious)
        ivNext = view.findViewById(R.id.ivNext)
        rvImageReport.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val numItems = recyclerView.getAdapter()?.getItemCount();
                if (numItems!! >= 3) {
                    val layoutManager = recyclerView.getLayoutManager() as androidx.recyclerview.widget.LinearLayoutManager;
                    val pos = layoutManager?.findLastCompletelyVisibleItemPosition();
                    if (pos == 0) {
                        ivPrevious.visibility = View.GONE
                    } else {
                        ivPrevious.visibility = View.VISIBLE
                    }
                    if (pos + 1 >= numItems!!) {
                        ivNext.visibility = View.GONE
                    } else {
                        ivNext.visibility = View.VISIBLE
                    }
                } else {
                    ivPrevious.visibility = View.GONE
                    ivNext.visibility = View.GONE
                }
            }
        })
        addView(view)
    }

    public fun initRecyclerView( adt:RecyclerView.Adapter<out RecyclerView.ViewHolder>) {
        rvImageReport.apply {
            setHasFixedSize(true)
            adapter = adt
            layoutManager = LinearLayoutManager(context, GridLayoutManager.HORIZONTAL, false)
        }
    }

}
