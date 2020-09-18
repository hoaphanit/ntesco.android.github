package com.vn.ntesco.utils

import android.content.Context
import android.location.Geocoder
import android.text.TextUtils
import android.util.Log
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.io.IOException
import java.util.*

class GetLocationDetail(val addressCallBack: LocationData.AddressCallBack, val context: Context) {
    private val BASE_URL = "https://maps.googleapis.com/maps/"
    private var retrofit: Retrofit? = null

    fun getRetrofitInstance(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
        return retrofit
    }

    fun getAddress(latitude: Double?, longitude: Double?, key: String) {
        try {
            val geocoder = Geocoder(context, Locale.getDefault())
            val addresses = geocoder.getFromLocation(latitude!!, longitude!!, 1)
            if (addresses != null && addresses.size > 0) {

                val address =
                        addresses[0].getAddressLine(0) // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
                val city = addresses[0].locality
                val state = addresses[0].adminArea
                val country = addresses[0].countryName
                val postalCode = addresses[0].postalCode
                val knownName = addresses[0].featureName // Only if available else return NULL
                val locationData = LocationData()
                locationData.city = city
                locationData.full_address = address
                locationData.pincode = postalCode
                locationData.country = country
                addressCallBack.locationData(locationData)

            }
        } catch (e: IOException) {
            WriteLog.e("getAddressFaild", e.toString())
            getAddressFromApi(latitude, longitude, key)
        }

    }

    private fun getAddressFromApi(latitude: Double?, longitude: Double?, key: String) {
        val tempBuilder = StringBuilder()
        tempBuilder.append(latitude)
        tempBuilder.append(",")
        tempBuilder.append(longitude)
        val dataService = getRetrofitInstance()?.create(DataService::class.java)
        val stringCall = dataService?.getData(tempBuilder.toString(), true, key)
        if (!stringCall!!.isExecuted) {
            stringCall?.cancel()
        }
        stringCall.enqueue(object : Callback<String> {
            override fun onResponse(call: Call<String>, response: Response<String>) {
                try {
                    val jsonObject = JSONObject(response.body())
                    val Results = jsonObject.getJSONArray("results")
                    val zero = Results.getJSONObject(0)
                    val address_components = zero.getJSONArray("address_components")
                    val locationData = LocationData()
                    locationData.full_address = zero.getString("formatted_address")
                    for (i in 0 until address_components.length()) {
                        val zero2 = address_components.getJSONObject(i)
                        val long_name = zero2.getString("long_name")
                        val mtypes = zero2.getJSONArray("types")
                        val Type = mtypes.getString(0)
                        if (TextUtils.isEmpty(long_name) == false || long_name != null || long_name!!.length > 0 || long_name !== "") {
                            if (Type.equals("street_number", ignoreCase = true)) {
                                //Address1 = long_name + " ";
                            } else if (Type.equals("route", ignoreCase = true)) {
                                //Address1 = Address1 + long_name;
                            } else if (Type.equals("sublocality", ignoreCase = true)) {
                                // Address2 = long_name;
                            } else if (Type.equals("locality", ignoreCase = true)) {
                                // Address2 = Address2 + long_name + ", ";
                                locationData.city = long_name
                            } else if (Type.equals("administrative_area_level_2", ignoreCase = true)) {
                                // County = long_name;

                            } else if (Type.equals("administrative_area_level_1", ignoreCase = true)) {
                                // State = long_name;
                            } else if (Type.equals("country", ignoreCase = true)) {
                                locationData.country = long_name
                            } else if (Type.equals("postal_code", ignoreCase = true)) {
                                locationData.pincode = long_name
                            }
                        }
                    }
                    addressCallBack.locationData(locationData)
                } catch (e: JSONException) {
                    e.printStackTrace()
                }

            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                Log.v("response", t.toString())
            }
        })
    }


    private interface DataService {
        @GET("api/geocode/json")
        fun getData(@Query("latlng") latLong: String, @Query("sensor") sensor: Boolean, @Query("key") key: String): Call<String>
    }
}