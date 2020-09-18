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
import com.vn.ntesco.model.Category
import java.io.File

class ReportUploadImages(val mContext: Context?) : RecyclerView.Adapter<ReportUploadImages.ViewHolder>() {
    lateinit var itemClickListener: ItemClickListener
    var listImages: MutableList<String>
    init {
        listImages = ArrayList()
    }
    fun setData(list: ArrayList<String>) {
        listImages = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return listImages.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_image_report, parent, false))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        if (!listImages[position].isEmpty()) {
            if (!listImages[position].startsWith("http|https", true)) {
                Picasso.get().load(File(listImages[position])).fit().centerCrop().placeholder(R.mipmap.default_banner).into(viewHolder.ivReport)
            } else {
                Picasso.get().load(listImages[position]).fit().centerCrop().placeholder(R.mipmap.default_banner).into(viewHolder.ivReport)
            }
            viewHolder.ivClose.visibility= View.VISIBLE
            viewHolder.ivClose.setOnClickListener {
                listImages.removeAt(position)
                notifyDataSetChanged()
            }
        } else {
            Picasso.get().load(R.mipmap.add_image).fit().centerCrop().into(viewHolder.ivReport)
            viewHolder.ivClose.visibility= View.GONE
        }
        viewHolder.itemView.setOnClickListener(View.OnClickListener {
            if (itemClickListener != null)
                itemClickListener!!.onItemClick(listImages!!.get(position), position)
        })

    }


    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        var ivReport: ImageView
        var ivClose: ImageView
        init {
            ivReport = v.findViewById(R.id.ivReport)
            ivClose = v.findViewById(R.id.ivClose)
        }


    }

    fun setOnItemClickListener(itemClickListener: ItemClickListener) {
        this.itemClickListener = itemClickListener
    }
}