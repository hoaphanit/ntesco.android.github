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
import com.vn.ntesco.utils.DimensionUtils
import com.vn.ntesco.utils.WriteLog
import java.util.*
import kotlin.collections.ArrayList

class WorkScheduleAdapter(val mContext: Context) : androidx.recyclerview.widget.RecyclerView.Adapter<WorkScheduleAdapter.ViewHolder>() {
    //    var workDateList : List<Date> = ArrayList<Date>()
    var dataSchedule: MutableList<DataSchedule> = ArrayList<DataSchedule>()
    var currentCalendar: Calendar? = Calendar.getInstance()
    fun setData(dateList: MutableList<DataSchedule>) {
        dataSchedule = dateList
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return dataSchedule.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.tvDate.text = Utils.getDay(dataSchedule[position].day)
        if (currentCalendar?.get(Calendar.MONTH) == Utils.getCalendar(dataSchedule[position].day).get(Calendar.MONTH)) {
            viewHolder.itemView.setBackgroundResource(R.drawable.bg_border_right_bottom)
        } else
            viewHolder.itemView.setBackgroundResource(R.drawable.bg_solid_grey_right_bottom)

        if (dataSchedule[position].report != null && dataSchedule[position].report!!.size > 0) {
            viewHolder.workChildList.visibility = View.VISIBLE
            viewHolder.workChildList.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(mContext, androidx.recyclerview.widget.RecyclerView.VERTICAL, false)
            viewHolder.workScheduleChildAdapter = WorkScheduleChildAdapter(mContext)
            viewHolder.workScheduleChildAdapter.reportSchedules = dataSchedule[position].report!!
            viewHolder.workScheduleChildAdapter.notifyDataSetChanged()
            viewHolder.workChildList.adapter = viewHolder.workScheduleChildAdapter
        } else {
            viewHolder.workChildList.visibility = View.GONE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_work_schedule, parent, false))
    }

    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        var tvDate: TextView
        var workChildList: androidx.recyclerview.widget.RecyclerView
        lateinit var workScheduleChildAdapter: WorkScheduleChildAdapter

        init {
            tvDate = v.findViewById(R.id.tvDate)
            workChildList = v.findViewById(R.id.workChildList)
            val layoutParams = v.getLayoutParams() as androidx.recyclerview.widget.RecyclerView.LayoutParams
            layoutParams.width = (DimensionUtils.getWidthScreen() / 6).toInt()
            layoutParams.height = (DimensionUtils.getWidthScreen() / 6).toInt()
            v.layoutParams = layoutParams;
        }


    }
}