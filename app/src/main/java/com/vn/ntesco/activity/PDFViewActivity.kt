package com.vn.ntesco.activity

import android.os.Bundle
import com.vn.ntesco.R
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.PdfUtils
import com.vn.ntesco.utils.WriteLog
import kotlinx.android.synthetic.main.activity_pdf_view.*
import java.io.File

class PDFViewActivity : BaseHeaderActivity() {
    var typePost = Constant.NEWS_EVENT
    override fun setTitle(): String {
        return intent.getStringExtra(Constant.PDF_NAME);
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_pdf_view
    }

    override fun setBackgroundHeader(): Int {
        typePost = intent.getStringExtra(Constant.TYPE)
        if (typePost.equals(Constant.NEWS_EVENT)) {
            return R.color.green
        } else {
            return R.color.blue_ocean;
        }
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        val pdfUrl = intent.getStringExtra(Constant.PDF_URL)
        //val url = "https://drive.google.com/viewerng/viewer?embedded=true&url=${myPdfUrl.trim()}"
        WriteLog.e("myPdfUrl::",pdfUrl)
        setLoading(true)
        PdfUtils.openPdfFromUrl(pdfUrl, this, object : PdfUtils.PdfDownloadlistener {
            override fun onSuccess(file: File?) {
                setLoading(false)
                showPdfFromFile(file)
            }

            override fun onError(error: String) {
                setLoading(false)
            }

        })
//        webView.settings.javaScriptEnabled = true
////        webView.settings.loadWithOverviewMode = true
//        webView.loadUrl(url)
//        webView.webViewClient = object : WebViewClient() {
//            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
//            }
//
//            override fun onPageFinished(view: WebView?, url: String?) {
//                if (view?.getContentHeight() == 0){
//                    view.reload();
//                }else
//                    setLoading(false)
//
//
//            }
//
//        }
    }
    private fun showPdfFromFile(file: File?) {
        pdfView.fromFile(file)
                .password(null)
                .defaultPage(0)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .onPageError { page, _ ->

                }
                .load()
    }
}