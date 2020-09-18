package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName

data class CalculatorChemical(
        @SerializedName("cost")
        var cost: String,
        @SerializedName("mix_chemical")
        var mixChemical: String,
        @SerializedName("selected_dosing")
        var selectedDosing: String
)