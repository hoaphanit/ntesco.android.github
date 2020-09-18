package com.vn.ntesco.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.vn.ntesco.R
import com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.*
import com.vn.ntesco.utils.WriteLog

class CheckListGroupAdapter(val mContext: Context) : RecyclerView.Adapter<CheckListGroupAdapter.ViewHolder>() {
    var itemClickListener: ItemClickListener? = null;
    var listGroupCheckListModel: MutableList<CheckListModel> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int {
        return listGroupCheckListModel.size
    }


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_group_check_list, parent, false), mContext)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.tvProduct.text = listGroupCheckListModel[position].name
        viewHolder.initRecyclerView(listGroupCheckListModel[position])
        if (listGroupCheckListModel[position].isExpanded) {
            viewHolder.showCheckList()
        } else {
            viewHolder.hideCheckList()
        }
        viewHolder.tvProduct.setOnClickListener {
            listGroupCheckListModel[position].isExpanded = !listGroupCheckListModel[position].isExpanded
            notifyDataSetChanged()
        }
        viewHolder.btnSend.setOnClickListener {
            itemClickListener?.onItemClick(listGroupCheckListModel[position],position)
        }
//        if (checkListModel?.childrenList?.get(position)?.size == 1 && checkListModel?.childrenList?.get(position)?.get(0)!!.isEmpty()) {
//            viewHolder.tvAttributes.text = ""
//        } else
//            viewHolder.tvAttributes.text = checkListModel?.attributesList?.get(position) ?: ""
//        if (checkListModel?.childrenList?.size?.minus(1) ?: 0 >= position)
//            viewHolder.initRecyclerView(checkListModel?.childrenList?.get(position)
//                    ?: listOf(), checkListModel?.inputAttributesList?.get(position)
//                    ?: mutableListOf(), checkListModel?.attributesList?.get(position) ?: "")
    }


    class ViewHolder(v: View, context: Context) : RecyclerView.ViewHolder(v) {
        var tvProduct: TextView = v.findViewById(R.id.tvProduct)
        var btnSend: TextView = v.findViewById(R.id.btnSend)
        var ivArrow: ImageView = v.findViewById(R.id.ivArrow)
        var checkListAdapter: CheckListAdapter = CheckListAdapter(context)
        var rvCheckList: RecyclerView = v.findViewById(R.id.rvCheckList)
        fun initRecyclerView(checkListModel: CheckListModel) {
            checkListAdapter.checkListModel = checkListModel
            rvCheckList.apply {
                adapter = checkListAdapter
                layoutManager = LinearLayoutManager(context)
            }
        }

        fun hideCheckList() {
            btnSend.visibility = View.GONE
            rvCheckList.visibility = View.GONE
            ivArrow.rotation = -90f
        }

        fun showCheckList() {
            btnSend.visibility = View.VISIBLE
            rvCheckList.visibility = View.VISIBLE
            ivArrow.rotation = 0f
        }
    }

}