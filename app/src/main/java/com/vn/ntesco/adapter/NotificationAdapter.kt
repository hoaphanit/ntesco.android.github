package com.vn.ntesco.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.vn.ntesco.R
import com.vn.ntesco.listener.ItemButtonClickListener
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Notification
import com.vn.ntesco.views.NtescoRevealLayout
import com.vn.ntesco.views.ViewBinderHelper

class NotificationAdapter(val mContext: Context?) : androidx.recyclerview.widget.RecyclerView.Adapter<NotificationAdapter.ViewHolder>() {

    var itemClickListener: ItemClickListener? = null
    var itemButtonClickListener: ItemButtonClickListener? = null
    public var notificationsList: MutableList<Notification>
    var viewBinderHelper: ViewBinderHelper

    init {
        viewBinderHelper = ViewBinderHelper()
        notificationsList = ArrayList<Notification>()
        viewBinderHelper.setOpenOnlyOne(true)
    }

    override fun getItemCount(): Int {
        return notificationsList.size;
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_notification, parent, false))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewBinderHelper.closeLayout(position.toString())
        viewBinderHelper.bind(viewHolder.swipeRevealLayout, position.toString())
        viewHolder.dragItem.setOnClickListener(View.OnClickListener {
            itemClickListener?.onItemClick(notificationsList[position], position)
        })
        viewHolder.tvDelete.setOnClickListener {
            itemButtonClickListener?.onDeleteClick(notificationsList[position], position)
        }
        if (notificationsList[position].status == 1) {
            viewHolder.ivNotify.setImageResource(R.mipmap.ic_notify_new)
        } else {
            viewHolder.ivNotify.setImageResource(R.mipmap.ic_notify)
        }
        viewHolder.tvTitle.setText(notificationsList[position].title)
        viewHolder.tvDateCreated.setText(notificationsList[position].createdAt)
    }


    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        var tvTitle: TextView
        var tvDateCreated: TextView
        var tvDelete: TextView
        var ivNotify: ImageView
        var swipeRevealLayout: NtescoRevealLayout
        var dragItem: View
        init {
            tvTitle = v.findViewById(R.id.tvTitleNotify)
            tvDateCreated = v.findViewById(R.id.tvDateNotify)
            ivNotify = v.findViewById(R.id.ivIconNotify)
            swipeRevealLayout = v.findViewById(R.id.swipe_reveal_layout)
            tvDelete = v.findViewById(R.id.txt_delete_notify)
            dragItem = v.findViewById(R.id.drag_item)
        }


    }

    fun setOnItemClickListener(itemClickListener: ItemClickListener) {
        this.itemClickListener = itemClickListener
    }
}