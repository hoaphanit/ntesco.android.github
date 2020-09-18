package com.vn.ntesco.model.Request

import com.google.gson.annotations.SerializedName

class LoginRequest: NTescoRequestPOST() {
    @SerializedName("username")
    var userName: String? = null
    @SerializedName("password")
    var password: String? = null
    @SerializedName("device_token")
    var deviceToken: String? = null
    @SerializedName("device_type")
    var device_type: Int = 1
    @SerializedName("device_id")
    var device_id: String? = null
}