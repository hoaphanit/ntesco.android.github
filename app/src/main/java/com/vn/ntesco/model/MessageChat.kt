package com.vn.ntesco.model

data class MessageChat(val content: String? = null,
                       val created: Any? = null,
                       val senderId: String? = null,
                       val senderName: String? = null
) {
    var type: Int = 0
}