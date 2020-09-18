package com.vn.ntesco.views

import android.content.Context
import androidx.annotation.Nullable
import androidx.viewpager.widget.ViewPager
import android.util.AttributeSet
import android.view.View

class CustomeViewPager: ViewPager {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, @Nullable attrs: AttributeSet) : super(context, attrs) {
    }

    override fun requestChildFocus(child: View, focused: View) {
        //Do nothing, disables automatic focus behaviour

    }

}