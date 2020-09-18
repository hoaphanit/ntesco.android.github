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
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.DimensionUtils
import retrofit2.Retrofit
import java.util.ArrayList

class PopularNewsAdapter(val mContext: Context) : androidx.recyclerview.widget.RecyclerView.Adapter<PopularNewsAdapter.ViewHolder>() {
    var postList: MutableList<Post> = ArrayList<Post>()
    lateinit var itemClickListener: ItemClickListener
    fun setOnItemClickListener(itemClickListener: ItemClickListener) {
        this.itemClickListener = itemClickListener
    }

    override fun getItemCount(): Int {
        return postList.size;
    }

    fun setData(mutableList: MutableList<Post>) {
        postList = mutableList;
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_popular_news, parent, false))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Picasso.get().load(postList[position].image).centerCrop().fit().placeholder(R.mipmap.default_banner).into(viewHolder.imageView)
        viewHolder.tvTitleNews.text = postList[position].name
        viewHolder.tvDateNews.text = postList[position].publishDate
        viewHolder.tvNumberView.text = postList[position].views.toString()
        viewHolder.itemView.setOnClickListener(View.OnClickListener {
            postList[position].views++
            notifyItemChanged(position)
            if (itemClickListener != null)
                itemClickListener.onItemClick(postList.get(position), position)
        })
    }


    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        var cardView: androidx.cardview.widget.CardView
        var imageView: ImageView
        var tvTitleNews: TextView
        var tvDateNews: TextView
        var tvNumberView: TextView

        init {
            cardView = v.findViewById(R.id.cardView)
            imageView = v.findViewById(R.id.ivHotNews)
            tvTitleNews = v.findViewById(R.id.tvTitleNews)
            tvDateNews = v.findViewById(R.id.tvDateNews)
            tvNumberView = v.findViewById(R.id.tvNumberView)

        }


    }
}