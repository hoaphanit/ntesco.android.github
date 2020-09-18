package com.vn.ntesco.notification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import android.text.Html
import android.view.View
import com.vn.ntesco.activity.*
import com.vn.ntesco.model.Response.DetailNotificationResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.UserCache
import com.vn.ntesco.utils.WriteLog
import kotlinx.android.synthetic.main.activity_detail_notification.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class OpenNotifyReceiver : BroadcastReceiver() {
    /* 1 // submit report
     2 // comfirm report
     3 // change report
     4 // completed report
     5 // admin push
     7 // news knownledge
     8 // assigned report
     9 // processing status report
     10 // processed report */
    override fun onReceive(context: Context?, intent: Intent?) {
        val reportId = intent?.getIntExtra(Constant.REPORT_ID, 0)
        val type = intent?.getIntExtra(Constant.TYPE_NOTIFY, 0)
        val notifyId = intent?.getIntExtra(Constant.NOTIFICATION_ID, 0)
        val postId = intent?.getIntExtra(Constant.POST_ID, 0)
        var intentNoti: Intent? = null
        when (type) {
            1 -> {
                intentNoti = Intent(context, ListWorkActivity::class.java)
                intentNoti.putExtra(Constant.REPORT_ID, reportId)
                intentNoti.putExtra(Constant.TYPE_NOTIFY, type)
            }
            2 -> {
                intentNoti = Intent(context, ReportActivity::class.java)
                intentNoti.putExtra(Constant.REPORT_ID, reportId)
            }
            3 -> {
                if (!UserCache.isCustomerUser()) {
                    intentNoti = Intent(context, ListWorkActivity::class.java)
                    intentNoti.putExtra(Constant.TYPE_NOTIFY, type)
                } else {
                    intentNoti = Intent(context, ReportActivity::class.java)
                }
                intentNoti.putExtra(Constant.REPORT_ID, reportId)
            }
            4 -> {
//                if (UserCache.isManager()) {
//                    intentNoti = Intent(context, ListWorkActivity::class.java)
//                } else if (UserCache.isCustomerUser()) {
//                    intentNoti = Intent(context, ReportActivity::class.java)
//                }
                intentNoti = Intent(context, ListWorkActivity::class.java)
                intentNoti?.putExtra(Constant.REPORT_ID, reportId)
                intentNoti.putExtra(Constant.TYPE_NOTIFY, type)
            }
            5 -> {
                intentNoti = Intent(context, NotificationActivity::class.java)
                intentNoti.putExtra(Constant.NOTIFICATION_ID, notifyId)
            }
            7 -> {
                intentNoti = Intent(context, DetailPostActivity::class.java)
                intentNoti.putExtra(Constant.POST_ID, postId)
            }
            8 -> {
                if(UserCache.isCustomerUser()){
                    intentNoti = Intent(context, ReportActivity::class.java)
                    intentNoti.putExtra(Constant.REPORT_ID, reportId)
                }else if(UserCache.isTechnical()){
                    intentNoti = Intent(context, ListWorkActivity::class.java)
                    intentNoti.putExtra(Constant.TYPE_NOTIFY, type)
                    intentNoti.putExtra(Constant.REPORT_ID, reportId)
                }
            }
            else -> {
                intentNoti = Intent(context, ReportActivity::class.java)
                intentNoti.putExtra(Constant.REPORT_ID, reportId)
            }

        }
        if (notifyId != 0)
            getDetailNotification(notifyId!!, context)
        intentNoti?.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context?.startActivity(intentNoti)
    }

    private fun getDetailNotification(notifyId: Int, context: Context?) {
        if (UserCache.isLogin()) {
            ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                    .getDetailNotification(notifyId)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<DetailNotificationResponse> {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                        }

                        override fun onNext(detailNotificationResponse: DetailNotificationResponse) {
                            if (detailNotificationResponse.code == Constant.SUCCESS) {
                                sendBroadcast(context,notifyId)
                            }

                        }

                    })
        }
    }

    private fun sendBroadcast(context: Context?, notifyId : Int) {
        val intent = Intent(Constant.NOTIFY_LOCAL_BROADCAST)
        intent.putExtra(Constant.FROM_NOTIFY,true)
        intent.putExtra(Constant.NOTIFICATION_ID,notifyId)
        if (context != null) {
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent)
        }
    }
}