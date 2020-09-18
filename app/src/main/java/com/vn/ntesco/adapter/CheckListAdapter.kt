package com.vn.ntesco.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.vn.ntesco.R
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.*
import com.vn.ntesco.utils.WriteLog

class CheckListAdapter(val mContext: Context) : RecyclerView.Adapter<CheckListAdapter.ViewHolder>() {
    //var checkList: MutableList<CheckList>
    var itemClickListener: ItemClickListener? = null;
    var checkListModel: CheckListModel? = null
        set(value) {
            field = value
            //   field?.inputAttributesList = value?.childrenList?.toMutableList()
            //  field?.inputAttributesList?.fill(mutableListOf())
            if (field?.inputAttributesList == null || field?.inputAttributesList?.size != value?.childrenList?.size)
                for (value in value?.childrenList!!) {
                    var list = value.toMutableList().apply {
                        this.fill("")
                    }
                    field?.inputAttributesList?.add(list)
                }
            notifyDataSetChanged()
        }


    override fun getItemCount(): Int {
        return checkListModel?.attributesList?.size ?: 0
    }


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_check_list, parent, false), mContext)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        if (checkListModel?.childrenList?.get(position)?.size == 1 && checkListModel?.childrenList?.get(position)?.get(0)!!.isEmpty()) {
            viewHolder.tvAttributes.text = ""
        } else
            viewHolder.tvAttributes.text = checkListModel?.attributesList?.get(position) ?: ""
        if (checkListModel?.childrenList?.size?.minus(1) ?: 0 >= position)
            viewHolder.initRecyclerView(checkListModel?.childrenList?.get(position)
                    ?: listOf(), checkListModel?.inputAttributesList?.get(position)
                    ?: mutableListOf(), checkListModel?.attributesList?.get(position) ?: "")
    }


    class ViewHolder(v: View, context: Context) : RecyclerView.ViewHolder(v) {
        var tvAttributes: TextView = v.findViewById(R.id.tvAttributes)
        var rvAttributes: RecyclerView = v.findViewById(R.id.rvAttributes)
        var attributesAdapter: CheckListAttributesAdapter = CheckListAttributesAdapter(context)

        fun initRecyclerView(dataList: List<String>, inputList: MutableList<String>, attribute: String) {
            attributesAdapter.attributeList = dataList
            attributesAdapter.inputAttributeList = inputList
            attributesAdapter.attribute = attribute
            rvAttributes.apply {
                adapter = attributesAdapter
                layoutManager = LinearLayoutManager(context)
            }
        }

    }

}