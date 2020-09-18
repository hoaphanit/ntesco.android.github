package com.vn.ntesco

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import net.gotev.uploadservice.UploadService


class MainApplication : Application() {

    companion object {
        var context: Context = MainApplication()
    }
    override fun onCreate() {
        super.onCreate()
        context = this
        // Or, you can define it manually.
        UploadService.NAMESPACE = "com.vn.ntesco";

    }


}
