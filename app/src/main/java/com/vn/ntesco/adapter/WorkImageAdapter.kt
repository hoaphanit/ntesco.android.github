package com.vn.ntesco.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import com.vn.ntesco.R
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.RawWaterType
import com.vn.ntesco.utils.DimensionUtils
import com.vn.ntesco.utils.WriteLog
import java.io.File

class WorkImageAdapter(val mContext: Context?) : androidx.recyclerview.widget.RecyclerView.Adapter<WorkImageAdapter.ViewHolder>() {
    var dataList: MutableList<String> = ArrayList<String>()
    var itemClickListener : ItemClickListener? = null;

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_img_product, parent, false))

    }

    override fun getItemCount(): Int {
        return dataList.size;
    }

    override fun onBindViewHolder(viewHolder: WorkImageAdapter.ViewHolder, position: Int) {
        val layoutParams = viewHolder.itemView.getLayoutParams() as RecyclerView.LayoutParams
        val margin = mContext?.resources?.getDimensionPixelOffset(R.dimen.margin_big)
        val marginx = mContext?.resources?.getDimensionPixelOffset(R.dimen.margin_normal)
        layoutParams.width = (DimensionUtils.getWidthScreen() - (margin?.times(2)
                ?: 0) - (marginx?.times(2) ?: 0) - marginx!!) / 2
        layoutParams.height = ((DimensionUtils.getWidthScreen() - (margin?.times(2)
                ?: 0) - (marginx?.times(2) ?: 0)) / 2) * 2 / 3
        viewHolder.itemView.layoutParams = layoutParams;
        WriteLog.e("listimage", dataList[position])
        Glide.with(mContext!!).load(dataList[position].trim()).placeholder(R.mipmap.default_banner).into(viewHolder.ivProduct)
        viewHolder.itemView.setBackgroundResource(R.drawable.bg_border_grey)
        if (!dataList[position].isEmpty()) {
            if (!dataList[position].startsWith("http", true) && !dataList[position].startsWith("https", true)) {
                Picasso.get().load(File(dataList[position])).fit().centerCrop().into(viewHolder.ivProduct)
            } else {
                Picasso.get().load(dataList[position]).fit().centerCrop().into(viewHolder.ivProduct)
            }
        }
        viewHolder.itemView.setOnClickListener {
            itemClickListener?.onItemClick(dataList[position],position)
        }
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        lateinit var ivProduct: ImageView

        init {
            ivProduct = v.findViewById(R.id.ivProduct)
        }

    }

}