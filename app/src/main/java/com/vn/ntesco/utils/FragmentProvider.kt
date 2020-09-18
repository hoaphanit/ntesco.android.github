package com.vn.ntesco.utils

import android.os.Bundle
import com.vn.ntesco.base.BaseFragment
import com.vn.ntesco.fragment.AccountInfoFragment
import com.vn.ntesco.fragment.LoginFragment

object FragmentProvider {
    fun getFragmentNewInstance(fragmentClassName: String?, data: Bundle?): BaseFragment? {
        var data = data
        if (data == null) data = Bundle()
        var fragment: BaseFragment? = null
        when (fragmentClassName) {

            Constant.AccountInfoFragment -> fragment = AccountInfoFragment()
        }
        if (fragment != null) {
            fragment!!.setArguments(data)
        }

        return fragment
    }
}