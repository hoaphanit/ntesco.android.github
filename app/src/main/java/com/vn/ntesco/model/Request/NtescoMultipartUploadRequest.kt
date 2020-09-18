package com.vn.ntesco.model.Request

import android.content.Context
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.UserCache
import net.gotev.uploadservice.MultipartUploadRequest

class NtescoMultipartUploadRequest(context: Context?, serverUrl: String?) : MultipartUploadRequest(context, serverUrl) {
   init {
       addHeader("Content-Type", "application/json")
       addHeader("Authorization", "Bearer " + UserCache.userInfo?.accessToken)
       addHeader("Language", Constant.getLanguage())
   }

}