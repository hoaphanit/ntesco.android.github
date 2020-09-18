package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.AboutUs

class TotalNotifyUnreadResponse : NTescoResponse() {
    @SerializedName("data")
    @Expose
    val data: Int? = 0;
}