package com.vn.ntesco.activity

import android.content.Intent
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.google.gson.Gson
import com.viewpagerindicator.CirclePageIndicator
import com.vn.ntesco.R
import com.vn.ntesco.adapter.CategoryAdapter
import com.vn.ntesco.adapter.adaptersViewPager.HomeAdapterViewPager
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Banner
import com.vn.ntesco.model.Category
import com.vn.ntesco.model.Post
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.BannerResponse
import com.vn.ntesco.model.Response.CategoryResponse
import com.vn.ntesco.model.Response.DetailPostResponse
import com.vn.ntesco.model.Response.OfficesResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.PrefUtils
import com.vn.ntesco.views.ViewPagerAutoScroll
import kotlinx.android.synthetic.main.activity_detail_post.*
import kotlinx.android.synthetic.main.activity_solution_application.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class SolutionApplicationActivity : BaseHeaderActivity() {
    lateinit var solutionAdapter: HomeAdapterViewPager
    lateinit var solutionViewPager: ViewPagerAutoScroll
    lateinit var categoryAdapter: CategoryAdapter
    lateinit var circleIndicator: CirclePageIndicator

    override fun setTitle(): String {
        return resources.getString(R.string.solution_application)
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_solution_application
    }

    override fun setBackgroundHeader(): Int {
        return R.color.pink
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        solutionAdapter = HomeAdapterViewPager(this)
        solutionViewPager = findViewById(R.id.solutionViewPager)
        solutionViewPager?.adapter = solutionAdapter
        circleIndicator = findViewById(R.id.circleIndicator) as CirclePageIndicator
        categoryAdapter = CategoryAdapter(this)
        categoryAdapter.type = 2
        val gridLayoutManager = androidx.recyclerview.widget.GridLayoutManager(this, 3)
        rvCategory.apply {
            setHasFixedSize(true)
            adapter = categoryAdapter
            layoutManager = gridLayoutManager
        }
        categoryAdapter.setOnItemClickListener(object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                val intent = Intent(this@SolutionApplicationActivity, DetailSolutionActivity::class.java)
                if (item is Category) {
                    val category = item as Category
                    intent.putExtra(Constant.SOLUTION_APPLICATION, category)
                    intent.putExtra(Constant.COLOR, category.color)

                }
                startActivity(intent)
            }

        })
        if (verifyAvailableNetwork(this)) {
            getBanner()
            getCategoriesSolution()
        } else {
            if (PrefUtils.getInstance().getString(PrefUtils.BANNER_SOLUTION) != null && !PrefUtils.getInstance().getString(PrefUtils.BANNER_SOLUTION).isEmpty()) {
                val bannerResponse = Gson().fromJson<BannerResponse>(PrefUtils.getInstance().getString(PrefUtils.BANNER_SOLUTION), BannerResponse::class.java)
                initBanner(bannerResponse)
            }
            if (PrefUtils.getInstance().getString(PrefUtils.CATEGORY) != null && !PrefUtils.getInstance().getString(PrefUtils.CATEGORY).isEmpty()) {
                categoryAdapter.setData(Gson().fromJson(PrefUtils.getInstance().getString(PrefUtils.CATEGORY), CategoryResponse::class.java).data)
            } else {
                showAlert(getString(R.string.network_error))
            }
        }
    }

    private fun getCategoriesSolution() {
        setLoading(true)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getCategoriesSolution()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<CategoryResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(categoryResponse: CategoryResponse) {
                        setLoading(false)
                        if (categoryResponse.code == Constant.SUCCESS) {
                            PrefUtils.getInstance().putString(PrefUtils.CATEGORY, Gson().toJson(categoryResponse))
                            //categoryAdapter.setData(Utils.getListSolutionApplication(this@SolutionApplicationActivity,categoryResponse.data))
                            categoryAdapter.setData(categoryResponse.data)
                        }

                    }

                })
    }

    private fun getBanner() {
        val nTescoRequestGET = NTescoRequestGET()
        nTescoRequestGET.setPosition(2)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getBanners(nTescoRequestGET)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<BannerResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(bannerResponse: BannerResponse) {
                        if (bannerResponse.code == Constant.SUCCESS) {
                            initBanner(bannerResponse)
                        }

                    }

                })
    }

    fun initBanner(bannerResponse: BannerResponse) {
        if (bannerResponse.data != null) {
            solutionAdapter?.bannerList = bannerResponse.data
            solutionAdapter?.notifyDataSetChanged()
            if (bannerResponse.data.size > 1) {
                circleIndicator?.setViewPager(solutionViewPager)
                circleIndicator.visibility = View.VISIBLE
                solutionViewPager.startAutoScroll()
            } else {
                circleIndicator.visibility = View.GONE
            }
            PrefUtils.getInstance().putString(PrefUtils.BANNER_SOLUTION, Gson().toJson(bannerResponse))
        } else {
            circleIndicator.visibility = View.GONE
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        solutionViewPager.stopAutoScroll()
    }
}
