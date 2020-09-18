package com.vn.ntesco.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.location.LocationServices
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.net.PlacesClient
import com.vn.ntesco.R
import com.vn.ntesco.adapter.PlaceAutocompleteAdapter
import com.vn.ntesco.utils.Constant
import kotlinx.android.synthetic.main.address_dialog.*
import com.google.android.libraries.places.api.model.Place
import com.google.android.gms.common.api.ApiException
import com.google.android.libraries.places.api.net.FetchPlaceRequest
import com.vn.ntesco.utils.DialogUtils

import java.util.*


class AddAddressDialog : FragmentActivity(), PlaceAutocompleteAdapter.PlaceAutoCompleteInterface, GoogleApiClient.OnConnectionFailedListener,
        GoogleApiClient.ConnectionCallbacks {

    internal var mAdapter: PlaceAutocompleteAdapter? = null
    lateinit var placesClient: PlacesClient
    lateinit var mGoogleApiClient: GoogleApiClient
    lateinit var txtAddress: EditText
    var placeDetail: Place? = null
    var placeAddress: String = ""
    var isSelected = false;
    override fun onStart() {
        mGoogleApiClient.connect()
        super.onStart()
    }

    override fun onStop() {
        mGoogleApiClient.disconnect()
        super.onStop()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.address_dialog)
        txtAddress = findViewById(R.id.txtAddress)

        Places.initialize(this, "AIzaSyAXjssHBlyvnt57SDuBy219QbSGACwJfr8")
        placesClient = Places.createClient(this)
        mAdapter = PlaceAutocompleteAdapter(this, R.layout.item_address_suggest, placesClient, this)
        list_search.apply {
            setHasFixedSize(true)
            adapter = mAdapter
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this@AddAddressDialog, androidx.recyclerview.widget.RecyclerView.VERTICAL, false)
        }
        mGoogleApiClient = GoogleApiClient.Builder(this)
                .enableAutoManage(this, 0 /* clientId */, this)
                //                .addApi(Places.GEO_DATA_API)
                .addConnectionCallbacks(this)

                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build()

        txtAddress.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (s.toString() == "") {
                    mAdapter?.clearList()
                    return
                }
                if (s.toString() != "" && mGoogleApiClient.isConnected) {
                    if(isSelected){
                        isSelected = false
                        return
                    }
                    placeDetail = null
                    placeAddress = ""
                    mAdapter?.getFilter()?.filter(s.toString())


                } else if (!mGoogleApiClient.isConnected) {
                    //                    Toast.makeText(getApplicationContext(), Constants.API_NOT_CONNECTED, Toast.LENGTH_SHORT).show();
                    //                    Log.e("", "NOT CONNECTED");
                }
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
        ivClose.setOnClickListener {
            Utils.hideKeyboard(this)
            finish()
        }
        btnSelect.setOnClickListener {
            if(placeAddress==null || placeAddress.isEmpty()){
                DialogUtils.showDialog(this,getString(R.string.address_not_select),null)
                return@setOnClickListener
            }
            val intent = Intent()
            if (placeDetail != null) {
                intent.putExtra(Constant.ADDRESS, placeAddress)
                intent.putExtra(Constant.LAT_LNG, placeDetail?.latLng)
                setResult(Activity.RESULT_OK, intent)
            }
            finish()
            Utils.hideKeyboard(this)
        }
    }

    override fun onPlaceClick(place: PlaceAutocompleteAdapter.PlaceAutocomplete) {
        val placeFields = Arrays.asList(Place.Field.ID, Place.Field.ADDRESS, Place.Field.LAT_LNG)
        val request = FetchPlaceRequest.newInstance(place.placeId.toString(), placeFields)
        placesClient.fetchPlace(request).addOnSuccessListener { response ->
            isSelected = true
            placeDetail = response.place
            placeAddress = place.description?.toString()
            Utils.hideKeyboard(this)
            txtAddress.setText(placeAddress)
//            val intent = Intent()
//            intent.putExtra(Constant.ADDRESS, place.description)
//            intent.putExtra(Constant.LAT_LNG, placeDetail.latLng)
//            setResult(Activity.RESULT_OK, intent)
//            finish()
        }.addOnFailureListener { exception ->
            if (exception is ApiException) {
                val statusCode = exception.statusCode
            }
        }
    }

    override fun onConnectionFailed(p0: ConnectionResult) {
    }

    override fun onConnected(p0: Bundle?) {
    }

    override fun onConnectionSuspended(p0: Int) {
    }

}