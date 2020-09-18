package com.vn.ntesco.base

import android.Manifest
import android.app.Activity
import android.app.FragmentTransaction
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.os.Build
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.kaopiz.kprogresshud.KProgressHUD
import com.vn.ntesco.R
import com.vn.ntesco.activity.SplashActivity
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.NTescoResponse
import com.vn.ntesco.model.Response.RawWaterTypeResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.*
import com.vn.ntesco.views.MyContextWrapper
import qiu.niorgai.StatusBarCompat
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


abstract class BaseActivity : AppCompatActivity() {

    abstract fun getLayoutResource(): Int;
    abstract fun setBody(savedInstanceState: Bundle?)
    private lateinit var progressDialog: KProgressHUD
    val REQUEST_PERMISSIONS_REQUEST_CODE = 34;

    companion object {
        var baseActivity: BaseActivity? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baseActivity = this
        overridePendingTransition(R.anim.slide_in_left, R.anim.non_animation)
      //  StatusBarCompat.translucentStatusBar(this, true);
        setContentView(getLayoutResource())
        progressDialog = KProgressHUD(this)
        progressDialog.setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setDimAmount(0.5f)
                .setCancellable(false)
        setBody(savedInstanceState)
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase?.let { MyContextWrapper(newBase).wrap(it, PrefUtils.getInstance().getLanguage()) });
    }

    override fun onResume() {
        super.onResume()
    }

    fun addFragment(fragment: BaseFragment?) {
        if (fragment == null || getFragmentContainerViewId() == 0 || !isAvailableActivity(this))
            return
//        if (fragmentManager == null)
//            fragmentManager = supportFragmentManager
        //        String backStateName = fragment.getClass().getName();
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(getFragmentContainerViewId(), fragment, fragment.tag)
        // ft.setCustomAnimations(R.anim.slide_right, R.anim.slide_left);
        // ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(fragment.tag)
        ft.commit()
    }

    fun startFirstFragment(): Fragment? {
        val data = intent.extras
        var fragment: BaseFragment? = null
        if (data != null) {
            val fragmentName = data.getString(Navigator.FRAGMENT_CLASS_NAME_START, "")
            if (!fragmentName.isEmpty()) {
                fragment = FragmentProvider.getFragmentNewInstance(fragmentName, data)
                replaceFragment(fragment)
            }
        }
        return fragment
    }

    fun replaceFragment(fragment: BaseFragment?) {
        if (fragment == null) return
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(getFragmentContainerViewId(), fragment, fragment.tag)
        ft.commit()
    }

    fun getFragmentContainerViewId(): Int {
        return R.id.container
    }

    fun isAvailableActivity(activity: Activity?): Boolean {
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                if (!activity.isDestroyed) {
                    return true
                }
            }
            if (!activity.isFinishing) {
                return true
            }
        }
        return false
    }

    fun setLoading(isLoading: Boolean) {
        if (this == null)
            return
        if (isFinishing)
            return
        if (progressDialog == null)
            return
        if (this == null)
            return
        if (isLoading)
            progressDialog.show()
        else
            progressDialog.dismiss()
    }

    public fun getRawWaterType() {
        var ntescoRequest = NTescoRequestGET()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getRawWaterType(ntescoRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<RawWaterTypeResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(rawWaterTypeResponse: RawWaterTypeResponse) {
                        if (rawWaterTypeResponse.code == Constant.SUCCESS) {
                            PrefUtils.getInstance().saveListWaterType(rawWaterTypeResponse.data)

                        }

                    }

                })
    }

    public fun getProduct() {
        var ntescoRequest = NTescoRequestGET()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getProduct(ntescoRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<RawWaterTypeResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(rawWaterTypeResponse: RawWaterTypeResponse) {
                        if (rawWaterTypeResponse.code == Constant.SUCCESS) {
                            PrefUtils.getInstance().saveListProduct(rawWaterTypeResponse.data)

                        }

                    }

                })
    }
    public fun getFormsProcessingAndGuarantees() {
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getFormsProcessing()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<RawWaterTypeResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(rawWaterTypeResponse: RawWaterTypeResponse) {
                        if (rawWaterTypeResponse.code == Constant.SUCCESS) {
                            PrefUtils.getInstance().saveListFormsProcessing(rawWaterTypeResponse.data)
                        }

                    }

                })
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getGuarantees()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<RawWaterTypeResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(rawWaterTypeResponse: RawWaterTypeResponse) {
                        if (rawWaterTypeResponse.code == Constant.SUCCESS) {
                            PrefUtils.getInstance().saveListGuarantees(rawWaterTypeResponse.data)
                        }

                    }

                })
    }

    fun switchLanguage() {
        if (!UserCache.isLogin()) {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
            finishAffinity()
            return
        }
        setLoading(true)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .switchLanguage()
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
                            val intent = Intent(this@BaseActivity, SplashActivity::class.java)
                            startActivity(intent)
                            finishAffinity()
                        }

                    }

                })
    }

    protected fun showAlert(message: String?) {
        DialogUtils.showDialog(this, message, null)
    }

    protected fun showAlertCallback(message: String?, callbackDialog: DialogUtils.CallbackDialog) {
        DialogUtils.showDialog(this, message ,callbackDialog)
    }

    fun verifyAvailableNetwork(activity: AppCompatActivity): Boolean {
        return Utils.isNetworkConnected(activity)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.non_animation, R.anim.slide_out_right)
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.non_animation, R.anim.slide_out_right)
    }

    fun checkPermissions(): Boolean {
        return ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) === PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) === PackageManager.PERMISSION_GRANTED
    }

    fun requestPermissions() {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), REQUEST_PERMISSIONS_REQUEST_CODE);
    }

    protected fun getMyContext(): Context {
        return MyContextWrapper(this).wrap(this, PrefUtils.getInstance().getLanguage())
    }
}