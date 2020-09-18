package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data class AboutUs(
        @SerializedName("content")
        var content: String,
        @SerializedName("created_at")
        var createdAt: Any,
        @SerializedName("description")
        var description: String,
        @SerializedName("id")
        var id: Int,
        @SerializedName("image_head")
        var imageHead: String,
        @SerializedName("images")
        var images: List<String>,
        @SerializedName("image_footer")
        var imageFooter: String,
        @SerializedName("title")
        var title: String
)