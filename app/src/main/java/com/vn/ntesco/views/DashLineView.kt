package com.vn.ntesco.views

import android.R
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View


class DashLineView : View {
    private var density = 0f
    private var paint: Paint? = null
    private var path: Path? = null
    private var effects: PathEffect? = null

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {
        init(context)
    }

    private fun init(context: Context) {
        density = 1.0f
        paint = Paint()
        paint?.setStyle(Paint.Style.STROKE)
        paint?.setStrokeWidth(density * 4)
        //set your own color
        paint?.setColor(context.getResources().getColor(R.color.black))
        path = Path()
        //array is ON and OFF distances in px (4px line then 2px space)
        effects = DashPathEffect(floatArrayOf(4f, 2f, 4f, 2f), 0f)
    }

    protected override fun onDraw(canvas: Canvas) { // TODO Auto-generated method stub
        super.onDraw(canvas)
        paint?.setPathEffect(effects)
        val measuredHeight: Int = getMeasuredHeight()
        val measuredWidth: Int = getMeasuredWidth()
        if (measuredHeight <= measuredWidth) { // horizontal
            path?.moveTo(0f, 0f)
            path?.lineTo(measuredWidth.toFloat(), 0f)
            canvas.drawPath(path, paint)
        } else { // vertical
            path?.moveTo(0f, 0f)
            path?.lineTo(0f, measuredHeight.toFloat())
            canvas.drawPath(path, paint)
        }
    }
}