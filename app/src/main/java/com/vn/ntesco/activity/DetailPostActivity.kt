package com.vn.ntesco.activity

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import androidx.core.content.ContextCompat
import androidx.appcompat.widget.Toolbar
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.vn.ntesco.R
import com.vn.ntesco.base.BaseActivity
import com.vn.ntesco.model.Post
import com.vn.ntesco.model.Response.DetailPostResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.DialogUtils
import kotlinx.android.synthetic.main.activity_detail_post.*
import qiu.niorgai.StatusBarCompat
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class DetailPostActivity : BaseActivity(), AppBarLayout.OnOffsetChangedListener, View.OnClickListener {

    lateinit var main_collapsing: CollapsingToolbarLayout
    lateinit var mAppbar: AppBarLayout
    lateinit var mToolbar: Toolbar
    lateinit var ivBack: ImageView
    lateinit var bannerPost: ImageView
    lateinit var typePost: String
    private var mPost: Post? = null
    private val PERCENTAGE_TO_SHOW_BANNER = 40
    private var mMaxScrollSize: Int = 0

    override fun getLayoutResource(): Int {
        return R.layout.activity_detail_post
    }

    override fun setBody(savedInstanceState: Bundle?) {
        typePost = Constant.NEWS_EVENT
        if (intent.hasExtra(Constant.TYPE))
            typePost = intent.getStringExtra(Constant.TYPE)
        if (intent.hasExtra(Constant.POST))
            mPost = intent.getSerializableExtra(Constant.POST) as Post
        main_collapsing = findViewById(R.id.main_collapsing)
        mAppbar = findViewById(R.id.main_appbar)
        ivBack = findViewById(R.id.ivBack)
        bannerPost = findViewById(R.id.bannerPost)
        mToolbar = findViewById(R.id.toolbar)
        mAppbar.addOnOffsetChangedListener(this)
        ivBack.setOnClickListener(this)
        initData(mPost)
        StatusBarCompat.setStatusBarColorForCollapsingToolbar(this, mAppbar, main_collapsing, mToolbar, Color.TRANSPARENT);
        // webViewContent.settings.useWideViewPort = true
        webViewContent.settings.javaScriptEnabled = true
        //  webViewContent.settings.loadWithOverviewMode = true
    }

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, i: Int) {
        if (mMaxScrollSize == 0)
            mMaxScrollSize = appBarLayout!!.getTotalScrollRange()

        val currentScrollPercentage = Math.abs(i) * 100 / mMaxScrollSize

        if (currentScrollPercentage >= PERCENTAGE_TO_SHOW_BANNER) {
            if (typePost.equals(Constant.NEWS_EVENT)) {
                // StatusBarCompat.setStatusBarColorForCollapsingToolbar(this, mAppbar, main_collapsing, mToolbar, ContextCompat.getColor(this, R.color.green));
                StatusBarCompat.setStatusBarColor(this, ContextCompat.getColor(this, R.color.green));
                mToolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
            } else {
                mToolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.blue_ocean))
                // StatusBarCompat.setStatusBarColorForCollapsingToolbar(this, mAppbar, main_collapsing, mToolbar,ContextCompat.getColor(this, R.color.blue_ocean));
                StatusBarCompat.setStatusBarColor(this, ContextCompat.getColor(this, R.color.blue_ocean));
            }
            //   ivBack.setBackgroundResource(0)
        } else {
            mToolbar.setBackgroundColor(Color.TRANSPARENT)
            // ivBack.setBackgroundResource(R.color.transparent_50)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.ivBack -> {
                onBackPressed()
            }
        }
    }

    fun initData(post: Post?) {
        if (post == null) {
            val postId = intent.getIntExtra(Constant.POST_ID, 0)
            getDetailPost(postId)
        } else {
            Picasso.get().load(post.image).centerCrop().fit().placeholder(R.mipmap.default_banner).into(bannerPost)
            tvTitlePost.text = post.name
            getDetailPost(post.id)
        }
    }

    private fun getDetailPost(postId: Int) {
        setLoading(true)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getDetailPost(postId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<DetailPostResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(detailPostResponse: DetailPostResponse) {
                        setLoading(false)
                        if (detailPostResponse.code == Constant.SUCCESS && detailPostResponse.data!=null) {
                            val content = ("<html><head>"
                                    + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                                    //  + "<style type=\"text/css\"> img{max-width: 100%, height: auto;}"
                                    // + "</style></head>"
                                    + "<body>"
                                    + detailPostResponse.data?.content
                                    + "</body></html>")
                            webViewContent.loadData(content, "text/html", "UTF-8")
                            tvNumberView.text = detailPostResponse.data?.views.toString()
                            tvDatePosting.text = detailPostResponse.data?.publishDate
                            Picasso.get().load(detailPostResponse.data?.image).centerCrop().fit().placeholder(R.mipmap.default_banner).into(bannerPost)
                            tvTitlePost.text = detailPostResponse.data?.name
                            if (detailPostResponse.data?.pdfFile != null) {
                                tvPdfFile.text = detailPostResponse.data?.namePdf
                                tvPdfFile.visibility = View.VISIBLE
                                tvPdfFile.setOnClickListener {
                                    val intent = Intent(this@DetailPostActivity, PDFViewActivity::class.java)
                                    intent.putExtra(Constant.TYPE, typePost)
                                    intent.putExtra(Constant.PDF_URL, detailPostResponse.data?.pdfFile)
                                    intent.putExtra(Constant.PDF_NAME, detailPostResponse.data?.namePdf)
                                    startActivity(intent)

//                                    val intent = Intent(Intent.ACTION_VIEW)
//                                    intent.setDataAndType(Uri.parse(detailPostResponse.data?.pdfFile), "application/pdf");
//                                    startActivity(intent)

                                }
                            } else {
                                tvPdfFile.visibility = View.GONE
                            }
                        }else{
                            showAlertCallback(detailPostResponse.msg, object : DialogUtils.CallbackDialog {
                                override fun onCancel() {

                                }

                                override fun onAccept() {
                                    onBackPressed()
                                }
                            })
                        }

                    }

                })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (!Constant.isOpeningMain) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
