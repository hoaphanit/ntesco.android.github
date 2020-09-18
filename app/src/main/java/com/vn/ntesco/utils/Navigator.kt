package com.vn.ntesco.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.vn.ntesco.base.BaseActivity

object Navigator {
    val FRAGMENT_CLASS_NAME_START = "FRAGMENT_CLASS_NAME_START"




    fun startActivity(context: Context, activityClass: Class<*>?, data: Bundle?) {
        var data = data
        if (data == null) data = Bundle()
        if (activityClass != null) {
            val intent = Intent(context, activityClass)
            intent.putExtras(data)
            context.startActivity(intent)
        }
    }


    fun startFragmentIntent(context: Context, fragmentClassName: String?, intent: Intent?, data: Bundle?) {
        var data = data
        if (data == null) data = Bundle()
        if (intent != null) {
            if (fragmentClassName != null) {
                data.putString(FRAGMENT_CLASS_NAME_START, fragmentClassName)
            }
            intent.putExtras(data)
            context.startActivity(intent)
        } else {
            if (context is BaseActivity) {
                (context as BaseActivity).addFragment(FragmentProvider.getFragmentNewInstance(fragmentClassName, data))
            }
        }
    }

    fun startFragment(context: FragmentActivity, fragmentClassName: String?, activityClass: Class<*>?, data: Bundle?) {
        var data = data
        if (data == null) data = Bundle()
        if (activityClass != null) {
            if (fragmentClassName != null) {
                data.putString(FRAGMENT_CLASS_NAME_START, fragmentClassName)
            }
            val intent = Intent(context, activityClass)
            intent.putExtras(data)
            //            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent)
        }
    }

    fun startFragmentWithResult(
        context: Activity,
        fragmentClassName: String?,
        activityClass: Class<*>?,
        data: Bundle?,
        request: Int
    ) {
        var data = data
        if (data == null) data = Bundle()
        if (activityClass != null) {
            if (fragmentClassName != null) {
                data.putString(FRAGMENT_CLASS_NAME_START, fragmentClassName)
            }
            val intent = Intent(context, activityClass)
            intent.putExtras(data)
            //            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivityForResult(intent, request)
        }
    }
}