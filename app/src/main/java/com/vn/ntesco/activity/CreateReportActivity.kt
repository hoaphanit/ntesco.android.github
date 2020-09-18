package com.vn.ntesco.activity

//import com.github.dhaval2404.imagepicker.ImagePicker
//import net.gotev.uploadservice.UploadNotificationConfig
//import net.gotev.uploadservice.MultipartUploadRequest
import Utils
import android.Manifest
import android.app.Activity
import android.content.*
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.location.Location
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.provider.Settings
import android.view.View
import android.widget.EditText
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.gms.maps.model.LatLng
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import com.vn.ntesco.R
import com.vn.ntesco.adapter.ReportCheckAdapter
import com.vn.ntesco.adapter.ReportUploadImages
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.fragment.AddAddressDialogFragment
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Request.NtescoMultipartUploadRequest
import com.vn.ntesco.model.Response.NTescoResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.*
import kotlinx.android.synthetic.main.activity_detail_report.*
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


class CreateReportActivity : BaseHeaderActivity(), SharedPreferences.OnSharedPreferenceChangeListener, LocationData.AddressCallBack, ImagePicker.OnSingleImageSelectedListener {


    lateinit var waterTypeAdapter: ReportCheckAdapter
    lateinit var productTypeAdapter: ReportCheckAdapter
    lateinit var reportUploadImages: ReportUploadImages
    lateinit var edtCustomerName: EditText
    lateinit var edtContent: EditText
    var isDetail = false
    var posSelect: Int = 0
    lateinit var myReceiver: MyReceiver
    var mService: LocationUpdatesService? = null
    var mBound = false;
    var imagesList = ArrayList<String>()
    var lat: Double = 0.0
    var lng: Double = 0.0
    val WRITE_EXTERNAL_STORAGE_CODE = 111
    private val mServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(className: ComponentName,
                                        service: IBinder) {
            val binder = service as LocationUpdatesService.LocalBinder
            mService = binder.service
            mBound = true
        }

        override fun onServiceDisconnected(name: ComponentName) {
            mService = null;
            mBound = false
        }
    }


    override fun getLayoutContent(): Int {
        return R.layout.activity_detail_report
    }


    override fun setBackgroundHeader(): Int {
        return R.color.blue
    }

    override fun setTitle(): String {
        return resources.getString(R.string.report) + " (" + Utils.getCurrentDate() + ")"
    }

    override fun onStart() {
        super.onStart()
        //PreferenceManager.getDefaultSharedPreferences(this).registerOnSharedPreferenceChangeListener(this);


        bindService(Intent(this, LocationUpdatesService::class.java), mServiceConnection, Context.BIND_AUTO_CREATE)

    }


    override fun onResume() {
        super.onResume();
        LocalBroadcastManager.getInstance(this).registerReceiver(myReceiver,
                IntentFilter(LocationUpdatesService.ACTION_BROADCAST));
    }

    override fun onPause() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(myReceiver);
        super.onPause();
    }

    override fun onStop() {
        if (mBound) {
            // Unbind from the service. This signals to the service that this activity is no longer
            // in the foreground, and the service can respond by promoting itself to a foreground
            // service.
            unbindService(mServiceConnection);
            mBound = false;
        }
//        PreferenceManager.getDefaultSharedPreferences(this)
//                .unregisterOnSharedPreferenceChangeListener(this);
        super.onStop();
    }


    /**
     * Returns the current state of the permissions needed.
     */


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        WriteLog.i("TAG", "onRequestPermissionResult");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_PERMISSIONS_REQUEST_CODE) {
            if (grantResults.size <= 0) {
                // If user interaction was interrupted, the permission request is cancelled and you
                // receive empty arrays.
                WriteLog.i("TAG", "User interaction was cancelled.");
            } else if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission was granted.
                GpsUtils(this@CreateReportActivity, mService?.mLocationRequest).turnGPSOn(object : GpsUtils.onGpsListener {
                    override fun gpsStatus(isGPSEnable: Boolean) {
                        setLoading(true)
                        mService?.requestLocationUpdates();
                    }
                });
            } else {
                // Permission denied.
//                setButtonsState(false);
                Snackbar.make(
                        findViewById<View>(R.id.btnGetCurrent),
                        R.string.permission_denied_explanation,
                        Snackbar.LENGTH_INDEFINITE)
                        .setAction(R.string.settings, View.OnClickListener() {
                            val intent = Intent();
                            intent.setAction(
                                    Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                            val uri = Uri.fromParts("package",
                                    BuildConfig.APPLICATION_ID, null);
                            intent.setData(uri);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                        })
                        .show();
            }
        }
    }


    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {
        // Update the buttons state depending on whether location updates are being requested.
        //  if (key.equals(Utils.KEY_REQUESTING_LOCATION_UPDATES)) {
//            setButtonsState(sharedPreferences?.getBoolean(Utils.KEY_REQUESTING_LOCATION_UPDATES,
//                false));
        //  }
    }


    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        myReceiver = MyReceiver()
        waterTypeAdapter = ReportCheckAdapter(this)
        productTypeAdapter = ReportCheckAdapter(this)
        reportUploadImages = ReportUploadImages(this)
        edtCustomerName = findViewById(R.id.txtCustomerName)
        edtContent = findViewById(R.id.edtContent)

        reportUploadImages.listImages = imagesList
        imageReportView.initRecyclerView(reportUploadImages)
        rvReportWaterType.apply {
            setHasFixedSize(true)
            adapter = waterTypeAdapter
            layoutManager = androidx.recyclerview.widget.GridLayoutManager(this@CreateReportActivity, 2, androidx.recyclerview.widget.GridLayoutManager.VERTICAL, false)
            waterTypeAdapter.data = PrefUtils.getInstance().getListWaterType()
            waterTypeAdapter.notifyDataSetChanged()
        }
        rvReportProducts.apply {
            setHasFixedSize(true)
            adapter = productTypeAdapter
            layoutManager = androidx.recyclerview.widget.GridLayoutManager(this@CreateReportActivity, 2, androidx.recyclerview.widget.GridLayoutManager.VERTICAL, false)
            productTypeAdapter.data = PrefUtils.getInstance().getListProduct()
            productTypeAdapter.notifyDataSetChanged()
        }
        reportUploadImages.setOnItemClickListener(object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                posSelect = position
                if (imagesList[position].isEmpty()) {
                    val imagePicker = ImagePicker.Builder("ntesco.fileprovider").build()
                    imagePicker.show(supportFragmentManager, "picker")
                } else {
                    var intent = Intent(this@CreateReportActivity, ViewImageActivity::class.java)
                    intent.putExtra(Constant.LIST_IMAGE, imagesList)
                    intent.putExtra(Constant.IS_CREATE_REPORT, true)
                    intent.putExtra(Constant.POSITION, position)
                    startActivity(intent);
                }
            }

        })


        btnSubmit.setOnClickListener(View.OnClickListener {
            if (checkValidate())
                createReport()  //  uploadReport()
        })
        txtAddress.setOnClickListener(View.OnClickListener {
            val addAddressDialogFragment = AddAddressDialogFragment.builder(object : AddAddressDialogFragment.CallbackPopup {
                override fun onSelectClick(address: String, latLng: LatLng?) {
                    txtAddress.setText(address)
                    lat = latLng?.latitude!!
                    lng = latLng?.longitude!!
                }


            })
            addAddressDialogFragment.showOnActivity(this)
            // var it = Intent(CreateReportActivity@ this, AddAddressDialog::class.java)
            //   startActivityForResult(it, 500)
        })
        imagesList.add("")
        btnGetCurrent.setOnClickListener {
            if (!checkPermissions()) {
                requestPermissions();
            } else {
                GpsUtils(this@CreateReportActivity, mService?.mLocationRequest).turnGPSOn(object : GpsUtils.onGpsListener {
                    override fun gpsStatus(isGPSEnable: Boolean) {
                        setLoading(true)
                        mService?.requestLocationUpdates();
                    }
                });

            }
        }
        txtCustomerName.setText((UserCache?.userInfo?.lastName!! + " " + UserCache?.userInfo?.firstName!!))
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 500) {
            txtAddress.setText(data?.extras?.get(Constant.ADDRESS).toString())
            val latLng: LatLng = data?.extras?.getParcelable(Constant.LAT_LNG) as LatLng
            lat = latLng.latitude
            lng = latLng.longitude
            // WriteLog.e("adddddressssssss", latLng.latitude.toString() + " " + latLng.longitude.toString())
            return
        } else if (resultCode == Activity.RESULT_OK && requestCode == Constant.GPS_REQUEST) {
            setLoading(true)
            mService?.requestLocationUpdates()
        }

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
                imagesList[posSelect] = imgPath!!
                imagesList.add("")
                reportUploadImages.notifyDataSetChanged()
                imageReportView.rvImageReport.scrollToPosition(reportUploadImages.listImages.size - 1)
            })
        }).start()
    }

    private fun uploadReport() {
        setLoading(true)
        var multipartUploadRequest = NtescoMultipartUploadRequest(this, Constant.apiEndPoint + "/api/report/send")
        try {
            for (image in imagesList) {
                if(image != null && image.isNotEmpty())
                multipartUploadRequest.addFileToUpload(image, "images[]")

            }
        } catch (exc: Exception) {
            WriteLog.e("AndroidUploadService", exc.message)
        }
        for (raw_water in waterTypeAdapter.data) {
            if (raw_water.select) {
                multipartUploadRequest.addParameter("raw_water_type[]", raw_water.id.toString())
            }
        }

        for (product in productTypeAdapter.data) {
            if (product.select) {
                multipartUploadRequest.addParameter("products[]", product.id.toString())
            }
        }
        multipartUploadRequest.addParameter("customer_name", edtCustomerName.text.toString())
        multipartUploadRequest.addParameter("error", edtContent.text.toString())
        multipartUploadRequest.addParameter("address", txtAddress.text.toString())
        multipartUploadRequest.addParameter("lat", lat.toString())
        multipartUploadRequest.addParameter("lng", lng.toString())
        val config = UploadNotificationConfig()
        config.completed.autoClear = true
        multipartUploadRequest.setNotificationConfig(config)
        multipartUploadRequest.setDelegate(object : UploadStatusDelegate {
            override fun onProgress(context: Context?, uploadInfo: UploadInfo?) {
                WriteLog.e("onCompleted", uploadInfo.toString())

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
                        showAlertCallback(nTescoResponse.msg, object : DialogUtils.CallbackDialog {
                            override fun onCancel() {

                            }

                            override fun onAccept() {
                                setResult(Activity.RESULT_OK)
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

    private fun hasStoragePermission(requestCode: Int): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), requestCode)
                false
            } else {
                true
            }
        } else {
            true
        }
    }

    fun createReport() {
        setLoading(true)
        var map: MutableMap<String, RequestBody> = mutableMapOf()
        map["customer_name"] = Utils.toRequestBody(edtCustomerName.text.toString())
        map["error"] = Utils.toRequestBody(edtContent.text.toString())
        map["address"] = Utils.toRequestBody(txtAddress.text.toString())
        map["lat"] = Utils.toRequestBody(lat.toString())
        map["lng"] = Utils.toRequestBody(lng.toString())
        val rawWaterTypeList: MutableList<RequestBody> = ArrayList();
        for (raw_water in waterTypeAdapter.data) {
            if (raw_water.select) {
                rawWaterTypeList.add(Utils.toRequestBody(raw_water.id.toString()))
            }
        }
        val productList: MutableList<RequestBody> = ArrayList();
        for (product in productTypeAdapter.data) {
            if (product.select) {
                productList.add(Utils.toRequestBody(product.id.toString()))
            }
        }
        val imagePartsList: MutableList<MultipartBody.Part> = ArrayList();
        for (image in imagesList) {
            if (image != null && image.isNotEmpty()) {
                val file = File(image)
                if (file != null) {
                    val fileBody = RequestBody.create(MediaType.parse("image/*"), file)
                    imagePartsList.add(MultipartBody.Part.createFormData("images[]", file.name, fileBody))
                }
            }

        }
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .createReport(map, imagePartsList, rawWaterTypeList, productList)
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
                                    setResult(Activity.RESULT_OK)
                                    finish()
                                }
                            })
                        }

                    }

                })
    }

    inner class MyReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val location: Location = intent?.extras!!.getParcelable(LocationUpdatesService.EXTRA_LOCATION);
            if (location != null) {
                mService?.removeLocationUpdates()
                WriteLog.e("location", location.toString())
                lat = location.latitude
                lng = location.longitude
                if (Utils.isNetworkConnected(this@CreateReportActivity)) {
                    val getLocationDetail = GetLocationDetail(this@CreateReportActivity, this@CreateReportActivity)
                    getLocationDetail.getAddress(location.latitude, location.longitude, "AIzaSyAXjssHBlyvnt57SDuBy219QbSGACwJfr8")
                } else {
                    showAlert(getString(R.string.network_error))
                }
                setLoading(false)

            }
        }

    }

    override fun locationData(locationData: LocationData?) {
        WriteLog.e("location:::::", locationData?.full_address)
        //  setLoading(false)
        txtAddress.setText(locationData?.full_address)
    }

    fun checkValidate(): Boolean {
        if (edtCustomerName.text.toString().isEmpty() || edtCustomerName.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.customer_name_is_empty))
            return false
        }
        var countRaw: Int = 0
        for (raw_water in waterTypeAdapter.data) {
            if (raw_water.select) {
                break
            } else {
                countRaw++
                if (countRaw == waterTypeAdapter.data.size) {
                    showAlert(getString(R.string.raw_water_is_not_selected))
                    return false
                }
            }
        }
        var countProduct: Int = 0
        for (product in productTypeAdapter.data) {
            if (product.select) {
                break
            } else {
                countProduct++
                if (countProduct == productTypeAdapter.data.size) {
                    showAlert(getString(R.string.product_is_not_selected))
                    return false
                }
            }
        }
        if (reportUploadImages.listImages.size <= 1) {
            showAlert(getString(R.string.image_error_is_not_uploaded))
            return false
        }
        if (edtContent.text.toString().isEmpty() || edtContent.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.error_report_is_empty))
            return false
        }
        if (txtAddress.text.toString().isEmpty() || txtAddress.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.location_is_not_selected))
            return false
        }
        return true
    }


}
