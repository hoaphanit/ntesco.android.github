package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.AboutUs
import com.vn.ntesco.model.SocialNetworks

class SocialResponse : NTescoResponse(){
    @SerializedName("data")
    @Expose
    val data : SocialNetworks? = null;
}