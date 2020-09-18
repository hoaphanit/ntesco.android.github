package com.vn.ntesco.fragment

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.vn.ntesco.R
import com.vn.ntesco.activity.DetailWorkActivity
import com.vn.ntesco.adapter.ListReportAdapter
import com.vn.ntesco.base.BaseFragment
import com.vn.ntesco.listener.EndlessRecyclerOnScrollListener
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Report
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.ReportResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.ReportStatus
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class ListReportFragment : BaseFragment(), SwipeRefreshLayout.OnRefreshListener {
    private lateinit var listReportAdapter: ListReportAdapter
    lateinit var endlessRecyclerOnScrollListener: EndlessRecyclerOnScrollListener
    var type = 1
    private lateinit var rvListReport: RecyclerView
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var tvNodata: TextView

    companion object {
        fun newInstance(type: Int): ListReportFragment {
            val listReportFragment = ListReportFragment()
            // Bundle args = new_process Bundle();
            listReportFragment.type = type
            //  truckInformationFragment.setArguments(args);
            return listReportFragment
        }
    }


    override fun getLayoutResource(): Int {
        return R.layout.fragment_list_report
    }

    override fun onSetBodyView(view: View, container: ViewGroup?, savedInstanceState: Bundle?) {
        listReportAdapter = ListReportAdapter(activity)
        rvListReport = view.findViewById(R.id.rvReport)
        swipeRefreshLayout = view.findViewById(R.id.swipeRefreshLayout)
        tvNodata = view.findViewById(R.id.tvNodata)
        swipeRefreshLayout.setOnRefreshListener(this)
        val linearLayoutManager = LinearLayoutManager(activity)
        listReportAdapter.setOnItemClickListener(object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                val intent = Intent(activity, DetailWorkActivity::class.java)
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
        if (type != -1)
            registerBroadcast(listReportReceiver, Constant.LIST_REPORT_LOCAL_BROADCAST)
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
        ntescoRequest.setType(type = type.toString())
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
        if (type != 1)
            unregisterBroadcast(listReportReceiver)
    }

}