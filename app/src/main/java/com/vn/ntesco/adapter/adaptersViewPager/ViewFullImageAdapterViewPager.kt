package com.vn.ntesco.adapter.adaptersViewPager

import android.content.Context
import androidx.annotation.NonNull
import androidx.viewpager.widget.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.jsibbold.zoomage.ZoomageView
import com.squareup.picasso.Picasso
import com.vn.ntesco.R
import com.vn.ntesco.utils.WriteLog
import java.io.File

class ViewFullImageAdapterViewPager(private val mContext: Context,  var imageList:MutableList<String> ) : PagerAdapter() {
    var isCreateReport : Boolean = false;
    override fun instantiateItem(view: ViewGroup, position: Int): Any {
        val imageLayout = LayoutInflater.from(mContext).inflate(R.layout.view_image_layout, view, false)!!
        val imageView = imageLayout.findViewById(R.id.image_view_full) as ZoomageView
        if (!imageList[position].startsWith("http", true) && !imageList[position].startsWith("https", true)) {
            Picasso.get().load(File(imageList[position])).placeholder(R.mipmap.default_banner).into(imageView)
        } else {
            WriteLog.e("image ", imageList[position]);
            Picasso.get().load(imageList[position]).placeholder(R.mipmap.default_banner).into(imageView)
        }
        view.addView(imageLayout)
        return imageLayout
    }

    override fun getCount(): Int {
      if(isCreateReport) return imageList.size-1 else return imageList.size
    }

    override fun isViewFromObject(@NonNull view: View, @NonNull `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}