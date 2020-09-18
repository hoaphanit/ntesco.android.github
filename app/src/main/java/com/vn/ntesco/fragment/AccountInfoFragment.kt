package com.vn.ntesco.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import com.vn.ntesco.R
import com.vn.ntesco.activity.ListWorkActivity
import com.vn.ntesco.activity.MainActivity
import com.vn.ntesco.activity.WorkScheduleActivity
import com.vn.ntesco.base.BaseFragment
import com.vn.ntesco.utils.UserCache

class AccountInfoFragment : BaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.btnListWork -> {
                val intent = Intent(activity, ListWorkActivity::class.java)
                startActivity(intent)
            }
            R.id.btnCalendar -> {

                val intent = Intent(activity, WorkScheduleActivity::class.java)
                startActivity(intent)
            }
            R.id.btnNotification -> {
            }
        }
    }

    override fun getLayoutResource(): Int {
        return R.layout.account_info_fragment

    }

    override fun onSetBodyView(view: View, container: ViewGroup?, savedInstanceState: Bundle?) {
        view.findViewById<View>(R.id.btnListWork).setOnClickListener(this)
        view.findViewById<View>(R.id.btnCalendar).setOnClickListener(this)
        view.findViewById<View>(R.id.btnLogout).setOnClickListener(this)
        view.findViewById<View>(R.id.btnNotification).setOnClickListener(this)

    }

}