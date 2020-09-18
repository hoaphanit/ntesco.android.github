package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data class RawWaterType(
    @SerializedName("name")
    var name: String = "",
    @SerializedName("id")
    var id: Int,
    @SerializedName("checked")
    var select: Boolean = false

)
