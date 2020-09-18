package com.vn.ntesco.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.vn.ntesco.R
import com.vn.ntesco.utils.DimensionUtils

class ReportImageAdapter(val mContext: Context?) :RecyclerView.Adapter<ReportImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_img_product, parent, false))

    }

    override fun getItemCount(): Int {
        return 8;
    }

    override fun onBindViewHolder(viewHolder: ReportImageAdapter.ViewHolder, position: Int) {
        val layoutParams = viewHolder.itemView.getLayoutParams() as RecyclerView.LayoutParams
        val margin = mContext?.resources?.getDimensionPixelOffset(R.dimen.margin_big)
        val marginx = mContext?.resources?.getDimensionPixelOffset(R.dimen.margin_normal)
        layoutParams.width = (DimensionUtils.getWidthScreen() - (margin?.times(2)
                ?: 0) - (marginx?.times(2) ?: 0) - marginx!!) / 2
        layoutParams . height =((DimensionUtils.getWidthScreen() - (margin?.times(2)
                ?: 0) - (marginx?.times(2) ?: 0)) / 2  )*2/3
        viewHolder.itemView.layoutParams = layoutParams;
    }

    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        val ivReport: ImageView? =null

        init {
            //ivReport = v.findViewById(R.id.ivCheck)
        }

    }

}