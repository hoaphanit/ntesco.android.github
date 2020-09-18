package com.vn.ntesco.views

import android.content.Context
import android.content.res.Resources
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.vn.ntesco.listener.ItemButtonListener

class ItemButton(val context: Context, val text: String, val textSize: Int, val imageRestId: Int, val color: Int, val itemButtonListener: ItemButtonListener) {
    private var position: Int = 0
    private var clickRegion: RectF? = null
    private var resource: Resources

    init {
        resource = context.resources
    }

    fun onClick(x: Float, y: Float): Boolean {
        if (clickRegion != null && clickRegion!!.contains(x, y)) {
            itemButtonListener.onClick(position)
            return true
        } else {
            return false
        }
    }

    fun onDraw(c: Canvas, rect: RectF, position: Int) {
        val p = Paint()

        // Draw background

        // Draw background
        p.color = color
        c.drawRect(rect, p)

        // Draw Text

        // Draw Text
        p.color = Color.WHITE
        p.textSize = textSize.toFloat()

        val r = Rect()
        val cHeight: Float = rect.height()
        val cWidth: Float = rect.width()
        p.textAlign = Paint.Align.LEFT
        p.getTextBounds(text, 0, text.length, r)
        var x = cWidth / 2f - r.width() / 2f - r.left
        var y = cHeight / 2f + r.height() / 2f - r.bottom
        c.drawText(text, rect.left + x, rect.top + y, p)

        clickRegion = rect
//        if (imageRestId == 0) {
//            x = cWidth / 2f - r.width() / 2f - r.left.toFloat();
//            y = cHeight / 2f - r.height() / 2f - r.bottom.toFloat();
//            canvas.drawText(text, rectF.left + x, rectF.top + y, p)
//        } else {
//            val d = ContextCompat.getDrawable(context, imageRestId)
//            var bitmap = drawableToBitmap(d)
//            canvas.drawBitmap(bitmap,(rectF.left+rectF.right)/2,(rectF.top+rectF.bottom)/2,p)
//        }
        this.position = position
    }

    fun drawableToBitmap(d: Drawable?) : Bitmap {
        if(d is BitmapDrawable) return  d.bitmap
        val bitmap= Bitmap.createBitmap(d!!.intrinsicWidth,d!!.intrinsicHeight,Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        d.setBounds(0,0,canvas.width,canvas.height)
        d.draw(canvas)
        return bitmap
    }
}