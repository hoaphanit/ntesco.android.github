package com.vn.ntesco.activity

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.squareup.picasso.Picasso
import com.vn.ntesco.R
import com.vn.ntesco.adapter.ProductSolutionAdapter
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.listener.ItemClickListener
import com.vn.ntesco.model.Category
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.SolutionProductResponse
import com.vn.ntesco.model.SolutionProduct
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.PrefUtils
import com.vn.ntesco.utils.WriteLog
import kotlinx.android.synthetic.main.activity_detail_solution.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class DetailSolutionActivity : BaseHeaderActivity() {
    lateinit var productSolutionAdapter: ProductSolutionAdapter
    lateinit var category: Category

    override fun setTitle(): String {
        return (intent?.getSerializableExtra(Constant.SOLUTION_APPLICATION) as Category)?.name ?: ""
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_detail_solution
    }

    override fun setBackgroundHeader(): Int {
        //return intent?.getIntExtra(Constant.COLOR,R.color.blue) ?: R.color.blue
        return R.color.pink
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        category = intent?.getSerializableExtra(Constant.SOLUTION_APPLICATION) as Category
        productSolutionAdapter = ProductSolutionAdapter(this)
        val gridLayoutManager = androidx.recyclerview.widget.GridLayoutManager(this, 2, androidx.recyclerview.widget.GridLayoutManager.HORIZONTAL, false)
        rvProductSolution.apply {
            setHasFixedSize(true)
            adapter = productSolutionAdapter
            layoutManager = gridLayoutManager
        }
        val solution = intent?.getStringExtra(Constant.SOLUTION_APPLICATION) ?: ""
        val color = intent?.getIntExtra(Constant.COLOR, R.color.blue) ?: R.color.blue
        productSolutionAdapter.setOnItemClickListener(object : ItemClickListener {
            override fun <T : Any> onItemClick(item: T, position: Int) {
                val intent = Intent(this@DetailSolutionActivity, DetailProductSolutionActivity::class.java)
                intent.putExtra(Constant.SOLUTION_APPLICATION, item as String)
                intent.putExtra(Constant.COLOR, color)
                intent.putExtra(Constant.PRODUCT_ID, productSolutionAdapter.productList[position].id)
                startActivity(intent)
            }

        })
        if (verifyAvailableNetwork(this))
            getSolutionProducts(category.id)
        else {
            if (PrefUtils.getInstance().getString(PrefUtils.SOLUTION_PRODUCT) != null && !PrefUtils.getInstance().getString(PrefUtils.SOLUTION_PRODUCT).isEmpty()) {
                WriteLog.e("solutions", PrefUtils.getInstance().getString(PrefUtils.SOLUTION_PRODUCT))
                checkExits(category.id, null)?.let {
                    tvSolutionContent.text = it.description
                    Picasso.get().load(it.image).fit().centerCrop().placeholder(R.mipmap.default_banner).into(ivSolution)
                    productSolutionAdapter.setData(it.products)
                } ?: showAlert(getString(R.string.network_error))
            } else {
                showAlert(getString(R.string.network_error))
            }
        }
    }

    private fun getSolutionProducts(categoryId: Int) {
        setLoading(true)
        val nTescoRequestGET = NTescoRequestGET()
        nTescoRequestGET.setCategoryId(categoryId)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getSolutionProducts(nTescoRequestGET)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<SolutionProductResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(solutionProductResponse: SolutionProductResponse) {
                        setLoading(false)
                        if (solutionProductResponse.code == Constant.SUCCESS) {
                            tvSolutionContent.text = solutionProductResponse.data.description
                            Picasso.get().load(solutionProductResponse.data.image).fit().centerCrop().placeholder(R.mipmap.default_banner).into(ivSolution)
                            productSolutionAdapter.setData(solutionProductResponse.data.products)
                            checkExits(categoryId, solutionProductResponse.data)
//                            if (checkExits(category.id, solutionProductResponse.data) == null) {
//                                val turnsType = object : TypeToken<List<SOLUTION_PRODUCT>>() {}.type
//                                var solutionProducts = Gson().fromJson<List<SOLUTION_PRODUCT>>(PrefUtils.getInstance().getString(PrefUtils.SOLUTION_PRODUCT), turnsType)
//                                if (solutionProducts != null) {
//                                    solutionProductResponse.data.id = categoryId
                            //                                 solutionProducts.plus(solutionProductResponse.data)
//                                    val jsonString = Gson().toJson(solutionProducts)
//                                    PrefUtils.getInstance().putString(PrefUtils.SOLUTION_PRODUCT, jsonString)
//                                } else {
//                                    var solutionProducts2 = ArrayList<SOLUTION_PRODUCT>()
//                                    solutionProductResponse.data.id = categoryId
//                                    solutionProducts2.add(solutionProductResponse.data)
//                                    val jsonString = Gson().toJson(solutionProducts2)
//                                    PrefUtils.getInstance().putString(PrefUtils.SOLUTION_PRODUCT, jsonString)
//
//
//                                }
//                            }
                        }

                    }

                })
    }

    fun checkExits(cate_id: Int, solutionProduct: SolutionProduct?): SolutionProduct? {

        val turnsType = object : TypeToken<MutableList<SolutionProduct>>() {}.type
        val solutionProducts = Gson().fromJson<MutableList<SolutionProduct>>(PrefUtils.getInstance().getString(PrefUtils.SOLUTION_PRODUCT), turnsType)
        if (solutionProducts != null) {
            for ((index, value) in solutionProducts.withIndex()) {
                if (value.id == cate_id) {
                    var solution: SolutionProduct? = null
                    if (solutionProduct != null) {
                        solution = solutionProduct
                    } else
                        solution = solutionProducts.get(index)
                    PrefUtils.getInstance().putString(PrefUtils.SOLUTION_PRODUCT, Gson().toJson(solutionProducts))
                    return solution
                }
            }
            if (solutionProduct != null) {
                solutionProduct.id = cate_id
                solutionProducts.add(solutionProduct)
                PrefUtils.getInstance().putString(PrefUtils.SOLUTION_PRODUCT, Gson().toJson(solutionProducts))
            }

        } else {
            if (solutionProduct != null) {
                var solutionProducts2 = ArrayList<SolutionProduct>()
                solutionProduct.id = cate_id
                solutionProducts2.add(solutionProduct)
                PrefUtils.getInstance().putString(PrefUtils.SOLUTION_PRODUCT, Gson().toJson(solutionProducts2))
            }
        }
        return null
    }


}
