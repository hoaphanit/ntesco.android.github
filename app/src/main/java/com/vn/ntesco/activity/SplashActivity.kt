package com.vn.ntesco.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.vn.ntesco.R
import com.vn.ntesco.base.BaseActivity
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.Navigator.startActivity
import com.vn.ntesco.utils.PrefUtils
import com.vn.ntesco.utils.WriteLog

class SplashActivity : BaseActivity() {
    val DELAY: Long = 500;

    override fun setBody(savedInstanceState: Bundle?) {
        WriteLog.e("getLanguage", Constant.getLanguage())
        Handler().postDelayed(Runnable {
            if(PrefUtils.getInstance().getLanguage()!=null && !PrefUtils.getInstance().getLanguage().isEmpty()){
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            }else{
                startActivity(Intent(this@SplashActivity, SelectLanguageActivity::class.java))
            }
            finish()

        }, DELAY)
    }

    override fun getLayoutResource(): Int {
        return R.layout.splash_activity
    }


}
