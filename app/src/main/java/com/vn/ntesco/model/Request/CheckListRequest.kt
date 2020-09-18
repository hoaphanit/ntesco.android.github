package com.vn.ntesco.model.Request

import com.google.gson.annotations.SerializedName

class CheckListRequest : NTescoRequestPOST() {
    @SerializedName("id")
    var id: Int = 0
    @SerializedName("attributess")
    var attributess: List<String>? = listOf()

    @SerializedName("children")
    var children: List<List<String>>? = listOf()

    @SerializedName("status")
    var statusList: MutableList<MutableList<String>>? = mutableListOf()
}