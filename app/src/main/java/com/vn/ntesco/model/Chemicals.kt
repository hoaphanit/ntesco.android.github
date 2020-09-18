package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data class Chemicals(
        @SerializedName("id")
        var id: Int = 0,
        @SerializedName("name")
        var name: String = "",
        @SerializedName("type")
        var type: Int = 0,
        @SerializedName("liquid_concentrate")
        var liquid_concentrate: Float = 0f,
        @SerializedName("liquid_specific_gravity")
        var liquid_specific_gravity: Float = 0f,
        @SerializedName("powder_concentrate")
        var powder_concentrate: Float = 0f,
        @SerializedName("powder_specific_gravity")
        var powder_specific_gravity: Float = 0f

)

