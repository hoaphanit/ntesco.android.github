package com.vn.ntesco.model.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vn.ntesco.model.AboutUs
import com.vn.ntesco.model.SolutionProduct

class SolutionProductResponse : NTescoResponse(){
    @SerializedName("data")
    @Expose
    lateinit var data : SolutionProduct
/*    if (solutionProductsList != null) {
        for ((index, solution) in solutionProductsList.withIndex()) {
            if (solution.id == cate_id) {
                solutionProductsList.removeAt(index)
                solutionProductsList.add(solutionProduct)
                PrefUtils.getInstance().putString(PrefUtils.SOLUTION_PRODUCT, Gson().toJson(solutionProductsList))
                return solutionProduct
            }
        }
        solutionProductsList.add(solutionProduct)
    } else {
        var solutionProducts2 = ArrayList<SOLUTION_PRODUCT>()
        solutionProducts2.add(solutionProduct)
        val jsonString = Gson().toJson(solutionProducts2)
        PrefUtils.getInstance().putString(PrefUtils.SOLUTION_PRODUCT, jsonString)
    }*/
}