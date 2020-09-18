package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Category(
        @SerializedName("id")
        var id: Int,
        @SerializedName("name")
        var name: String,
        @SerializedName("image")
        var image: Int,
        @SerializedName("icon")
        var icon: String,
        var color: Int
): Serializable



