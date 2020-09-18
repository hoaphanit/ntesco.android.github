package com.vn.ntesco.fragment


import android.content.Intent
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.viewpagerindicator.CirclePageIndicator

import com.vn.ntesco.R
import com.vn.ntesco.adapter.adaptersViewPager.HomeAdapterViewPager
import com.vn.ntesco.base.BaseFragment
import com.vn.ntesco.activity.*
import com.vn.ntesco.adapter.CategoryAdapter
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Category
import com.vn.ntesco.model.Post
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.BannerResponse
import com.vn.ntesco.model.Response.DetailPostResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.Navigator
import com.vn.ntesco.utils.UserCache
import com.vn.ntesco.views.ViewPagerAutoScroll
import kotlinx.android.synthetic.main.activity_detail_post.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


class HomeFragment : BaseFragment(), View.OnClickListener {
    var homeAdapter: HomeAdapterViewPager? = null
    var homeViewPager: ViewPagerAutoScroll? = null
    lateinit var categoryAdapter: CategoryAdapter
    lateinit var rvCategoryHome: androidx.recyclerview.widget.RecyclerView
    lateinit var circleIndicator: CirclePageIndicator

    override fun onSetBodyView(view: View, container: ViewGroup?, savedInstanceState: Bundle?) {
        homeAdapter = context?.let { HomeAdapterViewPager(it) }
        homeViewPager = view.findViewById(R.id.homeViewPager)
        homeViewPager?.adapter = homeAdapter
        circleIndicator = view.findViewById(R.id.circleIndicator)
        rvCategoryHome = view.findViewById(R.id.rvCategoryHome)
        categoryAdapter = CategoryAdapter(activity)
        categoryAdapter.setData(Utils.getListCategoryHome(activity))
        val gridLayoutManager = androidx.recyclerview.widget.GridLayoutManager(activity, 3)
        rvCategoryHome.apply {
            setHasFixedSize(true)
            adapter = categoryAdapter
            layoutManager = gridLayoutManager
        }
        categoryAdapter.setOnItemClickListener(object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                val category = item as Category
                when (category?.name) {
                    getString(R.string.about_us) -> {
                        val intent = Intent(activity, AboutUsActivity::class.java)

                        startActivity(intent)
                    }
                    getString(R.string.news_event) -> {
                        val intent = Intent(activity, NewsEventActivity::class.java)
                        intent.putExtra(Constant.TYPE, Constant.NEWS_EVENT)
                        startActivity(intent)
                    }
                    getString(R.string.water_treatment_knowledge) -> {
                        val intent = Intent(activity, NewsEventActivity::class.java)
                        intent.putExtra(Constant.TYPE, Constant.WATER_TREATMENT)
                        startActivity(intent)
                    }
                    getString(R.string.solution_application) -> {
                        val intent = Intent(activity, SolutionApplicationActivity::class.java)
                        startActivity(intent)
                    }
                    getString(R.string.service) -> {
                        if (UserCache.isLogin()) {
                            val intent = Intent(activity, ServiceActivity::class.java)
                            startActivity(intent)
                        } else {
                            val intent = Intent(activity, AccountActivity::class.java)
                            intent.putExtra(Constant.GO_TO_SERVICE, true)
                            startActivity(intent)
                        }

                    }
                    getString(R.string.chemical_calculation) -> {
                        val intent = Intent(activity, ChemicalCalculationActivity::class.java)
                        startActivity(intent)
                    }

                }
            }


        })
        getBanner()
    }

    override fun getLayoutResource(): Int {
        return R.layout.fragment_home
    }

    override fun onClick(v: View?) {

    }

    private fun getBanner() {
        setLoading(true)
        val nTescoRequestGET = NTescoRequestGET()
        nTescoRequestGET.setPosition(1)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getBanners(nTescoRequestGET)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<BannerResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(bannerResponse: BannerResponse) {
                        setLoading(false)
                        if (bannerResponse.code == Constant.SUCCESS) {
                            if (bannerResponse.data != null) {
                                homeAdapter?.bannerList = bannerResponse.data
                                homeAdapter?.notifyDataSetChanged()
                                if (bannerResponse.data.size > 1) {
                                    circleIndicator.setViewPager(homeViewPager)
                                    circleIndicator.visibility = View.VISIBLE
                                    homeViewPager?.startAutoScroll()
                                } else {
                                    circleIndicator.visibility = View.GONE
                                }

                            } else {
                                circleIndicator.visibility = View.GONE
                            }

                        }

                    }

                })
    }

    override fun onDestroy() {
        super.onDestroy()
        homeViewPager?.stopAutoScroll()
    }
}
