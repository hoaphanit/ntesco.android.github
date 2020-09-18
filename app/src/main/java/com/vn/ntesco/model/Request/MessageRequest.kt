package com.vn.ntesco.model.Request

import com.google.gson.annotations.SerializedName

class MessageRequest(@SerializedName("content")
                     var content: String?,
                     @SerializedName("sender_id")
                     var senderId: String?,
                     @SerializedName("sender_name")
                     var senderName: String?) : NTescoRequestPOST() {

}