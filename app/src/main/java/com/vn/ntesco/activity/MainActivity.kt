package com.vn.ntesco.activity

import android.app.Activity
import android.content.*
import android.content.pm.PackageManager
import android.location.Location
import android.net.Uri
import android.os.Bundle
import android.os.IBinder
import android.provider.Settings
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.core.content.ContextCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.viewpager.widget.ViewPager
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.airbnb.deeplinkdispatch.DeepLink
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.iid.FirebaseInstanceId
import com.vn.ntesco.R
import com.vn.ntesco.adapter.adaptersViewPager.MainAdapterViewPager
import com.vn.ntesco.base.BaseActivity
import com.vn.ntesco.model.Request.SignupRequest
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_header.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import com.daasuu.bl.BubblePopupHelper
import com.daasuu.bl.BubbleLayout
import com.squareup.picasso.Picasso
import com.vn.ntesco.BuildConfig
import com.vn.ntesco.fragment.*
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.*
import kotlinx.android.synthetic.main.activity_detail_solution.*

@DeepLink("ntesco://ntesco.vn/deepLink/")
class MainActivity : BaseActivity(), ViewPager.OnPageChangeListener {
    override fun onPageScrollStateChanged(p0: Int) {
    }

    override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {
    }

    override fun onPageSelected(p0: Int) {
        if (p0 != 0) {
            ivLanguage.visibility = View.INVISIBLE
            if (p0 == 2)
                tvDeleteAllNotify.visibility = View.VISIBLE
            else
                tvDeleteAllNotify.visibility = View.GONE
        } else {
            ivLanguage.visibility = View.VISIBLE
            tvDeleteAllNotify.visibility = View.GONE
        }
        Utils.hideKeyboard(this)
    }


    private lateinit var mMainAdapter: MainAdapterViewPager;
    private val tabIcons = intArrayOf(R.drawable.ic_home, R.drawable.ic_chat, R.drawable.ic_notification, R.drawable.ic_contact)
    var mService: LocationUpdatesService? = null
    var mBound = false;
    lateinit var locationReceiver: LocationReceiver
    var total = 0;
    private val mServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(className: ComponentName,
                                        service: IBinder) {
            val binder = service as LocationUpdatesService.LocalBinder
            mService = binder.service
            mBound = true
            getLocation()
        }

        override fun onServiceDisconnected(name: ComponentName) {
            mService = null;
            mBound = false
        }
    }


    override fun setBody(savedInstanceState: Bundle?) {
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.blue))
        locationReceiver = LocationReceiver()
        bindService(Intent(this, LocationUpdatesService::class.java), mServiceConnection, Context.BIND_AUTO_CREATE)
        mMainAdapter = MainAdapterViewPager(supportFragmentManager)
        mMainAdapter.addFragment(HomeFragment())
        mMainAdapter.addFragment(ChatBotFragment())
        mMainAdapter.addFragment(NotificationFragment.newInstance(true))
        mMainAdapter.addFragment(ContactFragment())
        mainViewPager.setAdapter(mMainAdapter)
        mainViewPager.setOffscreenPageLimit(3)
        mainViewPager.setPagingEnabled(false)
        mainTabLayout.setupWithViewPager(mainViewPager)
        mainViewPager.addOnPageChangeListener(this)
        inintTabLayout()
        Utils.geyHashKey(this)
        disableTab()
        FirebaseInstanceId.getInstance().instanceId
                .addOnCompleteListener(OnCompleteListener { task ->
                    if (!task.isSuccessful) {
                        return@OnCompleteListener
                    }
                    val token = task.result?.token
                    WriteLog.d("firebase_token", token.toString())
                    PrefUtils.getInstance().saveTokenFirebase(token.toString())
                })
        val bubbleLayout = LayoutInflater.from(this).inflate(R.layout.bubble_select_language, null) as BubbleLayout
        val tvVietNamese = bubbleLayout.findViewById<TextView>(R.id.txt_vietnamese)
        val tvEnglish = bubbleLayout.findViewById<TextView>(R.id.txt_english)

        ivLanguage.setOnClickListener {
            val popupWindow = BubblePopupHelper.create(this, bubbleLayout)
            val margin = resources.getDimensionPixelOffset(R.dimen.w_bubble_popup) + resources.getDimensionPixelOffset(R.dimen.padding_normal) - (it.width / 2 + 10)
            WriteLog.e("ivLanguage", it.height.toString() + " " + it.y + " " + it.bottom)
            popupWindow.showAtLocation(it, Gravity.NO_GRAVITY, it.left.toInt() - margin, it.bottom + it.height);
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
        tvDeleteAllNotify.setOnClickListener {
            if (mMainAdapter.getItem(2) != null) {
                val notificationFragment = mMainAdapter.getItem(2) as NotificationFragment
                notificationFragment.deleteAllNotify()
            }
        }
        LocalBroadcastManager.getInstance(this).registerReceiver(locationReceiver, IntentFilter(LocationUpdatesService.ACTION_BROADCAST));
        LocalBroadcastManager.getInstance(this).registerReceiver(notifyReceiver, IntentFilter(Constant.NOTIFY_LOCAL_BROADCAST));
        LocalBroadcastManager.getInstance(this).registerReceiver(loginReceiver, IntentFilter(Constant.LOGIN_LOCAL_BROADCAST));
        if (intent.getBooleanExtra(DeepLink.IS_DEEP_LINK, false) && !UserCache.isLogin()) {
            val intent = Intent(this@MainActivity, AccountActivity::class.java)
            startActivity(intent)
        }
        checkVersion()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        if (intent != null && intent.getBooleanExtra(Constant.CHAT, false)) {
            mainViewPager.setCurrentItem(1)
        } else
            mainViewPager.setCurrentItem(0)
    }

    inner class LocationReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val location: Location = intent?.extras!!.getParcelable(LocationUpdatesService.EXTRA_LOCATION);
            if (location != null) {
                mService?.removeLocationUpdates()
                if (UserCache.isTechnical())
                    updateLocation(location)
            }
        }

    }

    val loginReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val isLogOut = intent?.getBooleanExtra(Constant.LOG_OUT, false);
            if (isLogOut!!)
                hideNumberUnread()
            else
                getTotalNotifyUnread()
        }

    }

    override fun onResume() {
        super.onResume()
        Constant.isOpeningMain = true;
        baseActivity = this
        if (mBound)
            getLocation()
    }

    fun getLocation() {
        if (UserCache.isLogin() && UserCache.isTechnical()) {
            if (!checkPermissions()) {
                requestPermissions();
            } else {
                mService?.requestLocationUpdates();
            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (mBound) {
            unbindService(mServiceConnection);
            mBound = false;
        }
        LocalBroadcastManager.getInstance(this).unregisterReceiver(locationReceiver);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(notifyReceiver);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(loginReceiver);
    }

    override fun getLayoutResource(): Int {
        return R.layout.activity_main
    }

    private fun disableTab() {
        val tabStrip = mainTabLayout.getChildAt(0) as LinearLayout
        tabStrip.getChildAt(2).setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, event: MotionEvent): Boolean {
                if (UserCache.isLogin())
                    return false
                if (event.action == MotionEvent.ACTION_UP) {
                    val intent = Intent(this@MainActivity, AccountActivity::class.java)
                    startActivity(intent)
                }
                return true
            }
        })

    }

    private fun inintTabLayout() {
        val arrLabel = resources.getStringArray(R.array.main_tab_layout)
        for (i in 0 until mainTabLayout.getTabCount()) {
            val tab = mainTabLayout.getTabAt(i)
            val tab_Layout = LayoutInflater.from(this).inflate(R.layout.main_tab_layout, null) as LinearLayout
            val tvTitle = tab_Layout.findViewById(R.id.tvTitle) as TextView
            val ivIcon = tab_Layout.findViewById(R.id.ivIcon) as ImageView
            tvTitle.text = arrLabel[i]
            ivIcon.setImageResource(tabIcons[i])
            tab!!.setCustomView(tab_Layout)
        }
        getTotalNotifyUnread();
    }

    fun updateLocation(location: Location) {
        var signUpFragment = SignupRequest()
        signUpFragment.lat = location.latitude
        signUpFragment.lng = location.longitude
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .updateProfile(signUpFragment)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<UserResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(userResponse: UserResponse) {
                        if (userResponse.code == Constant.SUCCESS) {

                        }


                    }

                })
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode == REQUEST_PERMISSIONS_REQUEST_CODE) {
            if (grantResults.size <= 0) {
                // If user interaction was interrupted, the permission request is cancelled and you
                // receive empty arrays.
                WriteLog.i("TAG", "User interaction was cancelled.");
            } else if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                mService?.requestLocationUpdates()
            }
        }
    }

    private fun getTotalNotifyUnread() {
        if (!UserCache.isLogin())
            return
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
                            if (totalNotifyUnreadResponse.data == null) return;
                            total = totalNotifyUnreadResponse.data
                            if (total > 0)
                                showNumberUnread(total)
                            else
                                hideNumberUnread()
                        }

                    }

                })
    }

    private fun checkVersion() {
        val nTescoRequestGET = NTescoRequestGET()
        nTescoRequestGET.setEnv(Constant.ANDROID)
        nTescoRequestGET.setVersion(BuildConfig.VERSION_NAME)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .checkVersion(nTescoRequestGET)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<CheckVersionResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(checkVersionResponse: CheckVersionResponse) {
                        if (checkVersionResponse.code == Constant.SUCCESS) {
                            if (checkVersionResponse.data != null && checkVersionResponse.data.isUpdate!!) {
                                DialogUtils.showDialogConfirm(this@MainActivity, checkVersionResponse.data.informationUpdate, getString(R.string.update_profile), getString(R.string.cancel), checkVersionResponse.data.needUpdate == 0, object : DialogUtils.CallbackDialog {
                                    override fun onAccept() {
                                        Utils.openChPlay(this@MainActivity)
                                    }

                                    override fun onCancel() {
                                    }
                                })

                            }
                        }

                    }

                })
    }

    fun showNumberUnread(number: Int) {
        val tab = mainTabLayout.getTabAt(2)
        if (tab != null && tab.customView != null) {
            val tvNumberUnread = tab.customView!!.findViewById<TextView>(R.id.tvNumberUnread);
            if (tvNumberUnread != null) {
                tvNumberUnread.visibility = View.VISIBLE
                tvNumberUnread.setText(number.toString());
            }

        }
    }

    fun hideNumberUnread() {
        val tab = mainTabLayout.getTabAt(2)
        if (tab != null && tab.customView != null) {
            val tvNumberUnread = tab.customView!!.findViewById<TextView>(R.id.tvNumberUnread);
            if (tvNumberUnread != null) {
                tvNumberUnread.visibility = View.INVISIBLE
            }

        }
    }

    internal var notifyReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
//            if (intent.getBooleanExtra(Constant.IS_READ, false)) {
//                total--
//                if (total < 0)
//                    total = 0
//            } else {
//                total++
//            }
//            if (total > 0)
//                showNumberUnread(total)
//            else
//                hideNumberUnread()
            getTotalNotifyUnread()
        }
    }

    override fun onStart() {
        Constant.isOpeningMain = true;
        super.onStart()
    }

}
