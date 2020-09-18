package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.WriteLog
import java.io.Serializable

data class User(
        @SerializedName("access_token")
        var accessToken: String,
        @SerializedName("company")
        var company: String,
        @SerializedName("country")
        var country: String,
        @SerializedName("email")
        var email: String,
        @SerializedName("expires_in")
        var expiresIn: Int,
        @SerializedName("first_name")
        var firstName: String = "",
        @SerializedName("id")
        var id: Int,
        @SerializedName("last_name")
        var lastName: String = "",
        @SerializedName("location")
        var location: String,
        @SerializedName("phone")
        var phone: String,
        @SerializedName("token_type")
        var tokenType: String,
        @SerializedName("type")
        var type: Int,
        @SerializedName("username")
        var username: String,
        @SerializedName("email_verified_at")
        val email_verified_at: String,
        @SerializedName("device_token")
        val device_token: String,
        @SerializedName("device_type")
        var device_type: Int,
        @SerializedName("status")
        var status: Int,
        @SerializedName("created_at")
        val created_at: String,
        @SerializedName("updated_at")
        val updated_at: String,
        @SerializedName("image")
        val image: String,
        @SerializedName("full_name")
        val full_name: String
        ) : Serializable {

    fun getFullName(): String {
        if (Constant.getLanguage().equals("en_US")) {
            return firstName + " " + lastName
        } else {
            WriteLog.e("languageUser",Constant.getLanguage())
            return lastName + " " + firstName
        }
    }

}