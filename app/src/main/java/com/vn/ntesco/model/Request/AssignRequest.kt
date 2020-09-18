package com.vn.ntesco.model.Request

import com.google.gson.annotations.SerializedName

class AssignRequest : NTescoRequestPOST() {
    @SerializedName("handle_formality")
    var handleFormality: MutableList<Int>? = ArrayList()
    @SerializedName("guarantee")
    var guarantee: MutableList<Int>? = ArrayList()
}