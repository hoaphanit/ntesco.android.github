package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.Report

class ReportDetailReponse: NTescoResponse()
{
    @SerializedName("data")
    @Expose
    val data: Report? = null
}