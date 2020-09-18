package com.vn.ntesco.model.Request

import com.google.gson.annotations.SerializedName

class SignupRequest : NTescoRequestPOST() {
    @SerializedName("first_name")
    var first_name: String? = null
    @SerializedName("last_name")
    var last_name: String? = null
    @SerializedName("username")
    var username: String? = null
    @SerializedName("password")
    var password: String? = null
    @SerializedName("confirm_password")
    var confirm_password: String? = null
    @SerializedName("email")
    var email: String? = null
    @SerializedName("country")
    var country: String? = null
    @SerializedName("location")
    var location: String? = null
    @SerializedName("phone")
    var phone: String? = null
    @SerializedName("company")
    var company: String? = null
    @SerializedName("current_password")
    var currentPassword: String? =null
    @SerializedName("password_confirm")
    var confirmPassword: String? =null
    @SerializedName("full_name")
    var fullName: String? = null
    @SerializedName("title")
    var title: String? = null
    @SerializedName("content")
    var content: String? = null
    @SerializedName("lat")
    var lat: Double? = null
    @SerializedName("lng")
    var lng: Double? = null
}