package com.vn.ntesco.activity

import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import android.view.View
import com.vn.ntesco.R
import com.vn.ntesco.adapter.adaptersViewPager.AccountAdapter
import com.vn.ntesco.base.BaseActivity
import com.vn.ntesco.fragment.LoginFragment
import com.vn.ntesco.fragment.SignUpFragment
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.views.NTesCoViewPager
import kotlinx.android.synthetic.main.account_activity.*


class AccountActivity : BaseActivity() {
//    var vp: ViewPager = null

    lateinit var viewPager: NTesCoViewPager
    lateinit var tabLayout: TabLayout
    override fun setBody(savedInstanceState: Bundle?) {
        viewPager = findViewById<NTesCoViewPager>(R.id.container)
        tabLayout = findViewById<TabLayout>(R.id.tabs)
        var accountAdapter = AccountAdapter(supportFragmentManager)
        accountAdapter.addFragment(LoginFragment.newInstance(intent.getBooleanExtra(Constant.GO_TO_SERVICE, false)), resources.getString(R.string.login))
        accountAdapter.addFragment(SignUpFragment(), resources.getString(R.string.register))
        viewPager.adapter = accountAdapter
        viewPager.setPagingEnabled(false)
        tabLayout.setupWithViewPager(viewPager)
        ivBack.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

    override fun getLayoutResource(): Int {
        return R.layout.account_activity
    }

    override fun onResume() {
        super.onResume()
        baseActivity = this
    }

}