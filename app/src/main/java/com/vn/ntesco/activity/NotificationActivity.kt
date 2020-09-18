package com.vn.ntesco.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.vn.ntesco.R
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.fragment.NotificationFragment
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.UserCache
import kotlinx.android.synthetic.main.header.*


class NotificationActivity : BaseHeaderActivity() {

    override fun setTitle(): String {
        return resources.getString(R.string.notification)
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_notification
    }

    override fun setBackgroundHeader(): Int {
        return UserCache.getColorUser()
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        tvDeleteAllNotify.visibility= View.VISIBLE
        replaceFragment(NotificationFragment())
        if (intent.hasExtra(Constant.NOTIFICATION_ID)) {
            startDetail(intent)
        }
        tvDeleteAllNotify.setOnClickListener {
            val notificationFragment: Fragment? = supportFragmentManager.findFragmentById(R.id.container)
            if(notificationFragment!=null){
                ((notificationFragment as NotificationFragment).deleteAllNotify())
            }
        }
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        if (intent != null && intent.hasExtra(Constant.REPORT_ID)) {
            startDetail(intent)
        }
    }

    fun startDetail(intent: Intent?) {
        val intentStart = Intent(this, DetailNotificationActivity::class.java)
        intentStart.putExtra(Constant.NOTIFICATION_ID, intent?.getIntExtra(Constant.NOTIFICATION_ID, 0))
        startActivity(intentStart)
    }
}
