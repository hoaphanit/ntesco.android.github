package com.vn.ntesco.adapter

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.vn.ntesco.R
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Report
import com.vn.ntesco.utils.ReportStatus
import com.vn.ntesco.utils.UserCache


class ListReportAdapter(val mContext: Context?) : androidx.recyclerview.widget.RecyclerView.Adapter<ListReportAdapter.ViewHolder>() {
    lateinit var itemClickListener: ItemClickListener
    var data: MutableList<Report> = ArrayList<Report>()
    var type = 1

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_list_work, parent, false))
    }

    override fun getItemCount(): Int {
        return data.size;
    }

    override fun onBindViewHolder(viewHolder: ListReportAdapter.ViewHolder, position: Int) {
        val report = data[position]
        viewHolder.txtWorkName.text = report.customerName
        viewHolder.txtWorkDes.text = report.error
        viewHolder.tvWorkDate.text = report.publishDate
        viewHolder.itemView.setOnClickListener(View.OnClickListener {
            itemClickListener?.onItemClick(data[position], position)
        })
        if (report.image?.size > 0) {
            Picasso.get().load(report.image[0]).fit().centerCrop().placeholder(R.mipmap.default_banner).into(viewHolder.ivWork)
        } else {
            Picasso.get().load(R.mipmap.default_banner).fit().centerCrop().into(viewHolder.ivWork)
        }
        if (!UserCache.isTechnical() && (report.status != ReportStatus.NOT_CONFIRM.status)) {
            viewHolder.tvStatusWork.text = report.userName + " - " + Utils.getStatusText(report.status, mContext)
        } else {
            viewHolder.tvStatusWork.text = Utils.getStatusText(report.status,mContext)
        }
        viewHolder.tvStatusWork.setBackgroundColor(ContextCompat.getColor(mContext!!, Utils.getStatusColor(report.status)))

    }

    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        lateinit var txtWorkName: TextView
        lateinit var txtWorkDes: TextView
        lateinit var tvWorkDate: TextView
        lateinit var ivWork: ImageView
        lateinit var tvStatusWork: TextView

        init {
            txtWorkName = v.findViewById(R.id.tvWorkName)
            txtWorkDes = v.findViewById(R.id.tvWorkDescription)
            tvWorkDate = v.findViewById(R.id.tvWorkDate)
            tvStatusWork = v.findViewById(R.id.tvStatusWork)
            ivWork = v.findViewById(R.id.ivListWork)

        }


    }

    fun setOnItemClickListener(itemClickListener: ItemClickListener) {
        this.itemClickListener = itemClickListener
    }

    fun updateItem(id: Int, status: Int) {
        for ((index, value) in data.withIndex()) {
            if (value.id == id) {
                value.status = status
                value.userName = UserCache.userInfo?.username
                notifyItemChanged(index)
                return
            }
        }
    }
}