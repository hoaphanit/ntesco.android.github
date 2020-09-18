package com.vn.ntesco.adapter

import android.app.Activity
import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.vn.ntesco.R
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Category
import com.vn.ntesco.model.Office

class OfficeAdapter(val mContext: Activity?) : androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>() {

    var listOffice: ArrayList<Office>? = ArrayList<Office>()

    override fun getItemCount(): Int {
        return listOffice?.size ?: 0;
    }


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): androidx.recyclerview.widget.RecyclerView.ViewHolder {
//        if (position == 1)
//            return ViewHolderGroup(LayoutInflater.from(mContext).inflate(R.layout.office_group_item, parent, false))
//        else
        return ViewHolderItem(LayoutInflater.from(mContext).inflate(R.layout.office_item, parent, false))

    }


    override fun onBindViewHolder(viewHolder: androidx.recyclerview.widget.RecyclerView.ViewHolder, position: Int) {
        var office = listOffice?.get(position);
//        if (viewHolder is ViewHolderGroup) {
//            var viewHolderGroup = viewHolder as ViewHolderGroup;
//            viewHolderGroup.txtGroupName.text = office?.name
//        } else
        if (viewHolder is ViewHolderItem) {
            var viewHolderItem = viewHolder as ViewHolderItem;
            viewHolderItem.tvTitle.text = office?.title
            viewHolderItem.txtName.text = office?.name
            viewHolderItem.txtMobile.text = office?.phone
            viewHolderItem.txtFax.text = office?.fax
            viewHolderItem.txtEmail.text = office?.email
            viewHolderItem.txtAddress.text = office?.address
            viewHolderItem.txtWebsite.text = office?.website
        }

//        viewHolder.itemView.setOnClickListener(View.OnClickListener {
//            if(itemClickListener!=null)
//                itemClickListener!!.onItemClick(listCategory!!.get(position),position)
//        })
//        viewHolder.tvCategoryName.text = listCategory!!.get(position).name
//        viewHolder.ivCategory.setImageResource(listCategory!!.get(position).icon)
    }


    class ViewHolderGroup(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        var txtGroupName: TextView

        init {
            txtGroupName = v.findViewById(R.id.txtGroupName)
        }


    }

    class ViewHolderItem(v: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(v) {
        var txtName: TextView
        var txtAddress: TextView
        var txtEmail: TextView
        var txtMobile: TextView
        var txtFax: TextView
        var txtWebsite: TextView
        var tvTitle: TextView

        init {
            txtName = v.findViewById(R.id.txtName)
            txtAddress = v.findViewById(R.id.txtAddress)
            txtEmail = v.findViewById(R.id.txtEmail)
            txtMobile = v.findViewById(R.id.txtMobile)
            txtFax = v.findViewById(R.id.txtFax)
            txtWebsite = v.findViewById(R.id.txtWebSite)
            tvTitle = v.findViewById(R.id.tvTitle)
        }


    }

}