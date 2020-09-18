package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.AboutUs
import com.vn.ntesco.model.Post
import com.vn.ntesco.model.PostData

class PostResponse : NTescoResponse() {
    @SerializedName("data")
    @Expose
    var data: PostData? = null
}