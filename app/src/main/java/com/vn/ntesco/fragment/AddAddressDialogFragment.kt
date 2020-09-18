package com.vn.ntesco.fragment


import android.app.Activity
import android.content.Intent
import android.graphics.Point
import android.graphics.drawable.ColorDrawable
import android.location.Address
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.model.LatLng
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.api.net.FetchPlaceRequest
import com.google.android.libraries.places.api.net.PlacesClient
import com.vn.ntesco.R
import com.vn.ntesco.adapter.PlaceAutocompleteAdapter
import com.vn.ntesco.base.BaseActivity
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.DialogUtils
import kotlinx.android.synthetic.main.address_dialog.*
import java.util.*


class AddAddressDialogFragment : DialogFragment(), PlaceAutocompleteAdapter.PlaceAutoCompleteInterface, GoogleApiClient.OnConnectionFailedListener,
        GoogleApiClient.ConnectionCallbacks {

    override fun onPlaceClick(place: PlaceAutocompleteAdapter.PlaceAutocomplete) {
        val placeFields = Arrays.asList(Place.Field.ID, Place.Field.ADDRESS, Place.Field.LAT_LNG)
        val request = FetchPlaceRequest.newInstance(place.placeId.toString(), placeFields)
        placesClient.fetchPlace(request).addOnSuccessListener { response ->
            isSelected = true
            placeDetail = response.place
            placeAddress = place.description?.toString()
            Utils.hideKeyboard(activity!!)
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


    companion object {
        fun builder(callbackPopup: CallbackPopup): AddAddressDialogFragment {
            val addAddressDialogFragment = newInstance()
            addAddressDialogFragment.mCallbackPopup = callbackPopup
            addAddressDialogFragment.setCancelable(false)
            return addAddressDialogFragment
        }

        fun newInstance(): AddAddressDialogFragment {
            return AddAddressDialogFragment()
        }

    }

    internal var mAdapter: PlaceAutocompleteAdapter? = null
    lateinit var placesClient: PlacesClient
    lateinit var mGoogleApiClient: GoogleApiClient
    lateinit var txtAddress: EditText
    lateinit var list_search: androidx.recyclerview.widget.RecyclerView
    lateinit var ivClose: ImageView
    lateinit var btnSelect: TextView
    var placeDetail: Place? = null
    var placeAddress: String = ""
    var isSelected = false;
    var mCallbackPopup: CallbackPopup? = null;


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val mWindow = dialog!!.window
        mWindow.requestFeature(Window.FEATURE_NO_TITLE)
        val mBaseView = inflater.inflate(R.layout.address_dialog, container, false)
        list_search = mBaseView.findViewById(R.id.list_search)
        ivClose = mBaseView.findViewById(R.id.ivClose)
        btnSelect = mBaseView.findViewById(R.id.btnSelect)
        txtAddress = mBaseView.findViewById(R.id.txtAddress)

        Places.initialize(activity!!, "AIzaSyAXjssHBlyvnt57SDuBy219QbSGACwJfr8")
        placesClient = Places.createClient(activity!!)
        mAdapter = PlaceAutocompleteAdapter(activity!!, R.layout.item_address_suggest, placesClient, this)
        list_search.apply {
            setHasFixedSize(true)
            adapter = mAdapter
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity, androidx.recyclerview.widget.RecyclerView.VERTICAL, false)
        }
        mGoogleApiClient = GoogleApiClient.Builder(activity!!)
                .enableAutoManage(activity!!, 0 /* clientId */, this)
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
                    if (isSelected) {
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
            Utils.hideKeyboard(activity!!)
            dismiss()
        }
        btnSelect.setOnClickListener {
            if (placeAddress == null || placeAddress.isEmpty()) {
                DialogUtils.showDialog(activity, getString(R.string.address_not_select), null)
                return@setOnClickListener
            }
            mCallbackPopup?.onSelectClick(placeAddress, placeDetail?.latLng)
            dismiss()
            Utils.hideKeyboard(activity!!)
        }
        return mBaseView
    }

    override fun onStart() {
        super.onStart()
        val mWindow = dialog!!.window
        val size = Point()
        val display = mWindow.windowManager.defaultDisplay
        display.getSize(size)
        //  double width = getWidth() <= 0.5 ? 0.5 : getWidth();
        mWindow.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, if (getHeightPopup() == 0.0) ViewGroup.LayoutParams.MATCH_PARENT else (getHeightPopup() * size.y).toInt())//(int)(size.y*height)
        mWindow.setGravity(Gravity.CENTER)
        mWindow.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        // mWindow.setBackgroundDrawableResource(R.drawable.bg_popup);
        mWindow.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.tran)))
    }


    fun getHeightPopup(): Double {
        return 0.0
    }

    public fun showOnFragment(fragment: Fragment) {
        val childFragmentManager = fragment.childFragmentManager
        val childFragTrans = childFragmentManager.beginTransaction()
        childFragTrans.addToBackStack(null)
        try {
            show(childFragTrans, "")
        } catch (e: Exception) {
        }

    }

    public fun showOnActivity(baseActivity: BaseActivity) {
        val ft = baseActivity.getSupportFragmentManager().beginTransaction()
        ft.addToBackStack(null)
        this.show(ft, "")
    }

    interface CallbackPopup {
        fun onSelectClick(address: String, lng: LatLng?)
    }

    override fun onDestroy() {
        super.onDestroy()
        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
            mGoogleApiClient.stopAutoManage(activity!!);
            mGoogleApiClient.disconnect();
        }
    }

    override fun onDetach() {
        super.onDetach()
        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
            mGoogleApiClient.stopAutoManage(activity!!);
            mGoogleApiClient.disconnect();
        }
    }
}
