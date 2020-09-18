package com.vn.ntesco.views

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Typeface
import androidx.appcompat.widget.AppCompatTextView
import android.util.AttributeSet
import com.vn.ntesco.R

class NTesCoTextView: AppCompatTextView
{

    lateinit var mContext: Context
    lateinit var mAttribute: TypedArray

    enum class Font {
        Regular, Bold, BoldItalic, Italic, SemiBold
    }
    constructor(context: Context) : this(context, null){
        mContext = context
    }
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0){
        mContext = context
        init(context, attrs)

    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        mContext = context
        init(context, attrs)
    }

    /**
     * 初始化TabBar
     *
     * @param context 上下文
     * @param set     XML结点集合
     */
    private fun init(context: Context, set: AttributeSet?) {
        mContext = context
        mAttribute = context.obtainStyledAttributes(set, R.styleable.NTesCoTextView)
        if (mAttribute.length() > 0) {
            initFromAttribute()
        }
    }

  private fun initFromAttribute() {
        val font =
                Font.values()[mAttribute!!.getInt(R.styleable.NTesCoTextView_NTesCoTextViewFont, Font.Regular.ordinal)]
        var type = Typeface.createFromAsset(mContext!!.assets, "fonts/Open Sans Regular.ttf")
        when (font) {
            Font.Regular -> type =
                    Typeface.createFromAsset(mContext!!.assets, "fonts/Open Sans Regular.ttf")
            Font.Bold -> type =
                    Typeface.createFromAsset(mContext!!.assets, "fonts/Open Sans Bold.ttf")
            Font.Italic -> type =
                    Typeface.createFromAsset(mContext!!.assets, "fonts/Open Sans Italic.ttf")
            Font.BoldItalic -> type =
                    Typeface.createFromAsset(mContext!!.assets, "fonts/Open Sans Bold Italic.ttf")
            Font.SemiBold -> type =
                    Typeface.createFromAsset(mContext!!.assets, "fonts/OpenSans-SemiBold.ttf")
        }
        setTypeface(type)
    }
}