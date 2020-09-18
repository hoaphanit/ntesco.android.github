package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.DataSchedule
import com.vn.ntesco.model.Notification

class ScheduleResponse :  NTescoResponse(){

    @SerializedName("data")
    @Expose
    val data : MutableList<DataSchedule>? = ArrayList<DataSchedule>();
}