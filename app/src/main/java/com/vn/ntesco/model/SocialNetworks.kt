package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data class SocialNetworks(
        @SerializedName("facebook")
        var facebook: String,
        @SerializedName("youtube")
        var youtube: String,
        @SerializedName("twitter")
        var twitter: String,
        @SerializedName("linked_in")
        var linked_in: String

)