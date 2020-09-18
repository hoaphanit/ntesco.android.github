package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.Chemicals
import com.vn.ntesco.model.Notification
import com.vn.ntesco.model.NotificationData

class NotificationResponse :  NTescoResponse(){
    @SerializedName("data")
    @Expose
    val data : NotificationData? = null
}