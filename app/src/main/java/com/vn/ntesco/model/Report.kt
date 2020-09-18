package com.vn.ntesco.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Report(
        @SerializedName("id")
        var id: Int,

        @SerializedName("image")
        var image: ArrayList<String>,
        @SerializedName("customer_name")
        var customerName: String?,
        @SerializedName("error")
        var error: String?,
        @SerializedName("publish_date")
        var publishDate: String?,
        @SerializedName("status")
        var status: Int?,
        @SerializedName("username")
        var userName: String?,
        @SerializedName("lat")
        var lat: Double?,
        @SerializedName("lng")
        var lng: Double?,
        @SerializedName("address")
        var address: String?,
        @SerializedName("from_date")
        var fromDate: String?,
        @SerializedName("to_date")
        var toDate: String?,
        @SerializedName("raw_water_type")
        var rawWaterType: List<RawWaterType>,
        @SerializedName("product")
        var products: List<RawWaterType>,
        @SerializedName("images")
        var images: ArrayList<String>,
        @SerializedName("mine")
        var mine: Boolean,
        @SerializedName("created_at")
        var createdAt: String,
        @SerializedName("employee_lat")
        var employeeLat: Double?,
        @SerializedName("employee_lng")
        var employeeLng: Double?,
        @SerializedName("handle_formality")
        var handleFormality: List<RawWaterType>?,
        @SerializedName("guarantee")
        var guarantee: List<RawWaterType>?,
        @SerializedName("technical")
        var technical: String?,
        @SerializedName("image_processing_status")
        var imageProcessingStatus: ArrayList<String>?,
        @SerializedName("note_processing_status")
        var noteProcessingStatus: String?,
        @SerializedName("image_processed")
        var imageProcessed: ArrayList<String>?,
        @SerializedName("note_processed")
        var noteProcessed: String?,
        @SerializedName("comment_service_completed")
        var customerComment: String?
) : Serializable