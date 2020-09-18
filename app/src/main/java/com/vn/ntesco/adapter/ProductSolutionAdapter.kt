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
import com.vn.ntesco.model.Product
import com.vn.ntesco.utils.DimensionUtils
import com.vn.ntesco.utils.WriteLog

class ProductSolutionAdapter(val mContext: Context) : androidx.recyclerview.widget.RecyclerView.Adapter<ProductSolutionAdapter.ViewHolder>() {

    lateinit var itemClickListener: ItemClickListener
    lateinit var productList : MutableList<Product>
    init {
        productList = ArrayList<Product>()
    }

    override fun getItemCount(): Int {
        return productList.size;
    }
    fun setData(productList: ArrayList<Product>){
        this.productList = productList
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_product_solution, parent, false))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.setOnClickListener(View.OnClickListener {
            itemClickListener?.onItemClick(productList.get(position).name, position)
        })
        val layoutParams = viewHolder.itemView.getLayoutParams() as androidx.recyclerview.widget.RecyclerView.LayoutParams
        val margin = mContext.resources.getDimensionPixelOffset(R.dimen.margin_big)
        layoutParams.width = (DimensionUtils.getWidthScreen() - margin * 2) / 3
        viewHolder.itemView.layoutParams = layoutParams;
        viewHolder.tvCategoryName.text = productList.get(position).name
        Picasso.get().load(productList.get(position)?.image).centerCrop().fit().placeholder(R.mipmap.default_banner).into(viewHolder.ivProduct)
        WriteLog.e("product name::::", viewHolder.tvCategoryName.text.toString())
    }



    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        var ivProduct: ImageView
        var tvCategoryName: TextView

        init {
            ivProduct = v.findViewById(R.id.ivProduct)
            tvCategoryName = v.findViewById(R.id.tvCategoryName)
        }

    }

    fun setOnItemClickListener(itemClickListener: ItemClickListener) {
        this.itemClickListener = itemClickListener
    }
}