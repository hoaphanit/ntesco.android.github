package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data class NotificationData(
        @SerializedName("current_page")
        var currentPage: Int,
        @SerializedName("data")
        var data: MutableList<Notification>,
        @SerializedName("first_page_url")
        var firstPageUrl: String,
        @SerializedName("from")
        var from: Int,
        @SerializedName("last_page")
        var lastPage: Int,
        @SerializedName("last_page_url")
        var lastPageUrl: String,
        @SerializedName("next_page_url")
        var nextPageUrl: Any,
        @SerializedName("path")
        var path: String,
        @SerializedName("per_page")
        var perPage: String,
        @SerializedName("prev_page_url")
        var prevPageUrl: Any,
        @SerializedName("to")
        var to: Int,
        @SerializedName("total")
        var total: Int
)