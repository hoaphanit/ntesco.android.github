package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data class Notification(
        @SerializedName("id")
        var id: Int = 0,
        @SerializedName("title")
        var title: String = "",
        @SerializedName("body")
        var body: String = "",
        @SerializedName("params")
        var params: String = "",
        @SerializedName("template_id")
        var templateId: Int,
        @SerializedName("status")
        var status: Int,
        @SerializedName("created_at")
        var createdAt: String,
        @SerializedName("content")
        var content: String,
        @SerializedName("id_report")
        var idReport: Int,
        @SerializedName("id_post")
        var idPost: Int,
        @SerializedName("type")
        var type: Int
)