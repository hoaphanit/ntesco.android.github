package com.vn.ntesco.utils

import com.google.gson.Gson
import com.vn.ntesco.R
import com.vn.ntesco.model.User

object UserCache {
    var userInfo: User? = null
        get() =
            if (PrefUtils.getInstance().getString(PrefUtils.USER).isEmpty()) null else Gson().fromJson(
                    PrefUtils.getInstance().getString(
                            PrefUtils.USER
                    ), User::class.java
            )

    fun isLogin(): Boolean {
        try {
            return userInfo != null && userInfo?.accessToken != null && !userInfo?.accessToken.toString().isEmpty()
        } catch (e: Exception) {

        }
        return false
    }

    fun getColorUser(): Int {
        try {
            if (userInfo?.type != 1)
                return R.color.red
            else
                return R.color.blue
        } catch (e: Exception) {

        }
        return R.color.blue
    }

    fun isCustomerUser(): Boolean {
        return userInfo != null && userInfo?.type == 1
    }

    fun isManager(): Boolean {
        return userInfo != null && userInfo?.type == 3
    }

    fun isTechnical(): Boolean {
        return userInfo != null && userInfo?.type == 2
    }
    fun isEmployee(): Boolean {
        return userInfo != null && userInfo?.type == 4
    }
    /**
     * Store new_process user info into cache
     */
    fun saveUserInfo(userInfo: User?) {
        if (userInfo != null) {
            PrefUtils.getInstance().putString(PrefUtils.USER, Gson().toJson(userInfo))
            WriteLog.e("saveUserInfo", PrefUtils.getInstance().getString(PrefUtils.USER))
        } else
            PrefUtils.getInstance().putString(PrefUtils.USER, "")

    }


}