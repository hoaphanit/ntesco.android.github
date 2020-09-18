package com.vn.ntesco.views

import android.content.Context
import androidx.annotation.Nullable
import androidx.core.content.ContextCompat
import androidx.cardview.widget.CardView
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import com.vn.ntesco.R


class NTescoSwitchButton : FrameLayout {
    internal var clickListener: ClickListener? = null
    lateinit var tvLeft: TextView
    lateinit var tvRight: TextView
    lateinit var tvCenter: TextView

    var isDisable: Boolean = false
    var isLeft: Boolean = true
    fun setClickListener(clickListener: ClickListener) {
        this.clickListener = clickListener
    }

    constructor(context: Context) : super(context) {
        init(null)
    }

    constructor(context: Context, @Nullable attrs: AttributeSet) : super(context, attrs) {
        init(attrs)
    }

    constructor(context: Context, @Nullable attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(attrs)
    }


    fun init(attr: AttributeSet?) {
        val attributes = context.obtainStyledAttributes(attr, R.styleable.NTescoSwitchButton)
        val view = LayoutInflater.from(context).inflate(R.layout.switch_button_layout, this, false)
        tvLeft = view.findViewById(R.id.leftSwitchButton)
        tvRight = view.findViewById(R.id.rightSwitchButton)
        tvCenter = view.findViewById(R.id.centerSwitchButton)
        tvLeft.setText(attributes.getString(R.styleable.NTescoSwitchButton_left_text))
        tvRight.setText(attributes.getString(R.styleable.NTescoSwitchButton_right_text))
        if (attributes.getString(R.styleable.NTescoSwitchButton_center_text) != null &&
                !attributes.getString(R.styleable.NTescoSwitchButton_center_text).isEmpty()) {
            tvCenter.visibility = View.VISIBLE
            tvCenter.setText(attributes.getString(R.styleable.NTescoSwitchButton_center_text))
        }
        tvLeft.isSelected = true
        tvLeft.setOnClickListener(OnClickListener {
            if (isDisable) return@OnClickListener
            isLeft = true
            tvLeft.isSelected = true
            tvRight.isSelected = false
            if (tvCenter.visibility == View.VISIBLE)
                tvCenter.isSelected = false
            if (clickListener != null)
                clickListener?.onLeftClick()

        })
        tvRight.setOnClickListener(OnClickListener {
            if (isDisable) return@OnClickListener
            isLeft = false
            tvRight.isSelected = true
            tvLeft.isSelected = false
            if (tvCenter.visibility == View.VISIBLE)
                tvCenter.isSelected = false
            if (clickListener != null)
                clickListener?.onRightClick()
        })
        if(tvRight.visibility== View.VISIBLE){
            tvCenter.setOnClickListener(OnClickListener {
                if (isDisable) return@OnClickListener
                isLeft = false
                tvCenter.isSelected = true
                tvLeft.isSelected = false
                tvRight.isSelected = false
                if (clickListener != null)
                    clickListener?.onCenterClick()
            })
        }


        val width = attributes.getInt(R.styleable.NTescoSwitchButton_layout_weight, 0)

        when (width) {
            0 -> {
                val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                params.weight = 0f
                tvLeft.layoutParams = params
                tvRight.layoutParams = params
            }
            else -> {
                val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                params.weight = 1.0f
                tvLeft.layoutParams = params
                tvRight.layoutParams = params
            }
        }
        attributes.recycle()
        addView(view)
    }

    fun setLeftSelect() {
        tvLeft.setTextColor(ContextCompat.getColor(context, R.color.white))
        tvLeft.setBackgroundResource(R.drawable.bg_corner_red)
        tvRight.setTextColor(ContextCompat.getColor(context, R.color.black_49))
        tvRight.setBackgroundResource(0)
    }

    fun setRigtSelect() {
        tvLeft.setTextColor(ContextCompat.getColor(context, R.color.black_49))
        tvLeft.setBackgroundResource(0)
        tvRight.setTextColor(ContextCompat.getColor(context, R.color.white))
        tvRight.setBackgroundResource(R.drawable.bg_corner_red)
    }

    interface ClickListener {
        fun onRightClick()
        fun onLeftClick()
        fun onCenterClick()
    }
}