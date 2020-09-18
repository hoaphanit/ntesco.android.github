package com.vn.ntesco.utils

import android.content.Context
import android.graphics.Canvas
import android.graphics.Point
import android.graphics.Rect
import android.graphics.RectF
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.vn.ntesco.views.ItemButton
import java.util.*
import kotlin.collections.ArrayList

abstract class NtescoSwipeHelper(val context: Context, val recyclerview: RecyclerView, val widthButton: Int)
    : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
    var buttonList: MutableList<ItemButton>? = null
    lateinit var gestureDetector: GestureDetector
    var swipePosition = -1
    var swipeThresold = 0.5f
    var buttonBuffer: MutableMap<Int, MutableList<ItemButton>>
    lateinit var removeQueue: LinkedList<Int>
    abstract fun instantiateButton(viewHolder: RecyclerView.ViewHolder, buffer: MutableList<ItemButton>)

    private val gestureListener = object : GestureDetector.SimpleOnGestureListener() {
        override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
            for (button in buttonList!!)
                if (button.onClick(e!!.x, e!!.y))
                    break
            return true
        }
    }

    //    private val onTouchListener = object : View.OnTouchListener {
//        override fun onTouch(v: View?, event: MotionEvent?): Boolean {
//            if (swipePosition < 0) return false
//            val point = Point(event?.rawX!!.toInt(), event?.rawY!!.toInt())
//            val swipeHolder = recyclerview.findViewHolderForAdapterPosition(swipePosition)
//            val swipeItem = swipeHolder?.itemView
//            val rect = Rect()
//            swipeItem?.getGlobalVisibleRect(rect)
//            if (event.action == MotionEvent.ACTION_DOWN || event.action == MotionEvent.ACTION_MOVE
//                    || event.action == MotionEvent.ACTION_UP) {
//                if (rect.top < point.y && rect.bottom > point.y) {
//                    WriteLog.e("onTouchListener","xxx");
//                    return gestureDetector.onTouchEvent(event)
//                } else {
//                    WriteLog.e("onTouchListener","yyy");
//                    removeQueue.add(swipePosition)
//                    swipePosition = -1
//                    recoverSwipeItem()
//                }
//            }
//            return false
//        }
//
//    }
    private val onTouchListener = View.OnTouchListener { view, e ->
        if (swipePosition < 0) return@OnTouchListener false
        val point = Point(e.rawX.toInt(), e.rawY.toInt())
        val swipedViewHolder = recyclerview.findViewHolderForAdapterPosition(swipePosition)
        val swipedItem = swipedViewHolder?.itemView
        val rect = Rect()
        swipedItem?.getGlobalVisibleRect(rect)
        if (e.action == MotionEvent.ACTION_DOWN || e.action == MotionEvent.ACTION_UP || e.action == MotionEvent.ACTION_MOVE) {
            if (rect.top < point.y && rect.bottom > point.y) {
                WriteLog.e("onTouchListener", "xxx");
                gestureDetector.onTouchEvent(e)
            } else {
                WriteLog.e("onTouchListener", "yyy");
                removeQueue.add(swipePosition)
                swipePosition = -1
                recoverSwipeItem()
            }
        }
        false
    }

    @Synchronized
    private fun recoverSwipeItem() {
        while (!removeQueue.isEmpty()) {
            val pos = removeQueue.poll().toInt()
            if (pos > -1) {
                recyclerview.getAdapter()?.notifyItemChanged(pos);
            }
        }
    }

    init {
        buttonList = ArrayList()
        gestureDetector = GestureDetector(context, gestureListener)
        recyclerview.setOnTouchListener(onTouchListener)
        buttonBuffer = HashMap()
        removeQueue = object : LinkedList<Int>() {
            override fun add(element: Int): Boolean {
                if (contains(element))
                    return false;
                else
                    return super.add(element);
            }
        }
        attachSwipe()
    }

    private fun attachSwipe() {
        var itemTochHelper = ItemTouchHelper(this)
        itemTochHelper.attachToRecyclerView(recyclerview)
    }

    class IntLinkedList : LinkedList<Int>() {
        override fun contains(element: Int): Boolean {
            return false
        }

        override fun lastIndexOf(element: Int): Int {
            return element
        }

        override fun remove(): Int {
            return super.remove()
        }

        override fun indexOf(element: Int): Int {
            return element
        }

        override fun add(element: Int): Boolean {
            return if (contains(element)) false else super.add(element)
        }
    }

    override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
        return false
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        val pos = viewHolder.adapterPosition
        if (swipePosition != pos)
            removeQueue.add(swipePosition)
        swipePosition = pos
        if (buttonBuffer.containsKey(swipePosition))
            buttonList = buttonBuffer[swipePosition]
        else
            buttonList?.clear()
        buttonBuffer.clear()
        swipeThresold = 0.5f * buttonList?.size!!.toFloat() * widthButton
        recoverSwipeItem()
    }

    override fun getSwipeEscapeVelocity(defaultValue: Float): Float {
        return 0.1f * defaultValue
    }

    override fun getSwipeVelocityThreshold(defaultValue: Float): Float {
        return 0.5f * defaultValue
    }

    override fun onChildDraw(c: Canvas, recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, dX: Float, dY: Float, actionState: Int, isCurrentlyActive: Boolean) {
        val pos = viewHolder.adapterPosition
        var translationX = dX
        val itemView = viewHolder.itemView
        if (pos < 0) {
            swipePosition = pos
            return
        }
        if (actionState == ItemTouchHelper.ACTION_STATE_SWIPE) {
            if (dX < 0) {
                var buffer: MutableList<ItemButton> = ArrayList()
                if (!buttonBuffer.containsKey(pos)) {
                    instantiateButton(viewHolder, buffer)
                    buttonBuffer[pos] = buffer
                } else {
                    buffer = buttonBuffer[pos]!!
                }
                translationX = dX * buffer.size.toFloat() * widthButton.toFloat() / itemView.width
                drawButton(c, itemView, buffer, pos, translationX)
            }
        }
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
    }

    private fun drawButton(c: Canvas, itemView: View, buffer: MutableList<ItemButton>, pos: Int, translationX: Float) {
        var right = itemView.right.toFloat()
        val dButtonWidth = -1 * translationX / buffer.size
        for (button in buffer) {
            val left = right - dButtonWidth
            button.onDraw(c, RectF(left, itemView.top.toFloat(), right, itemView.bottom.toFloat()), pos)
            right = left
        }
    }

}


