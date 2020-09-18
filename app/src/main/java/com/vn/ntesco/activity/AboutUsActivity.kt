package com.vn.ntesco.activity

import android.app.PendingIntent.getActivity
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import com.google.gson.Gson
import com.squareup.picasso.Picasso
import com.vn.ntesco.R
import com.vn.ntesco.adapter.OfficeAdapter
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.model.Office
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.AboutUsResponse
import com.vn.ntesco.model.Response.ChemicalsResponse
import com.vn.ntesco.model.Response.OfficesResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.PrefUtils
import com.vn.ntesco.utils.WriteLog
import com.vn.ntesco.views.CustomTypefaceSpan
import kotlinx.android.synthetic.main.activity_about_us.*
import kotlinx.android.synthetic.main.activity_chemical_calculation.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


class AboutUsActivity : BaseHeaderActivity() {

    lateinit var content: WebView
    lateinit var ivBanner: ImageView
    //    lateinit var officeAdapter: OfficeAdapter
    lateinit var listOffices: androidx.recyclerview.widget.RecyclerView
    lateinit var officeAdapter: OfficeAdapter

    override fun setBackgroundHeader(): Int {
        return R.color.dark_blue;
    }


    override fun setTitle(): String {
        return resources.getString(R.string.about_us)
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_about_us
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        content = findViewById(R.id.content)
        ivBanner = findViewById(R.id.ivBanner)
        listOffices = findViewById(R.id.listOffice)
        officeAdapter = OfficeAdapter(this@AboutUsActivity)
        listOffices.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this@AboutUsActivity, androidx.recyclerview.widget.LinearLayoutManager.VERTICAL, false)
        listOffices.adapter = officeAdapter
        // content.getSettings().setLoadWithOverviewMode(true)
        content.settings.useWideViewPort = false
        content.settings.javaScriptEnabled = true
        if (verifyAvailableNetwork(this)) {
            getAboutUs()
            getOffices()
        } else {
            if (PrefUtils.getInstance().getString(PrefUtils.ABOUT) != null && !PrefUtils.getInstance().getString(PrefUtils.ABOUT).isEmpty()) {
                fillAboutUs(Gson().fromJson(PrefUtils.getInstance().getString(PrefUtils.ABOUT), AboutUsResponse::class.java))
            }else {
                showAlert(getString(R.string.network_error))
            }

            if (PrefUtils.getInstance().getString(PrefUtils.OFFICES) != null && !PrefUtils.getInstance().getString(PrefUtils.OFFICES).isEmpty()) {
                fillOffices(Gson().fromJson(PrefUtils.getInstance().getString(PrefUtils.OFFICES), OfficesResponse::class.java))
            }
        }
        content.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                ntescoLogo.visibility = View.VISIBLE
                listOffices.visibility = View.VISIBLE
                ivFooter.visibility = View.VISIBLE
                content.visibility = View.VISIBLE

            }

            override fun onPageCommitVisible(view: WebView?, url: String?) {
                super.onPageCommitVisible(view, url)
            }
        }
    }

    private fun initLabelText() {
//        val fontBold = Typeface.createFromAsset(getAssets(), "fonts/Open Sans Bold.ttf")
//        val spannableStringBuilder = SpannableStringBuilder(getString(R.string.about_us_priority))
//        spannableStringBuilder.setSpan(CustomTypefaceSpan("", fontBold), 36, spannableStringBuilder.length, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
//        spannableStringBuilder.setSpan(ForegroundColorSpan(ContextCompat.getColor(this, R.color.dark_blue)), 36, spannableStringBuilder.length, Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
//        tvAboutUsPriority.setText(spannableStringBuilder)
    }

    private fun getAboutUs() {
        setLoading(true)
        var ntescoRequest = NTescoRequestGET()
        ntescoRequest.setSlug("about-us")
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getAboutUs(ntescoRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<AboutUsResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(aboutUsResponse: AboutUsResponse) {
                        setLoading(false)
                        if (aboutUsResponse.code == Constant.SUCCESS) {
                            fillAboutUs(aboutUsResponse)

                        }

                    }

                })
    }

    fun fillAboutUs(aboutUsResponse: AboutUsResponse) {
        Picasso.get().load(aboutUsResponse.data?.imageHead).placeholder(R.mipmap.default_banner).centerCrop().fit().into(ivBanner)
        Picasso.get().load(aboutUsResponse.data?.imageFooter).placeholder(R.mipmap.default_banner).into(ivFooter)
        content.loadData(aboutUsResponse.data?.content, "text/html", "UTF-8")

        // content. : WebViewClient{})
        PrefUtils.getInstance().putString(PrefUtils.ABOUT, Gson().toJson(aboutUsResponse))
    }

    fun fillOffices(officesResponse: OfficesResponse) {
//        var offices = ArrayList<Office>()
//        for (item in officesResponse.data.iterator()) {
//            var group = Office(item.name, 0, "", "", "", "", "", 0.0, 0.0, 1, 1)
//            offices.add(group)
//            for (items in item.offices.iterator()) {
//                var itemss = Office(items.name, items.id, items.address, items.phone, items.fax, items.email, items.website, 0.0, 0.0, 1, 2)
//                offices.add(itemss)
//            }
//
//        }
        officeAdapter.listOffice = officesResponse.data
        officeAdapter.notifyDataSetChanged()
        PrefUtils.getInstance().putString(PrefUtils.OFFICES, Gson().toJson(officesResponse))
    }

    fun getOffices() {
        setLoading(true)
        var ntescoRequest = NTescoRequestGET()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getOffices(ntescoRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<OfficesResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(officesResponse: OfficesResponse) {
                        setLoading(false)
                        if (officesResponse.code == Constant.SUCCESS) {
                            fillOffices(officesResponse)
                        }

                    }

                })
    }
}
