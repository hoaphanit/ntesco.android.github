package com.vn.ntesco.fragment

import android.content.Intent
import android.os.Bundle
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.cardview.widget.CardView
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.vn.ntesco.R
import com.vn.ntesco.activity.*
import com.vn.ntesco.base.BaseFragment
import com.vn.ntesco.model.Request.LoginRequest
import com.vn.ntesco.model.Response.UserResponse
import com.vn.ntesco.model.User
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.Navigator
import com.vn.ntesco.utils.PrefUtils
import com.vn.ntesco.utils.UserCache
import com.vn.ntesco.views.NTesCoEditText
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class LoginFragment : BaseFragment(), View.OnClickListener {
    private lateinit var edtUserName: EditText
    private lateinit var edtPassword: EditText
    private lateinit var ivUserName: ImageView
    private lateinit var ivPassword: ImageView
    private lateinit var tvForgotPass: TextView
    var goToService: Boolean = false

    companion object {
        @JvmStatic
        fun newInstance(gotoService: Boolean) = LoginFragment().apply {
            arguments = Bundle().apply {
                putBoolean(Constant.GO_TO_SERVICE, gotoService)
            }
        }
    }

    override fun onSetBodyView(view: View, container: ViewGroup?, savedInstanceState: Bundle?) {
        edtUserName = view.findViewById(R.id.edtUserName)
        edtPassword = view.findViewById(R.id.edtPassword)
        ivUserName = view.findViewById(R.id.ivUserName)
        ivPassword = view.findViewById(R.id.ivPassword)
        tvForgotPass = view.findViewById(R.id.tvForgotPass)
        goToService = arguments?.getBoolean(Constant.GO_TO_SERVICE, false)!!
        view.findViewById<androidx.cardview.widget.CardView>(R.id.btnLogin).setOnClickListener(this)
        edtUserName.setOnFocusChangeListener(View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                ivUserName.setImageResource(R.mipmap.ic_account_blue)
                ivPassword.setImageResource(R.mipmap.ic_pass)
            }
        })
        edtPassword.setOnFocusChangeListener(View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                ivUserName.setImageResource(R.mipmap.ic_account)
                ivPassword.setImageResource(R.mipmap.ic_pass_blue)
            }
        })
        tvForgotPass.setOnClickListener(this)

    }

    override fun getLayoutResource(): Int {
        return R.layout.login_fragment
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnLogin -> {
                if (checkValidate())
                    login()
            }
            R.id.tvForgotPass -> {
                val intent = Intent(activity, ForgotPasswordActivity::class.java)
                startActivity(intent)
            }
        }
    }

    fun login() {
        setLoading(true)
        var loginRequest = LoginRequest()
        loginRequest.userName = edtUserName.text.toString()
        loginRequest.password = edtPassword.text.toString()
        loginRequest.deviceToken = PrefUtils.getInstance().getTokenFirebase()
        loginRequest.device_id = Utils.getDeviceId(activity)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .login(loginRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<UserResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(userResponse: UserResponse) {
                        setLoading(false)
                        if (userResponse.code == Constant.SUCCESS) {
                            UserCache.saveUserInfo(userResponse.data)
                            sendBroadcast()
                            if (goToService) {
                                val intent = Intent(activity, ServiceActivity::class.java)
                                startActivity(intent)
                            }
                            activity?.finish()
                        }


                    }

                })
    }

    private fun checkValidate(): Boolean {
        if (edtUserName.getText().toString().isEmpty()) {
            showAlert(getString(R.string.user_name_is_empty))
            return false
        }
        if (edtPassword.getText().toString().isEmpty()) {
            showAlert(getString(R.string.password_is_empty))
            return false
        }
        return true
    }

    private fun sendBroadcast() {
        val intent = Intent(Constant.LOGIN_LOCAL_BROADCAST)
        activity?.let { androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(it).sendBroadcast(intent) }
    }
}