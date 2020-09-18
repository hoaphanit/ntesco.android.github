package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.Chemicals

class ChemicalsResponse : NTescoResponse(){
    @SerializedName("data")
    @Expose
    val data : MutableList<Chemicals>? = ArrayList<Chemicals>();
 }
