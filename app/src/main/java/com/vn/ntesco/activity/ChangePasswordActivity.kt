package com.vn.ntesco.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.vn.ntesco.R
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.model.Request.NTescoRequestPOST
import com.vn.ntesco.model.Request.SignupRequest
import com.vn.ntesco.model.Response.UserResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.UserCache
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class ChangePasswordActivity : BaseHeaderActivity() {
    lateinit var edtCurrentPass: EditText
    lateinit var edtNewPass: EditText
    lateinit var edtConfirmPass: EditText
    lateinit var btnUpdate: TextView
    override fun setTitle(): String {
        return getString(R.string.change_password)
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_change_password
    }

    override fun setBackgroundHeader(): Int {
        return UserCache.getColorUser()
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        edtConfirmPass = findViewById(R.id.edtConfirmPass)
        edtNewPass = findViewById(R.id.edtNewPass)
        edtCurrentPass = findViewById(R.id.edtPassword)
        btnUpdate = findViewById(R.id.btnUpdate)
        btnUpdate.setOnClickListener(View.OnClickListener {
            if (checkValidate())
                changePassword()
        })
    }


    fun changePassword() {
        setLoading(true)
        var signupRequest = SignupRequest()
        signupRequest.currentPassword = edtCurrentPass.text.toString()
        signupRequest.password = edtNewPass.text.toString()
        signupRequest.confirmPassword = edtConfirmPass.text.toString()

        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .changePassword(signupRequest)
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
                            UserCache.saveUserInfo(null)
                            val intent = Intent(this@ChangePasswordActivity, MainActivity::class.java)
                            startActivity(intent)
                            finish()
                        }


                    }

                })
    }

    private fun checkValidate(): Boolean {
        if (edtCurrentPass.text.toString().isEmpty()) {
            showAlert(getString(R.string.current_pass_is_empty))
            return false
        }
        if (edtNewPass.text.toString().isEmpty()) {
            showAlert(getString(R.string.new_pass_is_empty))
            return false
        }
        if (edtNewPass.text.toString().length < 6) {
            showAlert(getString(R.string.new_password_length_longer_6))
            return false
        }
        if (edtConfirmPass.text.toString().isEmpty()) {
            showAlert(getString(R.string.verify_pass_is_empty))
            return false
        }

        if (!edtConfirmPass.text.toString().equals(edtNewPass.text.toString())) {
            showAlert(getString(R.string.new_password_confirm_pass_not_similar))
            return false
        }
        return true
    }
}
