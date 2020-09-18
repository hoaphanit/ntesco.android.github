package com.vn.ntesco.utils

import android.app.Activity
import android.content.Context
import android.content.IntentSender.SendIntentException
import android.location.LocationManager
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*

class GpsUtils {
    private var context: Context? = null
    private var mSettingsClient: SettingsClient? = null
    private var mLocationSettingsRequest: LocationSettingsRequest? = null
    private var locationManager: LocationManager? = null

    constructor(context: Context, locationRequest: LocationRequest?){
        this.context = context
        locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        mSettingsClient = LocationServices.getSettingsClient(context)
        val builder = LocationSettingsRequest.Builder().addLocationRequest(locationRequest!!)
        mLocationSettingsRequest = builder.build()

        //**************************
        builder.setAlwaysShow(true) //this is the key ingredient
        //**************************
    }

    // method for turn on GPS
    fun turnGPSOn(onGpsListener: onGpsListener?) {
        if (locationManager!!.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            onGpsListener?.gpsStatus(true)
        } else {
            mSettingsClient!!
                    .checkLocationSettings(mLocationSettingsRequest)
                    .addOnSuccessListener {
                        if (onGpsListener != null) {
                            WriteLog.e("turnGPSOn", "turnGPSOn")
                            onGpsListener.gpsStatus(true)
                        }
                    }
                    .addOnFailureListener((context as Activity?)!!) { e ->
                        val statusCode = (e as ApiException).statusCode
                        when (statusCode) {
                            LocationSettingsStatusCodes.RESOLUTION_REQUIRED -> try {
                                // Show the dialog by calling startResolutionForResult(), and check the
                                // result in onActivityResult().
                                val rae = e as ResolvableApiException
                                rae.startResolutionForResult(context as Activity?, Constant.GPS_REQUEST)
                            } catch (sie: SendIntentException) {
                            }
                            LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE -> {

                            }

                        }
                    }
        }
    }


    interface onGpsListener {
        fun gpsStatus(isGPSEnable: Boolean)
    }
}