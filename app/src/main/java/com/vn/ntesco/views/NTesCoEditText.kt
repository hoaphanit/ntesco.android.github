package com.vn.ntesco.views

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Typeface
import androidx.annotation.Nullable
import androidx.appcompat.widget.AppCompatEditText
import android.util.AttributeSet
import android.widget.EditText
import com.vn.ntesco.R

class NTesCoEditText :AppCompatEditText {


    lateinit var mContext: Context
    lateinit var mAttribute: TypedArray

    enum class Font {
        Regular, Bold, BoldItalic, Italic, SemiBold
    }

    constructor(context: Context) : super(context) {}

    constructor(context: Context, @Nullable attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, @Nullable attrs: AttributeSet, defStyleAttr: Int) : super(
            context,
            attrs,
            defStyleAttr
    ) {
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
        mAttribute = context.obtainStyledAttributes(set, R.styleable.NTesCoEditText)
        if (mAttribute.length() > 0) {
            initFromAttribute()
        }
    }

    private fun initFromAttribute() {
        val font =
                Font.values()[mAttribute!!.getInt(R.styleable.NTesCoEditText_NTesCoEditTextFont, Font.Regular.ordinal)]
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