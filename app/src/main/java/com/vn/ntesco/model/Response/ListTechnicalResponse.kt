package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.Category
import com.vn.ntesco.model.Chemicals
import com.vn.ntesco.model.User

class ListTechnicalResponse : NTescoResponse(){
    @SerializedName("data")
    @Expose
    val data : MutableList<User>? = ArrayList<User>();
}