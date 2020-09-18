package com.vn.ntesco.activity

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import android.text.Html
import android.view.View
import com.vn.ntesco.R
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.model.Notification
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.DetailNotificationResponse
import com.vn.ntesco.model.Response.NotificationResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.UserCache
import kotlinx.android.synthetic.main.activity_detail_notification.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class DetailNotificationActivity : BaseHeaderActivity() {

    override fun setTitle(): String {
        return resources.getString(R.string.notification_detail)
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_detail_notification
    }

    override fun setBackgroundHeader(): Int {
        if (intent.getBooleanExtra(Constant.FROM_HOME, false)) {
            return R.color.blue
        } else
            return UserCache.getColorUser()
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        val id = intent.getIntExtra(Constant.NOTIFICATION_ID, 0)
        getDetailNotification(id, intent.getIntExtra(Constant.NOTIFICATION_STATUS, 2))
    }

    private fun getDetailNotification(notifyId: Int, notifyStatus: Int) {
        setLoading(true)
        if (UserCache.isLogin()) {
            ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                    .getDetailNotification(notifyId)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<DetailNotificationResponse> {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            setLoading(false)
                        }

                        override fun onNext(detailNotificationResponse: DetailNotificationResponse) {
                            setLoading(false)
                            if (detailNotificationResponse.code == Constant.SUCCESS) {
                                if (notifyStatus == 1) {
                                    sendBroadcast()
                                }
                                if (detailNotificationResponse.data?.idReport != 0 || detailNotificationResponse.data?.idPost != 0){
                                    btnViewReport.visibility = View.VISIBLE
                                    if(detailNotificationResponse.data?.idPost != 0)
                                        btnViewReport.text= getString(R.string.view_detail)
                                }

                                tvTitleNotify.text = detailNotificationResponse.data?.title
                                /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                                    tvContentNotify.text = Html.fromHtml(detailNotificationResponse.data?.content, Html.FROM_HTML_MODE_LEGACY)
                                } else {
                                    tvContentNotify.text = Html.fromHtml(detailNotificationResponse.data?.content)
                                }*/
                                tvContentNotify.text = detailNotificationResponse.data?.content
                                btnViewReport.setOnClickListener(View.OnClickListener {
                                    if (detailNotificationResponse.data?.idPost != 0) {
                                        val intent = Intent(this@DetailNotificationActivity, DetailPostActivity::class.java)
                                        intent.putExtra(Constant.POST_ID, detailNotificationResponse.data?.idPost)
                                        startActivity(intent)
                                    }
                                    if (detailNotificationResponse.data?.idReport != 0) {
                                        val intent = Intent(this@DetailNotificationActivity, DetailWorkActivity::class.java)
                                        intent.putExtra(Constant.REPORT_ID, detailNotificationResponse.data?.idReport)
                                        startActivity(intent)
                                    }
                                })
                            }

                        }

                    })
        }
    }

    private fun sendBroadcast() {
        val intent = Intent(Constant.NOTIFY_LOCAL_BROADCAST)
        intent.putExtra(Constant.IS_READ, true)
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent)

    }
}
