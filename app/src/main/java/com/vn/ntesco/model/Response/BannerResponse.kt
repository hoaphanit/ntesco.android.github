package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.Banner
import com.vn.ntesco.model.Chemicals
import com.vn.ntesco.model.Report
import com.vn.ntesco.model.User

class BannerResponse: NTescoResponse() {

    @SerializedName("data")
    @Expose
    val data : MutableList<Banner>? = ArrayList<Banner>();
}