package com.vn.ntesco.adapter

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.vn.ntesco.R
import com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.*
import com.vn.ntesco.utils.DimensionUtils
import com.vn.ntesco.utils.PrefUtils
import com.vn.ntesco.utils.WriteLog
import kotlinx.android.synthetic.main.activity_chemical_calculation.*
import kotlin.collections.ArrayList

class CheckListChildAdapter(val mContext: Context) : RecyclerView.Adapter<CheckListChildAdapter.ViewHolder>() {
    var checkListChild: MutableList<CheckListChild>
    var itemClickListener: ItemClickListener? = null;

    init {
        checkListChild = ArrayList()
    }

    fun setData(mutableList: MutableList<CheckListChild>) {
        checkListChild = mutableList;
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_check_list_child, parent, false), checkListChild)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.tvAddProductSpecification.visibility = if (position == itemCount - 1) View.VISIBLE else View.GONE
        viewHolder.tvAddProductSpecification.setOnClickListener {
            checkListChild.add(CheckListChild())
            notifyDataSetChanged()
//            itemClickListener?.onItemClick(checkListChild[position],position)
        }
        viewHolder.edtProductSpecification.setText(checkListChild[position].productSpecification)
        viewHolder.edtProductStatus.setText(checkListChild[position].status)
    }


    class ViewHolder(v: View, checkListChild: MutableList<CheckListChild>) : RecyclerView.ViewHolder(v) {
        var edtProductSpecification: EditText
        var edtProductStatus: EditText
        var tvAddProductSpecification: TextView
        var specificationTextWatcher: TextWatcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                checkListChild[adapterPosition].productSpecification = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        }
        var statusTextWatcher: TextWatcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                checkListChild[adapterPosition].status = s.toString()

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        }

        init {

            edtProductSpecification = v.findViewById(R.id.edtProductSpecification)
            edtProductStatus = v.findViewById(R.id.edtProductStatus)
            tvAddProductSpecification = v.findViewById(R.id.tvAddProductSpecification)
            removeTextChangeListener()
            addTextChangeListener()
        }

        fun addTextChangeListener() {
            edtProductSpecification.addTextChangedListener(specificationTextWatcher)
            edtProductStatus.addTextChangedListener(statusTextWatcher)
        }

        fun removeTextChangeListener() {
            edtProductSpecification.removeTextChangedListener(specificationTextWatcher)
            edtProductStatus.removeTextChangedListener(statusTextWatcher)
        }
    }

    override fun getItemCount(): Int {
        return checkListChild.size
    }

}