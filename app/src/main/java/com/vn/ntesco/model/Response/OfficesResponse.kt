package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.Office
import com.vn.ntesco.model.OfficeGroup

class OfficesResponse: NTescoResponse()
{
    @SerializedName("data")
    @Expose
    val data = ArrayList<Office>()
}