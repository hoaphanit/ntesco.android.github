package com.vn.ntesco.adapter

import android.content.Context
import androidx.viewpager.widget.ViewPager
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.vn.ntesco.R
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Post
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.DimensionUtils
import java.util.*

class HotNewsAdapter( val  mContext: Context) : RecyclerView.Adapter<HotNewsAdapter.ViewHolder>() {
    var postList : MutableList<Post> = ArrayList<Post>()
    lateinit var itemClickListener: ItemClickListener

    override fun getItemCount(): Int {
        return postList.size;
    }
    fun setData(mutableList: MutableList<Post>){
        postList  = mutableList;
        notifyDataSetChanged()
    }
    fun setOnItemClickListener(itemClickListener: ItemClickListener) {
        this.itemClickListener = itemClickListener
    }
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_hot_news, parent, false))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val layoutParams = viewHolder.cardView.getLayoutParams() as RecyclerView.LayoutParams
        layoutParams.width = (DimensionUtils.getWidthScreen() * 0.85).toInt()
        val margin = mContext.getResources().getDimensionPixelOffset(R.dimen.margin_small)
        layoutParams.setMargins(margin, 0, 0, 0)
        if (viewHolder.adapterPosition === getItemCount() - 1) {
            layoutParams.setMargins(margin, 0, margin, 0)
        }
        viewHolder.cardView.layoutParams = layoutParams;
        Picasso.get().load(postList.get(position).image).centerCrop().fit().placeholder(R.mipmap.default_banner).into(viewHolder.imageView)
        viewHolder.tvTitleNews.text=postList.get(position).name
        viewHolder.itemView.setOnClickListener(View.OnClickListener {
            if(itemClickListener!=null)
                itemClickListener.onItemClick(postList.get(position),position)
        })
    }


    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        var cardView: androidx.cardview.widget.CardView
        var imageView: ImageView
        var tvTitleNews: TextView
        init {
            cardView = v.findViewById(R.id.cardView)
            imageView = v.findViewById(R.id.ivHotNews)
            tvTitleNews = v.findViewById(R.id.tvTitleNews)

        }


    }

}