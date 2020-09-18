package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.ProductDetail

class ProductDetailResponse :  NTescoResponse(){
    @SerializedName("data")
    @Expose
    var data : ProductDetail? = null
}