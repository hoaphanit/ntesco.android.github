package com.vn.ntesco.activity

//import com.asksira.bsimagepicker.Utils
import Utils
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.ImageView
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.*
import com.google.gson.Gson
import com.vn.ntesco.R
import com.vn.ntesco.adapter.ReportCheckAdapter
import com.vn.ntesco.adapter.ReportUploadImages
import com.vn.ntesco.adapter.WorkCheckAdapter
import com.vn.ntesco.adapter.WorkImageAdapter
import com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.fragment.WorkaroundMapFragment
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Report
import com.vn.ntesco.model.Request.AssignRequest
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Request.NTescoRequestPOST
import com.vn.ntesco.model.Request.NtescoMultipartUploadRequest
import com.vn.ntesco.model.Response.ListTechnicalResponse
import com.vn.ntesco.model.Response.NTescoResponse
import com.vn.ntesco.model.Response.ReportDetailReponse
import com.vn.ntesco.model.User
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.*
import com.vn.ntesco.views.NtescoInfoWindowAdapter
import kotlinx.android.synthetic.main.activity_detail_work.*
import kotlinx.android.synthetic.main.activity_detail_work.imageReportView
import net.gotev.uploadservice.*
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.io.File
import java.io.FileOutputStream
import java.net.URISyntaxException
import java.util.*


class DetailWorkActivity : BaseHeaderActivity(), OnMapReadyCallback, ImagePicker.OnSingleImageSelectedListener {
    lateinit var waterTypeAdapter: WorkCheckAdapter
    lateinit var productTypeAdapter: WorkCheckAdapter
    lateinit var formsProcessingAdapter: ReportCheckAdapter
    lateinit var warrantyStatusAdapter: ReportCheckAdapter
    lateinit var reportImageAdapter: WorkImageAdapter
    lateinit var technicalAdapter: DataSpinnerAdapter<User>
    lateinit var reportUploadImagesAdapter: ReportUploadImages
    lateinit var processingStatusImageAdapter: WorkImageAdapter
    lateinit var processedImageAdapter: WorkImageAdapter

    private var report: Report? = null

    // private var reportDetail: ReportDetail? = null
    private var mMap: GoogleMap? = null
    private val ZOOM_VALUE = 15
    private var reportId = 0
    private lateinit var newStatus: ImageView
    private lateinit var confirmStatus: ImageView
    private lateinit var processingStatus: ImageView
    private lateinit var completedStatus: ImageView
    public var posSelect = 0;
    override fun setTitle(): String {
        return ""
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_detail_work
    }

    override fun setBackgroundHeader(): Int {
        return UserCache.getColorUser()
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        report = intent.getSerializableExtra(Constant.REPORT) as? Report
        reportId = intent.getIntExtra(Constant.REPORT_ID, 0)
        WriteLog.e("reportId", reportId.toString())
        newStatus = findViewById<ImageView>(R.id.newStatus)
        confirmStatus = findViewById<ImageView>(R.id.confirm)
        processingStatus = findViewById<ImageView>(R.id.processing)
        completedStatus = findViewById<ImageView>(R.id.completed)

        val mMapFragment = supportFragmentManager.findFragmentById(R.id.map) as WorkaroundMapFragment
        mMapFragment.getMapAsync(this)
        if (PrefUtils.getInstance().getListProduct()?.size == 0)
            getProduct()
        if (PrefUtils.getInstance().getListWaterType()?.size == 0)
            getRawWaterType()
        if (PrefUtils.getInstance().getListFormsProcessing()?.size == 0)
            getFormsProcessingAndGuarantees()
        waterTypeAdapter = WorkCheckAdapter(this)
        productTypeAdapter = WorkCheckAdapter(this)

        reportImageAdapter = WorkImageAdapter(this)
        reportImageAdapter.itemClickListener = object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                var intent = Intent(this@DetailWorkActivity, ViewImageActivity::class.java)
                intent.putExtra(Constant.LIST_IMAGE, reportImageAdapter.dataList as ArrayList<String>)
                intent.putExtra(Constant.POSITION, position)
                startActivity(intent);
            }

        }
        val waterTypeLayoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        rvWaterType.apply {
            setHasFixedSize(true)
            adapter = waterTypeAdapter
            layoutManager = waterTypeLayoutManager
            waterTypeAdapter.dataList = PrefUtils.getInstance().getListWaterType()
            waterTypeAdapter.notifyDataSetChanged()
        }
        val productLayoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        rvProducts.apply {
            setHasFixedSize(true)
            adapter = productTypeAdapter
            layoutManager = productLayoutManager
            productTypeAdapter.dataList = PrefUtils.getInstance().getListProduct()
            productTypeAdapter.notifyDataSetChanged()
        }
        imageReportView.initRecyclerView(reportImageAdapter)
        mMapFragment.setListener(object : WorkaroundMapFragment.OnTouchListener {
            override fun onTouch() {
                scrollView.requestDisallowInterceptTouchEvent(true);
            }
        })
        btnConfirm.setOnClickListener(this)
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        mMap = googleMap
        //   googleMap?.getUiSettings()?.setZoomGesturesEnabled(false)
        if (report != null)
            getReportDetail(report?.id)
        if (reportId != 0)
            getReportDetail(reportId)

    }

    private fun getReportDetail(id: Int?) {
        setLoading(true)
        var ntescoRequest = NTescoRequestGET()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getDetailReport(id.toString(), ntescoRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<ReportDetailReponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        WriteLog.e("getReportDetail onError", e.toString())
                        setLoading(false)
                    }

                    override fun onNext(reportDetailReponse: ReportDetailReponse) {
                        setLoading(false)
                        if (reportDetailReponse.code == Constant.SUCCESS) {
                            report = reportDetailReponse.data
                            initData(report)
                        }

                    }

                })
    }

    fun initData(reportDetail: Report?) {
        if (reportDetail == null) return
        titleHeader.text = getString(R.string.report) + " (" + reportDetail?.createdAt + ")"
        tvCustomerName.setText(reportDetail.customerName)
        tvContentReport.setText(reportDetail.error)
        productTypeAdapter.dataList = reportDetail.products
        productTypeAdapter.notifyDataSetChanged()
        waterTypeAdapter.dataList = reportDetail.rawWaterType
        waterTypeAdapter.notifyDataSetChanged()
        if (reportDetail.images.size > 0) {
            reportImageAdapter.dataList = reportDetail.images
            reportImageAdapter.notifyDataSetChanged()
        } else {
            imageReportView.rvImageReport.visibility = View.GONE
        }

        val customerLocation = LatLng(reportDetail.lat ?: 0.0, reportDetail.lng ?: 0.0)
        mMap?.setInfoWindowAdapter(NtescoInfoWindowAdapter(reportDetail?.address ?: "", this));
        mMap?.addMarker(MarkerOptions().position(customerLocation).title(reportDetail?.address
                ?: "").icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location_blue)))
        if (!UserCache.isManager()) {
            mMap?.moveCamera(CameraUpdateFactory.newLatLngZoom(customerLocation, ZOOM_VALUE.toFloat()))
        } else {
            if (reportDetail.status != ReportStatus.NOT_CONFIRM.status && reportDetail.employeeLat != null && reportDetail.employeeLng != null) {
                val employeeLocation = LatLng(reportDetail.employeeLat
                        ?: 0.0, reportDetail.employeeLng ?: 0.0)
                val employMarker = mMap?.addMarker(MarkerOptions().position(employeeLocation).icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location_red)))
                val builder = LatLngBounds.Builder()
                builder.include(customerLocation)
                builder.include(employeeLocation)
                val bounds = builder.build()
                mMap?.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, resources.getDimensionPixelSize(R.dimen.padding_large)));
                mMap?.setOnMarkerClickListener(object : GoogleMap.OnMarkerClickListener {
                    override fun onMarkerClick(marker: Marker): Boolean {
                        if (marker.id.equals(employMarker?.id))
                            marker.hideInfoWindow();
                        else
                            marker.showInfoWindow();
                        return true;
                    }

                });
            } else {
                mMap?.moveCamera(CameraUpdateFactory.newLatLngZoom(customerLocation, ZOOM_VALUE.toFloat()))
            }
        }
        btnConfirm.visibility = View.GONE
        when (reportDetail?.status) {
            ReportStatus.NOT_CONFIRM.status -> {
                newStatus.setImageResource(R.mipmap.new_blue)
                if (UserCache.isManager())
                    btnConfirm.visibility = View.VISIBLE
            }
            ReportStatus.CONFIRM.status -> {
                newStatus.setImageResource(R.mipmap.new_blue)
                confirmStatus.setImageResource(R.mipmap.confirmed_blue)
                if (UserCache.isManager()) {
                    tvFromDate.setOnClickListener(this)
                    tvToDate.setOnClickListener(this)
                    btnConfirm.text = getString(R.string.implement)
                    initAssignData() // assign for technical
                    btnConfirm.visibility = View.VISIBLE
                }
            }
            ReportStatus.ASSIGNED.status -> {
                newStatus.setImageResource(R.mipmap.new_blue)
                confirmStatus.setImageResource(R.mipmap.confirmed_blue)
                initAssignData(reportDetail, true)// only view assignment info
            }
            ReportStatus.PROCESSING.status, ReportStatus.PROCESSING_STATUS.status -> {
                newStatus.setImageResource(R.mipmap.new_blue)
                confirmStatus.setImageResource(R.mipmap.confirmed_blue)
                processingStatus.setImageResource(R.mipmap.processing_blue)
                initAssignData(reportDetail, true) // only view assignment info
                initProcessingData(reportDetail)
                if (reportDetail.status == ReportStatus.PROCESSING_STATUS.status)
                    showProcessedUploadInfo(reportDetail)
            }
            ReportStatus.PROCESSED.status -> {
                newStatus.setImageResource(R.mipmap.new_blue)
                confirmStatus.setImageResource(R.mipmap.confirmed_blue)
                processingStatus.setImageResource(R.mipmap.processing_blue)
                initAssignData(reportDetail, true)// only view assignment info
                showProcessedUploadInfo(reportDetail)
                if (UserCache.isCustomerUser()) {
                    btnConfirm.visibility = View.VISIBLE
                    btnConfirm.text = getString(R.string.complete)
                    llCommentCustomer.visibility = View.VISIBLE
                }
            }

            ReportStatus.COMPLETED.status -> {
                newStatus.setImageResource(R.mipmap.new_blue)
                confirmStatus.setImageResource(R.mipmap.confirmed_blue)
                processingStatus.setImageResource(R.mipmap.processing_blue)
                completedStatus.setImageResource(R.mipmap.completed_blue)
                initAssignData(reportDetail, true)// only view assignment info
                showProcessedUploadInfo(reportDetail)
                llCommentCustomer.visibility = View.VISIBLE
                edtComment.setText(reportDetail.customerComment)
                edtComment.isEnabled = false
            }
        }
    }

    fun initAssignData(reportDetail: Report? = null, isDisable: Boolean = false) {
        formsProcessingAdapter = ReportCheckAdapter(this)
        warrantyStatusAdapter = ReportCheckAdapter(this)
        if (isDisable) {
            spinnerTechnical.visibility = View.GONE
            tvTechnicalAssigned.visibility = View.VISIBLE
            tvTechnicalAssigned.text = reportDetail?.technical
        } else {
            technicalAdapter = DataSpinnerAdapter<User>(this, R.layout.item_spinner)
            getListTechnicals()
        }
        llFormsProcessing.visibility = View.VISIBLE
        labelDateMaintenance.visibility = View.VISIBLE
        llWarrantyStatus.visibility = View.VISIBLE
        llTechnical.visibility = View.VISIBLE
        if (isDisable) {
            tvToDate.text = reportDetail?.toDate!!
            tvFromDate.text = reportDetail?.fromDate
            tvToDate.setOnClickListener(null)
            tvFromDate.setOnClickListener(null)
        }
        val formsProcessingLayoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        rvFormsProcessing.apply {
            adapter = formsProcessingAdapter
            layoutManager = formsProcessingLayoutManager
            formsProcessingAdapter.data = if (isDisable) reportDetail?.handleFormality ?: listOf() else PrefUtils.getInstance().getListFormsProcessing()
            formsProcessingAdapter.isDetail = isDisable
            formsProcessingAdapter.notifyDataSetChanged()
        }
        val warrantyStatusLayoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        rvWarrantyStatus.apply {
            adapter = warrantyStatusAdapter
            layoutManager = warrantyStatusLayoutManager
            warrantyStatusAdapter.isSigleSelect = true
//            warrantyStatusAdapter.data = PrefUtils.getInstance().getListWarrantyStatus(this@DetailWorkActivity)
            warrantyStatusAdapter.data = if (isDisable) reportDetail?.guarantee ?: listOf() else PrefUtils.getInstance().getListGuarantees()
            if (isDisable) {
                warrantyStatusAdapter.isDetail = isDisable
//                if (reportDetail?.guarantee == 1) {
//                    warrantyStatusAdapter.data[0].select = true
//                } else {
//                    warrantyStatusAdapter.data[1].select = true
//                }
            }
            warrantyStatusAdapter.notifyDataSetChanged()
        }

    }

    fun initProcessingData(reportDetail: Report?) {
        if (reportDetail!!.mine) {
            btnConfirm.text = getString(R.string.send)
            llProcessingButton.visibility = View.VISIBLE
            if (reportDetail.status == ReportStatus.PROCESSING_STATUS.status) {
                btnProcessingStatus.visibility = View.GONE
            }
            btnProcessingStatus.setOnClickListener(this)
            btnProcessed.setOnClickListener(this)

            reportUploadImagesAdapter = ReportUploadImages(this)
            reportUploadImagesAdapter.listImages.add("")
            imageProcessingView.initRecyclerView(reportUploadImagesAdapter)
            reportUploadImagesAdapter.setOnItemClickListener(object : ItemClickListener {
                override fun <T : Any> onItemClick(item: T, position: Int) {
                    posSelect = position
                    if (reportUploadImagesAdapter.listImages[position].isEmpty()) {
                        val imagePicker = ImagePicker.Builder("ntesco.fileprovider").build()
                        imagePicker.show(supportFragmentManager, "picker")
                    } else {
                        var intent = Intent(this@DetailWorkActivity, ViewImageActivity::class.java)
                        intent.putExtra(Constant.LIST_IMAGE, reportUploadImagesAdapter.listImages as ArrayList<String>)
                        intent.putExtra(Constant.IS_CREATE_REPORT, true)
                        intent.putExtra(Constant.POSITION, position)
                        startActivity(intent);
                    }
                }

            })
        } else {
            llProcessingButton.visibility = View.GONE
        }
    }

    fun showProcessedUploadInfo(reportDetail: Report?) {
        if (reportDetail?.imageProcessingStatus != null && reportDetail.imageProcessingStatus!!.size > 0) {
            tvNoteProcessingStatus.text = reportDetail.noteProcessingStatus
            llProcessingStatus.visibility = View.VISIBLE
            processingStatusImageAdapter = WorkImageAdapter(this)
            processingStatusImageAdapter.dataList = reportDetail.imageProcessingStatus!!
            processingStatusImageAdapter.itemClickListener = object : ItemClickListener {
                override fun <T : Any> onItemClick(item: T, position: Int) {
                    var intent = Intent(this@DetailWorkActivity, ViewImageActivity::class.java)
                    intent.putExtra(Constant.LIST_IMAGE, processingStatusImageAdapter.dataList as ArrayList<String>)
                    intent.putExtra(Constant.POSITION, position)
                    startActivity(intent);
                }

            }
            imageProcessingStatus.initRecyclerView(processingStatusImageAdapter)
        }
        if (reportDetail?.imageProcessed != null && reportDetail.imageProcessed!!.size > 0) {
            tvNoteProcessed.text = reportDetail.noteProcessed
            llProcessed.visibility = View.VISIBLE
            processedImageAdapter = WorkImageAdapter(this)
            processedImageAdapter.dataList = reportDetail.imageProcessed!!
            processedImageAdapter.itemClickListener = object : ItemClickListener {
                override fun <T : Any> onItemClick(item: T, position: Int) {
                    var intent = Intent(this@DetailWorkActivity, ViewImageActivity::class.java)
                    intent.putExtra(Constant.LIST_IMAGE, processedImageAdapter.dataList as ArrayList<String>)
                    intent.putExtra(Constant.POSITION, position)
                    startActivity(intent);
                }

            }
            imageProcessed.initRecyclerView(processedImageAdapter)
        }
    }

    /*  fun calculateZoomLevel(): Int {
          var equatorLength: Double = 40075004.0
          var widthInPixels: Int = DimensionUtils.getWidthScreen();
          var metersPerPixel = equatorLength / 256;
          var zoomLevel = 1;
          while ((metersPerPixel * widthInPixels) > 2000) {
              metersPerPixel /= 2;
              ++zoomLevel;
          }
          return zoomLevel;
      }
  */
    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.tvFromDate -> {
                if (tvToDate.text.toString().isEmpty())
                    DialogUtils.showDialogPickFromDate(this, Utils.getCalendarDate(tvFromDate.text.toString()), object : DialogUtils.CallbackPickDateDialog {
                        override fun onPick(view: DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int) {
                            tvFromDate.text = String.format("%02d", dayOfMonth) + "/" + String.format("%02d", monthOfYear + 1) + "/" + year
                        }
                    }, null)
                else
                    DialogUtils.showDialogPickFromDate(this, Utils.getCalendarDate(tvFromDate.text.toString()), object : DialogUtils.CallbackPickDateDialog {
                        override fun onPick(view: DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int) {
                            tvFromDate.text = String.format("%02d", dayOfMonth) + "/" + String.format("%02d", monthOfYear + 1) + "/" + year
                        }
                    }, Utils.getCalendarDate(tvToDate.text.toString()))
            }
            R.id.tvToDate -> {
                DialogUtils.showDialogPickToDate(this, Utils.getCalendarDate(tvToDate.text.toString()), object : DialogUtils.CallbackPickDateDialog {
                    override fun onPick(view: DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int) {
                        tvToDate.text = String.format("%02d", dayOfMonth) + "/" + String.format("%02d", monthOfYear + 1) + "/" + year
                    }
                }, Utils.getCalendarDate(tvFromDate.text.toString()))
            }
            R.id.btnProcessingStatus -> {
                llProductProcessed.visibility = View.VISIBLE
                btnConfirm.visibility = View.VISIBLE
                btnProcessingStatus.isEnabled = false
                btnProcessed.isEnabled = true
                scrollView.post(Runnable { scrollView.fullScroll(View.FOCUS_DOWN) })
            }
            R.id.btnProcessed -> {
                llProductProcessed.visibility = View.VISIBLE
                btnConfirm.visibility = View.VISIBLE
                btnProcessingStatus.isEnabled = true
                btnProcessed.isEnabled = false
                scrollView.post(Runnable { scrollView.fullScroll(View.FOCUS_DOWN) })
            }
            R.id.btnConfirm -> {
                when (report?.status) {
                    ReportStatus.NOT_CONFIRM.status -> {
                        confirmReport(report?.id)
                    }
                    ReportStatus.CONFIRM.status -> {
                        if (checkValidate())
                            assignReport(report?.id)
                    }
                    ReportStatus.PROCESSING.status -> {
                        if (checkValidate()) {
                            if (!btnProcessingStatus.isEnabled) {
                                uploadProductProcessingReportNew(report?.id, 0)
                            } else if (!btnProcessed.isEnabled) {
                                uploadProductProcessingReportNew(report?.id, 1)
                            }
                        }

                    }
                    ReportStatus.PROCESSING_STATUS.status -> {
                        if (checkValidate())
                            uploadProductProcessingReportNew(report?.id, 1)
                    }
                    ReportStatus.PROCESSED.status -> {
                        if (checkValidate())
                            completeReport(report?.id)
                    }

                }

            }

        }
    }

    fun confirmReport(id: Int?) {
        setLoading(true)
//        var nTescoRequestPOST = NTescoRequestPOST()
//        nTescoRequestPOST.fromDate = tvFromDate.text.toString()
//        nTescoRequestPOST.toDate = tvToDate.text.toString()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .confirmReport(id)
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
                            sendBroadcast(ReportStatus.CONFIRM.status)
                            showAlertCallback(nTescoResponse.msg, object : DialogUtils.CallbackDialog {
                                override fun onCancel() {

                                }

                                override fun onAccept() {
                                    finish()
                                }
                            })
                        }


                    }

                })
    }

    fun assignReport(id: Int?) {
        setLoading(true)
        var assignRequest = AssignRequest()
        assignRequest.fromDate = tvFromDate.text.toString()
        assignRequest.toDate = tvToDate.text.toString()
        assignRequest.technicalId = (spinnerTechnical.selectedItem as? User)?.id;
        for (data in formsProcessingAdapter.data) {
            if (data.select) {
                assignRequest.handleFormality?.add(data.id)
            }
        }
        for (data in warrantyStatusAdapter.data) {
            if (data.select) {
                assignRequest.guarantee?.add(data.id)
            }
        }
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .assignReport(id, assignRequest)
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
                            sendBroadcast(ReportStatus.ASSIGNED.status)
                            showAlertCallback(nTescoResponse.msg, object : DialogUtils.CallbackDialog {
                                override fun onCancel() {

                                }

                                override fun onAccept() {
                                    finish()
                                }
                            })
                        }


                    }

                })
    }

    fun completeReport(id: Int?) {
        setLoading(true)
        val ntNTescoRequestPOST = NTescoRequestPOST()
        ntNTescoRequestPOST.comment_service = edtComment.text.toString()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .completeReport(id, ntNTescoRequestPOST)
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
                            val intent = Intent(Constant.LIST_REPORT_LOCAL_BROADCAST)
                            LocalBroadcastManager.getInstance(this@DetailWorkActivity).sendBroadcast(intent)
                            showAlertCallback(nTescoResponse.msg, object : DialogUtils.CallbackDialog {
                                override fun onCancel() {

                                }

                                override fun onAccept() {
                                    finish()
                                }
                            })
                        }


                    }

                })
    }

    fun getListTechnicals() {
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getListTechnicals()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<ListTechnicalResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(listTechnicalResponse: ListTechnicalResponse) {
                        if (listTechnicalResponse.code == Constant.SUCCESS) {
                            listTechnicalResponse.data?.let {
                                //   it.add(0, Chemicals(-1, getString(R.string.select), -1))
                                technicalAdapter.setItems(it)
                            }
                            technicalAdapter.setDropDownViewResource(R.layout.item_spinner)
                            spinnerTechnical.adapter = technicalAdapter
                        }

                    }

                })
    }

    fun checkValidate(): Boolean {
        when (report?.status) {
            ReportStatus.CONFIRM.status -> {
                if (tvFromDate.text.toString().isEmpty()) {
                    showAlert(getString(R.string.from_date_is_not_select))
                    return false
                }
                if (tvToDate.text.toString().isEmpty()) {
                    showAlert(getString(R.string.to_date_is_not_select))
                    return false
                }
                var countForm = 0
                for (data in formsProcessingAdapter.data) {
                    if (data.select) {
                        break
                    } else {
                        countForm++
                        if (countForm == formsProcessingAdapter.data.size) {
                            showAlert(getString(R.string.forms_processing_is_not_selected))
                            return false
                        }
                    }
                }
                var countWarranty = 0
                for (data in warrantyStatusAdapter.data) {
                    if (data.select) {
                        break
                    } else {
                        countWarranty++
                        if (countWarranty == warrantyStatusAdapter.data.size) {
                            showAlert(getString(R.string.warranty_status_is_not_selected))
                            return false
                        }
                    }
                }
            }
            ReportStatus.PROCESSING.status, ReportStatus.PROCESSING_STATUS.status -> {
                if (reportUploadImagesAdapter.listImages.size <= 1) {
                    showAlert(getString(R.string.product_image_processed_is_empty))
                    return false
                }
                if (edtNote.text.toString().isEmpty() || edtNote.text.toString().trim().isEmpty()) {
                    showAlert(getString(R.string.note_is_empty))
                    return false
                }
            }

            ReportStatus.PROCESSED.status -> {
                if (edtComment.text.toString().isEmpty() || edtComment.text.toString().trim().isEmpty()) {
                    showAlert(getString(R.string.customer_comment_is_empty))
                    return false
                }
            }

        }
        return true
    }

    fun sendBroadcast(status: Int) {
        val intent = Intent(Constant.LIST_WORK_LOCAL_BROADCAST)
        intent.putExtra(Constant.STATUS, status)
        intent.putExtra(Constant.REPORT_ID, report?.id)
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
    }

    override fun onSingleImageSelected(uri: Uri?, tag: String?) {
        var imgPath: String? = null
        try {
            imgPath = ImageUtils.getPathImage(this, uri!!)
        } catch (e: URISyntaxException) {
            e.printStackTrace()
        }

        if (imgPath == null) return
        setLoading(true)
        Thread(Runnable {
            var bitmap: Bitmap? = null
            try {
                bitmap = ImageUtils.resizeBitmap(imgPath)
                val out = FileOutputStream(imgPath)
                bitmap?.compress(Bitmap.CompressFormat.PNG, 100, out)
                out.flush()
                out.close()
            } catch (e: Exception) {
                e.printStackTrace()
            }
            runOnUiThread(Runnable {
                setLoading(false)
                if (bitmap == null) {
                    return@Runnable
                }
                reportUploadImagesAdapter.listImages[posSelect] = imgPath!!
                reportUploadImagesAdapter.listImages.add("")
                reportUploadImagesAdapter.notifyDataSetChanged()
                imageProcessingView.rvImageReport.scrollToPosition(reportUploadImagesAdapter.listImages.size - 1)
            })
        }).start()
    }

    private fun uploadProductProcessingReport(reportId: Int?, type: Int) {
        setLoading(true)
        val url = Constant.apiEndPoint + if (type == 0) "api/report/processing-status/$reportId" else "api/report/processed/$reportId"
        WriteLog.e("uploadProductProcessingReport", url)
        var multipartUploadRequest = NtescoMultipartUploadRequest(this, url)
        try {
            for (image in reportUploadImagesAdapter.listImages) {
                multipartUploadRequest.addFileToUpload(image, "images[]")
            }
        } catch (exc: Exception) {
            WriteLog.e("AndroidUploadService", exc.message)
        }
        multipartUploadRequest.addParameter("note", edtNote.text.toString())

        val config = UploadNotificationConfig()
        config.completed.autoClear = true
        multipartUploadRequest.setNotificationConfig(config)
        multipartUploadRequest.setDelegate(object : UploadStatusDelegate {
            override fun onProgress(context: Context?, uploadInfo: UploadInfo?) {
            }

            override fun onError(context: Context?, uploadInfo: UploadInfo?, serverResponse: ServerResponse?, exception: java.lang.Exception?) {
                WriteLog.e("onError", serverResponse?.bodyAsString)
                setLoading(false)
            }

            override fun onCompleted(context: Context?, uploadInfo: UploadInfo?, serverResponse: ServerResponse?) {
                WriteLog.e("onCompleted", serverResponse?.getBodyAsString())
                setLoading(false)
                if (serverResponse?.bodyAsString != null) {
                    val nTescoResponse = Gson().fromJson(serverResponse?.bodyAsString, NTescoResponse::class.java);
                    if (nTescoResponse.code == Constant.SUCCESS) {
                        sendBroadcast(ReportStatus.PROCESSING_STATUS.status)
                        showAlertCallback(nTescoResponse.msg, object : DialogUtils.CallbackDialog {
                            override fun onCancel() {

                            }

                            override fun onAccept() {
                                finish()
                            }
                        })

                    } else
                        showAlert(nTescoResponse.msg)
                }
            }

            override fun onCancelled(context: Context?, uploadInfo: UploadInfo?) {
                setLoading(false)
            }
        })
        multipartUploadRequest.setUtf8Charset()
        multipartUploadRequest.setMaxRetries(2)
        multipartUploadRequest.startUpload()

    }

    fun uploadProductProcessingReportNew(reportId: Int?, type: Int) {
        setLoading(true)
        var map: MutableMap<String, RequestBody> = mutableMapOf()
        map["note"] = Utils.toRequestBody(edtNote.text.toString())
        val imagePartsList: MutableList<MultipartBody.Part> = ArrayList();
        for (image in reportUploadImagesAdapter.listImages) {
            if (image != null && image.isNotEmpty()) {
                val file = File(image)
                if (file != null) {
                    val fileBody = RequestBody.create(MediaType.parse("image/*"), file)
                    imagePartsList.add(MultipartBody.Part.createFormData("images[]", file.name, fileBody))
                }
            }

        }
        val request = if (type == 0) ServiceFactory.createRetrofitMultiPartService(NTescoService::class.java, Constant.apiEndPoint)
                .processingStatusReport(reportId!!, map, imagePartsList)
        else
            ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                    .processedReport(reportId!!, map, imagePartsList)
        request.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<NTescoResponse> {
            override fun onCompleted() {

            }

            override fun onError(e: Throwable) {
                setLoading(false)

            }

            override fun onNext(nTescoResponse: NTescoResponse) {
                setLoading(false)
                if (nTescoResponse.code == Constant.SUCCESS) {
                    sendBroadcast(ReportStatus.PROCESSING_STATUS.status)
                    showAlertCallback(nTescoResponse.msg, object : DialogUtils.CallbackDialog {
                        override fun onCancel() {

                        }

                        override fun onAccept() {
                            finish()
                        }
                    })
                }else
                    showAlert(nTescoResponse.msg)

            }

        })
    }
}
