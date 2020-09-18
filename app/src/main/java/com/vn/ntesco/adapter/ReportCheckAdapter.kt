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
import com.vn.ntesco.model.Report

class ReportCheckAdapter(val mContext: Context?) : androidx.recyclerview.widget.RecyclerView.Adapter<ReportCheckAdapter.ViewHolder>() {

    var data :List<RawWaterType> = ArrayList<RawWaterType>()
    var isDetail = false
    var isSigleSelect = false
    var positionSelected = -1
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_check_value, parent, false))

    }

    override fun getItemCount(): Int {
        return data.size;
    }

    override fun onBindViewHolder(viewHolder: ReportCheckAdapter.ViewHolder, position: Int) {
        if(data[position].select)
            viewHolder.ivCheck.setImageResource(R.mipmap.check_selected)
        else
            viewHolder.ivCheck.setImageResource(R.mipmap.check)

        viewHolder.tvContent.text = data[position].name
        viewHolder.itemView.setOnClickListener(View.OnClickListener {
            if (isDetail)
                return@OnClickListener
            if(isSigleSelect){
                data[position].select = true
                if(positionSelected!=-1 && position!= positionSelected) data[positionSelected].select = false
                positionSelected = position
            }else{
                data[position].select = !data[position].select
            }
            notifyDataSetChanged()
        })
    }

    class ViewHolder(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        val ivCheck : ImageView
        val tvContent : TextView
        init {
            ivCheck = v.findViewById(R.id.ivCheck)
            tvContent = v.findViewById(R.id.tvContent)
        }

    }

}