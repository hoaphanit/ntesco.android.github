package com.vn.ntesco.activity

import android.app.Activity
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.TextView
import com.daasuu.bl.BubbleLayout
import com.daasuu.bl.BubblePopupHelper
import com.google.firebase.iid.FirebaseInstanceId
import com.squareup.picasso.Picasso
import com.vn.ntesco.R
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.model.Response.NTescoResponse
import com.vn.ntesco.model.Response.TotalNotifyUnreadResponse

import com.vn.ntesco.model.Response.UserResponse
import com.vn.ntesco.model.User
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.*
import kotlinx.android.synthetic.main.activity_service.*

import net.gotev.uploadservice.*
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.net.URISyntaxException

class ServiceActivity : BaseHeaderActivity(), ImagePicker.OnSingleImageSelectedListener {

    var mUser: User? = null
    val REQUEST_EDIT_PROFILE = 102

    override fun setTitle(): String {
        return resources.getString(R.string.service)
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_service
    }

    override fun setBackgroundHeader(): Int {
        return UserCache.getColorUser()
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        btnLogout.setOnClickListener(this)
        btnEdit.setOnClickListener(this)
        mUser = UserCache.userInfo
        txtName.text = mUser?.getFullName()
        txtJob.text = Utils.getUserType(this@ServiceActivity, mUser?.type ?: 0)
        getProfile();
        if (!UserCache.isCustomerUser()) {
            btnCalendar.setOnClickListener(this)
            btnListWork.setOnClickListener(this)
            btnReport.visibility = GONE
            btnCheckList.visibility = GONE
            Picasso.get().load(R.drawable.bg_employer).centerCrop().fit().into(ivBanner)
        } else {
            btnReport.setOnClickListener(this)
            btnCheckList.setOnClickListener(this)
            btnCalendar.visibility = GONE
            btnListWork.visibility = GONE
            btnCheckList.visibility = VISIBLE
            Picasso.get().load(R.drawable.bg_customer).centerCrop().fit().into(ivBanner)
        }
        ivAvatar.setOnClickListener(this)
        btnNotification.setOnClickListener(this)
        ivLanguage.visibility = View.VISIBLE
        ivLanguage.setOnClickListener(this)

        getRawWaterType()
        getProduct()
        getFormsProcessingAndGuarantees()
        getTotalNotifyUnread()
        LocalBroadcastManager.getInstance(this).registerReceiver(notifyReceiver, IntentFilter(Constant.NOTIFY_LOCAL_BROADCAST));

    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v?.id) {
            R.id.ivLanguage -> {
                val bubbleLayout = LayoutInflater.from(this).inflate(R.layout.bubble_select_language, null) as BubbleLayout
                val tvVietNamese = bubbleLayout.findViewById<TextView>(R.id.txt_vietnamese)
                val tvEnglish = bubbleLayout.findViewById<TextView>(R.id.txt_english)
                val popupWindow = BubblePopupHelper.create(this, bubbleLayout)
                val margin = resources.getDimensionPixelOffset(R.dimen.w_bubble_popup) + resources.getDimensionPixelOffset(R.dimen.padding_normal) - (v.width / 2 + 10)
                popupWindow.showAtLocation(v, Gravity.NO_GRAVITY, v.left.toInt() - margin, v.height + v.y.toInt());
                tvVietNamese.setOnClickListener {
                    if (!PrefUtils.getInstance().getLanguage().equals("vi")) {
                        PrefUtils.getInstance().saveLanguage("vi")
                        switchLanguage()
                    }
                    popupWindow.dismiss()


                }
                tvEnglish.setOnClickListener {
                    if (!PrefUtils.getInstance().getLanguage().equals("en")) {
                        PrefUtils.getInstance().saveLanguage("en")
                        switchLanguage()
                    }
                    popupWindow.dismiss()

                }
            }
            R.id.btnListWork -> {
                val intent = Intent(this, ListWorkActivity::class.java)
                startActivity(intent)
            }
            R.id.btnReport -> {
                val intent = Intent(this, ReportActivity::class.java)
                startActivity(intent)
            }
            R.id.btnCalendar -> {
                val intent = Intent(this, WorkScheduleActivity::class.java)
                startActivity(intent)
            }
            R.id.btnEdit -> {
                val intent = Intent(this, EditProfileActivity::class.java)
                intent.putExtra(Constant.USER, mUser)
                startActivityForResult(intent, REQUEST_EDIT_PROFILE)
            }
            R.id.btnLogout -> {
                logOut()
            }

            R.id.ivAvatar -> {
//                ImagePicker.with(this@ServiceActivity)
//                        .crop(1f, 1f)                //Crop Square icon(Optional)
//                        .compress(1024)            //Final icon size will be less than 1 MB(Optional)
//                        .maxResultSize(1080, 1080)    //Final icon resolution will be less than 1080 x 1080(Optional)
//                        .start()
                val imagePicker = com.vn.ntesco.utils.ImagePicker.Builder("ntesco.fileprovider").build()
                imagePicker.show(supportFragmentManager, "picker")
            }
            R.id.btnNotification -> {
                val intent = Intent(this, NotificationActivity::class.java)
                startActivity(intent)
            }
            R.id.btnCheckList -> {
                val intent = Intent(this, CheckListActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun getProfile() {
        setLoading(true)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getProfile()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<UserResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(userResponse: UserResponse) {
                        setLoading(false)
                        if (userResponse.code == Constant.SUCCESS) {
                            if (userResponse.data == null) return
                            mUser = userResponse.data
                            initData(mUser)

                        }

                    }

                })
    }

    private fun logOut() {
        setLoading(true)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .logOut()
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
                            UserCache.saveUserInfo(null)
                            val nMgr = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                            nMgr.cancelAll()
                            Thread(Runnable {
                                try {
                                    FirebaseInstanceId.getInstance().deleteInstanceId()
                                } catch (e: IOException) {
                                    e.printStackTrace()
                                }
                            }).start()
                            sendBroadcast();
                            finish()
                        }

                    }

                })
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_EDIT_PROFILE && resultCode == Activity.RESULT_OK) {
            mUser = data?.getSerializableExtra(Constant.USER) as User
            initData(mUser)
            return
        }
//        if (resultCode == Activity.RESULT_OK) {
//            //Image Uri will not be null for RESULT_OK
//            val fileUri = data?.data
////            imgProfile.setImageURI(fileUri)
//
//            //You can get File object from intent
//            val file: File? = ImagePicker.getFile(data!!)
//
//            //You can also get File Path from intent
//            val filePath: String? = ImagePicker.getFilePath(data)
//            WriteLog.e("pathhhhhhhh", filePath)
//            Picasso.get().load(File(filePath)).fit().centerCrop().into(ivAvatar)
//            filePath?.let { uploadPhoto(it) }
//        } else if (resultCode == ImagePicker.RESULT_ERROR) {
//            // Toast.makeText(this, ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
//        } else {
//            //    Toast.makeText(this, "Task Cancelled", Toast.LENGTH_SHORT).show()
//        }
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
                changeAvatar(imgPath)
                Picasso.get().load(File(imgPath)).into(ivAvatar)
            })
        }).start()
    }

    fun initData(user: User?) {
        if (user == null) return
        Picasso.get().load(user.image).centerCrop().fit().placeholder(R.mipmap.default_avatar).into(ivAvatar)
        txtName.text = user.getFullName()
        txtJob.text = Utils.getUserType(this@ServiceActivity, user.type)
        user.accessToken = UserCache.userInfo?.accessToken!!
        UserCache.saveUserInfo(user)
    }

    private fun uploadPhoto(file: String) {

        var multipartUploadRequest = MultipartUploadRequest(this, "http://ntesco.verztecsolution.com/api/change-avatar")


        multipartUploadRequest.addHeader("Content-Type", "application/json")
        multipartUploadRequest.addHeader("Authorization", "Bearer " + UserCache.userInfo?.accessToken)
        multipartUploadRequest.addHeader("Language", Constant.getLanguage())

        multipartUploadRequest.addFileToUpload(file, "image")
        val config = UploadNotificationConfig()
        config.completed.autoClear = true
        multipartUploadRequest.setNotificationConfig(config)
        multipartUploadRequest.setDelegate(object : UploadStatusDelegate {
            override fun onProgress(context: Context?, uploadInfo: UploadInfo?) {
            }

            override fun onError(context: Context?, uploadInfo: UploadInfo?, serverResponse: ServerResponse?, exception: java.lang.Exception?) {
                WriteLog.e("onError", serverResponse?.bodyAsString)

            }

            override fun onCompleted(context: Context?, uploadInfo: UploadInfo?, serverResponse: ServerResponse?) {
                WriteLog.e("onCompleted", serverResponse?.getBodyAsString())
            }

            override fun onCancelled(context: Context?, uploadInfo: UploadInfo?) {
            }
        })
        multipartUploadRequest.setMaxRetries(2)
        multipartUploadRequest.startUpload()

    }

    fun changeAvatar(path: String) {
        var partsImg: MultipartBody.Part? = null;
        if (path != null && path.isNotEmpty()) {
            val file = File(path)
            if (file != null) {
                val fileBody = RequestBody.create(MediaType.parse("image/*"), file)
                partsImg = MultipartBody.Part.createFormData("image", file.name, fileBody)
            }
        }
        ServiceFactory.createRetrofitMultiPartService(NTescoService::class.java, Constant.apiEndPoint)
                .changeAvatar(partsImg!!)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<NTescoResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {

                    }

                    override fun onNext(nTescoResponse: NTescoResponse) {
                        if (nTescoResponse.code == Constant.SUCCESS) {
                        }

                    }

                })
    }

    private fun sendBroadcast() {
        val intent = Intent(Constant.LOGIN_LOCAL_BROADCAST)
        intent.putExtra(Constant.LOG_OUT, true)
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
    }

    private fun getTotalNotifyUnread() {
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getTotalNotifyUnread()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<TotalNotifyUnreadResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(totalNotifyUnreadResponse: TotalNotifyUnreadResponse) {
                        if (totalNotifyUnreadResponse.code == Constant.SUCCESS) {
                            if (totalNotifyUnreadResponse.data == null) return
                            if (totalNotifyUnreadResponse.data > 0) {
                                tvNumberUnread.visibility = View.VISIBLE
                                tvNumberUnread.setText(totalNotifyUnreadResponse.data.toString())
                            } else
                                tvNumberUnread.visibility = View.INVISIBLE
                        }

                    }

                })
    }

    internal var notifyReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            getTotalNotifyUnread()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(notifyReceiver);
    }
}