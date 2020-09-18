package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class SolutionProduct(
        @SerializedName("id")
        var id: Int,
        @SerializedName("image")
        var image: String,
        @SerializedName("description")
        var description: String,
        @SerializedName("products")
        var products: ArrayList<Product>
): Serializable



