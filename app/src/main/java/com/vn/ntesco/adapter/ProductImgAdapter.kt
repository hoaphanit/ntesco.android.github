package com.vn.ntesco.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.vn.ntesco.R
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Notification
import com.vn.ntesco.utils.DimensionUtils

class ProductImgAdapter(val mContext: Context) : androidx.recyclerview.widget.RecyclerView.Adapter<ProductImgAdapter.ViewHolder>() {

    lateinit var itemClickListener: ItemClickListener
    var images = ArrayList<String>()
    var posSelect = 0
    override fun getItemCount(): Int {
        return images.size;
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_img_product, parent, false))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.setOnClickListener(View.OnClickListener {
            itemClickListener?.let {
                posSelect = position
                notifyDataSetChanged()
                it.onItemClick(images[position], position)
            }
        })
        val layoutParams = viewHolder.itemView.getLayoutParams() as androidx.recyclerview.widget.RecyclerView.LayoutParams
        val margin = mContext.resources.getDimensionPixelOffset(R.dimen.margin_big)
        if (posSelect == position) {
            viewHolder.itemView.setBackgroundResource(R.drawable.bg_border_orange)
        }else{
            viewHolder.itemView.setBackgroundResource(R.drawable.bg_border_grey)

        }
        layoutParams.width = (DimensionUtils.getWidthScreen() - margin * 2) / 4
        viewHolder.itemView.layoutParams = layoutParams;
        Picasso.get().load(images[position]).fit().centerCrop().into(viewHolder.ivProduct)

    }


    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        var ivProduct: ImageView

        init {
            ivProduct = v.findViewById(R.id.ivProduct)
        }

    }

    fun setOnItemClickListener(itemClickListener: ItemClickListener) {
        this.itemClickListener = itemClickListener
    }
}