package com.vn.ntesco.adapter

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.vn.ntesco.R
import com.vn.ntesco.model.DataSchedule
import com.vn.ntesco.model.ReportSchedule
import com.vn.ntesco.utils.UserCache
import java.util.*

class WorkScheduleChildAdapter(val mContext: Context) : androidx.recyclerview.widget.RecyclerView.Adapter<WorkScheduleChildAdapter.ViewHolder>() {
    var reportSchedules: List<ReportSchedule> = ArrayList<ReportSchedule>()

    override fun getItemCount(): Int {
        return reportSchedules.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        if(UserCache.userInfo?.type!=3){
            viewHolder.tvScheduleWork.text = "#" + reportSchedules[position].id.toString() + " - " + reportSchedules[position].customerName
        }else{
            viewHolder.tvScheduleWork.text = "#" + reportSchedules[position].id.toString() + " - " + reportSchedules[position].userName + " - " + reportSchedules[position].customerName
        }
        if (reportSchedules.get(position).status == 3) {
            viewHolder.tvScheduleWork.setBackgroundColor(ContextCompat.getColor(mContext, R.color.grey_e7));
            viewHolder.tvScheduleWork.setTextColor(ContextCompat.getColor(mContext, R.color.grey_71));
            viewHolder.divider.setBackgroundColor(ContextCompat.getColor(mContext, R.color.grey_b9));

        } else {
            viewHolder.tvScheduleWork.setBackgroundColor(ContextCompat.getColor(mContext, R.color.blue_light));
            viewHolder.tvScheduleWork.setTextColor(ContextCompat.getColor(mContext, R.color.dark_blue));
            viewHolder.divider.setBackgroundColor(ContextCompat.getColor(mContext, R.color.blue_sky));
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_work_schedule_children, parent, false))
    }

    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        var tvScheduleWork: TextView
        var divider: View

        init {
            tvScheduleWork = v.findViewById(R.id.tvScheduleWork)
            divider = v.findViewById(R.id.divider)
        }


    }
}