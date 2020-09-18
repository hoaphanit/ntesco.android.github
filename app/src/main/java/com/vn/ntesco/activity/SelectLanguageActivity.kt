package com.vn.ntesco.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.vn.ntesco.R
import com.vn.ntesco.base.BaseActivity
import com.vn.ntesco.utils.PrefUtils
import kotlinx.android.synthetic.main.activity_select_language.*
import kotlinx.android.synthetic.main.main_header.*
import java.util.*


class SelectLanguageActivity : BaseActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.llVietNamese -> {
                changeLanguage("vi")
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
            R.id.llEnglish -> {
                changeLanguage("en")
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }


    override fun setBody(savedInstanceState: Bundle?) {
        ivLanguage.visibility = View.INVISIBLE
        findViewById<LinearLayout>(R.id.llVietNamese).setOnClickListener(this)
        findViewById<LinearLayout>(R.id.llEnglish).setOnClickListener(this)
    }

    override fun getLayoutResource(): Int {
        return R.layout.activity_select_language
    }

    fun changeLanguage(language_code: String) {
        val res = this.getResources()
        val dm = res.getDisplayMetrics()
        val conf = res.getConfiguration()
        conf.setLocale(Locale(language_code)) // API 17+ only.
        this.createConfigurationContext(conf)
        PrefUtils.getInstance().saveLanguage(language_code)
    }
}
