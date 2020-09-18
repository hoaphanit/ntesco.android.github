package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data class OfficeGroup(
    @SerializedName("name")
    var name: String,
    @SerializedName("id")
    var id: Int,
    @SerializedName("offices")
    var offices: List<Office>
)