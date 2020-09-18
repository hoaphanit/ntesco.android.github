package com.vn.ntesco.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.squareup.picasso.Picasso
import com.vn.ntesco.adapter.ProductImgAdapter
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.ProductDetail
import com.vn.ntesco.model.Response.ProductDetailResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.PrefUtils
import com.vn.ntesco.utils.WriteLog
import kotlinx.android.synthetic.main.activity_detail_product_solution.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import com.vn.ntesco.R

class DetailProductSolutionActivity : BaseHeaderActivity() {
    lateinit var productImgAdapter: ProductImgAdapter
    lateinit var tvSolutionContent: WebView
    var productId: Int = 0
    var urlPDF: String? = null
    override fun setTitle(): String {
        return intent?.getStringExtra(Constant.SOLUTION_APPLICATION) ?: ""
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_detail_product_solution
    }

    override fun setBackgroundHeader(): Int {
        return R.color.pink
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        productId = intent?.getIntExtra(Constant.PRODUCT_ID, 0)!!
        productImgAdapter = ProductImgAdapter(this)
        tvSolutionContent = findViewById(R.id.tvSolutionContent)
        tvSolutionContent.settings.javaScriptEnabled = true
        rvImgProduct.apply {
            setHasFixedSize(true)
            adapter = productImgAdapter
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this@DetailProductSolutionActivity, androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL, false)
        }
        // getProductDetail(productId)
        val name = intent?.getStringExtra(Constant.SOLUTION_APPLICATION)
        findViewById<View>(R.id.btnViewMore).setOnClickListener(View.OnClickListener {
            urlPDF?.let {
                val intent = Intent(this@DetailProductSolutionActivity, PDFViewActivity::class.java)
                intent.putExtra(Constant.TYPE, Constant.NEWS_EVENT)
                intent.putExtra(Constant.PDF_URL, it)
                intent.putExtra(Constant.PDF_NAME, name)
                startActivity(intent)
//                setLoading(true)
//                PdfUtils.openPdfFromUrl(it, this@DetailProductSolutionActivity, name
//                        ?: "", object : PdfUtils.PdfDownloadlistener {
//                    override fun onSuccess(file: File?) {
//                        setLoading(false)
//                    }
//
//                })
            }
        })
        productImgAdapter.setOnItemClickListener(object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                if (item != null && item is String)
                    Picasso.get().load(item as String).fit().centerCrop().into(ivBanner)

            }

        })
        if (verifyAvailableNetwork(this))
            getProductDetail(productId)
        else {
            if (PrefUtils.getInstance().getString(PrefUtils.PRODUCT_DETAIL_LIST) != null && !PrefUtils.getInstance().getString(PrefUtils.PRODUCT_DETAIL_LIST).isEmpty()) {
                WriteLog.e("solutions", PrefUtils.getInstance().getString(PrefUtils.PRODUCT_DETAIL_LIST))
                checkExits(productId, null)?.let {
                    fillData(it)
//                    tvSolutionContent.text=it.description
//                    productSolutionAdapter.setData(it.products)
                } ?: showAlert(getString(R.string.network_error))
            } else {
                showAlert(getString(R.string.network_error))
            }
        }
        ivChat.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(Constant.CHAT, true)
            startActivity(intent)
        }
    }

    private fun getProductDetail(id: Int) {
        setLoading(true)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getProductDetail(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<ProductDetailResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(productDetailResponse: ProductDetailResponse) {
                        setLoading(false)
                        if (productDetailResponse.code == Constant.SUCCESS) {
                            findViewById<View>(R.id.btnViewMore).visibility = View.VISIBLE
                            fillData(productDetailResponse.data)
                            urlPDF = productDetailResponse.data?.file
                            checkExits(productId, productDetailResponse.data)
//                            if (checkExits(productId) == null) {
//                                val turnsType = object : TypeToken<List<ProductDetail>>() {}.type
//                                var solutionProducts = Gson().fromJson<List<ProductDetail>>(PrefUtils.getInstance().getString(PrefUtils.PRODUCT_DETAIL_LIST), turnsType)
//                                if (solutionProducts != null) {
//                                    solutionProducts.plus(productDetailResponse.data)
//                                    val jsonString = Gson().toJson(solutionProducts)
//                                    PrefUtils.getInstance().putString(PrefUtils.PRODUCT_DETAIL_LIST, jsonString)
//                                } else {
//                                    var solutionProducts2 = ArrayList<ProductDetail>()
//                                    solutionProducts2.add(productDetailResponse.data!!)
//                                    val jsonString = Gson().toJson(solutionProducts2)
//                                    PrefUtils.getInstance().putString(PrefUtils.PRODUCT_DETAIL_LIST, jsonString)
//
//
//                                }
//                            }
//                            PrefUtils.getInstance().putString(PrefUtils.CATEGORY, Gson().toJson(categoryResponse))
//                            categoryAdapter.setData(Utils.getListSolutionApplication(this@SolutionApplicationActivity,categoryResponse.data))
                        }

                    }

                })
    }

    fun fillData(productDetail: ProductDetail?) {
        titleHeader.text = productDetail?.name
        productImgAdapter.images = productDetail?.images as ArrayList<String>
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            tvSolutionContent.setText(Html.fromHtml(productDetail?.content,Html.FROM_HTML_MODE_LEGACY))
//        }else
//            tvSolutionContent.setText(Html.fromHtml(productDetail?.content))
        val content = ("<html><head>"
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                // + "<style type=\"text/css\"> img{max-width: 100%, height: auto;}"
                //   + "</style></head>"
                + "<body>"
                + productDetail?.content
                + "</body></html>")
        tvSolutionContent.loadData(content, "text/html", "UTF-8")
        Picasso.get().load(productImgAdapter.images[0]).fit().centerCrop().into(ivBanner)

    }

    fun checkExits(product_id: Int, productDetail: ProductDetail?): ProductDetail? {
        val turnsType = object : TypeToken<MutableList<ProductDetail>>() {}.type
        val productDetails = Gson().fromJson<MutableList<ProductDetail>>(PrefUtils.getInstance().getString(PrefUtils.PRODUCT_DETAIL_LIST), turnsType)
        if (productDetails != null) {
            for ((index, value) in productDetails.withIndex()) {
                if (value.id == product_id) {
                    var product: ProductDetail? = null
                    if (productDetail != null) {
                        product = productDetail
                    } else
                        product = productDetails.get(index)
                    PrefUtils.getInstance().putString(PrefUtils.PRODUCT_DETAIL_LIST, Gson().toJson(productDetails))
                    return product
                }
            }
            if (productDetail != null) {
                productDetails.add(productDetail)
                PrefUtils.getInstance().putString(PrefUtils.PRODUCT_DETAIL_LIST, Gson().toJson(productDetails))
            }

        } else {
            if (productDetail != null) {
                var productList = ArrayList<ProductDetail>()
                productList.add(productDetail)
                PrefUtils.getInstance().putString(PrefUtils.PRODUCT_DETAIL_LIST, Gson().toJson(productList))
            }
        }
        return null
    }


    fun checkExits(product_id: Int): ProductDetail? {

        val turnsType = object : TypeToken<List<ProductDetail>>() {}.type
        val productDetails = Gson().fromJson<List<ProductDetail>>(PrefUtils.getInstance().getString(PrefUtils.PRODUCT_DETAIL_LIST), turnsType)

        var pos = 0
        productDetails?.let {
            for (productDetail in productDetails) {
                if (productDetail.id == product_id) {
                    val product = productDetails.get(pos)
                    val jsonString = Gson().toJson(productDetails)
                    PrefUtils.getInstance().putString(PrefUtils.PRODUCT_DETAIL_LIST, jsonString)
                    return product
                }
                pos++
            }
        }

        return null
    }

}
