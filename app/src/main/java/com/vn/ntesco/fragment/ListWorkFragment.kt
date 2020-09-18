package com.vn.ntesco.fragment

import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import com.vn.ntesco.R
import android.content.Intent
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

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
import kotlinx.android.synthetic.main.activity_report.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

//class ListWorkFragment: BaseFragment()
//{
//    private lateinit var vpListWork: ViewPager
//    override fun getLayoutResource(): Int {
class ListWorkFragment : BaseFragment(), SwipeRefreshLayout.OnRefreshListener {


    private lateinit var listWorkAdapter: ListReportAdapter
    private lateinit var rvListWord: RecyclerView
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var tvNodata: TextView
    var type = 1
    val REQUEST_DETAIL_WORK = 123
    var positionSelected = -1
    lateinit var endlessRecyclerOnScrollListener: EndlessRecyclerOnScrollListener

    companion object {
        fun newInstance(type: Int): ListWorkFragment {
            val listWorkFragment = ListWorkFragment()
            // Bundle args = new_process Bundle();
            listWorkFragment.type = type
            //  truckInformationFragment.setArguments(args);
            return listWorkFragment
        }
    }

    override fun getLayoutResource(): Int {
        return R.layout.list_work_fragment
    }

    override fun onSetBodyView(view: View, container: ViewGroup?, savedInstanceState: Bundle?) {
        listWorkAdapter = ListReportAdapter(activity)
        rvListWord = view.findViewById(R.id.rvListWork)
        swipeRefreshLayout = view.findViewById(R.id.swipeRefreshLayout)
        tvNodata = view.findViewById(R.id.tvNodata)
        swipeRefreshLayout.setOnRefreshListener(this)
        val linearLayoutManager = LinearLayoutManager(activity)
        rvListWord.apply {
            layoutManager = linearLayoutManager
            adapter = listWorkAdapter
            listWorkAdapter.type = type
        }
        listWorkAdapter.setOnItemClickListener(object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                positionSelected = position
                val intent = Intent(activity, DetailWorkActivity::class.java)
                intent.putExtra(Constant.REPORT, item as? Report)
                startActivityForResult(intent, REQUEST_DETAIL_WORK)
            }
        })
        endlessRecyclerOnScrollListener = object : EndlessRecyclerOnScrollListener(linearLayoutManager, Constant.DEFAULT_FIRST_PAGE) {
            override fun onLoadMore(current_page: Int) {
                getListWorks(current_page)
            }

        }
        rvListWord.addOnScrollListener(endlessRecyclerOnScrollListener)
        getListWorks(Constant.DEFAULT_FIRST_PAGE)
        registerBroadcast(listWorkReceiver, Constant.LIST_WORK_LOCAL_BROADCAST)
    }


    private fun getListWorks(page: Int) {
        setLoading(true)
        var ntescoRequest = NTescoRequestGET()
        ntescoRequest.setPage(page)
        ntescoRequest.setType(type.toString())
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getAllListWork(ntescoRequest)
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
                                    listWorkAdapter.data = reportResponse.data.data
                                    if (reportResponse.data.data.size == 0) {
                                        tvNodata.visibility = View.VISIBLE
                                    } else {
                                        tvNodata.visibility = View.GONE
                                    }
                                } else
                                    listWorkAdapter.data.addAll(reportResponse.data.data)
                                listWorkAdapter.notifyDataSetChanged()
                            }


                        }

                    }

                })
    }

    override fun onRefresh() {
        swipeRefreshLayout.setRefreshing(false)
        endlessRecyclerOnScrollListener?.resetCurrentPage()
        getListWorks(Constant.DEFAULT_FIRST_PAGE)
    }

    internal var listWorkReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val status = intent?.getIntExtra(Constant.STATUS, 0);
            val reportId = intent?.getIntExtra(Constant.REPORT_ID, 0);
            if(type!=3)
                onRefresh()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterBroadcast(listWorkReceiver)
    }
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == REQUEST_DETAIL_WORK && resultCode == Activity.RESULT_OK) {
//            if (positionSelected != -1) {
//                val status = data?.getIntExtra(Constant.STATUS, 1)
//                listWorkAdapter.data[positionSelected].status = status
//                listWorkAdapter.notifyItemChanged(positionSelected)
//            }
//        }
//    }
}