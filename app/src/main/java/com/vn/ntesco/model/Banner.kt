package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data class Banner(
        @SerializedName("description")
        var description: String,
        @SerializedName("id")
        var id: Int,
        @SerializedName("image")
        var image: String,
        @SerializedName("link")
        var link: Any,
        @SerializedName("name")
        var name: String,
        @SerializedName("order")
        var order: Any,
        @SerializedName("position")
        var position: Int,
        @SerializedName("status")
        var status: Int
)