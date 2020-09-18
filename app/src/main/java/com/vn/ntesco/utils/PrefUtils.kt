package com.vn.ntesco.utils

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.vn.ntesco.MainApplication
import com.vn.ntesco.R
import com.vn.ntesco.model.RawWaterType
import java.io.File
import java.util.ArrayList

class PrefUtils {
    private var prefUtils: PrefUtils? = null
    private var preferences: SharedPreferences? = null

    private object Holder {
        val INSTANCE = PrefUtils()
    }

    fun putString(key: String, value: String) {
        checkForNullKey(key)
        checkForNullValue(value)
        preferences!!.edit().putString(key, value).apply()
    }

    fun getString(key: String): String {
        if (preferences == null)
            return ""
        return if (!preferences!!.contains(key)) "" else preferences!!.getString(key, "")
    }

    fun putInt(key: String, value: Int) {
        preferences!!.edit().putInt(key, value).apply()
    }

    fun getInt(key: String): Int {
        return if (preferences == null) 0 else preferences!!.getInt(key, 0)
    }

    fun putBoolean(key: String, b: Boolean) {
        preferences!!.edit().putBoolean(key, b).apply()
    }

    fun getBoolean(key: String): Boolean {
        return if (preferences == null) false else preferences!!.getBoolean(key, false)

    }

    fun saveListWaterType(modelList: List<RawWaterType>) {
        val arrayData = Gson().toJson(modelList)
        putString(WATER_TYPE, arrayData)
    }

    fun getListWaterType(): List<RawWaterType> {
        var rawWaterType: List<RawWaterType> = ArrayList<RawWaterType>()
        if (getString(WATER_TYPE) != null && !getString(WATER_TYPE).isEmpty()) {
            rawWaterType = Gson().fromJson<List<RawWaterType>>(getString(WATER_TYPE), object : TypeToken<List<RawWaterType>>() {
            }.type)
        }
        return rawWaterType
    }

    fun saveListProduct(modelList: List<RawWaterType>) {
        val arrayData = Gson().toJson(modelList)
        putString(PRODUCTS, arrayData)
    }

    fun getListProduct(): List<RawWaterType> {
        var rawWaterType: List<RawWaterType> = ArrayList<RawWaterType>()
        if (getString(PRODUCTS) != null && !getString(PRODUCTS).isEmpty()) {
            rawWaterType = Gson().fromJson<List<RawWaterType>>(getString(PRODUCTS), object : TypeToken<List<RawWaterType>>() {
            }.type)
        }
        return rawWaterType
    }
    fun saveListFormsProcessing(modelList: List<RawWaterType>) {
        val arrayData = Gson().toJson(modelList)
        putString(FORMS_PROCESSING, arrayData)
    }

    fun getListFormsProcessing(): List<RawWaterType> {
        var rawWaterType: List<RawWaterType> = ArrayList<RawWaterType>()
        if (getString(FORMS_PROCESSING) != null && !getString(FORMS_PROCESSING).isEmpty()) {
            rawWaterType = Gson().fromJson<List<RawWaterType>>(getString(FORMS_PROCESSING), object : TypeToken<List<RawWaterType>>() {
            }.type)
        }
        return rawWaterType
    }
    fun saveListGuarantees(modelList: List<RawWaterType>) {
        val arrayData = Gson().toJson(modelList)
        putString(GUARANTEES, arrayData)
    }

    fun getListGuarantees(): List<RawWaterType> {
        var rawWaterType: List<RawWaterType> = ArrayList<RawWaterType>()
        if (getString(GUARANTEES) != null && !getString(GUARANTEES).isEmpty()) {
            rawWaterType = Gson().fromJson<List<RawWaterType>>(getString(GUARANTEES), object : TypeToken<List<RawWaterType>>() {
            }.type)
        }
        return rawWaterType
    }
    fun getListWarrantyStatus(context: Context): List<RawWaterType> {
        val listWarranty = listOf(RawWaterType(context.resources.getString(R.string.longer_warranty),1,false),RawWaterType(context.resources.getString(R.string.out_of_warranty),0,false))
        return listWarranty
    }
    fun saveTokenFirebase(token: String) {
        putString(TOKEN_FIREBASE, token)
    }

    fun getTokenFirebase(): String {
        return getString(TOKEN_FIREBASE)
    }
    fun saveLanguage(language: String) {
        putString(LANGUAGE, language)
    }

    fun getLanguage(): String {
        return getString(LANGUAGE)
    }
    /**
     * null keys would corrupt the shared pref file and make them unreadable this is a preventive measure
     *
     * @param key pref key
     */
    fun checkForNullKey(key: String?) {
        if (key == null)
            throw NullPointerException()
    }

    /**
     * null keys would corrupt the shared pref file and make them unreadable this is a preventive measure
     *
     * @param value pref key
     */
    fun checkForNullValue(value: String?) {
        if (value == null)
            throw NullPointerException()
    }

    companion object {
        val NTESCO = "NTESCO"
        val USER = "USER"
        val WATER_TYPE = "WATER_TYPE"
        val PRODUCTS = "PRODUCTS"
        val ABOUT = "ABOUT"
        val OFFICES = "OFFICES"
        val CATEGORY = "CATEGORY"
        val TOKEN_FIREBASE = "TOKEN_FIREBASE"
        val SOLUTION_PRODUCT = "SOLUTION_PRODUCT"
        val PRODUCT_DETAIL_LIST = "PRODUCT_DETAIL_LIST"
        val LANGUAGE = "LANGUAGE"
        val BANNER_SOLUTION = "BANNER_SOLUTION"
        val FORMS_PROCESSING = "FORMS_PROCESSING"
        val GUARANTEES = "GUARANTEES"

        var pref: PrefUtils? = null;
        @JvmStatic
        fun getInstance(): PrefUtils {
            if (pref == null) {
                pref = PrefUtils();
                pref!!.preferences = MainApplication.context.getSharedPreferences(NTESCO, Context.MODE_PRIVATE)
            }
            return pref as PrefUtils
        }

    }


}