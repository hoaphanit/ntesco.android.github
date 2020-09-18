package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data class ReportSchedule(
        @SerializedName("id")
        var id: Int,
        @SerializedName("customer_name")
        var customerName: String,
        @SerializedName("error")
        var error: String,
        @SerializedName("lat")
        var lat: Double,
        @SerializedName("lng")
        var lng: Double,
        @SerializedName("address")
        var address: String,
        @SerializedName("from_date")
        var fromDate: String,
        @SerializedName("to_date")
        var toDate: String,
        @SerializedName("status")
        var status: Int,
        @SerializedName("created_at")
        var createdAt: String,
        @SerializedName("updated_at")
        var updatedAt: String,
        @SerializedName("deleted_at")
        var deletedAt: String,
        @SerializedName("user_id")
        var userId: Int,
        @SerializedName("username")
        var userName: String
)