package com.vn.ntesco.base

import android.content.BroadcastReceiver
import android.content.IntentFilter
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kaopiz.kprogresshud.KProgressHUD
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.DialogUtils

abstract class BaseFragment : Fragment() {

    abstract fun getLayoutResource(): Int
    abstract fun onSetBodyView(view: View, container: ViewGroup?, savedInstanceState: Bundle?)
    lateinit var progressDialog: KProgressHUD

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        progressDialog = KProgressHUD(context)
        progressDialog.setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setDimAmount(0.5f)
                .setCancellable(false)
        val mBaseView = inflater.inflate(getLayoutResource(), container, false)
        if (isAdded())
            onSetBodyView(mBaseView, container, savedInstanceState)
        return mBaseView

    }

    fun setLoading(isLoading: Boolean) {
        if (activity != null) {
            if (activity!!.isFinishing())
                return

            if (this == null)
                return

            if (!isAdded)
                return

            if (isLoading)
                progressDialog.show()
            else
                progressDialog.dismiss()
        }
    }

    protected fun showAlert(message: String) {
        DialogUtils.showDialog(activity, message, null)
    }

    protected fun showAlertCallback(message: String, callbackDialog: DialogUtils.CallbackDialog) {
        DialogUtils.showDialog(activity, message, callbackDialog)
    }

    protected fun registerBroadcast(broadcastReceiver: BroadcastReceiver, filter: String) {
       LocalBroadcastManager.getInstance(activity!!).registerReceiver(broadcastReceiver, IntentFilter(filter))
    }

    protected fun unregisterBroadcast(broadcastReceiver: BroadcastReceiver) {
        LocalBroadcastManager.getInstance(activity!!).unregisterReceiver(broadcastReceiver)
    }
}