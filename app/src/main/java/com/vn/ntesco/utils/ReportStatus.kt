package com.vn.ntesco.utils

enum class ReportStatus(val status: Int) {
    NOT_CONFIRM(1),
    CONFIRM(2),
    COMPLETED(7),
    CANCEL(8),
    PROCESSING(4),
    PROCESSING_STATUS(5),
    PROCESSED(6),
    ASSIGNED(3),


}