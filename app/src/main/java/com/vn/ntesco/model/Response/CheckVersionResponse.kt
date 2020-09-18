package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.AboutUs
import com.vn.ntesco.model.CheckVersion

class CheckVersionResponse : NTescoResponse(){
    @SerializedName("data")
    @Expose
    val data : CheckVersion? = null;
}