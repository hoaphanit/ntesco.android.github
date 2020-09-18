package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Product(
        @SerializedName("id")
        var id: Int,
        @SerializedName("name")
        var name: String,
        @SerializedName("image")
        var image: String
): Serializable



