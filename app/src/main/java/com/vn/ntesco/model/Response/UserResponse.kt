package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.CalculatorChemical
import com.vn.ntesco.model.User

class UserResponse: NTescoResponse() {

    @SerializedName("data")
    @Expose
    val data : User? = null;
}