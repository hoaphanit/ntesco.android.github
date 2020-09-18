package com.vn.ntesco.adapter.adaptersViewPager

import android.content.Context
import android.graphics.ColorSpace
import androidx.annotation.NonNull
import androidx.viewpager.widget.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.vn.ntesco.R
import com.vn.ntesco.model.Banner

class HomeAdapterViewPager(private val mContext: Context) : PagerAdapter() {
    var bannerList : MutableList<Banner>? =  ArrayList<Banner>()
    override fun instantiateItem(view : ViewGroup, position: Int): Any {
        val imageLayout = LayoutInflater.from(mContext).inflate(R.layout.item_home_banner, view, false)!!
        val imageView = imageLayout.findViewById(R.id.ivBanner) as ImageView
        Picasso.get().load(bannerList?.get(position)?.image).centerCrop().fit().placeholder(R.mipmap.default_banner).into(imageView)
        view.addView(imageLayout)
        return imageLayout
    }

    override fun getCount(): Int {
        return bannerList?.size ?:0
    }

    override fun isViewFromObject(@NonNull view: View, @NonNull `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}