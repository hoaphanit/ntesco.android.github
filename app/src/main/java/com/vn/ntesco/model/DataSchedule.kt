package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data
class DataSchedule( @SerializedName("day")
                    var day: String,
                    @SerializedName("report")
                    var report: List<ReportSchedule>?

 )