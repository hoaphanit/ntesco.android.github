package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Post(
        @SerializedName("created_at")
        var createdAt: String,
        @SerializedName("description")
        var description: String,
        @SerializedName("featured")
        var featured: Int,
        @SerializedName("format_type")
        var formatType: Any,
        @SerializedName("id")
        var id: Int,
        @SerializedName("image")
        var image: String,
        @SerializedName("name")
        var name: String,
        @SerializedName("publish_date")
        var publishDate: String,
        @SerializedName("status")
        var status: Int,
        @SerializedName("updated_at")
        var updatedAt: String,
        @SerializedName("user_id")
        var userId: Int,
        @SerializedName("views")
        var views: Int,
        @SerializedName("content")
        var content: String,
        @SerializedName("pdf_file")
        var pdfFile: String?,
        @SerializedName("pdf_name")
        var namePdf: String?
) : Serializable