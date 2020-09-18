package com.vn.ntesco.activity

import android.content.Intent
import android.os.Bundle
import com.vn.ntesco.R
import com.vn.ntesco.adapter.adaptersViewPager.MainAdapterViewPager
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.fragment.ListWorkFragment
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.WriteLog
import com.vn.ntesco.views.NTescoSwitchButton
import kotlinx.android.synthetic.main.activity_list_work.*

class ListWorkActivity : BaseHeaderActivity() {
    private lateinit var mMainAdapter: MainAdapterViewPager;
    private lateinit var nTescoSwitchButton: NTescoSwitchButton

    override fun getLayoutContent(): Int {
        return R.layout.activity_list_work
    }

    override fun setBackgroundHeader(): Int {
        return R.color.red
    }

    override fun setTitle(): String {
        return resources.getString(R.string.list_work)
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        mMainAdapter = MainAdapterViewPager(supportFragmentManager)
        mMainAdapter.addFragment(ListWorkFragment.newInstance(1))
        mMainAdapter.addFragment(ListWorkFragment.newInstance(2))
        mMainAdapter.addFragment(ListWorkFragment.newInstance(3))
        listWorkViewPager.setAdapter(mMainAdapter)
        listWorkViewPager.setOffscreenPageLimit(2)
        listWorkViewPager.setPagingEnabled(false)
        nTescoSwitchButton = findViewById(R.id.switchButton)
        nTescoSwitchButton.setClickListener(object : NTescoSwitchButton.ClickListener {
            override fun onLeftClick() {
                listWorkViewPager.setCurrentItem(0)
            }

            override fun onCenterClick() {
                listWorkViewPager.setCurrentItem(1)
            }

            override fun onRightClick() {
                listWorkViewPager.setCurrentItem(2)

            }
        })
        if (intent.hasExtra(Constant.REPORT_ID)) {
            startDetail(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        if (intent != null && intent.hasExtra(Constant.REPORT_ID)) {
            startDetail(intent)
            if (mMainAdapter.getItem(0) != null && mMainAdapter.getItem(0) is ListWorkFragment) {
                val listWorkFragment = mMainAdapter.getItem(0) as ListWorkFragment
                listWorkFragment.onRefresh()
            }
            if (mMainAdapter.getItem(1) != null && mMainAdapter.getItem(1) is ListWorkFragment) {
                val listWorkFragment = mMainAdapter.getItem(1) as ListWorkFragment
                listWorkFragment.onRefresh()
            }
            if (intent.hasExtra(Constant.TYPE_NOTIFY) && intent.getIntExtra(Constant.TYPE_NOTIFY, 0) == 4) {
                if (mMainAdapter.getItem(2) != null && mMainAdapter.getItem(2) is ListWorkFragment) {
                    val listWorkFragment = mMainAdapter.getItem(2) as ListWorkFragment
                    listWorkFragment.onRefresh()
                }
            }

        }
    }

    fun startDetail(intent: Intent?) {
        val intentStart = Intent(this, DetailWorkActivity::class.java)
        intentStart.putExtra(Constant.REPORT_ID, intent?.getIntExtra(Constant.REPORT_ID, 0))
        startActivity(intentStart)
    }
}
