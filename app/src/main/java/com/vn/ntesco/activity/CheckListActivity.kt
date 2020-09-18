package com.vn.ntesco.activity

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vn.ntesco.R
import com.vn.ntesco.adapter.CheckListGroupAdapter
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.CheckListModel
import com.vn.ntesco.model.Request.CheckListRequest
import com.vn.ntesco.model.Response.CheckListResponse
import com.vn.ntesco.model.Response.NTescoResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.DialogUtils
import com.vn.ntesco.views.SpacesItemDecoration
import kotlinx.android.synthetic.main.activity_check_list.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class CheckListActivity : BaseHeaderActivity() {
    lateinit var checkListGroupAdapter: CheckListGroupAdapter
//    lateinit var productsAdapter: DataSpinnerAdapter<CheckListModel>

    override fun setTitle(): String {
        return getString(R.string.check_list)
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_check_list
    }

    override fun setBackgroundHeader(): Int {
        return R.color.blue
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        checkListGroupAdapter = CheckListGroupAdapter(this)
        rvGroupCheckList.apply {
            adapter = checkListGroupAdapter
            layoutManager = LinearLayoutManager(this@CheckListActivity)
        }
        rvGroupCheckList.addItemDecoration(SpacesItemDecoration(resources.getDimensionPixelOffset(R.dimen.margin_big)))
        checkListGroupAdapter.itemClickListener = object :ItemClickListener{
            override fun <T : Any> onItemClick(item: T, position: Int) {
                checkList(item as CheckListModel)
            }

        }
        checkListGroupAdapter.registerAdapterDataObserver(object :
                RecyclerView.AdapterDataObserver() {
            override fun onChanged() {
                //rvGroupCheckList.smoothScrollToPosition(rvGroupCheckList.adapter?.itemCount!! - 1)
//                val distanceInPixels: Int
//                val firstVisibleChild: View = rvGroupCheckList.getChildAt(0)
//                val itemHeight = firstVisibleChild.height
//                val currentPosition: Int = rvGroupCheckList.getChildAdapterPosition(firstVisibleChild)
//                val p: Int = Math.abs(position - currentPosition)
//                distanceInPixels = if (p > 5) (p - (p - 5)) * itemHeight else p * itemHeight
//                layoutMgr.scrollToPositionWithOffset(position, distanceInPixels)
            }
        })

        //   productsAdapter = DataSpinnerAdapter<CheckListModel>(this, R.layout.item_spinner)
//        spinnerProductsCheckList.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                if (productsAdapter.getItems().get(position) != null && productsAdapter.getItems().size > 0 && productsAdapter.getItems().get(position) is CheckListModel) {
//                    checkListAdapter.checkListModel = productsAdapter?.getItems().get(position)
//                }
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//            }
//
//
//        })
//        btnSend.setOnClickListener {
//            checkList()
//        }
        getCheckLists()
    }

    private fun checkList(checkListModel: CheckListModel) {
        setLoading(true)
        var nTescoRequestPOST = CheckListRequest()
        nTescoRequestPOST.id = checkListModel?.id ?: 0
        nTescoRequestPOST.attributess = checkListModel?.attributesList
        nTescoRequestPOST.children = checkListModel?.childrenList
        nTescoRequestPOST.statusList = checkListModel?.inputAttributesList!!
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .checkList(nTescoRequestPOST)
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
                            showAlertCallback(nTescoResponse.msg, object : DialogUtils.CallbackDialog {
                                override fun onCancel() {

                                }

                                override fun onAccept() {
                                    //  finish()
                                }
                            })
                        }

                    }

                })
    }

    private fun getCheckLists() {
        setLoading(true)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getCheckLists()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<CheckListResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(checkListResponse: CheckListResponse) {
                        setLoading(false)
                        if (checkListResponse.code == Constant.SUCCESS) {
                            checkListResponse.data?.let {
                                checkListGroupAdapter.listGroupCheckListModel = it
                                //  productsAdapter.setItems(it)
                            }
                            //   productsAdapter.setDropDownViewResource(R.layout.item_spinner)
                            //  spinnerProductsCheckList.adapter = productsAdapter
                            //   checkListAdapter.checkListModel = checkListResponse.data?.get(0)
                        }


                    }

                })
    }
}