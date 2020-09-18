package com.vn.ntesco.model.Request

import com.google.gson.annotations.SerializedName

open class NTescoRequestPOST {
    @SerializedName("chemical_name")
    var chemicalName: String? = null

    @SerializedName("concentration")
    var concentration: String? = null

    @SerializedName("cost")
    var cost: String? = null

    @SerializedName("required")
    var required: String? = null

    @SerializedName("specific_gravity")
    var specificGravity: String? = null

    @SerializedName("stock_solution")
    var stockSolution: String? = null

    @SerializedName("water_flow_rate")
    var waterFlowRate: String? = null

    @SerializedName("from_date")
    var fromDate: String? = null

    @SerializedName("to_date")
    var toDate: String? = null

    @SerializedName("technical_id")
    var technicalId: Int? = null

    @SerializedName("comment_service")
    var comment_service: String? = null

    @SerializedName("currency")
    var currency: String? = null


}