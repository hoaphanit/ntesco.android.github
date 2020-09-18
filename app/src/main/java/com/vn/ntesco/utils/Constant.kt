package com.vn.ntesco.utils;

import java.util.*

object Constant {
//    val apiEndPoint = "http://mobile.ntesco.com/";
    //   val apiEndPoint  =   "http://ntesco.verztecsolution.com/";
       val apiEndPoint  =   "http://ntesco.com.vn/";
    val SUCCESS: Int = 200;
    val TYPE: String = "type";
    val SOLUTION_APPLICATION: String = "SOLUTION_APPLICATION";
    val COLOR: String = "COLOR";
    val DAYS_COUNT: Int = 30;
    val AccountInfoFragment = "AccountInfoFragment"
    val LOGIN = "LOGIN"
    val NEWS_EVENT = "news_event"
    val WATER_TREATMENT = "water_treatment_knowledge"
    val HOT_NEWS = "hot-news"
    val POPULAR_NEWS = "popular-topics"
    val POST = "POST"
    val USER = "USER"
    val REPORT = "REPORT"
    val STATUS = "STATUS"
    val CHAT = "CHAT"
    val PRODUCT_ID = "PRODUCT_ID"
    val ADDRESS = "ADDRESS"
    val LAT_LNG = "LAT_LNG"
    val PAGE_SIZE = 15
    val DEFAULT_FIRST_PAGE = 1
    val LOGIN_LOCAL_BROADCAST = "LOGIN_LOCAL_BROADCAST"
    val LIST_WORK_LOCAL_BROADCAST = "LIST_WORK_LOCAL_BROADCAST"
    val LIST_REPORT_LOCAL_BROADCAST = "LIST_REPORT_LOCAL_BROADCAST"
    val NOTIFY_LOCAL_BROADCAST = "NOTIFY_LOCAL_BROADCAST"
    val TYPE_NOTIFY = "TYPE_NOTIFY"
    val REPORT_ID = "REPORT_ID"
    val GO_TO_SERVICE = "GO_TO_SERVICE"
    val NOTIFICATION_ID = "NOTIFICATION_ID"
    val NOTIFICATION_STATUS = "NOTIFICATION_STATUS"
    val FROM_HOME = "FROM_HOME"
    val LOG_OUT = "LOG_OUT"
    val IS_READ = "IS_READ"
    val FROM_NOTIFY = "FROM_NOTIFY"
    val DELETE_NOTIFY= "DELETE_NOTIFY"
    val PDF_URL = "PDF_URL"
    val PDF_NAME = "PDF_NAME"
    var isLoggedOut = false
    var ANDROID = "android"
    val LIST_IMAGE = "LIST_IMAGE"
    val IS_CREATE_REPORT = "IS_CREATE_REPORT"
    val POSITION = "POSITION"
    val POST_ID = "POST_ID"
    var isOpeningMain = false
    val GPS_REQUEST = 1001

    fun getLanguage(): String {
        if (PrefUtils.getInstance().getLanguage() != null && !PrefUtils.getInstance().getLanguage().isEmpty()) {
            if (PrefUtils.getInstance().getLanguage().equals("en"))
                return "en_US"
            else
                return PrefUtils.getInstance().getLanguage()
        } else {
            if (Locale.getDefault().getLanguage().equals("vi"))
                return "vi"
            else
                return "en_US"
        }
    }


}