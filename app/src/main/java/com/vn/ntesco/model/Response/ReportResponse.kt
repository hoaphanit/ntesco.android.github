package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.Chemicals
import com.vn.ntesco.model.Report
import com.vn.ntesco.model.ReportData
import com.vn.ntesco.model.User

class ReportResponse: NTescoResponse() {

    @SerializedName("data")
    @Expose
    val data : ReportData? = null;
}