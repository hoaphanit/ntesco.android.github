package com.vn.ntesco.model


import com.google.gson.annotations.SerializedName

data class CheckVersion(
    @SerializedName("information_update")
    var informationUpdate: String? = "",
    @SerializedName("is_update")
    var isUpdate: Boolean? = false,
    @SerializedName("need_update")
    var needUpdate: Int? = 0
)