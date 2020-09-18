package com.vn.ntesco.fragment


import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.localbroadcastmanager.content.LocalBroadcastManager

import com.vn.ntesco.R
import com.vn.ntesco.activity.AccountActivity
import com.vn.ntesco.activity.DetailNotificationActivity
import com.vn.ntesco.adapter.NotificationAdapter
import com.vn.ntesco.base.BaseFragment
import com.vn.ntesco.listener.EndlessRecyclerOnScrollListener
import com.vn.ntesco.listener.ItemButtonClickListener
import com.vn.ntesco.listener.ItemButtonListener
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Notification
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.NTescoResponse
import com.vn.ntesco.model.Response.NotificationResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.DialogUtils
import com.vn.ntesco.utils.NtescoSwipeHelper
import com.vn.ntesco.utils.UserCache
import com.vn.ntesco.views.ItemButton
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import kotlin.math.acos


class NotificationFragment : BaseFragment(), SwipeRefreshLayout.OnRefreshListener {


    private lateinit var notificationAdapter: NotificationAdapter
    private lateinit var linearLayoutManager:LinearLayoutManager
    private lateinit var rvNotify: RecyclerView
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var endlessRecyclerOnScrollListener: EndlessRecyclerOnScrollListener
    private lateinit var tvNodata: TextView
    var from_home = false
    var isFromNotify = false
    override fun getLayoutResource(): Int {
        return R.layout.fragment_notification
    }

    companion object {
        fun newInstance(fromHome: Boolean): NotificationFragment {
            val notificationFragment = NotificationFragment()
            // Bundle args = new_process Bundle();
            notificationFragment.from_home = fromHome
            //  truckInformationFragment.setArguments(args);
            return notificationFragment
        }
    }

    override fun onSetBodyView(view: View, container: ViewGroup?, savedInstanceState: Bundle?) {
        rvNotify = view.findViewById(R.id.rvNotify)
        swipeRefreshLayout = view.findViewById(R.id.swipeRefreshLayout)
        tvNodata = view.findViewById(R.id.tvNodata)
        notificationAdapter = NotificationAdapter(activity)
        linearLayoutManager = androidx.recyclerview.widget.LinearLayoutManager(context, androidx.recyclerview.widget.LinearLayoutManager.VERTICAL, false)
        rvNotify.apply {
            adapter = notificationAdapter
            layoutManager = linearLayoutManager
        }

        notificationAdapter.setOnItemClickListener(object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                if (UserCache.isLogin()) {
                    val intent = Intent(activity, DetailNotificationActivity::class.java)
                    intent.putExtra(Constant.NOTIFICATION_ID, (item as Notification).id)
                    intent.putExtra(Constant.NOTIFICATION_STATUS, (item as Notification).status)
                    intent.putExtra(Constant.FROM_HOME, from_home)
                    startActivity(intent)
                    if (notificationAdapter.notificationsList[position].status == 1) {
                        notificationAdapter.notificationsList[position].status = 2
                        notificationAdapter.notifyItemChanged(position)
                    }
                } else {
                    val intent = Intent(activity, AccountActivity::class.java)
                    startActivity(intent)
                }

            }

        })
        notificationAdapter.itemButtonClickListener = object : ItemButtonClickListener {
            override fun <T : Any> onDeleteClick(item: T, position: Int) {
                if (item != null)
                    deleteNotification((item as Notification).id, position)
            }

        }
        getNotification(Constant.DEFAULT_FIRST_PAGE)
        endlessRecyclerOnScrollListener = object : EndlessRecyclerOnScrollListener(linearLayoutManager, Constant.DEFAULT_FIRST_PAGE) {
            override fun onLoadMore(current_page: Int) {
                getNotification(current_page)

            }

        }
        rvNotify.addOnScrollListener(endlessRecyclerOnScrollListener);
        swipeRefreshLayout.setOnRefreshListener(this)
        registerBroadcast(loginBroadcastReceiver, Constant.LOGIN_LOCAL_BROADCAST)
        registerBroadcast(notifyReceiver, Constant.NOTIFY_LOCAL_BROADCAST)
//        val swipeHelper = object  : NtescoSwipeHelper(activity!!,rvNotify,200){
//            override fun instantiateButton(viewHolder: RecyclerView.ViewHolder, buffer: MutableList<ItemButton>) {
//                buffer.add(ItemButton(
//                        getContext()!!,
//                        getString(R.string.delete),
//                        resources.getDimensionPixelOffset(R.dimen.font_big),
//                        0,
//                        Color.parseColor("#FF503D"),
//                        object : ItemButtonListener{
//                            override fun onClick(position: Int) {
//                                Toast.makeText(context,"click button",Toast.LENGTH_LONG).show()
//                            }
//                        }
//                ))
//            }
//
//        }
    }

    override fun onRefresh() {
        swipeRefreshLayout.isRefreshing = false
        endlessRecyclerOnScrollListener?.resetCurrentPage()
        getNotification(Constant.DEFAULT_FIRST_PAGE)
    }

    private fun getNotification(page: Int) {
        if (!UserCache.isLogin()) return
        if(!isFromNotify)setLoading(true)
        val nTescoRequestGET = NTescoRequestGET()
        nTescoRequestGET.setPage(page)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getNotifications(nTescoRequestGET)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<NotificationResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        if(!isFromNotify){
                            setLoading(false)
                        }else{
                            isFromNotify = false;
                        }
                    }

                    override fun onNext(notificationResponse: NotificationResponse) {
                        if(!isFromNotify){
                            setLoading(false)
                        }else{
                            isFromNotify = false;
                        }
                        if (notificationResponse.code == Constant.SUCCESS) {
                            notificationResponse.data?.data?.let {
                                if (page == Constant.DEFAULT_FIRST_PAGE) {
                                    if (notificationResponse.data.data.size == 0)
                                        tvNodata.visibility = View.VISIBLE
                                    else
                                        tvNodata.visibility = View.GONE
                                    notificationAdapter.notificationsList = it
                                } else
                                    notificationAdapter.notificationsList.addAll(it)
                                notificationAdapter.notifyDataSetChanged()
                            }


                        }

                    }

                })

    }
    fun deleteAllNotify(){
        DialogUtils.showDialogConfirm(activity,getString(R.string.delete_all_notify),getString(R.string.ok),getString(R.string.cancel),true,object :DialogUtils.CallbackDialog{
            override fun onAccept() {
                deleteNotification()
            }

            override fun onCancel() {

            }
        })
    }
    fun deleteNotification(notifyId: Int = 0, position : Int =0) {
        if (!UserCache.isLogin()) return
        setLoading(true)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .deleteNotification(notifyId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<NTescoResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(nTescoResponse: NTescoResponse) {
                        setLoading(false)
                        if (nTescoResponse.code == Constant.SUCCESS) {
                            if (notifyId == 0) {
                                showAlert(nTescoResponse.msg!!)
                                notificationAdapter.notificationsList.clear()
                                notificationAdapter.notifyDataSetChanged()
                                tvNodata.visibility = View.VISIBLE
                            } else {
                                notificationAdapter.notificationsList.removeAt(position)
                                notificationAdapter.notifyDataSetChanged()
                                if(notificationAdapter.notificationsList.size==0)
                                    tvNodata.visibility = View.VISIBLE
                            }
                            sendBroadcastNotify()
                        }

                    }

                })

    }

    internal var loginBroadcastReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            onRefresh()
        }
    }
    internal var notifyReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            if (intent.getBooleanExtra(Constant.FROM_NOTIFY, false))
                if (intent.getIntExtra(Constant.NOTIFICATION_ID, 0) != 0) {
                    val notifyId = intent.getIntExtra(Constant.NOTIFICATION_ID, 0)
                    for ((index, value) in notificationAdapter.notificationsList.withIndex()) {
                        if (value.id == notifyId) {
                            notificationAdapter.notificationsList[index].status = 2
                            notificationAdapter.notifyItemChanged(index)
                            break
                        }
                    }
                } else{
                    isFromNotify = true;
                    onRefresh()
                }
            else
                if(intent.getBooleanExtra(Constant.DELETE_NOTIFY, false) && from_home ){
                    onRefresh()
                }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterBroadcast(loginBroadcastReceiver)
        unregisterBroadcast(notifyReceiver)
    }
    private fun sendBroadcastNotify() {
        val intent = Intent(Constant.NOTIFY_LOCAL_BROADCAST)
        intent.putExtra(Constant.DELETE_NOTIFY, !from_home)
        LocalBroadcastManager.getInstance(activity!!).sendBroadcast(intent)
    }

}
