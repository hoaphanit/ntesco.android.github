package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose


data class Office(
        @SerializedName("title")
        var title: String,
        @SerializedName("name")
        var name: String,
        @SerializedName("id")
        var id: Int,
        @SerializedName("address")
        var address: String?,
        @SerializedName("phone")
        var phone: String?,
        @SerializedName("fax")
        var fax: String?,
        @SerializedName("email")
        var email: String?,
        @SerializedName("website")
        var website: String?,
        @SerializedName("lat")
        var lat: String,
        @SerializedName("lng")
        var lng: String,
        @SerializedName("status")
        var status: Int
)