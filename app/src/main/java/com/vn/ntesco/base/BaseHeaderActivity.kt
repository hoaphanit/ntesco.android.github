package com.vn.ntesco.base

import android.content.Intent
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.vn.ntesco.R
import com.vn.ntesco.activity.*
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.WriteLog

abstract class BaseHeaderActivity : BaseActivity(), View.OnClickListener {
    abstract fun setTitle(): String
    abstract fun getLayoutContent(): Int
    abstract fun setBackgroundHeader(): Int
    lateinit var ivBack: ImageView
    lateinit var ivLanguage: ImageView
    lateinit var titleHeader: TextView
    lateinit var headerLayout: ConstraintLayout
    lateinit var tvAdd: TextView

    override fun getLayoutResource(): Int {
        return R.layout.activity_base_header
    }

    override fun setBody(savedInstanceState: Bundle?) {
        WriteLog.e("screeeen", javaClass.simpleName)
        ivBack = findViewById(R.id.ivBack)
        ivLanguage = findViewById(R.id.ivLanguage)
        titleHeader = findViewById(R.id.tvTitleHeader)
        headerLayout = findViewById(R.id.header)
        tvAdd = findViewById(R.id.txtAdd)
        val frameLayout = findViewById(R.id.rootViewActivity) as FrameLayout
        layoutInflater.inflate(getLayoutContent(), frameLayout, true)
        titleHeader.text = setTitle()
        getWindow().setStatusBarColor(ContextCompat.getColor(this, setBackgroundHeader()));
        headerLayout.setBackgroundResource(setBackgroundHeader())
        ivBack.setOnClickListener(this)
        tvAdd.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.ivBack -> {
                onBackPressed()
            }

//            R.id.txtAdd ->
//            {
//                val intent = Intent(this@BaseHeaderActivity, CreateReportActivity::class.java)
//                startActivityForResult(intent)
//            }
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        if(this is ListWorkActivity || this is ReportActivity || this is NotificationActivity){
            if(!Constant.isOpeningMain){
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
    override fun onResume() {
        super.onResume()
        baseActivity = this

    }
}
