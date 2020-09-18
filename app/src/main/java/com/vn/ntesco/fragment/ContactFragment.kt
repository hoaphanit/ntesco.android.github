package com.vn.ntesco.fragment


import android.app.Activity
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ScrollView
import android.widget.TextView
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions
import com.google.gson.Gson

import com.vn.ntesco.R
import com.vn.ntesco.base.BaseFragment
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Request.SignupRequest
import com.vn.ntesco.model.Response.*
import com.vn.ntesco.model.SocialNetworks
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.DimensionUtils
import com.vn.ntesco.utils.PrefUtils
import com.vn.ntesco.utils.WriteLog
import kotlinx.android.synthetic.main.activity_forgot_password.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


class ContactFragment : BaseFragment(), OnMapReadyCallback, View.OnClickListener {


    private val ZOOM_VALUE = 15
    lateinit var mMap: GoogleMap
    lateinit var scrollView: ScrollView
    lateinit var edtFullName: EditText
    lateinit var edtEmai: EditText
    lateinit var edtTitle: EditText
    lateinit var edtContent: EditText
    lateinit var btnSend: TextView
    lateinit var tvFacebook: TextView
    lateinit var tvLinked: TextView
    lateinit var tvTwitter: TextView
    lateinit var tvYoutube: TextView
    var socialNetworks: SocialNetworks? = null
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        if (Utils.isNetworkConnected(activity!!)) {
            getOffices()
            getSocialNetworks()
        } else {
            if (PrefUtils.getInstance().getString(PrefUtils.OFFICES) != null && !PrefUtils.getInstance().getString(PrefUtils.OFFICES).isEmpty()) {
                initMarkerInMap(Gson().fromJson(PrefUtils.getInstance().getString(PrefUtils.OFFICES), OfficesResponse::class.java))
            }
        }
    }

    override fun getLayoutResource(): Int {
        return R.layout.fragment_contact
    }

    override fun onSetBodyView(view: View, container: ViewGroup?, savedInstanceState: Bundle?) {
        val mMapFragment = childFragmentManager.findFragmentById(R.id.map) as WorkaroundMapFragment
        scrollView = view.findViewById(R.id.scrollView)
        edtFullName = view.findViewById(R.id.edtFullName)
        edtEmai = view.findViewById(R.id.edtEmail)
        edtTitle = view.findViewById(R.id.edtTitle)
        edtContent = view.findViewById(R.id.edtContent)
        btnSend = view.findViewById(R.id.btnSend)
        tvFacebook = view.findViewById(R.id.tvFacebook)
        tvLinked = view.findViewById(R.id.tvLinked)
        tvTwitter = view.findViewById(R.id.tvTwitter)
        tvYoutube = view.findViewById(R.id.tvYoutube)
        mMapFragment.getMapAsync(this)
        val params = mMapFragment?.view?.getLayoutParams()
        params?.height = DimensionUtils.getWidthScreen();
        mMapFragment.view?.setLayoutParams(params)
        mMapFragment.setListener(object : WorkaroundMapFragment.OnTouchListener {
            override fun onTouch() {
                scrollView.requestDisallowInterceptTouchEvent(true);
            }
        })
        btnSend.setOnClickListener {
            if (checkValidate())
                sendContact()
        }
        tvFacebook.setOnClickListener(this)
        tvLinked.setOnClickListener(this)
        tvTwitter.setOnClickListener(this)
        tvYoutube.setOnClickListener(this)
    }

    fun sendContact() {
        setLoading(true)
        var signUpFragment = SignupRequest()
        signUpFragment.fullName = edtFullName.text.toString()
        signUpFragment.email = edtEmai.text.toString()
        signUpFragment.title = edtTitle.text.toString()
        signUpFragment.content = edtContent.text.toString()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .sendContact(signUpFragment)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<NTescoResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(nTescoResponse: NTescoResponse) {
                        setLoading(false)
                        if (nTescoResponse.code == Constant.SUCCESS) {
                            edtFullName.text = null
                            edtEmai.text = null
                            edtTitle.text = null
                            edtContent.text = null
                            showAlert(nTescoResponse?.msg ?: "")
                        }


                    }

                })
    }

    fun checkValidate(): Boolean {
        if (edtFullName.text.toString().isEmpty() || edtFullName.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.full_name_is_empty))
            return false
        }
        if (edtEmai.text.toString().isEmpty() || edtEmai.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.email_is_empty))
            return false
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(edtEmail.text.toString()).matches()) {
            showAlert(getString(R.string.email_is_invalid))
            return false
        }
        if (edtTitle.text.toString().isEmpty() || edtTitle.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.title_contact_is_empty))
            return false
        }
        if (edtContent.text.toString().isEmpty() || edtContent.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.content_contact_is_empty))
            return false
        }
        return true
    }

    fun getOffices() {
        var ntescoRequest = NTescoRequestGET()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getOffices(ntescoRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<OfficesResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {

                    }

                    override fun onNext(officesResponse: OfficesResponse) {
                        if (officesResponse.code == Constant.SUCCESS) {
                            PrefUtils.getInstance().putString(PrefUtils.OFFICES, Gson().toJson(officesResponse))
                            initMarkerInMap(officesResponse)
                        }

                    }

                })
    }

    fun getSocialNetworks() {
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getSocialNetworks()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<SocialResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {

                    }

                    override fun onNext(socialResponse: SocialResponse) {
                        if (socialResponse.code == Constant.SUCCESS) {
                            socialNetworks = socialResponse.data
                        }

                    }

                })
    }

    fun initMarkerInMap(officesResponse: OfficesResponse) {
        val builder = LatLngBounds.Builder()
        for ((index, value) in officesResponse.data.withIndex()) {
            if (value.lat != null && value.lng != null && !value.lat.isEmpty() && !value.lng.isEmpty()) {
                val officeLocation = LatLng(value.lat.toDouble(), value.lng.toDouble())
                mMap?.addMarker(MarkerOptions().position(officeLocation).title(value.address).icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location_red)))
                builder.include(officeLocation)
            }
        }
        val bounds = builder.build()
        mMap?.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds, resources.getDimensionPixelSize(R.dimen.padding_largeXXX)));
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tvFacebook -> {
                goToFaceBookApp(socialNetworks?.facebook)
            }
            R.id.tvYoutube -> {
                val youTuBeIntent = Intent(Intent.ACTION_VIEW);
                youTuBeIntent.setData(Uri.parse("http://m.youtube.com/watch?v=" + socialNetworks?.youtube));
                youTuBeIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(youTuBeIntent);
            }
            R.id.tvTwitter -> {
                var intent: Intent? = null;
                try {
                    activity?.getPackageManager()?.getPackageInfo("com.twitter.android", 0);
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id=" + socialNetworks?.twitter));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                } catch (e: PackageManager.NameNotFoundException) {
                    // no Twitter app, revert to browser
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/PROFILENAME"));
                }
                startActivity(intent);
            }
            R.id.tvLinked -> {
                var intent: Intent? = null;
                try {
                    activity?.getPackageManager()?.getPackageInfo("com.linkedin.android", 0);
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://profile/" + socialNetworks?.linked_in));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                } catch (e: PackageManager.NameNotFoundException) {
                    // no Twitter app, revert to browser
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.linkedin.com/company/" + socialNetworks?.linked_in));
                }
                startActivity(intent);
            }
        }
    }

    val FACEBOOK_URL = "https://www.facebook.com/";

    public fun goToFaceBookApp(url: String?) {
        val packageManager = activity?.packageManager;
        var urlFb = ""
        try {
            val versionCode = packageManager?.getPackageInfo("com.facebook.katana", 0)?.versionCode!!
            val activated = packageManager.getApplicationInfo("com.facebook.katana", 0).enabled;
            if (activated) {
                if (versionCode >= 3002850) { //newer versions of fb app
                    urlFb = "fb://facewebmodal/f?href=" + FACEBOOK_URL + url
                } else {
                    urlFb = "fb://page/" + url;
                }
            }else{
                urlFb = FACEBOOK_URL + url
            }

            // http://stackoverflow.com/a/24547437/1048340
            // urlFb = "fb://facewebmodal/f?href=" + FACEBOOK_URL + url

        } catch (e: PackageManager.NameNotFoundException) {
            urlFb = FACEBOOK_URL + url; //normal web url
        }
        val facebookIntent = Intent(Intent.ACTION_VIEW);
        facebookIntent.setData(Uri.parse(urlFb));
        startActivity(facebookIntent);
    }
}
