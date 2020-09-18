package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.Category
import com.vn.ntesco.model.CheckListModel
import com.vn.ntesco.model.Chemicals
import com.vn.ntesco.model.User

class CheckListResponse : NTescoResponse(){
    @SerializedName("data")
    @Expose
    val data : MutableList<CheckListModel>? = ArrayList<CheckListModel>();
}