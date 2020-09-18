package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

class ProductDetail(
        @SerializedName("id")
        var id: Int,
        @SerializedName("name")
        var name: String,
        @SerializedName("description")
        var description: String,
        @SerializedName("content")
        var content: String,
        @SerializedName("file")
        var file: String,
        @SerializedName("images")
        var images: List<String>
)