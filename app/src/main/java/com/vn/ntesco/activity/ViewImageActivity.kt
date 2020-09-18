package com.vn.ntesco.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import android.widget.ImageView
import com.vn.ntesco.R
import com.vn.ntesco.adapter.adaptersViewPager.ViewFullImageAdapterViewPager
import com.vn.ntesco.base.BaseActivity
import com.vn.ntesco.utils.Constant
import kotlinx.android.synthetic.main.activity_view_image.*

class ViewImageActivity : BaseActivity() {
    lateinit var viewFullImageAdapterViewPager: ViewFullImageAdapterViewPager
    override fun getLayoutResource(): Int {
        return R.layout.activity_view_image
    }

    override fun setBody(savedInstanceState: Bundle?) {
        window.statusBarColor = ContextCompat.getColor(this, R.color.black);
        var listImage: MutableList<String> = ArrayList<String>()
        if (intent.getStringArrayListExtra(Constant.LIST_IMAGE) != null) {
            listImage = intent.getStringArrayListExtra(Constant.LIST_IMAGE)
        }
        viewFullImageAdapterViewPager = ViewFullImageAdapterViewPager(this, listImage)
        viewFullImageAdapterViewPager.isCreateReport = intent.getBooleanExtra(Constant.IS_CREATE_REPORT, false)
        vpViewImage.offscreenPageLimit = if (listImage.size > 1) listImage.size-1 else listImage.size
        vpViewImage.apply {
            adapter = viewFullImageAdapterViewPager
        }
        vpViewImage.currentItem = intent.getIntExtra(Constant.POSITION, 0)
        circleIndicator.setViewPager(vpViewImage)
        ivBack.setOnClickListener {
            finish()
        }
    }


}