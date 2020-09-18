package com.vn.ntesco.adapter.adaptersSpinner

import android.content.Context
import androidx.core.content.ContextCompat
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.TextView
import com.vn.ntesco.R
import com.vn.ntesco.model.CheckListModel
import com.vn.ntesco.model.Chemicals
import com.vn.ntesco.model.RawWaterType
import com.vn.ntesco.model.User
import kotlinx.android.synthetic.main.item_spinner.view.*


class DataSpinnerAdapter<T>(context: Context, resource: Int) : ArrayAdapter<T>(context, resource) {

    lateinit var listItems: MutableList<T>

    fun setItems(listItems: MutableList<T>) {
        this.listItems = listItems
        notifyDataSetChanged()
    }

    fun getItems(): MutableList<T> {
        if (listItems == null) return mutableListOf<T>()
        return listItems
    }

    override fun getCount(): Int {
        return listItems.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItem(position: Int): T {
        return listItems.get(position)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val tvContent = super.getDropDownView(position, convertView, parent) as TextView
        if (listItems.get(position) != null) {
            if (listItems.get(position) is Chemicals) {
                val chemicals = listItems.get(position) as Chemicals
                tvContent.text = chemicals.name
            } else if (listItems.get(position) is User) {
                val user = listItems.get(position) as User
                tvContent.text = user.full_name + " - " + user.phone
            } else if (listItems.get(position) is CheckListModel) {
                val checkListModel = listItems.get(position) as CheckListModel
                tvContent.text = checkListModel.name
            } else if (listItems.get(position) is String) {
                tvContent.text = (listItems.get(position) as String).toUpperCase()
            }
        }

        return tvContent
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val tvContent = super.getView(position, convertView, parent) as TextView
        if (listItems.get(position) != null) {
            if (listItems.get(position) is Chemicals) {
                val chemicals = listItems.get(position) as Chemicals
                tvContent.text = chemicals.name
            } else if (listItems.get(position) is User) {
                val user = listItems.get(position) as User
                tvContent.text = user.full_name + " - " + user.phone
            } else if (listItems.get(position) is CheckListModel) {
                val checkListModel = listItems.get(position) as CheckListModel
                tvContent.text = checkListModel.name
            }else if (listItems.get(position) is String) {
                tvContent.text = (listItems.get(position) as String).toUpperCase()
            }
        }
        return tvContent
    }
}
