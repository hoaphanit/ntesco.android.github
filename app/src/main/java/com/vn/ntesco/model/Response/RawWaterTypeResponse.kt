package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.OfficeGroup
import com.vn.ntesco.model.RawWaterType


class RawWaterTypeResponse: NTescoResponse()
{
    @SerializedName("data")
    @Expose
    val data = ArrayList<RawWaterType>()
}