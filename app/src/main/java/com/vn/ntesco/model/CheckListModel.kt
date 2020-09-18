package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data class CheckListModel(
        @SerializedName("attributes")
        var attributesList: List<String> = listOf(),
        @SerializedName("children")
        var childrenList: MutableList<MutableList<String>> = mutableListOf(),
        @SerializedName("created_at")
        var createdAt: String? = "",
        @SerializedName("id")
        var id: Int? = 0,
        @SerializedName("name")
        var name: String? = "",
        @SerializedName("status")
        var status: Int? = 0,
        @SerializedName("updated_at")
        var updatedAt: String? = ""

) {
    var inputAttributesList: MutableList<MutableList<String>>? = mutableListOf()
    var isExpanded = false
}