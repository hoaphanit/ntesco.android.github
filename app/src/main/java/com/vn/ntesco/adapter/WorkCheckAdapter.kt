package com.vn.ntesco.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.vn.ntesco.R
import com.vn.ntesco.model.RawWaterType

class WorkCheckAdapter(val mContext: Context?) : androidx.recyclerview.widget.RecyclerView.Adapter<WorkCheckAdapter.ViewHolder>() {

    var dataList: List<RawWaterType> = ArrayList<RawWaterType>()

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_check_value, parent, false))

    }

    override fun getItemCount(): Int {
        return dataList.size;
    }

    override fun onBindViewHolder(viewHolder: WorkCheckAdapter.ViewHolder, position: Int) {
        viewHolder.tvContent.text = dataList[position].name
        if (dataList[position].select)
            viewHolder.ivCheck.setImageResource(R.mipmap.check_selected)
        else viewHolder.ivCheck.setImageResource(R.mipmap.check)
    }

    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        val ivCheck: ImageView
        val tvContent: TextView

        init {
            ivCheck = v.findViewById(R.id.ivCheck)
            tvContent = v.findViewById(R.id.tvContent)
        }

    }

}