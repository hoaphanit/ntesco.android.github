package com.vn.ntesco.adapter

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vn.ntesco.R
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.utils.WriteLog


class CheckListAttributesAdapter(val mContext: Context) : RecyclerView.Adapter<CheckListAttributesAdapter.ViewHolder>() {
    var itemClickListener: ItemClickListener? = null;
    var attributeList: List<String> = listOf()
    var isFilled = false
    var inputAttributeList: MutableList<String> = ArrayList<String>()
        set(value) {
            field = value

        }

    var attribute: String = ""

    override fun getItemCount(): Int {
        return attributeList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_attributes, parent, false), inputAttributeList)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setIsRecyclable(false);
        holder.tvAttributesLabel.text = if (attributeList[position] != null && attributeList[position].isNotEmpty()) attributeList[position] else attribute
        holder.edtInputAttribute.setText(inputAttributeList[position])
    }


    class  ViewHolder(v: View, inputList: MutableList<String>) : RecyclerView.ViewHolder(v) {
        var tvAttributesLabel: TextView = v.findViewById(R.id.tvAttributesLabel)
        var edtInputAttribute: EditText = v.findViewById(R.id.edtInputAttribute)
        var inputTextWatcher: TextWatcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                inputList[adapterPosition] = s.toString()
                edtInputAttribute.setSelection(edtInputAttribute.getText().length);
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

        }

        init {
            edtInputAttribute.removeTextChangedListener(inputTextWatcher)
            edtInputAttribute.addTextChangedListener(inputTextWatcher)
        }
    }


}