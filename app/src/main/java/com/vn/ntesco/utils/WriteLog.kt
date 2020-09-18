package com.vn.ntesco.utils

import android.os.Debug
import android.util.Log
import com.vn.ntesco.BuildConfig

object WriteLog {
    var debug = BuildConfig.DEBUG

    fun d(tag: String, msg: String?) {
        if (!debug)
            return
        if (msg != null)
            Log.d(tag, msg)
    }

    fun e(tag: String, msg: String?) {
        if (!debug)
            return
        if (msg != null) {
            Log.e(tag, msg)
        }
    }

    fun i(tag: String, msg: String?) {
        if (!debug)
            return
        if (msg != null)
            Log.i(tag, msg)
    }

    fun v(tag: String, msg: String?) {
        if (!debug)
            return
        if (msg != null)
            Log.v(tag, msg)
    }

    fun w(tag: String, msg: String?) {
        if (!debug)
            return
        if (msg != null)
            Log.w(tag, msg)
    }

    /**
     * @param str Created by tuan.nguyen on 9/09/2016.
     */
    fun LogMem(str: String) {
        val usedMegs2 = (Debug.getNativeHeapAllocatedSize() / 1048576L).toInt()
        val useMemKB = (Debug.getNativeHeapAllocatedSize() / 1024L).toInt()
        WriteLog.e("NUS:", "$str memory :  $usedMegs2($useMemKB KB)")
    }
}