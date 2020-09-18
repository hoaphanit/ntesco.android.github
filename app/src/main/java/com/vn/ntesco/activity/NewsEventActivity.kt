package com.vn.ntesco.activity

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vn.ntesco.R
import com.vn.ntesco.adapter.HotNewsAdapter
import com.vn.ntesco.adapter.PopularNewsAdapter
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.listener.EndlessRecyclerOnScrollListener
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Post
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.PostResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.views.StartSnapHelper
import kotlinx.android.synthetic.main.activity_news_event.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class NewsEventActivity : BaseHeaderActivity() {
    private lateinit var hotNewsAdapter: HotNewsAdapter
    private lateinit var hotNewsLayoutManager: androidx.recyclerview.widget.LinearLayoutManager
    private lateinit var popularNewLayoutManager: androidx.recyclerview.widget.LinearLayoutManager
    private lateinit var popularNewsAdapter: PopularNewsAdapter
    private lateinit var typePost: String
    private lateinit var endlessHotNewOnScrollListener: EndlessRecyclerOnScrollListener
    private lateinit var endlessPopularOnScrollListener: EndlessRecyclerOnScrollListener

    override fun setTitle(): String {
        if (intent.getStringExtra(Constant.TYPE).equals(Constant.NEWS_EVENT))
            return resources.getString(R.string.news_event)
        else
            return resources.getString(R.string.water_treatment_knowledge)

    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_news_event
    }

    override fun setBackgroundHeader(): Int {
        if (intent.getStringExtra(Constant.TYPE).equals(Constant.NEWS_EVENT))
            return R.color.green
        else
            return R.color.purple_light
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        typePost = intent.getStringExtra(Constant.TYPE)
        hotNewsAdapter = HotNewsAdapter(this)
        popularNewsAdapter = PopularNewsAdapter(this)
        hotNewsLayoutManager = androidx.recyclerview.widget.LinearLayoutManager(this, androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL, false)
        popularNewLayoutManager = androidx.recyclerview.widget.LinearLayoutManager(this, androidx.recyclerview.widget.LinearLayoutManager.VERTICAL, false)
        rvHotNews.apply {
            adapter = hotNewsAdapter
            layoutManager = hotNewsLayoutManager
            isNestedScrollingEnabled =false
        }
        rvPopularNews.apply {
            adapter = popularNewsAdapter
            layoutManager = popularNewLayoutManager
        }
        val starSnapHelper = StartSnapHelper()
        starSnapHelper.attachToRecyclerView(rvHotNews)
        getHotNews(Constant.DEFAULT_FIRST_PAGE)
        getPopularNews(Constant.DEFAULT_FIRST_PAGE)
        hotNewsAdapter.setOnItemClickListener(object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                val intent = Intent(this@NewsEventActivity, DetailPostActivity::class.java)
                intent.putExtra(Constant.TYPE, typePost)
                if (item != null && item is Post) {
                    intent.putExtra(Constant.POST, item as Post)
                }
                startActivity(intent)
            }
        })
        popularNewsAdapter.setOnItemClickListener(object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                val intent = Intent(this@NewsEventActivity, DetailPostActivity::class.java)
                intent.putExtra(Constant.TYPE, typePost)
                if (item != null && item is Post) {
                    intent.putExtra(Constant.POST, item as Post)
                }
                startActivity(intent)
            }
        })
        if (typePost.equals(Constant.NEWS_EVENT)) {
            labelLastest.setText(R.string.latest_news_event)
            labelPopular.setText(R.string.popular_topic)
        }
        endlessHotNewOnScrollListener = object : EndlessRecyclerOnScrollListener(hotNewsLayoutManager, Constant.DEFAULT_FIRST_PAGE) {
            override fun onLoadMore(current_page: Int) {
                getHotNews(current_page)
            }

        }
        endlessPopularOnScrollListener = object : EndlessRecyclerOnScrollListener(popularNewLayoutManager, Constant.DEFAULT_FIRST_PAGE) {
            override fun onLoadMore(current_page: Int) {
                getPopularNews(Constant.DEFAULT_FIRST_PAGE)

            }

        }
        rvHotNews.addOnScrollListener(endlessHotNewOnScrollListener)
        rvPopularNews.addOnScrollListener(endlessPopularOnScrollListener)
        swipeRefreshLayout.setOnRefreshListener {
            swipeRefreshLayout.isRefreshing=false
            endlessHotNewOnScrollListener.resetCurrentPage()
            endlessPopularOnScrollListener.resetCurrentPage()
            getHotNews(Constant.DEFAULT_FIRST_PAGE)
            getPopularNews(Constant.DEFAULT_FIRST_PAGE)
        }
    }

    private fun getHotNews(page: Int) {
        setLoading(true)
        var ntescoRequest = NTescoRequestGET()
        if (typePost.equals(Constant.NEWS_EVENT))
            ntescoRequest.setSlugCategory(Constant.NEWS_EVENT)
        else
            ntescoRequest.setSlugCategory(Constant.WATER_TREATMENT)
        ntescoRequest.setType(Constant.HOT_NEWS)
        ntescoRequest.setPage(page)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getPost(ntescoRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<PostResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(postResponse: PostResponse) {
                        setLoading(false)
                        if (postResponse.code == Constant.SUCCESS) {
                            postResponse.data?.data?.let { hotNewsAdapter.setData(it) }
                        }

                    }

                })
    }

    private fun getPopularNews(page: Int) {
        setLoading(true)
        var ntescoRequest = NTescoRequestGET()
        if (typePost.equals(Constant.NEWS_EVENT))
            ntescoRequest.setSlugCategory(Constant.NEWS_EVENT)
        else
            ntescoRequest.setSlugCategory(Constant.WATER_TREATMENT)
        ntescoRequest.setType(Constant.POPULAR_NEWS)
        ntescoRequest.setPage(page)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getPost(ntescoRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<PostResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(postResponse: PostResponse) {
                        setLoading(false)
                        if (postResponse.code == Constant.SUCCESS) {
                            postResponse.data?.data?.let { popularNewsAdapter.setData(it) }

                        }

                    }

                })
    }
}
