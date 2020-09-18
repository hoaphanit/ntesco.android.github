package com.vn.ntesco.model.Response

import com.google.gson.annotations.SerializedName

open class NTescoResponse(
        @SerializedName("code")
        var code: Int? = 0,
        @SerializedName("msg")
        var msg: String? = ""
)