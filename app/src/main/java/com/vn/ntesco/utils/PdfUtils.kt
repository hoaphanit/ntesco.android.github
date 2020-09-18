package com.vn.ntesco.utils

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.ParcelFileDescriptor
import androidx.core.content.FileProvider
import com.facebook.accountkit.internal.AccountKitController.getApplicationContext
import rx.Observable
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.io.*
import java.net.URL
import java.net.URLConnection
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.Callable


object PdfUtils {
    fun openPdfFromUrl(pdfUrl: String?, activity: Activity, pdfDownloadListener: PdfDownloadlistener) {
        Observable.fromCallable(object : Callable<File?> {
            @Throws(Exception::class)
            override fun call(): File? {
                try {
                    val url = URL(pdfUrl)
                    val connection: URLConnection = url.openConnection()
                    connection.connect()

                    // download the file
                    val input: InputStream = BufferedInputStream(connection.getInputStream())
                    val dir = File(activity.filesDir, "/shared_pdf")
                    dir.mkdir()
                    val file = File(dir, "pdfFile_" + SimpleDateFormat("yyyyMMdd_HHmmss").format(Date()))
                    val output: OutputStream = FileOutputStream(file)
                    val data = ByteArray(1024)
                    var total: Long = 0
                    var count: Int = 0
                    while (input.read(data).also({ count = it }) != -1) {
                        total += count.toLong()
                        output.write(data, 0, count)
                    }
                    output.flush()
                    output.close()
                    input.close()
                    return file
                } catch (e: IOException) {
                    pdfDownloadListener.onError(e.toString())
                }
                return null
            }
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Subscriber<File?>() {
                    override fun onCompleted() {}
                    override fun onError(e: Throwable?) {
                        pdfDownloadListener.onError(e.toString())
                    }

                    override fun onNext(file: File?) {
                        pdfDownloadListener.onSuccess(file)
//                        val uriToFile: Uri = FileProvider.getUriForFile(activity, "ntesco.fileprovider", file!!)
//                        val shareIntent = Intent(Intent.ACTION_VIEW)
//                        shareIntent.setDataAndType(uriToFile, "application/pdf")
//                        shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
//                        if (shareIntent.resolveActivity(activity.packageManager) != null) {
//                            activity.startActivity(shareIntent)
//                        }
                    }
                })

    }

    fun getSeekableFileDescriptor(activity: Activity, file: File): ParcelFileDescriptor {
        var parcelFileDescriptor: ParcelFileDescriptor? = null;
        if (file.exists()) {
            parcelFileDescriptor = ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY);
            return parcelFileDescriptor;
        }
        parcelFileDescriptor = getApplicationContext().getContentResolver().openFileDescriptor(Uri.parse(file.path), "r");
        return parcelFileDescriptor;
    }

    interface PdfDownloadlistener {
        fun onSuccess(file: File?)
        fun onError(error: String)
    }
}