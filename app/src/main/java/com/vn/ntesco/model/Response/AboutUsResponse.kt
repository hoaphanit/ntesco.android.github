package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.AboutUs

class AboutUsResponse : NTescoResponse(){
    @SerializedName("data")
    @Expose
    val data : AboutUs? = null;
}