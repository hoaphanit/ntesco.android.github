package com.vn.ntesco.activity

import android.app.Activity
import android.os.Bundle
import com.airbnb.deeplinkdispatch.DeepLinkHandler
import com.vn.ntesco.deeplink.AppDeepLinkModule
import com.vn.ntesco.deeplink.AppDeepLinkModuleRegistry
import com.vn.ntesco.deeplink.LibraryDeepLinkModule
import com.vn.ntesco.deeplink.LibraryDeepLinkModuleRegistry


@DeepLinkHandler(AppDeepLinkModule::class,LibraryDeepLinkModule::class)
class DeepLinkActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val deepLinkDelegate  = DeepLinkDelegate(AppDeepLinkModuleRegistry(), LibraryDeepLinkModuleRegistry())
        // Delegate the deep link handling to DeepLinkDispatch.
        // It will start the correct Activity based on the incoming Intent URI
       deepLinkDelegate.dispatchFrom(this)
        // Finish this Activity since the correct one has been just started
        finish()
    }
}
