package com.vn.ntesco.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import com.vn.ntesco.R
import com.vn.ntesco.base.BaseActivity
import com.vn.ntesco.model.Request.NTescoRequestPOST
import com.vn.ntesco.model.Request.SignupRequest
import com.vn.ntesco.model.Response.NTescoResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.DialogUtils
import com.vn.ntesco.utils.ReportStatus
import kotlinx.android.synthetic.main.activity_forgot_password.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class ForgotPasswordActivity : BaseActivity(), View.OnClickListener {


    override fun getLayoutResource(): Int {
        return R.layout.activity_forgot_password
    }

    override fun setBody(savedInstanceState: Bundle?) {
        btnSend.setOnClickListener(this)
        ivBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnSend -> {
                if (checkValidate())
                    resetPassword()
            }
            R.id.ivBack -> {
                finish()
            }
        }
    }

    fun resetPassword() {
        setLoading(true)
        val signupRequest = SignupRequest()
        signupRequest.email = edtEmail.text.toString()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .resetPassword(signupRequest)
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
                            showAlertCallback(nTescoResponse.msg, object : DialogUtils.CallbackDialog {
                                override fun onCancel() {

                                }

                                override fun onAccept() {
                                    finish()
                                }
                            })
                        }


                    }

                })
    }

    private fun checkValidate(): Boolean {
        if (edtEmail.getText().toString().isEmpty()) {
            showAlert(getString(R.string.email_is_empty))
            return false
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(edtEmail.text.toString()).matches()) {
            showAlert(getString(R.string.email_is_invalid))
            return false
        }
        return true
    }
}
