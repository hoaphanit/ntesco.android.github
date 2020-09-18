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
import com.vn.ntesco.utils.WriteLog

class CategoryAdapter(val mContext: Context?) : androidx.recyclerview.widget.RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    lateinit var itemClickListener: ItemClickListener
    var listCategory = ArrayList<Category>();
    var type = 1;
    fun setData(list: ArrayList<Category>) {
        listCategory = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return listCategory.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_category, parent, false))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.setOnClickListener(View.OnClickListener {
            itemClickListener?.onItemClick(listCategory?.get(position), position)
        })
        viewHolder.tvCategoryName.text = listCategory?.get(position).name
        if (type == 1)
            viewHolder.ivCategory.setImageResource(listCategory?.get(position).image)
        else
            Picasso.get().load(listCategory?.get(position).icon).placeholder(R.mipmap.default_banner).centerCrop().fit().into(viewHolder.ivCategory)
    }


    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        var ivCategory: ImageView
        var tvCategoryName: TextView

        init {
            ivCategory = v.findViewById(R.id.ivCategory)
            tvCategoryName = v.findViewById(R.id.tvCategoryName)
        }


    }

    fun setOnItemClickListener(itemClickListener: ItemClickListener) {
        this.itemClickListener = itemClickListener
    }
}