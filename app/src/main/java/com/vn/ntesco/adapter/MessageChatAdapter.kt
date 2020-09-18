package com.vn.ntesco.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.vn.ntesco.R
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.MessageChat
import com.vn.ntesco.model.Product
import com.vn.ntesco.utils.WriteLog

class MessageChatAdapter(val mContext: Context) : androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>() {

    lateinit var messageList: MutableList<MessageChat>

    companion object {
        val SENDER = 0
        val RECIPIENT = 1
    }

    init {
        messageList = ArrayList();
    }

    fun setData(messageList: MutableList<MessageChat>) {
        this.messageList = messageList
        //  notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return messageList.size;
    }

    override fun getItemViewType(position: Int): Int {
        return messageList[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): androidx.recyclerview.widget.RecyclerView.ViewHolder {
        if (position == SENDER)
            return SenderViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_sender_message, parent, false))
        else
            return RecipientViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_recipient_message, parent, false))
    }


    override fun onBindViewHolder(viewHolder: androidx.recyclerview.widget.RecyclerView.ViewHolder, position: Int) {
        val params = viewHolder.itemView.layoutParams as androidx.recyclerview.widget.RecyclerView.LayoutParams
        if (position == 0) {
            params.topMargin = mContext.resources.getDimensionPixelSize(R.dimen.margin_normal)
        } else {
            params.topMargin = 0
        }
        viewHolder.itemView.layoutParams = params

        if (viewHolder is SenderViewHolder) {
            val senderViewHolder = viewHolder as SenderViewHolder
            senderViewHolder.tvSenderMessage.text = messageList[position].content
        } else {
            val recipientViewHolder = viewHolder as RecipientViewHolder
            recipientViewHolder.tvRecipientMessage.text = messageList[position].content
            if (position == 0) {
                recipientViewHolder.ivAvatar.visibility = View.VISIBLE
            } else {
                if (messageList[position - 1].type == SENDER) {
                    recipientViewHolder.ivAvatar.visibility = View.VISIBLE
                } else {
                    recipientViewHolder.ivAvatar.visibility = View.INVISIBLE

                }
            }
        }
    }


    class SenderViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        lateinit var tvSenderMessage: TextView

        init {
            tvSenderMessage = v.findViewById(R.id.tvSenderMessage)
        }

    }

    class RecipientViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        lateinit var tvRecipientMessage: TextView
        lateinit var ivAvatar: ImageView

        init {
            tvRecipientMessage = v.findViewById(R.id.tvRecipientMessage)
            ivAvatar = v.findViewById(R.id.ivRecipientAvatar)
        }

    }
}