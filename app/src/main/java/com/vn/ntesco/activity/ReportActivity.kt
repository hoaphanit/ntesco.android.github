package com.vn.ntesco.activity

import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.View
import android.widget.TextView
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.RecyclerView
import com.vn.ntesco.R
import com.vn.ntesco.adapter.ListReportAdapter
import com.vn.ntesco.adapter.adaptersViewPager.MainAdapterViewPager
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.fragment.ListReportFragment
import com.vn.ntesco.fragment.ListWorkFragment
import com.vn.ntesco.listener.EndlessRecyclerOnScrollListener
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Report
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.ReportResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.views.NTescoSwitchButton
import kotlinx.android.synthetic.main.activity_list_report.*
import kotlinx.android.synthetic.main.activity_list_work.*
import kotlinx.android.synthetic.main.activity_report.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class ReportActivity : BaseHeaderActivity(), SwipeRefreshLayout.OnRefreshListener {
    private lateinit var listReportAdapter: ListReportAdapter
    lateinit var endlessRecyclerOnScrollListener: EndlessRecyclerOnScrollListener
    var type = 1
    private lateinit var rvListReport: RecyclerView
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var tvNodata: TextView
    //
    val CREATE_REPORT_REQUEST = 123

    override fun setTitle(): String {
        return resources.getString(R.string.report)
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_report
        //return R.layout.activity_list_report
    }

    override fun setBackgroundHeader(): Int {
        return R.color.blue
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        tvAdd.visibility = View.VISIBLE
        listReportAdapter = ListReportAdapter(this)
        rvListReport = findViewById(R.id.rvReport)
        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout)
        tvNodata = findViewById(R.id.tvNodata)
        swipeRefreshLayout.setOnRefreshListener(this)
        val linearLayoutManager = LinearLayoutManager(this)
        listReportAdapter.setOnItemClickListener(object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                val intent = Intent(this@ReportActivity, DetailWorkActivity::class.java)
                intent.putExtra(Constant.REPORT, item as? Report)
                startActivity(intent)
            }

        })
        rvListReport.apply {
            layoutManager = linearLayoutManager
            adapter = listReportAdapter
        }
        endlessRecyclerOnScrollListener = object : EndlessRecyclerOnScrollListener(linearLayoutManager, Constant.DEFAULT_FIRST_PAGE) {
            override fun onLoadMore(current_page: Int) {
                getReports(current_page)
            }

        }
        rvListReport.addOnScrollListener(endlessRecyclerOnScrollListener)
        getReports(Constant.DEFAULT_FIRST_PAGE)
        LocalBroadcastManager.getInstance(this).registerReceiver(listReportReceiver, IntentFilter(Constant.LIST_REPORT_LOCAL_BROADCAST))
        if (intent.hasExtra(Constant.REPORT_ID)) {
            startDetail(intent)
        }
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        if (intent != null && intent.hasExtra(Constant.REPORT_ID)) {
            onRefresh()
            startDetail(intent)
        }
    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.txtAdd -> {
                val intent = Intent(this, CreateReportActivity::class.java)
                startActivityForResult(intent, CREATE_REPORT_REQUEST)
            }
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CREATE_REPORT_REQUEST && resultCode == Activity.RESULT_OK) {
            onRefresh()
//            listReportViewPager.currentItem = 0
//            if (mReportViewPagerAdapter.getItem(0) != null ) {
//                val listWorkFragment = mReportViewPagerAdapter.getItem(0) as ListReportFragment
//                listWorkFragment.onRefresh()
//            }
        }
    }
    fun startDetail(intent: Intent?) {
        val intentStart = Intent(this, DetailWorkActivity::class.java)
        intentStart.putExtra(Constant.REPORT_ID, intent?.getIntExtra(Constant.REPORT_ID, 0))
        startActivity(intentStart)
    }

    internal var listReportReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            onRefresh()
        }
    }

    override fun onRefresh() {
        swipeRefreshLayout.isRefreshing = false
        endlessRecyclerOnScrollListener?.resetCurrentPage()
        getReports(Constant.DEFAULT_FIRST_PAGE)
    }

    private fun getReports(page: Int) {
        setLoading(true)
        var ntescoRequest = NTescoRequestGET()
        ntescoRequest.setPage(page)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getReport(ntescoRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<ReportResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(reportResponse: ReportResponse) {
                        setLoading(false)
                        if (reportResponse.code == Constant.SUCCESS) {
                            reportResponse.data?.let {
                                if (page == Constant.DEFAULT_FIRST_PAGE) {
                                    listReportAdapter.data = reportResponse.data.data
                                    if (reportResponse.data.data.size == 0)
                                        tvNodata.visibility = View.VISIBLE
                                    else
                                        tvNodata.visibility = View.GONE
                                } else
                                    listReportAdapter.data.addAll(reportResponse.data.data)
                                listReportAdapter.notifyDataSetChanged()

                            }


                        }

                    }

                })
    }

    override fun onDestroy() {
        super.onDestroy()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(listReportReceiver)
    }
}
